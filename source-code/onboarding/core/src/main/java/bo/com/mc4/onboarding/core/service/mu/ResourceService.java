package bo.com.mc4.onboarding.core.service.mu;

import bo.com.mc4.onboarding.model.auth.AuthResource;

import java.util.List;
import java.util.Map;

public interface ResourceService {
    List<AuthResource> getResourceList();

    Map<String, Boolean> getActionsByUser(String frontendCode, String username);
}
