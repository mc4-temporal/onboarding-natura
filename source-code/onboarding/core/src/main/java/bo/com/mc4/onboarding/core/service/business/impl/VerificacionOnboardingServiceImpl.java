package bo.com.mc4.onboarding.core.service.business.impl;

import bo.com.mc4.onboarding.core.service.business.VerificacionOnboardingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("verificacionOnboardingService")
public class VerificacionOnboardingServiceImpl implements VerificacionOnboardingService {

    @Override
    public boolean existeDocumentoGera(String documento) {
        return false;
    }

    @Override
    public boolean existeEmailGera(String email) {
        return false;
    }
}
