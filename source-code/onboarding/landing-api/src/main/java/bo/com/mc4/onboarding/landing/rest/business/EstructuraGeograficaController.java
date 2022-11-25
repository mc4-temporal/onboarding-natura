package bo.com.mc4.onboarding.landing.rest.business;

import bo.com.mc4.onboarding.core.service.business.EstructuraGeograficaService;
import bo.com.mc4.onboarding.core.util.ApiConstants;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.business.dto.DepartamentoDto;
import bo.com.mc4.onboarding.model.business.dto.MunicipioDto;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@Tag(name = "Estrucura Geografica API", description = "API para obtener estructura geografica")
@RestController
@RequestMapping("/api/estructura-geografica")
public class EstructuraGeograficaController {

    private final EstructuraGeograficaService estructuraGeograficaService;

    public EstructuraGeograficaController(EstructuraGeograficaService estructuraGeograficaService) {
        this.estructuraGeograficaService = estructuraGeograficaService;
    }

    @GetMapping(value = "/departamento", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Recupera lista de departamentos",
            description = "",
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<List<DepartamentoDto>>> departamentoList() {
        try {
            return ok(ApiUtil.buildResponseWithDefaults(estructuraGeograficaService.departamentoList()));
        } catch (OperationException e) {
            log.error("Error al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error al ejecutar el servicio", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/municipio-por-departamento", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "Recupera lista de municipios por departamento",
            description = "",
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<List<MunicipioDto>>> municipioPorDepartamentoList(@RequestParam("codigoDepartamento") Integer codigoDepartamento) {
        try {
            return ok(ApiUtil.buildResponseWithDefaults(estructuraGeograficaService.municipioPorDepartamentoList(codigoDepartamento)));
        } catch (OperationException e) {
            log.error("Error al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error al ejecutar el servicio", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }
}
