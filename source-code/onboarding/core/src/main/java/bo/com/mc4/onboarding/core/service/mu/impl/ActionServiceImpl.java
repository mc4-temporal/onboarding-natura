package bo.com.mc4.onboarding.core.service.mu.impl;

import bo.com.mc4.onboarding.core.service.mu.ActionService;
import bo.com.mc4.onboarding.core.util.FormatUtil;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.auth.AuthAction;
import bo.com.mc4.onboarding.model.auth.AuthPrivilege;
import bo.com.mc4.onboarding.model.auth.AuthResource;
import bo.com.mc4.onboarding.model.auth.AuthRole;
import bo.com.mc4.onboarding.repository.auth.AuthActionRepository;
import bo.com.mc4.onboarding.repository.auth.AuthResourceRepository;
import bo.com.mc4.onboarding.repository.auth.AuthRoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("actionService")
public class ActionServiceImpl implements ActionService {
    private final AuthActionRepository authActionRepository;
    private final AuthRoleRepository authRoleRepository;
    private final AuthResourceRepository authResourceRepository;

    public ActionServiceImpl(AuthActionRepository authActionRepository,
                             AuthRoleRepository authRoleRepository,
                             AuthResourceRepository authResourceRepository) {
        this.authActionRepository = authActionRepository;
        this.authRoleRepository = authRoleRepository;
        this.authResourceRepository = authResourceRepository;
    }

    @Override
    public List<AuthAction> findAllActions() {
        return this.authActionRepository.findAllActions();
    }

    @Override
    public List<AuthPrivilege> getPrivilegesByRolAndResource(Long roleId, Long resourceId) {
        AuthRole authRole = this.authRoleRepository.findById(roleId)
                .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Rol", roleId)));

        AuthResource authResource = this.authResourceRepository.findById(resourceId)
                .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Recurso", resourceId)));

        return this.authActionRepository.findPrivilegesByRoleAndResource(authRole, authResource);
    }

    @Override
    public List<AuthAction> findAvailableActionsByResource(Long resourceId) {
        AuthResource authResource = this.authResourceRepository.findById(resourceId)
                .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Recurso", resourceId)));
        return this.authActionRepository.findAvailableActionsByResource(authResource);
    }
}
