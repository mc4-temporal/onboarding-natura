package bo.com.mc4.onboarding.backoffice.rest.auth;

import bo.com.mc4.onboarding.core.config.JwtTokenProvider;
import bo.com.mc4.onboarding.core.service.mu.EmailService;
import bo.com.mc4.onboarding.core.service.mu.LogService;
import bo.com.mc4.onboarding.core.service.mu.UserService;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.FormatUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.core.util.exception.ValidationFieldException;
import bo.com.mc4.onboarding.model.auth.AuthUser;
import bo.com.mc4.onboarding.model.auth.dto.*;
import bo.com.mc4.onboarding.model.auth.enums.UserStatus;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import bo.com.mc4.onboarding.model.commons.enums.ProcessType;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@Tag(name = "auth", description = "API para procesos de autentificación")
@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;
    private final UserService userService;
    private final LogService logService;
    private final EmailService emailService;

    public AuthController(AuthenticationManager authenticationManager,
                          JwtTokenProvider jwtTokenProvider,
                          UserService userService,
                          LogService logService,
                          EmailService emailService) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
        this.logService = logService;
        this.emailService = emailService;
    }

    @PostMapping("/signin")
    @Operation(summary = "Autentificación de usuario",
            description = "Método para autentificar a un usuario ",
            tags = {"auth"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = UserDto.class))),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
            })
    public ResponseEntity<ResponseBody<OKAuthDto>> signin(
            @Parameter(schema = @Schema(implementation = AuthenticationDto.class), description = "Request de autenticación") @RequestBody AuthenticationDto data) {
        try {
            String token = validateAuthData(data);
            log.info("Sesión iniciada por el usuario: {}", data.getUsername());
            // log importante para el perfil
            logService.infoApp(ProcessType.SESION, "Sesión iniciada por el usuario: " + data.getUsername(), "", data.getUsername());
            return ok(ApiUtil.buildResponseWithDefaults(OKAuthDto.builder()
                            .username(data.getUsername())
                            .token(token)
                            .build()));
        }catch (OperationException | BadCredentialsException e){
            log.error("No se logró autentificar al usuario: {}. Causa. {}",data.getUsername(), e.getMessage());
            throw  ApiResponseException.badRequest( e.getMessage());
        }catch (Exception e){
            log.error("Error al autentificar el usuario: {}", data.getUsername(),e);
            throw  ApiResponseException.serverError("Se generó un error al autentificar al usuario");
        }
    }

    @GetMapping("/logout")
    @Operation(summary = "logout",
            description = "Método para cerrar sesión ",
            tags = {"auth"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<?>> logout(@AuthenticationPrincipal Authentication authentication) {
        try {
            if(authentication.isAuthenticated()) {
                User authAuthUser = (User)authentication.getPrincipal();
                log.info("Cerrando sesión del usuario: {}", authAuthUser.getUsername());
                // log importante para el perfil
                logService.infoApp(ProcessType.SESION, "Sesión finalizada por el usuario: " + authAuthUser.getUsername(), "", authAuthUser.getUsername());
            }
            return ok(ApiUtil.buildResponseWithDefaults(null));
        }catch (OperationException | BadCredentialsException e){
            throw  ApiResponseException.badRequest( e.getMessage());
        }catch (Exception e){
            throw  ApiResponseException.serverError( FormatUtil.defaultError());
        }
    }

    @PostMapping("/cambiar-password")
    @Operation(summary = "Cambiar Contraseña",
            description = "Método para cambiar contraseña de un usuario",
            tags = {"auth"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<?>> changePassword(
            @Parameter(schema = @Schema(implementation = UserPassword.class), description = "Request para cambio de contraseña")
            @RequestBody UserPassword data,
            @AuthenticationPrincipal Authentication authentication) {
        try {
            if(authentication.isAuthenticated()) {
                User user = (User)authentication.getPrincipal();
                AuthUser authAuthUser = AuthUser.builder()
                        .username(user.getUsername())
                        .build();
                this.userService.changePassword(authAuthUser, data);
                log.info("El usuario: {} ha cambiado exitosamente su contrasenia", authAuthUser.getUsername());
                logService.info(ProcessType.USUARIO, "El usuario: {} ha cambiado exitosamente su contrasenia", authAuthUser.getUsername());
                return ok(ApiUtil.buildResponseWithDefaults(null));
            }
            throw  ApiResponseException.unauthorized("El usuario no ha iniciado su sesión");
        }catch (OperationException | ValidationFieldException e){
            throw  ApiResponseException.badRequest("Cambio contraseña", e.getMessage());
        }catch (Exception e){
            throw  ApiResponseException.serverError(FormatUtil.MSG_TITLE_ERROR, FormatUtil.defaultError());
        }
    }

    @RequestMapping(value = "/perfil", method = RequestMethod.GET)
    @Operation(summary = "Obtiene el perfil del usuario",
            description = "Método para obtener el perfil del usuario",
            tags = {"auth"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = MenuDto.class))),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "400", description = "Error en request", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "500", description = "Error en genérico en el servidor", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<UserDto>> getUser(@Parameter(hidden = true) @AuthenticationPrincipal Authentication authentication) {
        try {
            UserDto userDto = new UserDto();
            if (userDto == null) {
                throw ApiResponseException.notContent("No se encontró ningún dato para el usuario");
            }
            return ok(ApiUtil.buildResponseWithDefaults(userDto));
        } catch (Exception e) {
            log.error("Se generó un error genérico al obtener el perfil del usuario: {}", authentication.getName());
            throw ApiResponseException.serverError("No se logró obtener el perfil del usuario");
        }
    }



    @PostMapping("/recuperar-password")
    @Operation(summary = "Recuperar contraseña",
            description = "Método para recuperar contraseña de un usuario",
            tags = {"auth"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
            })
    public ResponseEntity<ResponseBody<String>> recuperarContrasenia(
            @Parameter(schema = @Schema(implementation = RecoveryPasswordDto.class), description = "Request para cambio de contraseña")
            @RequestBody RecoveryPasswordDto data) {
        try {
            return ok(ApiUtil.buildResponseWithDefaults(this.userService.recuperarPassword(data)));
        }catch (OperationException e){
            throw  ApiResponseException.badRequest("Cambio contraseña", e.getMessage());
        }catch (Exception e){
            log.error("Se genero un error al recuperar contraseña",e);
            throw  ApiResponseException.serverError(FormatUtil.MSG_TITLE_ERROR, FormatUtil.defaultError());
        }
    }


    private String validateAuthData(AuthenticationDto data) {
        String username = data.getUsername();
        AuthUser authAuthUser;
        try {
            authAuthUser = userService.findUserByUsername(data.getUsername());
            if (authAuthUser == null) {
                throw  new BadCredentialsException("Username " + username + "no encontrado.");
            }

        }catch (Exception e){
            log.error("No se encontró el usuario " + username + " Registrado en la Base de datos");
            throw new OperationException("No se encontró el usuario " + username + " Registrado en la Base de datos");
        }

        if(authAuthUser.getUserStatus() == UserStatus.BLOQUEADO){
            log.warn("[{}] Usuario BLOQUEADO",data.getUsername());
            throw new OperationException("Cuenta bloqueada. Por favor, comuníquese con el aministrador del sistema");
        }
        return this.dbLogin(data, authAuthUser);
    }



    private String dbLogin(AuthenticationDto data, AuthUser authAuthUser) {
        try{
            Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(data.getUsername(), data.getPassword()));
            SecurityContextHolder.getContext().setAuthentication(authentication);
            emailService.notificacionInicioSesion(authAuthUser.getName().trim()+" "+ authAuthUser.getLastname().trim(), authAuthUser.getEmail());
            return jwtTokenProvider.createToken(data.getUsername(), authAuthUser);
        } catch (AuthenticationException e) {
            log.error("Error al verificar las credenciales",e);
            throw new BadCredentialsException("Las credenciales son incorrectas");
        }catch (Exception e){
            log.error("Error de autentificacion: ",e);
            throw e;
        }
    }


}
