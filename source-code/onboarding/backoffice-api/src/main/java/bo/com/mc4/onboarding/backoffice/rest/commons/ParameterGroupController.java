package bo.com.mc4.onboarding.backoffice.rest.commons;

import bo.com.mc4.onboarding.core.service.commons.ParameterGroupService;
import bo.com.mc4.onboarding.core.util.ApiConstants;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.auth.dto.ParameterGroupDto;
import bo.com.mc4.onboarding.model.commons.ParameterGroup;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@Tag(name = "parameter-group", description = "API para gestion de los grupos de parametros")
@RestController
@RequestMapping("/api/v1/parameter-group")
public class ParameterGroupController {
    private final ParameterGroupService parameterGroupService;

    public ParameterGroupController(ParameterGroupService parameterGroupService) {
        this.parameterGroupService = parameterGroupService;
    }

    @GetMapping()
    @Operation(summary = "",
            description = "",
            tags = {"parameter-group"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<List<ParameterGroupDto>>> getParameterGroupList() {
        try {
            List<ParameterGroup> parameterGroups = this.parameterGroupService.getParameterGroupList();
            return ok(ApiUtil.buildResponseWithDefaults(parameterGroups.stream().map(ParameterGroupDto::fromParameterGroup)
                    .collect(Collectors.toList())));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }
}
