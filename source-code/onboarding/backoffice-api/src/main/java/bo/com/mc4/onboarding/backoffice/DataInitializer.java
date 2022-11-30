package bo.com.mc4.onboarding.backoffice;

import bo.com.mc4.onboarding.backoffice.job.GeraSyncJob;
import bo.com.mc4.onboarding.core.util.Constants;
import bo.com.mc4.onboarding.core.util.ResourceActionUtil;
import bo.com.mc4.onboarding.core.util.exception.ExceptionUtil;
import bo.com.mc4.onboarding.model.business.Servicio;
import bo.com.mc4.onboarding.model.auth.*;
import bo.com.mc4.onboarding.model.auth.enums.ResourceType;
import bo.com.mc4.onboarding.model.auth.enums.UserStatus;
import bo.com.mc4.onboarding.model.business.*;
import bo.com.mc4.onboarding.model.business.enums.EstadoFlujo;
import bo.com.mc4.onboarding.model.business.enums.TipoConsultora;
import bo.com.mc4.onboarding.model.business.enums.TipoDocumento;
import bo.com.mc4.onboarding.model.business.enums.TipoServicio;
import bo.com.mc4.onboarding.model.commons.enums.EntityState;
import bo.com.mc4.onboarding.repository.ServicioRepository;
import bo.com.mc4.onboarding.repository.auth.*;
import bo.com.mc4.onboarding.repository.business.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Component
public class DataInitializer implements CommandLineRunner {
    private final AuthRoleRepository authRoleRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthUserRepository userService;
    private final AuthResourceRepository authResourceRepository;
    private final AuthRoleResourceRepository authRoleResourceRepository;
    private final AuthActionRepository authActionRepository;
    private final AuthPrivilegeRepository authPrivilegeRepository;
    private final AuthResourceActionRepository authResourceActionRepository;
    private final ServicioRepository servicioRepository;
    private final DepartamentoRepository departamentoRepository;
    private final ProvinciaRepository provinciaRepository;
    private final MunicipioRepository municipioRepository;
    private final DirectoraRepository directoraRepository;
    private final ConsultoraRepository consultoraRepository;
    private final CanalOnboardingRepository canalOnboardingRepository;
    private final RegionRepository regionRepository;
    private final RegionMunicipioFmRepository regionMunicipioFmRepository;
    private final Scheduler scheduler;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Override
    public void run(String... args) throws Exception {
        if (activeProfile.contains("dev")) {
            addDefaultRolUsers();
            addParams();
            addDomains();
            addActions();
            buildDefaultMenu();
            buildSeeders();
            addEstructuraGeografica();
            addDirectoraMock();
            addJobs();
        }
    }

    private void buildSeeders() {
        createOrUpdateService("API Gera Authentication",  "/api", "https://hmlapiauthnaturabo.geravd.com.br", TipoServicio.AUTH_GERA, 30, 30, "EscritorioVirtual", "9244B35CFF3243E5A29C5ADDD7A514E63D3F3D42", "password", "136241", "Cn2022");
        createOrUpdateService("API Gera",  "/api", "https://hmlapinaturabo.geravd.com.br", TipoServicio.GERA, 30, 30, null, null, null, null, null);

    }

    private void createOrUpdateService(String nombreParam, String apiParam, String urlParam, TipoServicio tipoParam, int connectionTimeoutParam, int requestTimeoutParam, String clientId, String clientSecret, String grantType, String username, String password) {
        Servicio servicioFind = this.servicioRepository.findByTipo(tipoParam)
                .orElse(Servicio.builder()
                        .nombre(nombreParam)
                        .url(urlParam)
                        .api(apiParam)
                        .tipo(tipoParam)
                        .connectionTimeout(connectionTimeoutParam)
                        .requestTimeout(requestTimeoutParam)
                        .clientId(clientId)
                        .clientSecret(clientSecret)
                        .grantType(grantType)
                        .username(username)
                        .password(password)
                        .build());
        servicioFind.setNombre(nombreParam);
        servicioFind.setUrl(urlParam);
        servicioFind.setApi(apiParam);
        servicioFind.setTipo(tipoParam);
        servicioFind.setConnectionTimeout(connectionTimeoutParam);
        servicioFind.setRequestTimeout(requestTimeoutParam);
        servicioFind.setClientId(clientId);
        servicioFind.setClientSecret(clientSecret);
        servicioFind.setGrantType(grantType);
        servicioFind.setUsername(username);
        servicioFind.setPassword(password);
        servicioRepository.save(servicioFind);
    }


