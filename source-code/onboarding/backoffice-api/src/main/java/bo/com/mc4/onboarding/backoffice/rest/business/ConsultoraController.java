package bo.com.mc4.onboarding.backoffice.rest.business;

import bo.com.mc4.onboarding.core.service.business.ConsultoraService;
import bo.com.mc4.onboarding.core.util.ApiConstants;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.business.dto.ConsultoraDto;
import bo.com.mc4.onboarding.model.business.dto.input.FiltroConsultoraDto;
import bo.com.mc4.onboarding.model.business.enums.TipoConsultora;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import bo.com.mc4.onboarding.model.commons.dto.api.page.ResponsePage;
import bo.com.mc4.onboarding.model.util.DateUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@Tag(name = "consultora", description = "API para gestion de consultoras")
@RestController
@RequestMapping("/api/v1/consultora")
public class ConsultoraController {

    private final ConsultoraService consultoraService;

    public ConsultoraController(ConsultoraService consultoraService) {
        this.consultoraService = consultoraService;
    }

    @GetMapping("/list-by-filters")
    @Operation(summary = "",
            description = "",
            tags = {"consultora"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<ResponsePage<ConsultoraDto>>> getUserList(@RequestParam("page") int page,
                                                                                 @RequestParam("size") int size,
                                                                                 @RequestParam(value = "sortBy", defaultValue = "id") String sortBy,
                                                                                 @RequestParam(value = "sortDir", defaultValue = "DESC") Sort.Direction sortDir,
                                                                                 @RequestParam(value = "filtroTexto", defaultValue = "") String filtroTexto,
                                                                                 @RequestParam(value = "tipoConsultora", defaultValue = "PROSPECTO") String tipoConsultora,
                                                                                 @RequestParam(value = "idCanalOnboarding", defaultValue = "0") long idCanalOnboarding,
                                                                                 @RequestParam(value = "idMunicipio", defaultValue = "0") long idMunicipio,
                                                                                 @RequestParam(value = "fechaRegistroDesde") @DateTimeFormat(pattern = DateUtil.FORMAT_DATE_PARAM_URL) Date fechaRegistroDesde,
                                                                                 @RequestParam(value = "fechaRegistroHasta") @DateTimeFormat(pattern = DateUtil.FORMAT_DATE_PARAM_URL) Date fechaRegistroHasta,
                                                                                 @RequestParam(value = "idUser", defaultValue = "0") long idUser) {
        try {
            FiltroConsultoraDto filtro = FiltroConsultoraDto.builder()
                    .filtroTexto(filtroTexto)
                    .tipoConsultora(TipoConsultora.valueOf(tipoConsultora))
                    .idCanalOnboarding(idCanalOnboarding)
                    .idMunicipio(idMunicipio)
                    .fechaRegistroDesde(fechaRegistroDesde)
                    .fechaRegistroHasta(fechaRegistroHasta)
                    .idUser(idUser)
                    .build();
            Page<ConsultoraDto> pageConsultoras = this.consultoraService.getConsultorasList(filtro, ApiUtil.buildPageableWithSort(page, size, sortBy, sortDir));
            return ok(ApiUtil.buildResponseWithDefaults(
                    ApiUtil.buildResponsePaged(pageConsultoras, pageConsultoras.getContent())));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }
}
