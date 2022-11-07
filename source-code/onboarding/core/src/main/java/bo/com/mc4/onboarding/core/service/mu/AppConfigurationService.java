package bo.com.mc4.onboarding.core.service.mu;

import bo.com.mc4.onboarding.model.auth.AuthAppConfiguration;
import bo.com.mc4.onboarding.model.auth.dto.AppConfigurationDto;
import bo.com.mc4.onboarding.model.auth.enums.ApplicationType;

public interface AppConfigurationService {

    AuthAppConfiguration findAppTheme(String username, ApplicationType applicationType);

    void updateAppTheme(String username, ApplicationType applicationType, AppConfigurationDto appConfigurationDto);
}
