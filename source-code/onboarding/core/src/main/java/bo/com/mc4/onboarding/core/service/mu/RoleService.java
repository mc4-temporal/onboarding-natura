package bo.com.mc4.onboarding.core.service.mu;

import bo.com.mc4.onboarding.model.auth.AuthRole;
import bo.com.mc4.onboarding.model.auth.dto.PrivilegeDto;
import bo.com.mc4.onboarding.model.auth.dto.RoleDto;
import bo.com.mc4.onboarding.model.auth.dto.UserAccessDto;
import bo.com.mc4.onboarding.model.auth.dto.UserAuxDto;
import bo.com.mc4.onboarding.model.commons.enums.EntityState;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RoleService {

    void save(UserAuxDto userAuxDto, AuthRole roles);

    void update(UserAuxDto userAuxDto, AuthRole roles);

    AuthRole findById(Long id);

    AuthRole createRole(RoleDto roleDto);

    Page<AuthRole> getRoleList(String filter, Pageable pageable);

    AuthRole updateRole(RoleDto roleDto, Long roleId);

    void deleteRole(Long roleId);

    AuthRole updateStateRole(Long roleId, EntityState newState);

    List<UserAccessDto> findUserAccessByRol(Long roleId);

    void configurePrivilegesByRolAndResource(Long roleId, Long resourceId, List<PrivilegeDto> privilegeList);

    void deleteRoleResource(Long roleId, Long resourceId);

}
