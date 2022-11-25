package bo.com.mc4.onboarding.core.service.business.impl;

import bo.com.mc4.onboarding.core.service.business.OnboardingService;
import bo.com.mc4.onboarding.core.service.business.VerificacionOnboardingService;
import bo.com.mc4.onboarding.core.util.Constants;
import bo.com.mc4.onboarding.core.util.FormatUtil;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.business.CanalOnboarding;
import bo.com.mc4.onboarding.model.business.Consultora;
import bo.com.mc4.onboarding.model.business.Direccion;
import bo.com.mc4.onboarding.model.business.Municipio;
import bo.com.mc4.onboarding.model.business.dto.FrmDatosPersonalesDto;
import bo.com.mc4.onboarding.model.business.dto.FrmDireccionDto;
import bo.com.mc4.onboarding.model.business.dto.FrmResponseDto;
import bo.com.mc4.onboarding.model.business.enums.EstadoFlujo;
import bo.com.mc4.onboarding.model.business.enums.TipoDireccion;
import bo.com.mc4.onboarding.repository.business.CanalOnboardingRepository;
import bo.com.mc4.onboarding.repository.business.ConsultoraRepository;
import bo.com.mc4.onboarding.repository.business.DireccionRepository;
import bo.com.mc4.onboarding.repository.business.MunicipioRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.function.Supplier;

@Slf4j
@Service("onboardingService")
public class OnboardingServiceImpl implements OnboardingService {
    private final ConsultoraRepository consultoraRepository;
    private final CanalOnboardingRepository canalOnboardingRepository;
    private final VerificacionOnboardingService verificacionOnboardingService;
    private final MunicipioRepository municipioRepository;
    private final DireccionRepository direccionRepository;

    public OnboardingServiceImpl(ConsultoraRepository consultoraRepository,
                                 CanalOnboardingRepository canalOnboardingRepository,
                                 VerificacionOnboardingService verificacionOnboardingService,
                                 MunicipioRepository municipioRepository,
                                 DireccionRepository direccionRepository) {
        this.consultoraRepository = consultoraRepository;
        this.canalOnboardingRepository = canalOnboardingRepository;
        this.verificacionOnboardingService = verificacionOnboardingService;
        this.municipioRepository = municipioRepository;
        this.direccionRepository = direccionRepository;
    }

    @Override
    public FrmResponseDto saveFrmDatosPersonales(String codigoCanalOnb, FrmDatosPersonalesDto frmDatosPersonalesDto) {
        frmDatosPersonalesDto.validateFields();

        CanalOnboarding canalOnboarding;
        if (!StringUtils.isBlank(codigoCanalOnb)) {
            canalOnboarding = canalOnboardingRepository.findByCodigo(codigoCanalOnb)
                    .orElse(CanalOnboarding.builder()
                            .codigo(codigoCanalOnb)
                            .descripcion("Canal " + codigoCanalOnb)
                            .build());
        } else {
            canalOnboarding = canalOnboardingRepository.findByCodigo(Constants.DEFAULT_CANAL_ONBOARDING)
                    .orElse(CanalOnboarding.builder()
                            .codigo(Constants.DEFAULT_CANAL_ONBOARDING)
                            .descripcion("Onboarding")
                            .build());
        }
        if (canalOnboarding.getId() == null) {
            canalOnboardingRepository.save(canalOnboarding);
        }

        if (verificacionOnboardingService.existeDocumentoGera(frmDatosPersonalesDto.getNroDocumento())) {
            throw new OperationException(String.format("El número de documento '%s' ya se encuentra registrado.", frmDatosPersonalesDto.getNroDocumento()));
        }

        if (verificacionOnboardingService.existeEmailGera(frmDatosPersonalesDto.getCorreo())) {
            throw new OperationException(String.format("El correo '%s' ya se encuentra registrado.", frmDatosPersonalesDto.getCorreo()));
        }

        Consultora prospecto = frmDatosPersonalesDto.toConsultoraEntity();
        prospecto.setIdCanalOnboarding(canalOnboarding);
        prospecto.setEstadoFlujo(EstadoFlujo.FORM_DATOS_PERSONALES);
        consultoraRepository.save(prospecto);

        return FrmResponseDto.builder()
                .consultoraId(prospecto.getId())
                .build();
    }

    @Override
    @Transactional(rollbackFor = {OperationException.class, Exception.class})
    public FrmResponseDto saveFrmDireccion(Long prospectoId, FrmDireccionDto frmDireccionDto) {
        frmDireccionDto.validateFields();
        Consultora prospecto = consultoraRepository.findById(prospectoId).orElseThrow(throwFindFail(prospectoId.toString(), "Prospecto"));
        Municipio municipio = municipioRepository.findById(frmDireccionDto.getLocalidadId()).orElseThrow(throwFindFail(frmDireccionDto.getLocalidadId().toString(), "Municipio"));

        direccionRepository.deleteDireccionesExistentes(prospecto);

        Direccion direccion = frmDireccionDto.toDireccionEntity();
        direccion.setIdConsultora(prospecto);
        if (frmDireccionDto.getMismaDireccionEntrega()) {
            direccion.setTipo(TipoDireccion.AMBOS);
            direccionRepository.save(direccion);
        } else {
            direccion.setTipo(TipoDireccion.DOMICILIO);
            direccionRepository.save(direccion);

            Direccion direccionEntrega = frmDireccionDto.toDireccionEntregaEntity();
            direccionEntrega.setIdConsultora(prospecto);
            direccionEntrega.setTipo(TipoDireccion.ENTREGA);
            direccionRepository.save(direccionEntrega);
        }

        prospecto.setIdMunicipio(municipio);
        prospecto.setEstadoFlujo(EstadoFlujo.FORM_DIRECCIONES);
        consultoraRepository.save(prospecto);

        return FrmResponseDto.builder()
                .consultoraId(prospecto.getId())
                .build();
    }

    private Supplier<OperationException> throwFindFail(String entityId, String objeto) {
        return () -> new OperationException(FormatUtil.noRegistrado(objeto, entityId));
    }
}
