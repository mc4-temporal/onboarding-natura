package bo.com.mc4.onboarding.core.service.mu.impl;

import bo.com.mc4.onboarding.core.service.mu.RoleService;
import bo.com.mc4.onboarding.core.util.FormatUtil;
import bo.com.mc4.onboarding.core.util.ValidationUtil;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.auth.*;
import bo.com.mc4.onboarding.model.auth.dto.PrivilegeDto;
import bo.com.mc4.onboarding.model.auth.dto.RoleDto;
import bo.com.mc4.onboarding.model.auth.dto.UserAccessDto;
import bo.com.mc4.onboarding.model.auth.dto.UserAuxDto;
import bo.com.mc4.onboarding.model.commons.enums.EntityState;
import bo.com.mc4.onboarding.model.util.StringUtil;
import bo.com.mc4.onboarding.repository.auth.*;
import lombok.extern.slf4j.Slf4j;
import org.postgresql.util.PSQLException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service("rolService")
public class RoleServicelmpl implements RoleService {
    private final AuthRoleRepository authRoleRepository;
    private final AuthResourceRepository authResourceRepository;
    private final AuthActionRepository authActionRepository;
    private final AuthPrivilegeRepository authPrivilegeRepository;
    private final AuthRoleResourceRepository authRoleResourceRepository;

    public RoleServicelmpl(AuthRoleRepository authRoleRepository,
                           AuthResourceRepository authResourceRepository,
                           AuthActionRepository authActionRepository,
                           AuthPrivilegeRepository authPrivilegeRepository,
                           AuthRoleResourceRepository authRoleResourceRepository) {
        this.authRoleRepository = authRoleRepository;
        this.authResourceRepository = authResourceRepository;
        this.authActionRepository = authActionRepository;
        this.authPrivilegeRepository = authPrivilegeRepository;
        this.authRoleResourceRepository = authRoleResourceRepository;
    }

    public void save(UserAuxDto userAuxDto, AuthRole roles) {
        authRoleRepository.save(roles);
    }

    @Override
    public void update(UserAuxDto userAuxDto, AuthRole roles) {
      authRoleRepository.save(roles);
    }


    @Override
    public AuthRole findById(Long id) {
        return authRoleRepository.findById(id).orElse(null);
    }

    @Override
    public AuthRole createRole(RoleDto roleDto) {
        ValidationUtil.throwExceptionIfInvalidText("Nombre", roleDto.getName(), true, 3, 35);
        ValidationUtil.throwExceptionIfInvalidText("Descripcion", roleDto.getDescription(), true, 5, 255);
        Optional<AuthRole> authRoleOpt = this.authRoleRepository.finByName(roleDto.getName().trim());
        if (authRoleOpt.isPresent()) throw new OperationException(FormatUtil.yaRegistrado("Rol", "Nombre", roleDto.getName()));

        return this.authRoleRepository.save(AuthRole.builder()
                .name(roleDto.getName().trim())
                .description(roleDto.getDescription())
                .roleStatus(EntityState.ACTIVO)
                .build());
    }

    @Override
    public Page<AuthRole> getRoleList(String filter, Pageable pageable) {
        if (StringUtil.isEmptyOrNull(filter)) filter = "%%";
        else filter = "%" + filter + "%";
        return this.authRoleRepository.pageWithFilter(filter, pageable);
    }

    @Override
    public AuthRole updateRole(RoleDto roleDto, Long roleId) {
        ValidationUtil.throwExceptionIfInvalidText("Nombre", roleDto.getName(), true, 3, 35);
        ValidationUtil.throwExceptionIfInvalidText("Descripcion", roleDto.getDescription(), true, 5, 255);
        ValidationUtil.throwExceptionIfInvalidNumber("Rol Id", roleId, true, 0L);

        AuthRole authRole = this.authRoleRepository.findById(roleId)
                .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Rol", roleId)));
        if (authRole.isBaseRole()) throw new OperationException("No se permite cambiar los datos de un rol base.");

        Optional<AuthRole> authRoleOpt = this.authRoleRepository.finByName(roleDto.getName().trim());
        if (authRoleOpt.isPresent() && !authRoleOpt.get().getId().equals(authRole.getId()))
            throw new OperationException(FormatUtil.yaRegistrado("Rol", "Nombre", roleDto.getName()));

        authRole.setName(roleDto.getName());
        authRole.setDescription(roleDto.getDescription());
        return this.authRoleRepository.save(authRole);
    }

