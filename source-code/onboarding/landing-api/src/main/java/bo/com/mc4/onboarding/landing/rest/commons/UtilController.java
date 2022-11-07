package bo.com.mc4.onboarding.landing.rest.commons;

import bo.com.mc4.onboarding.core.util.ApiConstants;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.commons.dto.EnumDto;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import bo.com.mc4.onboarding.model.commons.enums.ProcessType;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@Tag(name = "utils", description = "API de utileria")
@RestController
@RequestMapping("/api/v1/utils")
public class UtilController {

    @GetMapping("/enum-as-list")
    @Operation(summary = "",
            description = "Servicio para recuperar valores de enum como lista",
            tags = {"enums"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<List<EnumDto>>> getEnumAsList(@RequestParam("enum") String enumName) {
        try {
            List<EnumDto> responseList = new ArrayList<>();
            switch (enumName) {
                case "tipoProceso":
                    responseList.addAll(Arrays.stream(ProcessType.values())
                            .map(value -> EnumDto.builder()
                                    .codigo(value.name())
                                    .descripcion(value.name())
                                    .build()
                            ).collect(Collectors.toList()));
                    break;
                default:
                    throw new OperationException("No se encuentra el enum: " + enumName);
            }
            return ok(ApiUtil.buildResponseWithDefaults(responseList));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }
}
