package bo.com.mc4.onboarding.landing.rest.business;

import bo.com.mc4.onboarding.core.service.business.OnboardingService;
import bo.com.mc4.onboarding.core.util.ApiConstants;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.business.dto.FrmDatosPersonalesDto;
import bo.com.mc4.onboarding.model.business.dto.FrmDireccionDto;
import bo.com.mc4.onboarding.model.business.dto.FrmDirectoraConsultoraDto;
import bo.com.mc4.onboarding.model.business.dto.FrmResponseDto;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@Tag(name = "Onboarding API", description = "API para onboarding de consultoras")
@RestController
@RequestMapping("/api/onboarding")
public class OnboardingController {

    private final OnboardingService onboardingService;

    public OnboardingController(OnboardingService onboardingService) {
        this.onboardingService = onboardingService;
    }

    @PostMapping(value = "/info-personal", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Guarda informacion personal del prospecto",
            description = "",
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<FrmResponseDto>> infoPersonal(@Nullable @RequestParam("canalOnb") String canalOnboarding,
                                                                     @RequestBody FrmDatosPersonalesDto frmDatosPersonalesDto) {
        try {
            return ok(ApiUtil.buildResponseWithDefaults(
                    onboardingService.saveFrmDatosPersonales(canalOnboarding, frmDatosPersonalesDto)));
        } catch (OperationException e) {
            log.error("Error al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error al ejecutar el servicio", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/address", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Guarda informacion de direccion del prospecto",
            description = "Recibe el codigo de formulario actual y la data correspondiente al mismo.",
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<FrmResponseDto>> address(@RequestParam("prospectoId") Long prospectoId,
                                                                @RequestBody FrmDireccionDto frmDireccionDto) {
        try {
            return ok(ApiUtil.buildResponseWithDefaults(
                    onboardingService.saveFrmDireccion(prospectoId, frmDireccionDto)));
        } catch (OperationException e) {
            log.error("Error al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error al ejecutar el servicio", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/directora-consultora", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Guarda informacion de directora, consultora conocida del prospecto",
            description = "Guarda informacion de directora, consultora conocida del prospecto",
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<FrmResponseDto>> directoraConsultoraConocida(@RequestParam("prospectoId") Long prospectoId,
                                                                                    @RequestBody FrmDirectoraConsultoraDto frmDirectoraConsultoraDto) {
        try {
            return ok(ApiUtil.buildResponseWithDefaults(
                    onboardingService.saveFrmDirectoraConsultoraConocida(prospectoId, frmDirectoraConsultoraDto)));
        } catch (OperationException e) {
            log.error("Error al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error al ejecutar el servicio", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }
}
