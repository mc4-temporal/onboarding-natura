package bo.com.mc4.onboarding.core.service.mu.impl;

import bo.com.mc4.onboarding.core.service.mu.ResourceService;
import bo.com.mc4.onboarding.core.util.FormatUtil;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.auth.AuthAction;
import bo.com.mc4.onboarding.model.auth.AuthResource;
import bo.com.mc4.onboarding.model.auth.AuthUser;
import bo.com.mc4.onboarding.repository.auth.AuthResourceRepository;
import bo.com.mc4.onboarding.repository.auth.AuthUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service("resourceService")
public class ResourceServiceImpl implements ResourceService {
    private final AuthResourceRepository authResourceRepository;
    private final AuthUserRepository authUserRepository;

    public ResourceServiceImpl(AuthResourceRepository authResourceRepository,
                               AuthUserRepository authUserRepository) {
        this.authResourceRepository = authResourceRepository;
        this.authUserRepository = authUserRepository;
    }

    @Override
    public List<AuthResource> getResourceList() {
        return this.authResourceRepository.findAll();
    }

    @Override
    public Map<String, Boolean> getActionsByUser(String frontendCode, String username) {
        AuthUser authUser = this.authUserRepository.findByUsername(username).orElseThrow(() -> new OperationException(FormatUtil.noRegistrado(AuthUser.class.getName(), "username", username)));
        List<AuthAction> actionList = this.authResourceRepository.getActionsByRoleAndFrontendCode(authUser.getIdAuthRole(), frontendCode);
        Map<String, Boolean> actionObjResult = new HashMap<>();
        actionList.forEach(item -> actionObjResult.put(item.getCode(), true));
        return actionObjResult;
    }
}
