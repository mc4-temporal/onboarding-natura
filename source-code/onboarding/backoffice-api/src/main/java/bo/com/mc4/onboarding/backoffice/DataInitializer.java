package bo.com.mc4.onboarding.backoffice;

import bo.com.mc4.onboarding.core.service.commons.ParameterService;
import bo.com.mc4.onboarding.core.util.ResourceActionUtil;
import bo.com.mc4.onboarding.model.auth.*;
import bo.com.mc4.onboarding.model.auth.enums.ResourceType;
import bo.com.mc4.onboarding.model.auth.enums.UserStatus;
import bo.com.mc4.onboarding.model.commons.enums.EntityState;
import bo.com.mc4.onboarding.repository.auth.*;
import bo.com.mc4.onboarding.repository.commons.ParameterGroupRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Slf4j
@Component
public class DataInitializer implements CommandLineRunner {
    private final AuthRoleRepository authRoleRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthUserRepository userService;
    private final AuthResourceRepository authResourceRepository;
    private final ParameterService paramService;
    private final ParameterGroupRepository parameterGroupRepository;
    private final AuthRoleResourceRepository authRoleResourceRepository;
    private final AuthActionRepository authActionRepository;
    private final AuthPrivilegeRepository authPrivilegeRepository;
    private final AuthResourceActionRepository authResourceActionRepository;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    public DataInitializer(AuthRoleRepository authRoleRepository,
                           PasswordEncoder passwordEncoder,
                           AuthUserRepository userService,
                           AuthResourceRepository authResourceRepository,
                           ParameterService paramService,
                           ParameterGroupRepository parameterGroupRepository,
                           AuthRoleResourceRepository authRoleResourceRepository,
                           AuthActionRepository authActionRepository,
                           AuthPrivilegeRepository authPrivilegeRepository,
                           AuthResourceActionRepository authResourceActionRepository) {
        this.authRoleRepository = authRoleRepository;
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
        this.authResourceRepository = authResourceRepository;
        this.paramService = paramService;
        this.parameterGroupRepository = parameterGroupRepository;
        this.authRoleResourceRepository = authRoleResourceRepository;
        this.authActionRepository = authActionRepository;
        this.authPrivilegeRepository = authPrivilegeRepository;
        this.authResourceActionRepository = authResourceActionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (activeProfile.contains("development")) {
            AuthRole root;
            Optional<AuthRole> authRoleOptional = authRoleRepository.findByName("ROLE_ROOT");
            if(!authRoleOptional.isPresent()){
                root = AuthRole.builder()
                        .name("ROLE_ROOT")
                        .description("Rol para usuarios de mantenimiento")
                        .roleStatus(EntityState.ACTIVO)
                        .baseRole(true)
                        .build();
                this.authRoleRepository.save(root);
            }else{
                root = authRoleOptional.get();
            }

            if (!this.userService.findByUsername("admin").isPresent()) {
                AuthUser authUser = AuthUser.builder()
                        .name("admin")
                        .lastname("admin")
                        .username("admin")
                        .email("soporte@mc4.com.bo")
                        .password(passwordEncoder.encode("admin"))
                        .idAuthRole(root)
                        .userStatus(UserStatus.ACTIVO)
                        .build();
                this.userService.save(authUser);
            }

            addParams();
            addDomains();
            addActions();
            buildDefaultMenu();
            addData();
        }
    }


