package bo.com.mc4.onboarding.core.service.mu.impl;

import bo.com.mc4.onboarding.core.service.mu.AppConfigurationService;
import bo.com.mc4.onboarding.core.util.FormatUtil;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.auth.AuthAppConfiguration;
import bo.com.mc4.onboarding.model.auth.AuthUser;
import bo.com.mc4.onboarding.model.auth.dto.AppConfigurationDto;
import bo.com.mc4.onboarding.model.auth.enums.ApplicationType;
import bo.com.mc4.onboarding.repository.auth.AuthAppConfigurationRepository;
import bo.com.mc4.onboarding.repository.auth.AuthUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service("appConfigurationService")
public class AppConfigurationServiceImpl implements AppConfigurationService {
    private final AuthAppConfigurationRepository authAppConfigurationRepository;
    private final AuthUserRepository authUserRepository;

    public AppConfigurationServiceImpl(AuthAppConfigurationRepository authAppConfigurationRepository,
                                       AuthUserRepository authUserRepository) {
        this.authAppConfigurationRepository = authAppConfigurationRepository;
        this.authUserRepository = authUserRepository;
    }

    @Override
    public AuthAppConfiguration findAppTheme(String username, ApplicationType applicationType) {
        AuthUser authUser = this.authUserRepository.findByUsername(username).orElseThrow(() -> new OperationException(FormatUtil.noRegistrado(AuthUser.class.getName(), "username", username)));
        return this.authAppConfigurationRepository.findByUserAndType(authUser, applicationType).orElse(null);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateAppTheme(String username, ApplicationType applicationType, AppConfigurationDto appConfigurationDto) {
        AuthUser authUser = this.authUserRepository.findByUsername(username).orElseThrow(() -> new OperationException(FormatUtil.noRegistrado(AuthUser.class.getName(), "username", username)));
        AuthAppConfiguration authAppConfiguration = this.authAppConfigurationRepository.findByUserAndType(authUser, applicationType).orElse(null);
        if (authAppConfiguration != null) {
            authAppConfiguration.setJsonConfig(appConfigurationDto.getJsonConfig());
            this.authAppConfigurationRepository.save(authAppConfiguration);
        } else {
            this.authAppConfigurationRepository.save(AuthAppConfiguration.builder()
                    .applicationType(applicationType)
                    .jsonConfig(appConfigurationDto.getJsonConfig())
                    .idAuthUser(authUser)
                    .build());
        }
    }
}