    @Override
    @Transactional
    public void deleteRole(Long roleId) {
        AuthRole authRole = this.authRoleRepository.findById(roleId)
                .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Rol", roleId)));

        if (authRole.isBaseRole()) throw new OperationException("No se permite eliminar un rol base.");
        this.authRoleRepository.deleteAuthRole(authRole);
    }

    @Override
    public AuthRole updateStateRole(Long roleId, EntityState newState) {
        ValidationUtil.throwExceptionIfInvalidNumber("Rol Id", roleId, true, 0L);
        if (newState == null) throw new OperationException(FormatUtil.requerido("Nuevo estado"));

        AuthRole authRole = this.authRoleRepository.findById(roleId)
                .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Rol", roleId)));

        if (authRole.isBaseRole()) throw new OperationException("No se permite modificar un rol base.");

        authRole.setRoleStatus(newState);
        return this.authRoleRepository.save(authRole);
    }

    @Override
    public List<UserAccessDto> findUserAccessByRol(Long roleId) {
        AuthRole authRole = this.authRoleRepository.findById(roleId)
                .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Rol", roleId)));

        List<UserAccessDto> resultList = new ArrayList<>();
        List<AuthResource> resourceParentList = this.authResourceRepository.findAllParents();
        for (AuthResource parent : resourceParentList) {
            resultList.add(UserAccessDto.buildFromResourceParent(parent));
            resultList.addAll(this.authResourceRepository.findAccessByRoleAndParent(authRole, parent));
        }
        return resultList;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = {OperationException.class, PSQLException.class, Exception.class})
    public void configurePrivilegesByRolAndResource(Long roleId, Long resourceId, List<PrivilegeDto> privilegeList) {
        AuthRole authRole = this.authRoleRepository.findById(roleId)
                .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Rol", roleId)));
        AuthResource authResource = this.authResourceRepository.findById(resourceId)
                .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Recurso", resourceId)));

        AuthRoleResource authRoleResource = this.authRoleResourceRepository.findByRoleAndResource(authRole, authResource)
                .orElse(AuthRoleResource.builder()
                        .idAuthResource(authResource)
                        .idAuthRole(authRole)
                        .build());
        if (authRoleResource.getId() == null) this.authRoleResourceRepository.save(authRoleResource);

        for (PrivilegeDto privilegeDto : privilegeList) {
            if (privilegeDto.getId() != null) {
                AuthPrivilege authPrivilege = this.authPrivilegeRepository.findById(privilegeDto.getId()).orElse(null);
                if (authPrivilege != null) {
                    if (!privilegeDto.getEnable()) this.authPrivilegeRepository.delete(authPrivilege);
                }
            } else {
                if (privilegeDto.getEnable()) {
                    AuthAction authAction = this.authActionRepository.findById(privilegeDto.getIdAuthAction())
                            .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Acción", privilegeDto.getIdAuthAction())));

                    this.authPrivilegeRepository.save(AuthPrivilege.builder()
                            .idAuthRoleResource(authRoleResource)
                            .idAuthAction(authAction)
                            .build());
                }
            }
        }
        this.deleteRoleResource(roleId, resourceId);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = {OperationException.class, PSQLException.class, Exception.class})
    public void deleteRoleResource(Long roleId, Long resourceId) {
        AuthRole authRole = this.authRoleRepository.findById(roleId)
                .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Rol", roleId)));
        AuthResource authResource = this.authResourceRepository.findById(resourceId)
                .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Recurso", resourceId)));

        AuthRoleResource authRoleResource = this.authRoleResourceRepository.findByRoleAndResource(authRole, authResource)
                .orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Rol Recurso", 0)));

        int countProvileges = this.authPrivilegeRepository.countAllByRoleResource(authRoleResource);
        if (countProvileges == 0) {
            this.authRoleResourceRepository.delete(authRoleResource);
        }
    }
}
