package bo.com.mc4.onboarding.backoffice.rest.business;

import bo.com.mc4.onboarding.core.service.business.CanalOnboardingService;
import bo.com.mc4.onboarding.core.util.ApiConstants;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.auth.dto.ParameterGroupDto;
import bo.com.mc4.onboarding.model.business.dto.CanalOnboardingDto;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@Tag(name = "canal-onboarding", description = "API para gestion de canales onboarding")
@RestController
@RequestMapping("/api/v1/canal-onboarding")
public class CanalOnboardingController {
    private final CanalOnboardingService canalOnboardingService;

    public CanalOnboardingController(CanalOnboardingService canalOnboardingService) {
        this.canalOnboardingService = canalOnboardingService;
    }


    @GetMapping()
    @Operation(summary = "",
            description = "",
            tags = {"canal-onboarding"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<List<CanalOnboardingDto>>> getCanalesOnboardingList() {
        try {
            List<CanalOnboardingDto> canalesOnboarding = this.canalOnboardingService.canalesOnboardingList();
            return ok(ApiUtil.buildResponseWithDefaults(canalesOnboarding));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }
}