    private void buildDefaultMenu() {
        AuthRole root = this.authRoleRepository.findRolByName("ROLE_ROOT");

        AuthResource recPadreSeguridad = createOrUpdateResource("Seguridad", "Módulo de seguridad", "security", 1, "security", ResourceType.item, null, null, null, null, null, null, root);
        AuthResource recPadrePanel = createOrUpdateResource("Paneles", "Módulo para paneles de usuarios", "panel", 2, "dashboard", ResourceType.item, null, null, null, null, null, null, root);

        // Seeeders
        createOrUpdateResource("Roles", "Interfaz para administración de roles", recPadreSeguridad.getUrl().concat("/roles"), 1, "insert_link", ResourceType.item, null, null, null, "PAGE_ROLES", recPadreSeguridad, ResourceActionUtil.roleActionsCode, root);
        createOrUpdateResource("Usuarios", "Interfaz para administración de usuarios", recPadreSeguridad.getUrl().concat("/users"), 2, "insert_link", ResourceType.item, null, null, null, "PAGE_USUARIOS", recPadreSeguridad, ResourceActionUtil.userActionsCode, root);
        createOrUpdateResource("Recursos", "Interfaz para administración de recursos del sistema", recPadreSeguridad.getUrl().concat("/resources"), 3, "insert_link", ResourceType.item, null, null, null, "PAGE_RECURSOS", recPadreSeguridad, ResourceActionUtil.resourceActionsCode, root);
        createOrUpdateResource("Accesos", "Interfaz para configuración de accesos a roles", recPadreSeguridad.getUrl().concat("/access"), 4, "insert_link", ResourceType.item, null, null, null, "PAGE_ACCESOS", recPadreSeguridad, ResourceActionUtil.accessActionsCode, root);
        createOrUpdateResource("Bitácora", "Interfaz para administración de logs del sistema", recPadreSeguridad.getUrl().concat("/log"), 6, "insert_link", ResourceType.item, null, null, null, "PAGE_BITACORA", recPadreSeguridad, ResourceActionUtil.logActionsCode, root);
        createOrUpdateResource("Parámetros", "Interfaz para administración de parametros", recPadreSeguridad.getUrl().concat("/parameters"), 7, "insert_link", ResourceType.item, null, null, null, "PAGE_PARAMETROS", recPadreSeguridad, ResourceActionUtil.parameterActionsCode, root);


        // UI: Directora View
        createOrUpdateResource("Directora", "Interfaz para administracion de directoras", recPadrePanel.getUrl().concat("/director"), 1, "insert_link", ResourceType.item, null, null, null, "PAGE_PANEL_DIRECTORA", recPadrePanel, ResourceActionUtil.directorPanelActionsCode, root);
        createOrUpdateResource("Callcenter", "Interfaz para administración de callcenter", recPadrePanel.getUrl().concat("/callcenter"), 2, "insert_link", ResourceType.item, null, null, null, "PAGE_PANEL_CALLCENTER", recPadrePanel, ResourceActionUtil.callCenterPanelActionsCode, root);
        createOrUpdateResource("Colaborador", "Interfaz para administración de colaboradores", recPadrePanel.getUrl().concat("/collaborator"), 3, "insert_link", ResourceType.item, null, null, null, "PAGE_PANEL_COLABORADOR", recPadrePanel, ResourceActionUtil.collaboratorPanelActionsCode, root);


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

    private void addDefaultRolUsers() {
        AuthRole root;
        Optional<AuthRole> authRoleOptional = authRoleRepository.findByName("ROLE_ROOT");
        if (authRoleOptional.isEmpty()) {
            root = AuthRole.builder()
                    .name("ROLE_ROOT")
                    .description("Rol para usuarios de mantenimiento")
                    .roleStatus(EntityState.ACTIVO)
                    .baseRole(true)
                    .build();
            this.authRoleRepository.save(root);
        } else {
            root = authRoleOptional.get();
        }

        if (this.userService.findByUsername("admin").isEmpty()) {
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
    }

    private void addJobs() throws SchedulerException {
        JobDetail jobDto = GeraSyncJob.getJobDto(Constants.DEFAULT_QUARTZ_GROUP, GeraSyncJob.JOB_NAME);
        if(!scheduler.checkExists(jobDto.getKey())) {
            log.info("No existe: {}", jobDto.getKey().getName());
            Date date = scheduler.scheduleJob(jobDto, GeraSyncJob.getTrigger(jobDto));
            log.info("Scheduled in: {}", date);
        }
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

    private void addEstructuraGeografica() {
        // region [Santa Cruz]
        Departamento dpto2 = departamentoRepository.findById(2)
                .orElse(Departamento.builder()
                .codigoGera(2)
                .nombre("SANTA CRUZ")
                .build());
        departamentoRepository.save(dpto2);

        Provincia prov11 = provinciaRepository.findById(11).orElse(Provincia.builder().codigoGera(11).nombre("Andrés Ibáñez").idDepartamento(dpto2).build());
        provinciaRepository.save(prov11);

        municipioRepository.save(municipioRepository.findById(123).orElse(Municipio.builder().codigoGera(123).nombre("Santa Cruz de la Sierra").idProvincia(prov11).build()));
        municipioRepository.save(municipioRepository.findById(124).orElse(Municipio.builder().codigoGera(124).nombre("Cotoca").idProvincia(prov11).build()));
        municipioRepository.save(municipioRepository.findById(125).orElse(Municipio.builder().codigoGera(125).nombre("Ayacucho (Porongo)").idProvincia(prov11).build()));
        municipioRepository.save(municipioRepository.findById(126).orElse(Municipio.builder().codigoGera(126).nombre("La Guardia").idProvincia(prov11).build()));
        municipioRepository.save(municipioRepository.findById(127).orElse(Municipio.builder().codigoGera(127).nombre("El Torno").idProvincia(prov11).build()));

        Provincia prov12 = provinciaRepository.findById(12).orElse(Provincia.builder().codigoGera(12).nombre("Ignacio Warnes").idDepartamento(dpto2).build());
        provinciaRepository.save(prov12);

        municipioRepository.save(municipioRepository.findById(128).orElse(Municipio.builder().codigoGera(128).nombre("Warnes").idProvincia(prov12).build()));
        municipioRepository.save(municipioRepository.findById(129).orElse(Municipio.builder().codigoGera(129).nombre("Okinawa Uno").idProvincia(prov12).build()));

        Provincia prov13 = provinciaRepository.findById(13).orElse(Provincia.builder().codigoGera(13).nombre("José Miguel de Velasco").idDepartamento(dpto2).build());
        provinciaRepository.save(prov13);

        municipioRepository.save(municipioRepository.findById(130).orElse(Municipio.builder().codigoGera(130).nombre("San Ignacio de Velasco").idProvincia(prov13).build()));
        municipioRepository.save(municipioRepository.findById(131).orElse(Municipio.builder().codigoGera(131).nombre("San Miguel de Velasco").idProvincia(prov13).build()));
        municipioRepository.save(municipioRepository.findById(132).orElse(Municipio.builder().codigoGera(132).nombre("San Rafael").idProvincia(prov13).build()));

        Provincia prov14 = provinciaRepository.findById(14).orElse(Provincia.builder().codigoGera(14).nombre("Ichilo").idDepartamento(dpto2).build());
        provinciaRepository.save(prov14);

        municipioRepository.save(municipioRepository.findById(133).orElse(Municipio.builder().codigoGera(133).nombre("Buena Vista").idProvincia(prov14).build()));
        municipioRepository.save(municipioRepository.findById(134).orElse(Municipio.builder().codigoGera(134).nombre("San Carlos").idProvincia(prov14).build()));
        municipioRepository.save(municipioRepository.findById(135).orElse(Municipio.builder().codigoGera(135).nombre("Yapacaní").idProvincia(prov14).build()));
        municipioRepository.save(municipioRepository.findById(136).orElse(Municipio.builder().codigoGera(136).nombre("San Juan").idProvincia(prov14).build()));

        Provincia prov15 = provinciaRepository.findById(15).orElse(Provincia.builder().codigoGera(15).nombre("Chiquitos").idDepartamento(dpto2).build());
        provinciaRepository.save(prov15);

        municipioRepository.save(municipioRepository.findById(137).orElse(Municipio.builder().codigoGera(137).nombre("San José de Chiquitos").idProvincia(prov15).build()));
        municipioRepository.save(municipioRepository.findById(138).orElse(Municipio.builder().codigoGera(138).nombre("Pailón").idProvincia(prov15).build()));
        municipioRepository.save(municipioRepository.findById(139).orElse(Municipio.builder().codigoGera(139).nombre("Roboré").idProvincia(prov15).build()));

        Provincia prov16 = provinciaRepository.findById(16).orElse(Provincia.builder().codigoGera(16).nombre("Sara").idDepartamento(dpto2).build());
        provinciaRepository.save(prov16);

        municipioRepository.save(municipioRepository.findById(140).orElse(Municipio.builder().codigoGera(140).nombre("Portachuelo").idProvincia(prov16).build()));
        municipioRepository.save(municipioRepository.findById(141).orElse(Municipio.builder().codigoGera(141).nombre("Santa Rosa del Sara").idProvincia(prov16).build()));
        municipioRepository.save(municipioRepository.findById(142).orElse(Municipio.builder().codigoGera(142).nombre("Colpa Bélgica").idProvincia(prov16).build()));

        Provincia prov17 = provinciaRepository.findById(17).orElse(Provincia.builder().codigoGera(17).nombre("Cordillera").idDepartamento(dpto2).build());
        provinciaRepository.save(prov17);

        municipioRepository.save(municipioRepository.findById(143).orElse(Municipio.builder().codigoGera(143).nombre("Lagunillas").idProvincia(prov17).build()));
        municipioRepository.save(municipioRepository.findById(144).orElse(Municipio.builder().codigoGera(144).nombre("Charagua").idProvincia(prov17).build()));
        municipioRepository.save(municipioRepository.findById(145).orElse(Municipio.builder().codigoGera(145).nombre("Cabezas").idProvincia(prov17).build()));
        municipioRepository.save(municipioRepository.findById(146).orElse(Municipio.builder().codigoGera(146).nombre("Cuevo").idProvincia(prov17).build()));
        municipioRepository.save(municipioRepository.findById(147).orElse(Municipio.builder().codigoGera(147).nombre("Gutiérrez").idProvincia(prov17).build()));
        municipioRepository.save(municipioRepository.findById(148).orElse(Municipio.builder().codigoGera(148).nombre("Camiri").idProvincia(prov17).build()));
        municipioRepository.save(municipioRepository.findById(149).orElse(Municipio.builder().codigoGera(149).nombre("Boyuibe").idProvincia(prov17).build()));

        Provincia prov18 = provinciaRepository.findById(18).orElse(Provincia.builder().codigoGera(18).nombre("Vallegrande").idDepartamento(dpto2).build());
        provinciaRepository.save(prov18);

        municipioRepository.save(municipioRepository.findById(150).orElse(Municipio.builder().codigoGera(150).nombre("Vallegrande").idProvincia(prov18).build()));
        municipioRepository.save(municipioRepository.findById(151).orElse(Municipio.builder().codigoGera(151).nombre("Trigal").idProvincia(prov18).build()));
        municipioRepository.save(municipioRepository.findById(152).orElse(Municipio.builder().codigoGera(152).nombre("Moro Moro").idProvincia(prov18).build()));
        municipioRepository.save(municipioRepository.findById(153).orElse(Municipio.builder().codigoGera(153).nombre("Postrer Valle").idProvincia(prov18).build()));
        municipioRepository.save(municipioRepository.findById(154).orElse(Municipio.builder().codigoGera(154).nombre("Pucara").idProvincia(prov18).build()));

        Provincia prov19 = provinciaRepository.findById(19).orElse(Provincia.builder().codigoGera(19).nombre("Florida").idDepartamento(dpto2).build());
        provinciaRepository.save(prov19);

        municipioRepository.save(municipioRepository.findById(155).orElse(Municipio.builder().codigoGera(155).nombre("Samaipata").idProvincia(prov19).build()));
        municipioRepository.save(municipioRepository.findById(156).orElse(Municipio.builder().codigoGera(156).nombre("Pampa Grande").idProvincia(prov19).build()));
        municipioRepository.save(municipioRepository.findById(157).orElse(Municipio.builder().codigoGera(157).nombre("Mairana").idProvincia(prov19).build()));
        municipioRepository.save(municipioRepository.findById(158).orElse(Municipio.builder().codigoGera(158).nombre("Quirusillas").idProvincia(prov19).build()));

        Provincia prov20 = provinciaRepository.findById(20).orElse(Provincia.builder().codigoGera(20).nombre("Obispo Santistevan").idDepartamento(dpto2).build());
        provinciaRepository.save(prov20);

        municipioRepository.save(municipioRepository.findById(159).orElse(Municipio.builder().codigoGera(159).nombre("Montero").idProvincia(prov20).build()));
        municipioRepository.save(municipioRepository.findById(160).orElse(Municipio.builder().codigoGera(160).nombre("Agustín Saavedra").idProvincia(prov20).build()));
        municipioRepository.save(municipioRepository.findById(161).orElse(Municipio.builder().codigoGera(161).nombre("Mineros").idProvincia(prov20).build()));
        municipioRepository.save(municipioRepository.findById(162).orElse(Municipio.builder().codigoGera(162).nombre("Fernández Alonso").idProvincia(prov20).build()));
        municipioRepository.save(municipioRepository.findById(163).orElse(Municipio.builder().codigoGera(163).nombre("San Pedro").idProvincia(prov20).build()));

        Provincia prov21 = provinciaRepository.findById(21).orElse(Provincia.builder().codigoGera(21).nombre("Ñuflo de Chávez").idDepartamento(dpto2).build());
        provinciaRepository.save(prov21);

        municipioRepository.save(municipioRepository.findById(164).orElse(Municipio.builder().codigoGera(164).nombre("Concepción").idProvincia(prov21).build()));
        municipioRepository.save(municipioRepository.findById(165).orElse(Municipio.builder().codigoGera(165).nombre("San Javier").idProvincia(prov21).build()));
        municipioRepository.save(municipioRepository.findById(166).orElse(Municipio.builder().codigoGera(166).nombre("San Ramón").idProvincia(prov21).build()));
        municipioRepository.save(municipioRepository.findById(167).orElse(Municipio.builder().codigoGera(167).nombre("San Julián").idProvincia(prov21).build()));
        municipioRepository.save(municipioRepository.findById(168).orElse(Municipio.builder().codigoGera(168).nombre("San Antonio de Lomerío").idProvincia(prov21).build()));
        municipioRepository.save(municipioRepository.findById(169).orElse(Municipio.builder().codigoGera(169).nombre("Cuatro Cañadas").idProvincia(prov21).build()));

        Provincia prov22 = provinciaRepository.findById(22).orElse(Provincia.builder().codigoGera(22).nombre("Ángel Sandoval").idDepartamento(dpto2).build());
        provinciaRepository.save(prov22);

        municipioRepository.save(municipioRepository.findById(170).orElse(Municipio.builder().codigoGera(170).nombre("San Matías").idProvincia(prov22).build()));

        Provincia prov23 = provinciaRepository.findById(23).orElse(Provincia.builder().codigoGera(23).nombre("Manuel María Caballero").idDepartamento(dpto2).build());
        provinciaRepository.save(prov23);

        municipioRepository.save(municipioRepository.findById(171).orElse(Municipio.builder().codigoGera(171).nombre("Comarapa").idProvincia(prov23).build()));
        municipioRepository.save(municipioRepository.findById(172).orElse(Municipio.builder().codigoGera(172).nombre("Saipina").idProvincia(prov23).build()));

        Provincia prov24 = provinciaRepository.findById(24).orElse(Provincia.builder().codigoGera(24).nombre("Germán Busch").idDepartamento(dpto2).build());
        provinciaRepository.save(prov24);

        municipioRepository.save(municipioRepository.findById(173).orElse(Municipio.builder().codigoGera(173).nombre("Puerto Suárez").idProvincia(prov24).build()));
        municipioRepository.save(municipioRepository.findById(174).orElse(Municipio.builder().codigoGera(174).nombre("Puerto Quijarro").idProvincia(prov24).build()));
        municipioRepository.save(municipioRepository.findById(175).orElse(Municipio.builder().codigoGera(175).nombre("Carmen Rivero Torrez").idProvincia(prov24).build()));

        Provincia prov25 = provinciaRepository.findById(25).orElse(Provincia.builder().codigoGera(25).nombre("Guarayos").idDepartamento(dpto2).build());
        provinciaRepository.save(prov25);

        municipioRepository.save(municipioRepository.findById(176).orElse(Municipio.builder().codigoGera(176).nombre("Ascensión de Guarayos").idProvincia(prov25).build()));
        municipioRepository.save(municipioRepository.findById(177).orElse(Municipio.builder().codigoGera(177).nombre("Urubichá").idProvincia(prov25).build()));
        municipioRepository.save(municipioRepository.findById(178).orElse(Municipio.builder().codigoGera(178).nombre("El Puente").idProvincia(prov25).build()));
        // endregion [Santa Cruz]

        // region [Cochabamba]
        Departamento dpto3 = departamentoRepository.findById(3)
                .orElse(Departamento.builder()
                .codigoGera(3)
                .nombre("COCHABAMBA")
                .build());
        departamentoRepository.save(dpto3);

        Provincia prov26 = provinciaRepository.findById(26).orElse(Provincia.builder().codigoGera(26).nombre("Cercado").idDepartamento(dpto3).build());
        provinciaRepository.save(prov26);

        municipioRepository.save(municipioRepository.findById(179).orElse(Municipio.builder().codigoGera(179).nombre("Cochabamba").idProvincia(prov26).build()));

        Provincia prov27 = provinciaRepository.findById(27).orElse(Provincia.builder().codigoGera(27).nombre("Narciso Campero").idDepartamento(dpto3).build());
        provinciaRepository.save(prov27);

        municipioRepository.save(municipioRepository.findById(180).orElse(Municipio.builder().codigoGera(180).nombre("Aiquile ").idProvincia(prov27).build()));
        municipioRepository.save(municipioRepository.findById(181).orElse(Municipio.builder().codigoGera(181).nombre("Pasorapa ").idProvincia(prov27).build()));
        municipioRepository.save(municipioRepository.findById(182).orElse(Municipio.builder().codigoGera(182).nombre("Omereque ").idProvincia(prov27).build()));

        Provincia prov28 = provinciaRepository.findById(28).orElse(Provincia.builder().codigoGera(28).nombre("Ayopaya").idDepartamento(dpto3).build());
        provinciaRepository.save(prov28);

        municipioRepository.save(municipioRepository.findById(183).orElse(Municipio.builder().codigoGera(183).nombre("Ayopaya (Villa de Independencia)").idProvincia(prov28).build()));
        municipioRepository.save(municipioRepository.findById(184).orElse(Municipio.builder().codigoGera(184).nombre("Morochata ").idProvincia(prov28).build()));

        Provincia prov29 = provinciaRepository.findById(29).orElse(Provincia.builder().codigoGera(29).nombre("Esteban Arce").idDepartamento(dpto3).build());
        provinciaRepository.save(prov29);

        municipioRepository.save(municipioRepository.findById(185).orElse(Municipio.builder().codigoGera(185).nombre("Tarata ").idProvincia(prov29).build()));
        municipioRepository.save(municipioRepository.findById(186).orElse(Municipio.builder().codigoGera(186).nombre("Anzaldo ").idProvincia(prov29).build()));
        municipioRepository.save(municipioRepository.findById(187).orElse(Municipio.builder().codigoGera(187).nombre("Arbieto ").idProvincia(prov29).build()));
        municipioRepository.save(municipioRepository.findById(188).orElse(Municipio.builder().codigoGera(188).nombre("Sacabamba ").idProvincia(prov29).build()));

        Provincia prov30 = provinciaRepository.findById(30).orElse(Provincia.builder().codigoGera(30).nombre("Arani").idDepartamento(dpto3).build());
        provinciaRepository.save(prov30);

        municipioRepository.save(municipioRepository.findById(189).orElse(Municipio.builder().codigoGera(189).nombre("Arani ").idProvincia(prov30).build()));
        municipioRepository.save(municipioRepository.findById(190).orElse(Municipio.builder().codigoGera(190).nombre("Vacas ").idProvincia(prov30).build()));

        Provincia prov31 = provinciaRepository.findById(31).orElse(Provincia.builder().codigoGera(31).nombre("Arque").idDepartamento(dpto3).build());
        provinciaRepository.save(prov31);

        municipioRepository.save(municipioRepository.findById(191).orElse(Municipio.builder().codigoGera(191).nombre("Arque ").idProvincia(prov31).build()));
        municipioRepository.save(municipioRepository.findById(192).orElse(Municipio.builder().codigoGera(192).nombre("Tacopaya ").idProvincia(prov31).build()));

        Provincia prov32 = provinciaRepository.findById(32).orElse(Provincia.builder().codigoGera(32).nombre("Capinota").idDepartamento(dpto3).build());
        provinciaRepository.save(prov32);

        municipioRepository.save(municipioRepository.findById(193).orElse(Municipio.builder().codigoGera(193).nombre("Capinota ").idProvincia(prov32).build()));
        municipioRepository.save(municipioRepository.findById(194).orElse(Municipio.builder().codigoGera(194).nombre("Santiváñez ").idProvincia(prov32).build()));
        municipioRepository.save(municipioRepository.findById(195).orElse(Municipio.builder().codigoGera(195).nombre("Sicaya ").idProvincia(prov32).build()));

        Provincia prov33 = provinciaRepository.findById(33).orElse(Provincia.builder().codigoGera(33).nombre("Germán Jordán").idDepartamento(dpto3).build());
        provinciaRepository.save(prov33);

        municipioRepository.save(municipioRepository.findById(196).orElse(Municipio.builder().codigoGera(196).nombre("Cliza ").idProvincia(prov33).build()));
        municipioRepository.save(municipioRepository.findById(197).orElse(Municipio.builder().codigoGera(197).nombre("Toco ").idProvincia(prov33).build()));
        municipioRepository.save(municipioRepository.findById(198).orElse(Municipio.builder().codigoGera(198).nombre("Tolata ").idProvincia(prov33).build()));

        Provincia prov34 = provinciaRepository.findById(34).orElse(Provincia.builder().codigoGera(34).nombre("Quillacollo").idDepartamento(dpto3).build());
        provinciaRepository.save(prov34);

        municipioRepository.save(municipioRepository.findById(199).orElse(Municipio.builder().codigoGera(199).nombre("Quillacollo ").idProvincia(prov34).build()));
        municipioRepository.save(municipioRepository.findById(200).orElse(Municipio.builder().codigoGera(200).nombre("Sipe Sipe ").idProvincia(prov34).build()));
        municipioRepository.save(municipioRepository.findById(201).orElse(Municipio.builder().codigoGera(201).nombre("Tiquipaya ").idProvincia(prov34).build()));
        municipioRepository.save(municipioRepository.findById(202).orElse(Municipio.builder().codigoGera(202).nombre("Vinto ").idProvincia(prov34).build()));
        municipioRepository.save(municipioRepository.findById(203).orElse(Municipio.builder().codigoGera(203).nombre("Colcapirhua ").idProvincia(prov34).build()));

        Provincia prov35 = provinciaRepository.findById(35).orElse(Provincia.builder().codigoGera(35).nombre("Chapare").idDepartamento(dpto3).build());
        provinciaRepository.save(prov35);

        municipioRepository.save(municipioRepository.findById(204).orElse(Municipio.builder().codigoGera(204).nombre("Sacaba ").idProvincia(prov35).build()));
        municipioRepository.save(municipioRepository.findById(205).orElse(Municipio.builder().codigoGera(205).nombre("Colomi ").idProvincia(prov35).build()));
        municipioRepository.save(municipioRepository.findById(206).orElse(Municipio.builder().codigoGera(206).nombre("Villa Tunari ").idProvincia(prov35).build()));

        Provincia prov36 = provinciaRepository.findById(36).orElse(Provincia.builder().codigoGera(36).nombre("Tapacarí").idDepartamento(dpto3).build());
        provinciaRepository.save(prov36);

        municipioRepository.save(municipioRepository.findById(207).orElse(Municipio.builder().codigoGera(207).nombre("Tapacarí ").idProvincia(prov36).build()));

        Provincia prov37 = provinciaRepository.findById(37).orElse(Provincia.builder().codigoGera(37).nombre("Carrasco").idDepartamento(dpto3).build());
        provinciaRepository.save(prov37);

        municipioRepository.save(municipioRepository.findById(208).orElse(Municipio.builder().codigoGera(208).nombre("Totora ").idProvincia(prov37).build()));
        municipioRepository.save(municipioRepository.findById(209).orElse(Municipio.builder().codigoGera(209).nombre("Pojo ").idProvincia(prov37).build()));
        municipioRepository.save(municipioRepository.findById(210).orElse(Municipio.builder().codigoGera(210).nombre("Pocona ").idProvincia(prov37).build()));
        municipioRepository.save(municipioRepository.findById(211).orElse(Municipio.builder().codigoGera(211).nombre("Chimoré ").idProvincia(prov37).build()));
        municipioRepository.save(municipioRepository.findById(212).orElse(Municipio.builder().codigoGera(212).nombre("Puerto Villarroel ").idProvincia(prov37).build()));
        municipioRepository.save(municipioRepository.findById(213).orElse(Municipio.builder().codigoGera(213).nombre("Entre Rios").idProvincia(prov37).build()));

        Provincia prov38 = provinciaRepository.findById(38).orElse(Provincia.builder().codigoGera(38).nombre("Mizque").idDepartamento(dpto3).build());
        provinciaRepository.save(prov38);

        municipioRepository.save(municipioRepository.findById(214).orElse(Municipio.builder().codigoGera(214).nombre("Mizque ").idProvincia(prov38).build()));
        municipioRepository.save(municipioRepository.findById(215).orElse(Municipio.builder().codigoGera(215).nombre("Vila Vila ").idProvincia(prov38).build()));
        municipioRepository.save(municipioRepository.findById(216).orElse(Municipio.builder().codigoGera(216).nombre("Alalay ").idProvincia(prov38).build()));

        Provincia prov39 = provinciaRepository.findById(39).orElse(Provincia.builder().codigoGera(39).nombre("Punata").idDepartamento(dpto3).build());
        provinciaRepository.save(prov39);

        municipioRepository.save(municipioRepository.findById(217).orElse(Municipio.builder().codigoGera(217).nombre("Punata ").idProvincia(prov39).build()));
        municipioRepository.save(municipioRepository.findById(218).orElse(Municipio.builder().codigoGera(218).nombre("Villa Rivero ").idProvincia(prov39).build()));
        municipioRepository.save(municipioRepository.findById(219).orElse(Municipio.builder().codigoGera(219).nombre("San Benito ").idProvincia(prov39).build()));
        municipioRepository.save(municipioRepository.findById(220).orElse(Municipio.builder().codigoGera(220).nombre("Tacachi ").idProvincia(prov39).build()));
        municipioRepository.save(municipioRepository.findById(221).orElse(Municipio.builder().codigoGera(221).nombre("Cuchumuela ").idProvincia(prov39).build()));

        Provincia prov40 = provinciaRepository.findById(40).orElse(Provincia.builder().codigoGera(40).nombre("Bolívar").idDepartamento(dpto3).build());
        provinciaRepository.save(prov40);

        municipioRepository.save(municipioRepository.findById(222).orElse(Municipio.builder().codigoGera(222).nombre("Bolívar ").idProvincia(prov40).build()));
        municipioRepository.save(municipioRepository.findById(222).orElse(Municipio.builder().codigoGera(222).nombre("Bolívar ").idProvincia(prov40).build()));

        Provincia prov41 = provinciaRepository.findById(41).orElse(Provincia.builder().codigoGera(41).nombre("Tiraque").idDepartamento(dpto3).build());
        provinciaRepository.save(prov41);

        municipioRepository.save(municipioRepository.findById(223).orElse(Municipio.builder().codigoGera(223).nombre("Tiraque ").idProvincia(prov41).build()));

        // endregion [Cochabamba]

        // region [La Paz]
        Departamento dpto4 = departamentoRepository.findById(4)
                .orElse(Departamento.builder()
                .codigoGera(4)
                .nombre("LA PAZ")
                .build());
        departamentoRepository.save(dpto4);

        Provincia prov42 = provinciaRepository.findById(42).orElse(Provincia.builder().codigoGera(42).nombre("Murillo").idDepartamento(dpto4).build());
        provinciaRepository.save(prov42);

        municipioRepository.save(municipioRepository.findById(224).orElse(Municipio.builder().codigoGera(224).nombre("La Paz").idProvincia(prov42).build()));
        municipioRepository.save(municipioRepository.findById(225).orElse(Municipio.builder().codigoGera(225).nombre("Palca").idProvincia(prov42).build()));
        municipioRepository.save(municipioRepository.findById(226).orElse(Municipio.builder().codigoGera(226).nombre("Mecapaca").idProvincia(prov42).build()));
        municipioRepository.save(municipioRepository.findById(227).orElse(Municipio.builder().codigoGera(227).nombre(" Achocalla").idProvincia(prov42).build()));
        municipioRepository.save(municipioRepository.findById(228).orElse(Municipio.builder().codigoGera(228).nombre("El Alto").idProvincia(prov42).build()));

        Provincia prov43 = provinciaRepository.findById(43).orElse(Provincia.builder().codigoGera(43).nombre("Omasuyos").idDepartamento(dpto4).build());
        provinciaRepository.save(prov43);

        municipioRepository.save(municipioRepository.findById(229).orElse(Municipio.builder().codigoGera(229).nombre("Achacachi").idProvincia(prov43).build()));
        municipioRepository.save(municipioRepository.findById(230).orElse(Municipio.builder().codigoGera(230).nombre("Ancoraimes").idProvincia(prov43).build()));

        Provincia prov44 = provinciaRepository.findById(44).orElse(Provincia.builder().codigoGera(44).nombre("Pacajes").idDepartamento(dpto4).build());
        provinciaRepository.save(prov44);

        municipioRepository.save(municipioRepository.findById(231).orElse(Municipio.builder().codigoGera(231).nombre("Coro Coro").idProvincia(prov44).build()));
        municipioRepository.save(municipioRepository.findById(232).orElse(Municipio.builder().codigoGera(232).nombre("Caquiaviri").idProvincia(prov44).build()));
        municipioRepository.save(municipioRepository.findById(233).orElse(Municipio.builder().codigoGera(233).nombre("Calacoto").idProvincia(prov44).build()));
        municipioRepository.save(municipioRepository.findById(234).orElse(Municipio.builder().codigoGera(234).nombre("Comanche").idProvincia(prov44).build()));
        municipioRepository.save(municipioRepository.findById(235).orElse(Municipio.builder().codigoGera(235).nombre(" Charaña").idProvincia(prov44).build()));
        municipioRepository.save(municipioRepository.findById(236).orElse(Municipio.builder().codigoGera(236).nombre("Waldo Ballivian").idProvincia(prov44).build()));
        municipioRepository.save(municipioRepository.findById(237).orElse(Municipio.builder().codigoGera(237).nombre("Nazacara de Pacajes").idProvincia(prov44).build()));
        municipioRepository.save(municipioRepository.findById(238).orElse(Municipio.builder().codigoGera(238).nombre("Callapa").idProvincia(prov44).build()));

        Provincia prov45 = provinciaRepository.findById(45).orElse(Provincia.builder().codigoGera(45).nombre("Camacho").idDepartamento(dpto4).build());
        provinciaRepository.save(prov45);

        municipioRepository.save(municipioRepository.findById(239).orElse(Municipio.builder().codigoGera(239).nombre("Puerto Acosta").idProvincia(prov45).build()));
        municipioRepository.save(municipioRepository.findById(240).orElse(Municipio.builder().codigoGera(240).nombre("Mocomoco").idProvincia(prov45).build()));
        municipioRepository.save(municipioRepository.findById(241).orElse(Municipio.builder().codigoGera(241).nombre("Pto. Carabuco").idProvincia(prov45).build()));

        Provincia prov46 = provinciaRepository.findById(46).orElse(Provincia.builder().codigoGera(46).nombre("Muñecas").idDepartamento(dpto4).build());
        provinciaRepository.save(prov46);

        municipioRepository.save(municipioRepository.findById(242).orElse(Municipio.builder().codigoGera(242).nombre("Chuma").idProvincia(prov46).build()));
        municipioRepository.save(municipioRepository.findById(243).orElse(Municipio.builder().codigoGera(243).nombre("Ayata").idProvincia(prov46).build()));
        municipioRepository.save(municipioRepository.findById(244).orElse(Municipio.builder().codigoGera(244).nombre("Aucapata").idProvincia(prov46).build()));

        Provincia prov47 = provinciaRepository.findById(47).orElse(Provincia.builder().codigoGera(47).nombre("Larecaja").idDepartamento(dpto4).build());
        provinciaRepository.save(prov47);

        municipioRepository.save(municipioRepository.findById(245).orElse(Municipio.builder().codigoGera(245).nombre("Sorata").idProvincia(prov47).build()));
        municipioRepository.save(municipioRepository.findById(246).orElse(Municipio.builder().codigoGera(246).nombre("Guanay").idProvincia(prov47).build()));
        municipioRepository.save(municipioRepository.findById(247).orElse(Municipio.builder().codigoGera(247).nombre("Tacacoma").idProvincia(prov47).build()));
        municipioRepository.save(municipioRepository.findById(248).orElse(Municipio.builder().codigoGera(248).nombre("Quiabaya").idProvincia(prov47).build()));
        municipioRepository.save(municipioRepository.findById(249).orElse(Municipio.builder().codigoGera(249).nombre("Combaya").idProvincia(prov47).build()));
        municipioRepository.save(municipioRepository.findById(250).orElse(Municipio.builder().codigoGera(250).nombre("Tipuani").idProvincia(prov47).build()));
        municipioRepository.save(municipioRepository.findById(251).orElse(Municipio.builder().codigoGera(251).nombre("Mapiri").idProvincia(prov47).build()));
        municipioRepository.save(municipioRepository.findById(252).orElse(Municipio.builder().codigoGera(252).nombre("Teoponte").idProvincia(prov47).build()));

        Provincia prov48 = provinciaRepository.findById(48).orElse(Provincia.builder().codigoGera(48).nombre("Franz Tamayo").idDepartamento(dpto4).build());
        provinciaRepository.save(prov48);

        municipioRepository.save(municipioRepository.findById(253).orElse(Municipio.builder().codigoGera(253).nombre("Apolo").idProvincia(prov48).build()));
        municipioRepository.save(municipioRepository.findById(254).orElse(Municipio.builder().codigoGera(254).nombre("Pelechuco").idProvincia(prov48).build()));

        Provincia prov49 = provinciaRepository.findById(49).orElse(Provincia.builder().codigoGera(49).nombre("Ingavi").idDepartamento(dpto4).build());
        provinciaRepository.save(prov49);

        municipioRepository.save(municipioRepository.findById(255).orElse(Municipio.builder().codigoGera(255).nombre("Viacha").idProvincia(prov49).build()));
        municipioRepository.save(municipioRepository.findById(256).orElse(Municipio.builder().codigoGera(256).nombre("Guaqui").idProvincia(prov49).build()));
        municipioRepository.save(municipioRepository.findById(257).orElse(Municipio.builder().codigoGera(257).nombre("Tiahuanacu").idProvincia(prov49).build()));
        municipioRepository.save(municipioRepository.findById(258).orElse(Municipio.builder().codigoGera(258).nombre("Desaguadero").idProvincia(prov49).build()));
        municipioRepository.save(municipioRepository.findById(259).orElse(Municipio.builder().codigoGera(259).nombre("San Andrés de Machaca").idProvincia(prov49).build()));
        municipioRepository.save(municipioRepository.findById(260).orElse(Municipio.builder().codigoGera(260).nombre("Jesús de Machaca").idProvincia(prov49).build()));
        municipioRepository.save(municipioRepository.findById(261).orElse(Municipio.builder().codigoGera(261).nombre("Taraco").idProvincia(prov49).build()));

        Provincia prov50 = provinciaRepository.findById(50).orElse(Provincia.builder().codigoGera(50).nombre("Loayza").idDepartamento(dpto4).build());
        provinciaRepository.save(prov50);

        municipioRepository.save(municipioRepository.findById(262).orElse(Municipio.builder().codigoGera(262).nombre("Luribay").idProvincia(prov50).build()));
        municipioRepository.save(municipioRepository.findById(263).orElse(Municipio.builder().codigoGera(263).nombre("Sapahaqui").idProvincia(prov50).build()));
        municipioRepository.save(municipioRepository.findById(264).orElse(Municipio.builder().codigoGera(264).nombre("Yaco").idProvincia(prov50).build()));
        municipioRepository.save(municipioRepository.findById(265).orElse(Municipio.builder().codigoGera(265).nombre("Malla").idProvincia(prov50).build()));
        municipioRepository.save(municipioRepository.findById(266).orElse(Municipio.builder().codigoGera(266).nombre("Cairoma").idProvincia(prov50).build()));

        Provincia prov51 = provinciaRepository.findById(51).orElse(Provincia.builder().codigoGera(51).nombre("Inquisivi").idDepartamento(dpto4).build());
        provinciaRepository.save(prov51);

        municipioRepository.save(municipioRepository.findById(267).orElse(Municipio.builder().codigoGera(267).nombre("Inquisivi").idProvincia(prov51).build()));
        municipioRepository.save(municipioRepository.findById(268).orElse(Municipio.builder().codigoGera(268).nombre("Quime").idProvincia(prov51).build()));
        municipioRepository.save(municipioRepository.findById(269).orElse(Municipio.builder().codigoGera(269).nombre("Cajuata").idProvincia(prov51).build()));
        municipioRepository.save(municipioRepository.findById(270).orElse(Municipio.builder().codigoGera(270).nombre("Colquiri").idProvincia(prov51).build()));
        municipioRepository.save(municipioRepository.findById(271).orElse(Municipio.builder().codigoGera(271).nombre("Ichoca").idProvincia(prov51).build()));

        Provincia prov52 = provinciaRepository.findById(52).orElse(Provincia.builder().codigoGera(52).nombre("Sud Yungas").idDepartamento(dpto4).build());
        provinciaRepository.save(prov52);

        municipioRepository.save(municipioRepository.findById(272).orElse(Municipio.builder().codigoGera(272).nombre("Villa Libertad Licoma").idProvincia(prov51).build()));
        municipioRepository.save(municipioRepository.findById(273).orElse(Municipio.builder().codigoGera(273).nombre("Chulumani").idProvincia(prov52).build()));
        municipioRepository.save(municipioRepository.findById(274).orElse(Municipio.builder().codigoGera(274).nombre("Irupana").idProvincia(prov52).build()));
        municipioRepository.save(municipioRepository.findById(275).orElse(Municipio.builder().codigoGera(275).nombre("Yanacachi").idProvincia(prov52).build()));
        municipioRepository.save(municipioRepository.findById(276).orElse(Municipio.builder().codigoGera(276).nombre("Palos Blancos").idProvincia(prov52).build()));
        municipioRepository.save(municipioRepository.findById(277).orElse(Municipio.builder().codigoGera(277).nombre("La Asunta").idProvincia(prov52).build()));

        Provincia prov53 = provinciaRepository.findById(53).orElse(Provincia.builder().codigoGera(53).nombre("Los Andes").idDepartamento(dpto4).build());
        provinciaRepository.save(prov53);

        municipioRepository.save(municipioRepository.findById(278).orElse(Municipio.builder().codigoGera(278).nombre("Pucarani").idProvincia(prov53).build()));
        municipioRepository.save(municipioRepository.findById(279).orElse(Municipio.builder().codigoGera(279).nombre("Laja").idProvincia(prov53).build()));
        municipioRepository.save(municipioRepository.findById(280).orElse(Municipio.builder().codigoGera(280).nombre("Batallas").idProvincia(prov53).build()));
        municipioRepository.save(municipioRepository.findById(281).orElse(Municipio.builder().codigoGera(281).nombre("Puerto Pérez").idProvincia(prov53).build()));

        Provincia prov54 = provinciaRepository.findById(54).orElse(Provincia.builder().codigoGera(54).nombre("Aroma").idDepartamento(dpto4).build());
        provinciaRepository.save(prov54);

        municipioRepository.save(municipioRepository.findById(282).orElse(Municipio.builder().codigoGera(282).nombre("Sica Sica").idProvincia(prov54).build()));
        municipioRepository.save(municipioRepository.findById(283).orElse(Municipio.builder().codigoGera(283).nombre("Umala").idProvincia(prov54).build()));
        municipioRepository.save(municipioRepository.findById(284).orElse(Municipio.builder().codigoGera(284).nombre("Ayo Ayo").idProvincia(prov54).build()));
        municipioRepository.save(municipioRepository.findById(285).orElse(Municipio.builder().codigoGera(285).nombre("Calamarca").idProvincia(prov54).build()));
        municipioRepository.save(municipioRepository.findById(286).orElse(Municipio.builder().codigoGera(286).nombre("Patacamaya").idProvincia(prov54).build()));
        municipioRepository.save(municipioRepository.findById(287).orElse(Municipio.builder().codigoGera(287).nombre("Colquencha").idProvincia(prov54).build()));
        municipioRepository.save(municipioRepository.findById(288).orElse(Municipio.builder().codigoGera(288).nombre("Collana").idProvincia(prov54).build()));

        Provincia prov55 = provinciaRepository.findById(55).orElse(Provincia.builder().codigoGera(55).nombre("Nor Yungas").idDepartamento(dpto4).build());
        provinciaRepository.save(prov55);

        municipioRepository.save(municipioRepository.findById(289).orElse(Municipio.builder().codigoGera(289).nombre("Coroico").idProvincia(prov55).build()));
        municipioRepository.save(municipioRepository.findById(290).orElse(Municipio.builder().codigoGera(290).nombre("Coripata").idProvincia(prov55).build()));

        Provincia prov56 = provinciaRepository.findById(56).orElse(Provincia.builder().codigoGera(56).nombre("Abel Iturralde").idDepartamento(dpto4).build());
        provinciaRepository.save(prov56);

        municipioRepository.save(municipioRepository.findById(291).orElse(Municipio.builder().codigoGera(291).nombre("Ixiamas").idProvincia(prov56).build()));
        municipioRepository.save(municipioRepository.findById(292).orElse(Municipio.builder().codigoGera(292).nombre("San Buenaventura").idProvincia(prov56).build()));

        Provincia prov57 = provinciaRepository.findById(57).orElse(Provincia.builder().codigoGera(57).nombre("Bautista Saavedra").idDepartamento(dpto4).build());
        provinciaRepository.save(prov57);

        municipioRepository.save(municipioRepository.findById(293).orElse(Municipio.builder().codigoGera(293).nombre("Charazani").idProvincia(prov57).build()));
        municipioRepository.save(municipioRepository.findById(294).orElse(Municipio.builder().codigoGera(294).nombre("Curva").idProvincia(prov57).build()));

        Provincia prov58 = provinciaRepository.findById(58).orElse(Provincia.builder().codigoGera(58).nombre("Manco Kapac").idDepartamento(dpto4).build());
        provinciaRepository.save(prov58);

        municipioRepository.save(municipioRepository.findById(295).orElse(Municipio.builder().codigoGera(295).nombre("Copacabana").idProvincia(prov58).build()));
        municipioRepository.save(municipioRepository.findById(296).orElse(Municipio.builder().codigoGera(296).nombre("San Pedro de Tiquina").idProvincia(prov58).build()));
        municipioRepository.save(municipioRepository.findById(297).orElse(Municipio.builder().codigoGera(297).nombre("Tito Yupanqui").idProvincia(prov58).build()));

        Provincia prov59 = provinciaRepository.findById(59).orElse(Provincia.builder().codigoGera(59).nombre("Gualberto Villarroel").idDepartamento(dpto4).build());
        provinciaRepository.save(prov59);

        municipioRepository.save(municipioRepository.findById(298).orElse(Municipio.builder().codigoGera(298).nombre("San Pedro Cuarahuara").idProvincia(prov59).build()));
        municipioRepository.save(municipioRepository.findById(299).orElse(Municipio.builder().codigoGera(299).nombre("Papel Pampa").idProvincia(prov59).build()));
        municipioRepository.save(municipioRepository.findById(300).orElse(Municipio.builder().codigoGera(300).nombre("Chacarilla").idProvincia(prov59).build()));

        Provincia prov60 = provinciaRepository.findById(60).orElse(Provincia.builder().codigoGera(60).nombre("Jose Manuel Pando").idDepartamento(dpto4).build());
        provinciaRepository.save(prov60);

        municipioRepository.save(municipioRepository.findById(301).orElse(Municipio.builder().codigoGera(301).nombre("Santiago de Machaca").idProvincia(prov60).build()));
        municipioRepository.save(municipioRepository.findById(302).orElse(Municipio.builder().codigoGera(302).nombre("Catacora").idProvincia(prov60).build()));

        Provincia prov61 = provinciaRepository.findById(61).orElse(Provincia.builder().codigoGera(61).nombre("Caranavi").idDepartamento(dpto4).build());
        provinciaRepository.save(prov61);

        municipioRepository.save(municipioRepository.findById(303).orElse(Municipio.builder().codigoGera(303).nombre("Caranavi").idProvincia(prov61).build()));
        // endregion [La Paz]

        // region [Chuquisaca]
        Departamento dpto5 = departamentoRepository.findById(5)
                .orElse(Departamento.builder()
                .codigoGera(5)
                .nombre("CHUQUISACA")
                .build());
        departamentoRepository.save(dpto5);


        Provincia prov62 = provinciaRepository.findById(62).orElse(Provincia.builder().codigoGera(62).nombre("Oropeza").idDepartamento(dpto4).build());
        provinciaRepository.save(prov62);

        municipioRepository.save(municipioRepository.findById(304).orElse(Municipio.builder().codigoGera(304).nombre("Sucre").idProvincia(prov62).build()));
        municipioRepository.save(municipioRepository.findById(305).orElse(Municipio.builder().codigoGera(305).nombre("Yotala").idProvincia(prov62).build()));
        municipioRepository.save(municipioRepository.findById(306).orElse(Municipio.builder().codigoGera(306).nombre("Poroma").idProvincia(prov62).build()));

        Provincia prov63 = provinciaRepository.findById(63).orElse(Provincia.builder().codigoGera(63).nombre("Azurduy").idDepartamento(dpto4).build());
        provinciaRepository.save(prov63);

        municipioRepository.save(municipioRepository.findById(307).orElse(Municipio.builder().codigoGera(307).nombre("Azurduy").idProvincia(prov63).build()));
        municipioRepository.save(municipioRepository.findById(308).orElse(Municipio.builder().codigoGera(308).nombre("Tarvita").idProvincia(prov63).build()));

        Provincia prov64 = provinciaRepository.findById(64).orElse(Provincia.builder().codigoGera(64).nombre("Zudañez").idDepartamento(dpto4).build());
        provinciaRepository.save(prov64);

        municipioRepository.save(municipioRepository.findById(309).orElse(Municipio.builder().codigoGera(309).nombre("Zudañez").idProvincia(prov64).build()));
        municipioRepository.save(municipioRepository.findById(310).orElse(Municipio.builder().codigoGera(310).nombre("Presto").idProvincia(prov64).build()));
        municipioRepository.save(municipioRepository.findById(311).orElse(Municipio.builder().codigoGera(311).nombre("Mojocoya").idProvincia(prov64).build()));
        municipioRepository.save(municipioRepository.findById(312).orElse(Municipio.builder().codigoGera(312).nombre("Cuarta Sección - Icla").idProvincia(prov64).build()));

        Provincia prov65 = provinciaRepository.findById(65).orElse(Provincia.builder().codigoGera(65).nombre("Tomina").idDepartamento(dpto4).build());
        provinciaRepository.save(prov65);

        municipioRepository.save(municipioRepository.findById(313).orElse(Municipio.builder().codigoGera(313).nombre("Padilla").idProvincia(prov65).build()));
        municipioRepository.save(municipioRepository.findById(314).orElse(Municipio.builder().codigoGera(314).nombre("Tomina").idProvincia(prov65).build()));
        municipioRepository.save(municipioRepository.findById(315).orElse(Municipio.builder().codigoGera(315).nombre("Sopachuy").idProvincia(prov65).build()));
        municipioRepository.save(municipioRepository.findById(316).orElse(Municipio.builder().codigoGera(316).nombre("Villa Alcalá").idProvincia(prov65).build()));
        municipioRepository.save(municipioRepository.findById(317).orElse(Municipio.builder().codigoGera(317).nombre("El Villar").idProvincia(prov65).build()));

        Provincia prov66 = provinciaRepository.findById(66).orElse(Provincia.builder().codigoGera(66).nombre("Hernando Siles").idDepartamento(dpto4).build());
        provinciaRepository.save(prov66);

        municipioRepository.save(municipioRepository.findById(318).orElse(Municipio.builder().codigoGera(318).nombre("Monteagudo").idProvincia(prov66).build()));
        municipioRepository.save(municipioRepository.findById(319).orElse(Municipio.builder().codigoGera(319).nombre("Huacareta").idProvincia(prov66).build()));

        Provincia prov67 = provinciaRepository.findById(67).orElse(Provincia.builder().codigoGera(67).nombre("Yamparaez").idDepartamento(dpto4).build());
        provinciaRepository.save(prov67);

        municipioRepository.save(municipioRepository.findById(320).orElse(Municipio.builder().codigoGera(320).nombre("Tarabuco").idProvincia(prov67).build()));
        municipioRepository.save(municipioRepository.findById(321).orElse(Municipio.builder().codigoGera(321).nombre("Yamparáez").idProvincia(prov67).build()));

        Provincia prov68 = provinciaRepository.findById(68).orElse(Provincia.builder().codigoGera(68).nombre("Nor Cinti").idDepartamento(dpto4).build());
        provinciaRepository.save(prov68);

        municipioRepository.save(municipioRepository.findById(322).orElse(Municipio.builder().codigoGera(322).nombre("Camargo").idProvincia(prov68).build()));
        municipioRepository.save(municipioRepository.findById(323).orElse(Municipio.builder().codigoGera(323).nombre("San Lucas").idProvincia(prov68).build()));
        municipioRepository.save(municipioRepository.findById(324).orElse(Municipio.builder().codigoGera(324).nombre("Incahuasi").idProvincia(prov68).build()));

        Provincia prov69 = provinciaRepository.findById(69).orElse(Provincia.builder().codigoGera(69).nombre("Belisario Boeto").idDepartamento(dpto4).build());
        provinciaRepository.save(prov69);

        municipioRepository.save(municipioRepository.findById(325).orElse(Municipio.builder().codigoGera(325).nombre("Villa Serrano").idProvincia(prov69).build()));

        Provincia prov70 = provinciaRepository.findById(70).orElse(Provincia.builder().codigoGera(70).nombre("Sud Cinti").idDepartamento(dpto4).build());
        provinciaRepository.save(prov70);

        municipioRepository.save(municipioRepository.findById(326).orElse(Municipio.builder().codigoGera(326).nombre("Villa Abecia").idProvincia(prov70).build()));
        municipioRepository.save(municipioRepository.findById(327).orElse(Municipio.builder().codigoGera(327).nombre("Culpina").idProvincia(prov70).build()));
        municipioRepository.save(municipioRepository.findById(328).orElse(Municipio.builder().codigoGera(328).nombre("Las Carreras").idProvincia(prov70).build()));

        Provincia prov71 = provinciaRepository.findById(71).orElse(Provincia.builder().codigoGera(71).nombre("Luis Calvo").idDepartamento(dpto4).build());
        provinciaRepository.save(prov71);

        municipioRepository.save(municipioRepository.findById(329).orElse(Municipio.builder().codigoGera(329).nombre("Muyupampa").idProvincia(prov71).build()));
        municipioRepository.save(municipioRepository.findById(330).orElse(Municipio.builder().codigoGera(330).nombre("Huacaya").idProvincia(prov71).build()));
        municipioRepository.save(municipioRepository.findById(331).orElse(Municipio.builder().codigoGera(331).nombre("Macharetí").idProvincia(prov71).build()));
        // endregion [Chuquisaca]

        // region [Tarija]
        Departamento dpto6 = departamentoRepository.findById(6)
                .orElse(Departamento.builder()
                .codigoGera(6)
                .nombre("TARIJA")
                .build());
        departamentoRepository.save(dpto6);

        Provincia prov72 = provinciaRepository.findById(72).orElse(Provincia.builder().codigoGera(72).nombre("Cercado").idDepartamento(dpto6).build());
        provinciaRepository.save(prov72);

        municipioRepository.save(municipioRepository.findById(332).orElse(Municipio.builder().codigoGera(332).nombre("Tarija").idProvincia(prov72).build()));

        Provincia prov73 = provinciaRepository.findById(73).orElse(Provincia.builder().codigoGera(73).nombre("Aniceto Arce").idDepartamento(dpto6).build());
        provinciaRepository.save(prov73);

        municipioRepository.save(municipioRepository.findById(333).orElse(Municipio.builder().codigoGera(333).nombre("Padcaya").idProvincia(prov73).build()));
        municipioRepository.save(municipioRepository.findById(334).orElse(Municipio.builder().codigoGera(334).nombre("Bermejo").idProvincia(prov73).build()));

        Provincia prov74 = provinciaRepository.findById(74).orElse(Provincia.builder().codigoGera(74).nombre("Gran Chaco").idDepartamento(dpto6).build());
        provinciaRepository.save(prov74);

        municipioRepository.save(municipioRepository.findById(335).orElse(Municipio.builder().codigoGera(335).nombre("Yacuiba").idProvincia(prov74).build()));
        municipioRepository.save(municipioRepository.findById(336).orElse(Municipio.builder().codigoGera(336).nombre("Caraparí").idProvincia(prov74).build()));
        municipioRepository.save(municipioRepository.findById(337).orElse(Municipio.builder().codigoGera(337).nombre("Villamontes").idProvincia(prov74).build()));

        Provincia prov75 = provinciaRepository.findById(75).orElse(Provincia.builder().codigoGera(75).nombre("Aviles").idDepartamento(dpto6).build());
        provinciaRepository.save(prov75);

        municipioRepository.save(municipioRepository.findById(338).orElse(Municipio.builder().codigoGera(338).nombre("Uriondo").idProvincia(prov75).build()));
        municipioRepository.save(municipioRepository.findById(339).orElse(Municipio.builder().codigoGera(339).nombre("Yunchará").idProvincia(prov75).build()));

        Provincia prov76 = provinciaRepository.findById(76).orElse(Provincia.builder().codigoGera(76).nombre("Méndez").idDepartamento(dpto6).build());
        provinciaRepository.save(prov76);

        municipioRepository.save(municipioRepository.findById(340).orElse(Municipio.builder().codigoGera(340).nombre("San Lorenzo").idProvincia(prov76).build()));
        municipioRepository.save(municipioRepository.findById(341).orElse(Municipio.builder().codigoGera(341).nombre("El Puente").idProvincia(prov76).build()));

        Provincia prov77 = provinciaRepository.findById(77).orElse(Provincia.builder().codigoGera(77).nombre("Burnet O'Connor").idDepartamento(dpto6).build());
        provinciaRepository.save(prov77);
        municipioRepository.save(municipioRepository.findById(342).orElse(Municipio.builder().codigoGera(342).nombre("Entre Ríos").idProvincia(prov77).build()));


        // endregion [Tarija]

        // region [Potosi]
        Departamento dpto7 = departamentoRepository.findById(7)
                .orElse(Departamento.builder()
                .codigoGera(7)
                .nombre("POTOSI")
                .build());
        departamentoRepository.save(dpto7);

        Provincia prov78 = provinciaRepository.findById(78).orElse(Provincia.builder().codigoGera(78).nombre("Tomas Frías").idDepartamento(dpto7).build());
        provinciaRepository.save(prov78);

        municipioRepository.save(municipioRepository.findById(343).orElse(Municipio.builder().codigoGera(343).nombre("Potosí").idProvincia(prov78).build()));
        municipioRepository.save(municipioRepository.findById(344).orElse(Municipio.builder().codigoGera(344).nombre("Tinguipaya").idProvincia(prov78).build()));
        municipioRepository.save(municipioRepository.findById(345).orElse(Municipio.builder().codigoGera(345).nombre("Yocalla").idProvincia(prov78).build()));
        municipioRepository.save(municipioRepository.findById(346).orElse(Municipio.builder().codigoGera(346).nombre("Urmiri").idProvincia(prov78).build()));

        Provincia prov79 = provinciaRepository.findById(79).orElse(Provincia.builder().codigoGera(79).nombre("Rafael Bustillo").idDepartamento(dpto7).build());
        provinciaRepository.save(prov79);

        municipioRepository.save(municipioRepository.findById(347).orElse(Municipio.builder().codigoGera(347).nombre("Uncía").idProvincia(prov79).build()));
        municipioRepository.save(municipioRepository.findById(348).orElse(Municipio.builder().codigoGera(348).nombre("Chayanta").idProvincia(prov79).build()));
        municipioRepository.save(municipioRepository.findById(349).orElse(Municipio.builder().codigoGera(349).nombre("Llallagua").idProvincia(prov79).build()));

        Provincia prov80 = provinciaRepository.findById(80).orElse(Provincia.builder().codigoGera(80).nombre("Cornelio Saavedra").idDepartamento(dpto7).build());
        provinciaRepository.save(prov80);

        municipioRepository.save(municipioRepository.findById(350).orElse(Municipio.builder().codigoGera(350).nombre("Betanzos").idProvincia(prov80).build()));
        municipioRepository.save(municipioRepository.findById(351).orElse(Municipio.builder().codigoGera(351).nombre("Chaquí").idProvincia(prov80).build()));
        municipioRepository.save(municipioRepository.findById(352).orElse(Municipio.builder().codigoGera(352).nombre("Tacobamba").idProvincia(prov80).build()));

        Provincia prov81 = provinciaRepository.findById(81).orElse(Provincia.builder().codigoGera(81).nombre("Chayanta").idDepartamento(dpto7).build());
        provinciaRepository.save(prov81);

        municipioRepository.save(municipioRepository.findById(353).orElse(Municipio.builder().codigoGera(353).nombre("Colquechaca").idProvincia(prov81).build()));
        municipioRepository.save(municipioRepository.findById(354).orElse(Municipio.builder().codigoGera(354).nombre("Ravelo").idProvincia(prov81).build()));
        municipioRepository.save(municipioRepository.findById(355).orElse(Municipio.builder().codigoGera(355).nombre("Pocoata").idProvincia(prov81).build()));
        municipioRepository.save(municipioRepository.findById(356).orElse(Municipio.builder().codigoGera(356).nombre("Ocurí").idProvincia(prov81).build()));

        Provincia prov82 = provinciaRepository.findById(82).orElse(Provincia.builder().codigoGera(82).nombre("Charcas").idDepartamento(dpto7).build());
        provinciaRepository.save(prov82);

        municipioRepository.save(municipioRepository.findById(357).orElse(Municipio.builder().codigoGera(357).nombre("San Pedro de Buena Vista").idProvincia(prov82).build()));
        municipioRepository.save(municipioRepository.findById(358).orElse(Municipio.builder().codigoGera(358).nombre("Toro Toro").idProvincia(prov82).build()));

        Provincia prov83 = provinciaRepository.findById(83).orElse(Provincia.builder().codigoGera(83).nombre("Nor Chichas").idDepartamento(dpto7).build());
        provinciaRepository.save(prov83);

        municipioRepository.save(municipioRepository.findById(359).orElse(Municipio.builder().codigoGera(359).nombre("Cotagaita").idProvincia(prov83).build()));
        municipioRepository.save(municipioRepository.findById(360).orElse(Municipio.builder().codigoGera(360).nombre("Vitichi").idProvincia(prov83).build()));

        Provincia prov84 = provinciaRepository.findById(84).orElse(Provincia.builder().codigoGera(84).nombre("Alonso de Ibáñez").idDepartamento(dpto7).build());
        provinciaRepository.save(prov84);

        municipioRepository.save(municipioRepository.findById(361).orElse(Municipio.builder().codigoGera(361).nombre("Sacaca (Villa de Sacaca)").idProvincia(prov84).build()));
        municipioRepository.save(municipioRepository.findById(362).orElse(Municipio.builder().codigoGera(362).nombre("Caripuyo").idProvincia(prov84).build()));

        Provincia prov85 = provinciaRepository.findById(85).orElse(Provincia.builder().codigoGera(85).nombre("Sud Chichas").idDepartamento(dpto7).build());
        provinciaRepository.save(prov85);

        municipioRepository.save(municipioRepository.findById(363).orElse(Municipio.builder().codigoGera(363).nombre("Tupiza").idProvincia(prov85).build()));
        municipioRepository.save(municipioRepository.findById(364).orElse(Municipio.builder().codigoGera(364).nombre("Atocha").idProvincia(prov85).build()));

        Provincia prov86 = provinciaRepository.findById(86).orElse(Provincia.builder().codigoGera(86).nombre("Nor Lípez").idDepartamento(dpto7).build());
        provinciaRepository.save(prov86);

        municipioRepository.save(municipioRepository.findById(365).orElse(Municipio.builder().codigoGera(365).nombre("Colcha K (Villa Martín)").idProvincia(prov86).build()));
        municipioRepository.save(municipioRepository.findById(366).orElse(Municipio.builder().codigoGera(366).nombre("San Pedro de Quemes").idProvincia(prov86).build()));

        Provincia prov87 = provinciaRepository.findById(87).orElse(Provincia.builder().codigoGera(87).nombre("Sud Lípez").idDepartamento(dpto7).build());
        provinciaRepository.save(prov87);

        municipioRepository.save(municipioRepository.findById(367).orElse(Municipio.builder().codigoGera(367).nombre("San Pablo de Lípez").idProvincia(prov87).build()));
        municipioRepository.save(municipioRepository.findById(368).orElse(Municipio.builder().codigoGera(368).nombre("Mojinete").idProvincia(prov87).build()));
        municipioRepository.save(municipioRepository.findById(369).orElse(Municipio.builder().codigoGera(369).nombre("San Antonio de Esmoruco").idProvincia(prov87).build()));

        Provincia prov88 = provinciaRepository.findById(88).orElse(Provincia.builder().codigoGera(88).nombre("José María Linares").idDepartamento(dpto7).build());
        provinciaRepository.save(prov88);

        municipioRepository.save(municipioRepository.findById(370).orElse(Municipio.builder().codigoGera(370).nombre("Puna (Villa Talavera)").idProvincia(prov88).build()));
        municipioRepository.save(municipioRepository.findById(371).orElse(Municipio.builder().codigoGera(371).nombre("Caiza D").idProvincia(prov88).build()));

        Provincia prov89 = provinciaRepository.findById(89).orElse(Provincia.builder().codigoGera(89).nombre("Antonio Quijarro").idDepartamento(dpto7).build());
        provinciaRepository.save(prov89);

        municipioRepository.save(municipioRepository.findById(372).orElse(Municipio.builder().codigoGera(372).nombre("Uyuni").idProvincia(prov89).build()));
        municipioRepository.save(municipioRepository.findById(373).orElse(Municipio.builder().codigoGera(373).nombre("Tomave").idProvincia(prov89).build()));
        municipioRepository.save(municipioRepository.findById(374).orElse(Municipio.builder().codigoGera(374).nombre("Porco").idProvincia(prov89).build()));

        Provincia prov90 = provinciaRepository.findById(90).orElse(Provincia.builder().codigoGera(90).nombre("Bernardino Bilbao").idDepartamento(dpto7).build());
        provinciaRepository.save(prov90);

        municipioRepository.save(municipioRepository.findById(375).orElse(Municipio.builder().codigoGera(375).nombre("Arampampa").idProvincia(prov90).build()));
        municipioRepository.save(municipioRepository.findById(376).orElse(Municipio.builder().codigoGera(376).nombre("Acasio").idProvincia(prov90).build()));

        Provincia prov91 = provinciaRepository.findById(91).orElse(Provincia.builder().codigoGera(91).nombre("Daniel Campos").idDepartamento(dpto7).build());
        provinciaRepository.save(prov91);

        municipioRepository.save(municipioRepository.findById(377).orElse(Municipio.builder().codigoGera(377).nombre("Llica").idProvincia(prov91).build()));
        municipioRepository.save(municipioRepository.findById(378).orElse(Municipio.builder().codigoGera(378).nombre("Tahua").idProvincia(prov91).build()));

        Provincia prov92 = provinciaRepository.findById(92).orElse(Provincia.builder().codigoGera(92).nombre("Modesto Omiste").idDepartamento(dpto7).build());
        provinciaRepository.save(prov92);

        municipioRepository.save(municipioRepository.findById(379).orElse(Municipio.builder().codigoGera(379).nombre("Villazón").idProvincia(prov92).build()));

        Provincia prov93 = provinciaRepository.findById(93).orElse(Provincia.builder().codigoGera(93).nombre("Enrique Baldivieso").idDepartamento(dpto7).build());
        provinciaRepository.save(prov93);
        municipioRepository.save(municipioRepository.findById(380).orElse(Municipio.builder().codigoGera(380).nombre("San Agustín").idProvincia(prov93).build()));


        // endregion [Potosi]

        // region [Oruro]
        Departamento dpto8 = departamentoRepository.findById(8)
                .orElse(Departamento.builder()
                .codigoGera(8)
                .nombre("ORURO")
                .build());
        departamentoRepository.save(dpto8);

        Provincia prov94 = provinciaRepository.findById(94).orElse(Provincia.builder().codigoGera(94).nombre("Cercado").idDepartamento(dpto8).build());
        provinciaRepository.save(prov94);

        municipioRepository.save(municipioRepository.findById(381).orElse(Municipio.builder().codigoGera(381).nombre("Oruro ").idProvincia(prov94).build()));
        municipioRepository.save(municipioRepository.findById(382).orElse(Municipio.builder().codigoGera(382).nombre("Caracollo ").idProvincia(prov94).build()));
        municipioRepository.save(municipioRepository.findById(383).orElse(Municipio.builder().codigoGera(383).nombre("El Choro ").idProvincia(prov94).build()));
        municipioRepository.save(municipioRepository.findById(384).orElse(Municipio.builder().codigoGera(384).nombre("Soracachi").idProvincia(prov94).build()));

        Provincia prov95 = provinciaRepository.findById(95).orElse(Provincia.builder().codigoGera(95).nombre("Eduardo Avaroa").idDepartamento(dpto8).build());
        provinciaRepository.save(prov95);

        municipioRepository.save(municipioRepository.findById(385).orElse(Municipio.builder().codigoGera(385).nombre("Challapata ").idProvincia(prov95).build()));
        municipioRepository.save(municipioRepository.findById(386).orElse(Municipio.builder().codigoGera(386).nombre("Santuario de Quillacas ").idProvincia(prov95).build()));

        Provincia prov96 = provinciaRepository.findById(96).orElse(Provincia.builder().codigoGera(96).nombre("Carangas").idDepartamento(dpto8).build());
        provinciaRepository.save(prov96);

        municipioRepository.save(municipioRepository.findById(387).orElse(Municipio.builder().codigoGera(387).nombre("Corque ").idProvincia(prov96).build()));
        municipioRepository.save(municipioRepository.findById(388).orElse(Municipio.builder().codigoGera(388).nombre("Choque Cota ").idProvincia(prov96).build()));

        Provincia prov97 = provinciaRepository.findById(97).orElse(Provincia.builder().codigoGera(97).nombre("Sajama").idDepartamento(dpto8).build());
        provinciaRepository.save(prov97);

        municipioRepository.save(municipioRepository.findById(389).orElse(Municipio.builder().codigoGera(389).nombre("Curahuara de Carangas ").idProvincia(prov97).build()));
        municipioRepository.save(municipioRepository.findById(390).orElse(Municipio.builder().codigoGera(390).nombre("Turco ").idProvincia(prov97).build()));

        Provincia prov98 = provinciaRepository.findById(98).orElse(Provincia.builder().codigoGera(98).nombre("Litoral").idDepartamento(dpto8).build());
        provinciaRepository.save(prov98);

        municipioRepository.save(municipioRepository.findById(391).orElse(Municipio.builder().codigoGera(391).nombre("Huachacalla ").idProvincia(prov98).build()));
        municipioRepository.save(municipioRepository.findById(392).orElse(Municipio.builder().codigoGera(392).nombre("Escara ").idProvincia(prov98).build()));
        municipioRepository.save(municipioRepository.findById(393).orElse(Municipio.builder().codigoGera(393).nombre("Cruz de Machacamarca ").idProvincia(prov98).build()));
        municipioRepository.save(municipioRepository.findById(394).orElse(Municipio.builder().codigoGera(394).nombre("Yunguyo de Litoral ").idProvincia(prov98).build()));
        municipioRepository.save(municipioRepository.findById(395).orElse(Municipio.builder().codigoGera(395).nombre("Esmeralda ").idProvincia(prov98).build()));

        Provincia prov99 = provinciaRepository.findById(99).orElse(Provincia.builder().codigoGera(99).nombre("Poopó").idDepartamento(dpto8).build());
        provinciaRepository.save(prov99);

        municipioRepository.save(municipioRepository.findById(396).orElse(Municipio.builder().codigoGera(396).nombre("Poopó ").idProvincia(prov99).build()));
        municipioRepository.save(municipioRepository.findById(397).orElse(Municipio.builder().codigoGera(397).nombre("Pazña ").idProvincia(prov99).build()));
        municipioRepository.save(municipioRepository.findById(398).orElse(Municipio.builder().codigoGera(398).nombre("Antequera ").idProvincia(prov99).build()));

        Provincia prov100 = provinciaRepository.findById(100).orElse(Provincia.builder().codigoGera(100).nombre("Pantaleón Dalence").idDepartamento(dpto8).build());
        provinciaRepository.save(prov100);

        municipioRepository.save(municipioRepository.findById(399).orElse(Municipio.builder().codigoGera(399).nombre("Huanuni ").idProvincia(prov100).build()));
        municipioRepository.save(municipioRepository.findById(400).orElse(Municipio.builder().codigoGera(400).nombre("Machacamarca ").idProvincia(prov100).build()));

        Provincia prov101 = provinciaRepository.findById(101).orElse(Provincia.builder().codigoGera(101).nombre("Ladislao Cabrera").idDepartamento(dpto8).build());
        provinciaRepository.save(prov101);

        municipioRepository.save(municipioRepository.findById(401).orElse(Municipio.builder().codigoGera(401).nombre("Salinas de Garcí Mendoza ").idProvincia(prov101).build()));
        municipioRepository.save(municipioRepository.findById(402).orElse(Municipio.builder().codigoGera(402).nombre("Pampa Aullagas ").idProvincia(prov101).build()));

        Provincia prov102 = provinciaRepository.findById(102).orElse(Provincia.builder().codigoGera(102).nombre("Atahuallpa").idDepartamento(dpto8).build());
        provinciaRepository.save(prov102);

        municipioRepository.save(municipioRepository.findById(403).orElse(Municipio.builder().codigoGera(403).nombre("Sabaya ").idProvincia(prov102).build()));
        municipioRepository.save(municipioRepository.findById(404).orElse(Municipio.builder().codigoGera(404).nombre("Coipasa ").idProvincia(prov102).build()));
        municipioRepository.save(municipioRepository.findById(405).orElse(Municipio.builder().codigoGera(405).nombre("Chipaya ").idProvincia(prov102).build()));

        Provincia prov103 = provinciaRepository.findById(103).orElse(Provincia.builder().codigoGera(103).nombre("Saucarí").idDepartamento(dpto8).build());
        provinciaRepository.save(prov103);

        municipioRepository.save(municipioRepository.findById(406).orElse(Municipio.builder().codigoGera(406).nombre("Toledo ").idProvincia(prov103).build()));

        Provincia prov104 = provinciaRepository.findById(104).orElse(Provincia.builder().codigoGera(104).nombre("Tomás Barrón").idDepartamento(dpto8).build());
        provinciaRepository.save(prov104);
        municipioRepository.save(municipioRepository.findById(407).orElse(Municipio.builder().codigoGera(407).nombre("Eucaliptus ").idProvincia(prov104).build()));

        Provincia prov105 = provinciaRepository.findById(105).orElse(Provincia.builder().codigoGera(105).nombre("Sud Carangas").idDepartamento(dpto8).build());
        provinciaRepository.save(prov105);

        municipioRepository.save(municipioRepository.findById(408).orElse(Municipio.builder().codigoGera(408).nombre("Santiago de Andamarca ").idProvincia(prov105).build()));
        municipioRepository.save(municipioRepository.findById(409).orElse(Municipio.builder().codigoGera(409).nombre("Belén de Andamarca ").idProvincia(prov105).build()));

        Provincia prov106 = provinciaRepository.findById(106).orElse(Provincia.builder().codigoGera(106).nombre("San Pedro de Totora").idDepartamento(dpto8).build());
        provinciaRepository.save(prov106);

        municipioRepository.save(municipioRepository.findById(410).orElse(Municipio.builder().codigoGera(410).nombre("Totora").idProvincia(prov106).build()));

        Provincia prov107 = provinciaRepository.findById(107).orElse(Provincia.builder().codigoGera(107).nombre("Sebastián Pagador").idDepartamento(dpto8).build());
        provinciaRepository.save(prov107);

        municipioRepository.save(municipioRepository.findById(411).orElse(Municipio.builder().codigoGera(411).nombre("Santiago de Huari ").idProvincia(prov107).build()));

        Provincia prov108 = provinciaRepository.findById(108).orElse(Provincia.builder().codigoGera(108).nombre("Puerto de Mejillones").idDepartamento(dpto8).build());
        provinciaRepository.save(prov108);

        municipioRepository.save(municipioRepository.findById(412).orElse(Municipio.builder().codigoGera(412).nombre("La Rivera ").idProvincia(prov108).build()));
        municipioRepository.save(municipioRepository.findById(413).orElse(Municipio.builder().codigoGera(413).nombre("Todos Santos ").idProvincia(prov108).build()));
        municipioRepository.save(municipioRepository.findById(414).orElse(Municipio.builder().codigoGera(414).nombre("Carangas ").idProvincia(prov108).build()));

        Provincia prov109 = provinciaRepository.findById(109).orElse(Provincia.builder().codigoGera(109).nombre("Nor Carangas").idDepartamento(dpto8).build());
        provinciaRepository.save(prov109);

        municipioRepository.save(municipioRepository.findById(415).orElse(Municipio.builder().codigoGera(415).nombre("Huayllamarca").idProvincia(prov109).build()));
        // endregion [Oruro]

        // region [Beni]
        Departamento dpto9 = departamentoRepository.findById(9)
                .orElse(Departamento.builder()
                .codigoGera(9)
                .nombre("BENI")
                .build());
        departamentoRepository.save(dpto9);

        Provincia prov110 = provinciaRepository.findById(110).orElse(Provincia.builder().codigoGera(110).nombre("Cercado").idDepartamento(dpto9).build());
        provinciaRepository.save(prov110);

        municipioRepository.save(municipioRepository.findById(416).orElse(Municipio.builder().codigoGera(416).nombre("Trinidad ").idProvincia(prov110).build()));
        municipioRepository.save(municipioRepository.findById(417).orElse(Municipio.builder().codigoGera(417).nombre("San Javier ").idProvincia(prov110).build()));
        // endregion [Beni]

        // region [Pando]
        Departamento dpto10 = departamentoRepository.findById(10)
                .orElse(Departamento.builder()
                .codigoGera(10)
                .nombre("PANDO")
                .build());
        departamentoRepository.save(dpto10);

        // endregion [Pando]
    }

    private void addDirectoraMock() {
        Municipio santaCruzMunicipio = municipioRepository.findById(123).orElseThrow(ExceptionUtil.throwFindFail("123", "Municipio"));
        Municipio warnesMunicipio = municipioRepository.findById(128).orElseThrow(ExceptionUtil.throwFindFail("128", "Municipio"));
        Municipio buenaVistaMunicipio = municipioRepository.findById(133).orElseThrow(ExceptionUtil.throwFindFail("133", "Municipio"));

        Region region1 = regionRepository.findByNombre("Region 1").orElse(Region.builder()
                .nombre("Region 1")
                .build());

        if (region1.getId() == null) {
            regionRepository.save(region1);

            regionMunicipioFmRepository.save(RegionMunicipioFm.builder()
                    .idMunicipio(santaCruzMunicipio)
                    .idRegion(region1)
                    .build());
            regionMunicipioFmRepository.save(RegionMunicipioFm.builder()
                    .idMunicipio(warnesMunicipio)
                    .idRegion(region1)
                    .build());
            regionMunicipioFmRepository.save(RegionMunicipioFm.builder()
                    .idMunicipio(buenaVistaMunicipio)
                    .idRegion(region1)
                    .build());

            Directora directora = Directora.builder()
                    .idRegion(region1)
                    .codigoDirectora("85637")
                    .nombre("ANAHI JOSSELINE CAMACHO MENDIZABAL")
                    .telefono("60529697")
                    .tokenInvitacion("1A85637")
                    .correo("acamacho@maturabo.net")
                    .build();
            directoraRepository.save(directora);

            Directora directora1 = Directora.builder()
                    .idRegion(region1)
                    .codigoDirectora("116696")
                    .nombre("JUMEY ANDREA HERBAS BELMONTE")
                    .telefono("70660090")
                    .tokenInvitacion("1A116696")
                    .correo("jherbas@maturabo.net")
                    .build();
            directoraRepository.save(directora1);
            CanalOnboarding canalOnboarding = canalOnboardingRepository.save(canalOnboardingRepository.findByCodigo(Constants.DEFAULT_CANAL_ONBOARDING)
                    .orElse(CanalOnboarding.builder()
                            .codigo(Constants.DEFAULT_CANAL_ONBOARDING)
                            .descripcion("Onboarding")
                            .build()));
            consultoraRepository.save(Consultora.builder()
                    .nombres("Consultora A")
                    .apellidos("Apellido A")
                    .nroDocumento("1234567")
                    .tipoDocumento(TipoDocumento.CI)
                    .expedicion("SC")
                    .fechaNacimiento(new Date())
                    .telefono("77282728")
                    .correo("consultora@naturabo.net")
                    .tipoConsultora(TipoConsultora.CONTADO)
                    .estadoFlujo(EstadoFlujo.FINALIZADO)
                    .idCanalOnboarding(canalOnboarding)
                    .idMunicipio(santaCruzMunicipio)
                    .build());
            consultoraRepository.save(Consultora.builder()
                    .nombres("Consultora B")
                    .apellidos("Apellido B")
                    .nroDocumento("7841515")
                    .tipoDocumento(TipoDocumento.CI)
                    .expedicion("SC")
                    .fechaNacimiento(new Date())
                    .telefono("64582155")
                    .correo("consultorab@naturabo.net")
                    .tipoConsultora(TipoConsultora.CONTADO)
                    .estadoFlujo(EstadoFlujo.FINALIZADO)
                    .idCanalOnboarding(canalOnboarding)
                    .idMunicipio(warnesMunicipio)
                    .build());
        }
    }
}
