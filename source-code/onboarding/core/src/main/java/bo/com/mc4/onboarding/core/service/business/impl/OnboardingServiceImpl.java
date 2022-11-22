package bo.com.mc4.onboarding.core.service.business.impl;

import bo.com.mc4.onboarding.core.service.business.OnboardingService;
import bo.com.mc4.onboarding.core.service.business.VerificacionOnboardingService;
import bo.com.mc4.onboarding.core.util.Constants;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.business.CanalOnboarding;
import bo.com.mc4.onboarding.model.business.Consultora;
import bo.com.mc4.onboarding.model.business.dto.FrmDatosPersonalesDto;
import bo.com.mc4.onboarding.model.business.dto.FrmResponseDto;
import bo.com.mc4.onboarding.model.business.enums.EstadoFlujo;
import bo.com.mc4.onboarding.repository.business.CanalOnboardingRepository;
import bo.com.mc4.onboarding.repository.business.ConsultoraRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Slf4j
@Service("onboardingService")
public class OnboardingServiceImpl implements OnboardingService {
    private final ConsultoraRepository consultoraRepository;
    private final CanalOnboardingRepository canalOnboardingRepository;
    private final VerificacionOnboardingService verificacionOnboardingService;

    public OnboardingServiceImpl(ConsultoraRepository consultoraRepository,
                                 CanalOnboardingRepository canalOnboardingRepository,
                                 VerificacionOnboardingService verificacionOnboardingService) {
        this.consultoraRepository = consultoraRepository;
        this.canalOnboardingRepository = canalOnboardingRepository;
        this.verificacionOnboardingService = verificacionOnboardingService;
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

        Consultora consultora = frmDatosPersonalesDto.toConsultoraEntity();
        consultora.setIdCanalOnboarding(canalOnboarding);
        consultora.setEstadoFlujo(EstadoFlujo.FORM_DATOS_PERSONALES);
        consultoraRepository.save(consultora);

        return FrmResponseDto.builder()
                .consultoraId(consultora.getId())
                .build();
    }
}
