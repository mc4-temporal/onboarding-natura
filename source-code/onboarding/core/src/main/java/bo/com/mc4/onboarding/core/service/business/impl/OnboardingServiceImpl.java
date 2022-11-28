package bo.com.mc4.onboarding.core.service.business.impl;

import bo.com.mc4.onboarding.core.service.business.OnboardingService;
import bo.com.mc4.onboarding.core.util.Constants;
import bo.com.mc4.onboarding.core.util.exception.ExceptionUtil;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.business.*;
import bo.com.mc4.onboarding.model.business.dto.FrmDatosPersonalesDto;
import bo.com.mc4.onboarding.model.business.dto.FrmDireccionDto;
import bo.com.mc4.onboarding.model.business.dto.FrmDirectoraConsultoraDto;
import bo.com.mc4.onboarding.model.business.dto.FrmResponseDto;
import bo.com.mc4.onboarding.model.business.enums.EstadoFlujo;
import bo.com.mc4.onboarding.model.business.enums.TipoConsultora;
import bo.com.mc4.onboarding.model.business.enums.TipoDireccion;
import bo.com.mc4.onboarding.repository.business.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service("onboardingService")
public class OnboardingServiceImpl implements OnboardingService {
    private final ConsultoraRepository consultoraRepository;
    private final CanalOnboardingRepository canalOnboardingRepository;
    private final MunicipioRepository municipioRepository;
    private final DireccionRepository direccionRepository;
    private final DirectoraRepository directoraRepository;

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

        Optional<Consultora> consultora = consultoraRepository.findByDocumento(frmDatosPersonalesDto.getNroDocumento());
        if (consultora.isPresent() && !consultora.get().getTipoConsultora().equals(TipoConsultora.PROSPECTO)) {
            throw new OperationException(String.format("El número de documento '%s' ya se encuentra registrado.", frmDatosPersonalesDto.getNroDocumento()));
        }
        if (consultora.isPresent() && consultora.get().getTipoConsultora().equals(TipoConsultora.PROSPECTO)) {
            return FrmResponseDto.builder()
                    .consultoraId(consultora.get().getId())
                    .flujoPendiente(true)
                    .estadoFlujo(consultora.get().getEstadoFlujo())
                    .build();
        }

        consultora = consultoraRepository.findByCorreo(frmDatosPersonalesDto.getCorreo());
        if (consultora.isPresent()) {
            throw new OperationException(String.format("El correo '%s' ya se encuentra registrado, por favor ingrese otro.", frmDatosPersonalesDto.getCorreo()));
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
        Consultora prospecto = consultoraRepository.findById(prospectoId).orElseThrow(ExceptionUtil.throwFindFail(prospectoId.toString(), "Prospecto"));
        Municipio municipio = municipioRepository.findById(frmDireccionDto.getLocalidadId()).orElseThrow(ExceptionUtil.throwFindFail(frmDireccionDto.getLocalidadId().toString(), "Municipio"));

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

    @Override
    public FrmResponseDto saveFrmDirectoraConsultoraConocida(Long prospectoId, FrmDirectoraConsultoraDto frmDirectoraConsultoraDto) {
        Consultora prospecto = consultoraRepository.findById(prospectoId).orElseThrow(ExceptionUtil.throwFindFail(prospectoId.toString(), "Prospecto"));
        Optional<Consultora> consultoraEmail = consultoraRepository.findByCorreo(frmDirectoraConsultoraDto.getCorreo());
        if (consultoraEmail.isPresent() && !consultoraEmail.get().getId().equals(prospecto.getId())) {
            throw new OperationException(String.format("El correo '%s' ya se encuentra registrado, por favor ingrese otro.", frmDirectoraConsultoraDto.getCorreo()));
        }
        if (!codigoVerificacionEmailValido(prospecto, frmDirectoraConsultoraDto.getCorreo(), frmDirectoraConsultoraDto.getCodigoConfirmacion())) {
            throw new OperationException("Código de confirmación de correo es incorrecto");
        }

        Directora directora;
        Consultora consultoraRecomendante;
        if (frmDirectoraConsultoraDto.getDirectoraId().equals(0L)) {
            directora = obtenerDirectoraPorAsignacionAutomatica(prospecto);
        } else {
            directora = directoraRepository.findById(frmDirectoraConsultoraDto.getDirectoraId()).orElseThrow(ExceptionUtil.throwFindFail(frmDirectoraConsultoraDto.getDirectoraId().toString(), "Directora"));
        }
        if (frmDirectoraConsultoraDto.getConsultoraId().equals(0L)) {
            consultoraRecomendante = obtenerConsultoraRecomendantePorDefecto();
        } else {
            consultoraRecomendante = consultoraRepository.findById(frmDirectoraConsultoraDto.getConsultoraId()).orElseThrow(ExceptionUtil.throwFindFail(frmDirectoraConsultoraDto.getConsultoraId().toString(), "Consultora"));
        }
        prospecto.setCorreo(frmDirectoraConsultoraDto.getCorreo());
        prospecto.setIdConsultoraRecomendante(consultoraRecomendante);
        prospecto.setIdDirectora(directora);
        prospecto.setEstadoFlujo(EstadoFlujo.FORM_ASIGNACION_DIRECTORA);
        consultoraRepository.save(prospecto);

        String codigoGeraGenerado = registrarConsultoraContadoGera(prospecto);
        prospecto.setEstadoFlujo(EstadoFlujo.FINALIZADO_CONTADO);
        prospecto.setCodigoConsultora(codigoGeraGenerado);
        prospecto.setTipoConsultora(TipoConsultora.CONTADO);
        consultoraRepository.save(prospecto);

        return FrmResponseDto.builder()
                .consultoraId(prospecto.getId())
                .codigoConsultora(prospecto.getCodigoConsultora())
                .build();
    }

    private String registrarConsultoraContadoGera(Consultora prospecto) {
        return String.valueOf(prospecto.getId() * 1000L);
    }

    private Consultora obtenerConsultoraRecomendantePorDefecto() {
        return null;
    }

    private Directora obtenerDirectoraPorAsignacionAutomatica(Consultora prospecto) {
        return null;
    }

    private boolean codigoVerificacionEmailValido(Consultora prospecto, String correo, Integer codigoConfirmacion) {
        return true;
    }
}
