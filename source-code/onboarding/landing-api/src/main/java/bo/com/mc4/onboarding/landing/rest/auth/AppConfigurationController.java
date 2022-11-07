package bo.com.mc4.onboarding.landing.rest.auth;

import bo.com.mc4.onboarding.core.service.mu.AppConfigurationService;
import bo.com.mc4.onboarding.core.util.ApiConstants;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.auth.AuthAppConfiguration;
import bo.com.mc4.onboarding.model.auth.dto.AppConfigurationDto;
import bo.com.mc4.onboarding.model.auth.enums.ApplicationType;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@Tag(name = "role", description = "API para gestion de roles")
@RestController
@RequestMapping("/api/v1/theme")
public class AppConfigurationController {
    @Value("${build.version}")
    private String version;

    private final AppConfigurationService appConfigurationService;

    public AppConfigurationController(AppConfigurationService appConfigurationService) {
        this.appConfigurationService = appConfigurationService;
    }

    @GetMapping("/find")
    @Operation(summary = "",
            description = "",
            tags = {"theme"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<String>> findAppTheme(@RequestParam("applicationType") ApplicationType applicationType) {
        try {
            User userAuth = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            String appConfig = null;
            AuthAppConfiguration appTheme = this.appConfigurationService.findAppTheme(userAuth.getUsername(), applicationType);
            if (appTheme != null) appConfig = appTheme.getJsonConfig();
            return ok(ApiUtil.buildResponseWithDefaults(appConfig));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    @Operation(summary = "",
            description = "",
            tags = {"theme"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<String>> updateAppTheme(@RequestParam("applicationType") ApplicationType applicationType,
                                                               @RequestBody AppConfigurationDto appConfigurationDto) {
        try {
            User userAuth = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            this.appConfigurationService.updateAppTheme(userAuth.getUsername(), applicationType, appConfigurationDto);
            return ok(ApiUtil.buildResponseWithDefaults(null));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/version")
    String version() {
        return version;
    }
}
