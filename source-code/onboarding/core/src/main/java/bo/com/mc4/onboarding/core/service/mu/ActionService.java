package bo.com.mc4.onboarding.core.service.mu;

import bo.com.mc4.onboarding.model.auth.AuthAction;
import bo.com.mc4.onboarding.model.auth.AuthPrivilege;

import java.util.List;

public interface ActionService {
    List<AuthAction> findAllActions();

    List<AuthPrivilege> getPrivilegesByRolAndResource(Long roleId, Long resourceId);

    List<AuthAction> findAvailableActionsByResource(Long resourceId);
}