    private void buildDefaultMenu() {
        AuthRole root = this.authRoleRepository.findRolByName("ROLE_ROOT");
        AuthResource recPadreSeguridad = createOrUpdateResource("Seguridad", "Módulo de seguridad", "security", 1, "security", ResourceType.item, null, null, null, null, null, null, root);

        createOrUpdateResource("Roles", "Interfaz para administración de roles", recPadreSeguridad.getUrl().concat("/roles"), 1, "insert_link", ResourceType.item, null, null, null, "PAGE_ROLES", recPadreSeguridad, ResourceActionUtil.roleActionsCode, root);
        createOrUpdateResource("Usuarios", "Interfaz para administración de usuarios", recPadreSeguridad.getUrl().concat("/users"), 2, "insert_link", ResourceType.item, null, null, null, "PAGE_USUARIOS", recPadreSeguridad, ResourceActionUtil.userActionsCode, root);
        createOrUpdateResource("Recursos", "Interfaz para administración de recursos del sistema", recPadreSeguridad.getUrl().concat("/resources"), 3, "insert_link", ResourceType.item, null, null, null, "PAGE_RECURSOS", recPadreSeguridad, ResourceActionUtil.resourceActionsCode, root);
        createOrUpdateResource("Accesos", "Interfaz para configuración de accesos a roles", recPadreSeguridad.getUrl().concat("/access"), 4, "insert_link", ResourceType.item, null, null, null, "PAGE_ACCESOS", recPadreSeguridad, ResourceActionUtil.accessActionsCode, root);
        createOrUpdateResource("Bitácora", "Interfaz para administración de logs del sistema", recPadreSeguridad.getUrl().concat("/log"), 6, "insert_link", ResourceType.item, null, null, null, "PAGE_BITACORA", recPadreSeguridad, ResourceActionUtil.logActionsCode, root);
        createOrUpdateResource("Parámetros", "Interfaz para administración de parametros", recPadreSeguridad.getUrl().concat("/parameters"), 7, "insert_link", ResourceType.item, null, null, null, "PAGE_PARAMETROS", recPadreSeguridad, ResourceActionUtil.parameterActionsCode, root);
    }
    private AuthResource createOrUpdateResource(String nombre,
                                                String descripcion,
                                                String url,
                                                int ordenMenu,
                                                String icono,
                                                ResourceType type,
                                                String badge,
                                                String badgeColor,
                                                String customClass,
                                                String frontendCode,
                                                AuthResource authResourcePadre,
                                                String[] availableActionCodeList,
                                                AuthRole... roles) {

        AuthResource authResource = authResourceRepository.findByUrl(url);
        if (authResource == null) {
            authResource = authResourceRepository.save(AuthResource.builder()
                    .url(url)
                    .name(nombre)
                    .description(descripcion)
                    .menuPosition(ordenMenu)
                    .icon(icono)
                    .resourceStatus(EntityState.ACTIVO)
                    .idAuthResourceParent(authResourcePadre)
                    .type(type)
                    .badge(badge)
                    .badgeColor(badgeColor)
                    .customClass(customClass)
                    .frontendCode(frontendCode)
                    .build());

            for (AuthRole authRole : roles) {
                AuthRoleResource authRoleResource = authRoleResourceRepository.save(AuthRoleResource.builder()
                        .idAuthResource(authResource)
                        .idAuthRole(authRole)
                        .build());

                this.authPrivilegeRepository.save(AuthPrivilege.builder()
                        .idAuthAction(this.authActionRepository.findByCode(ResourceActionUtil.LIST_ACTION_CODE).orElse(null))
                        .idAuthRoleResource(authRoleResource)
                        .build());
                if (authRole.getName().equals("ROLE_ROOT") && authResource.getUrl().equals("security/log")) {
                    this.authPrivilegeRepository.save(AuthPrivilege.builder()
                            .idAuthAction(this.authActionRepository.findByCode(ResourceActionUtil.VIEW_LOG_ACTION).orElse(null))
                            .idAuthRoleResource(authRoleResource)
                            .build());
                }
                if (authRole.getName().equals("ROLE_ROOT") && authResource.getUrl().equals("security/access")) {
                    this.authPrivilegeRepository.save(AuthPrivilege.builder()
                            .idAuthAction(this.authActionRepository.findByCode(ResourceActionUtil.CONFIG_ACCESS_ACTION).orElse(null))
                            .idAuthRoleResource(authRoleResource)
                            .build());
                }
            }
        } else {
            authResource.setUrl(url);
            authResource.setName(nombre);
            authResource.setDescription(descripcion);
            authResource.setMenuPosition(ordenMenu);
            authResource.setIcon(icono);
            authResource.setResourceStatus(EntityState.ACTIVO);
            authResource.setIdAuthResourceParent(authResourcePadre);
            authResource.setType(type);
            authResource.setBadge(badge);
            authResource.setBadgeColor(badgeColor);
            authResource.setCustomClass(customClass);
            authResource.setFrontendCode(frontendCode);
            authResourceRepository.save(authResource);
        }
        if (availableActionCodeList != null) {
            for (String actionCode : availableActionCodeList) {
                Optional<AuthAction> authActionOptional = this.authActionRepository.findByCode(actionCode);
                if (authActionOptional.isPresent()) {
                    Optional<AuthResourceAction> authResourceActionOptional = this.authResourceActionRepository.findByResourceAndAction(authResource, authActionOptional.get());
                    if (!authResourceActionOptional.isPresent()) {
                        this.authResourceActionRepository.save(AuthResourceAction.builder()
                                .idAuthResource(authResource)
                                .idAuthAction(authActionOptional.get())
                                .build());
                    }
                }
            }
        }

        return authResource;
    }

    private void addParams() {

    }

    private void addDomains() {

    }

    private void addActions() {
        for (AuthAction authAction : ResourceActionUtil.accionesBaseList()) {
            Optional<AuthAction> actionOptional = this.authActionRepository.findByCode(authAction.getCode());
            if (!actionOptional.isPresent()) this.authActionRepository.save(authAction);
        }
    }

    private void addData() {

    }
}
