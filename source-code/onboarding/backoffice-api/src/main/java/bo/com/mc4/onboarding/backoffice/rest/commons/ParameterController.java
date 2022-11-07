package bo.com.mc4.onboarding.backoffice.rest.commons;

import bo.com.mc4.onboarding.core.service.commons.ParameterService;
import bo.com.mc4.onboarding.core.util.ApiConstants;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.NotDataFoundException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.auth.dto.ParameterDto;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import bo.com.mc4.onboarding.model.commons.dto.api.page.ResponsePage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@Tag(name = "role", description = "API para gestion de parametros")
@RestController
@RequestMapping("/api/v1/parameter")
public class ParameterController {
    private final ParameterService parameterService;

    public ParameterController(ParameterService parameterService) {
        this.parameterService = parameterService;
    }

    @PostMapping()
    @Operation(summary = "Registrar Parametro",
            description = "Método para registrar parametro ",
            tags = {"parameter"}, responses = {
            @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
            @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
            @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
            @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
    }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<ParameterDto>> createParameter(@RequestBody ParameterDto parametroDto) {
        try {
            return ok(ApiUtil.buildResponseWithDefaults(ParameterDto.fromParameterDto(this.parameterService.createParameter(parametroDto))));
        } catch (OperationException | NotDataFoundException e) {
            log.error("Ocurrió un error al guardar parametro {}", e.getMessage(), e);
            throw ApiResponseException.badRequest("Guardar parametro", e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{parameterId}")
    @Operation(summary = "",
            description = "",
            tags = {"parameter"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<?> updateParameter(@PathVariable("parameterId") Long parameterId, @RequestBody ParameterDto parametroDto,
                                             @Parameter(hidden = true) @AuthenticationPrincipal UserDetails userDetails) {
        try {
            return ok(ApiUtil.buildResponseWithDefaults(ParameterDto.fromParameterDto(this.parameterService.updateParameter(parameterId, parametroDto))));
        } catch (OperationException | NotDataFoundException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{parameterId}")
    @Operation(summary = "Eliminar parametro",
            description = "Método para eliminar parametro ",
            tags = {"parameter"}, responses = {
            @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
            @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
            @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
            @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
    }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<?> deleteParameter(@PathVariable("parameterId") Long parameterId) {
        try {
            this.parameterService.delete(parameterId);
            return ok(ApiUtil.buildResponseWithDefaults(true));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/list-parameters-by-group/{group}")
    @Operation(summary = "",
            description = "",
            tags = {"parameter"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<ResponsePage<ParameterDto>>> listParametersByGroup(@PathVariable("group") Long group,
                                                                                          @RequestParam("page") int page,
                                                                                          @RequestParam("size") int size,
                                                                                          @RequestParam(value = "sortBy", defaultValue = "id") String sortBy,
                                                                                          @RequestParam(value = "sortDir", defaultValue = "DESC") Sort.Direction sortDir,
                                                                                          @RequestParam(value = "filter", defaultValue = "") String filter) {
        try {//TIPOS_DOCUMENTO_SECTOR,UNIDADES_MEDIDA,TIPOS_DOCUMENTO_FACTURACION
            Pageable pageable = ApiUtil.buildPageableWithSort(page, size, sortBy, sortDir);
            Page<bo.com.mc4.onboarding.model.commons.Parameter> parameterPage = this.parameterService.listParametersByGroup(group,filter, pageable);
            return ok(ApiUtil.buildResponseWithDefaults(ApiUtil.buildResponsePaged(parameterPage, parameterPage.getContent().stream().map(ParameterDto::fromParameterDto)
                            .collect(Collectors.toList()))
            ));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }
}
