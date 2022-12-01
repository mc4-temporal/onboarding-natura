package bo.com.mc4.onboarding.landing.rest.commons;

import bo.com.mc4.onboarding.core.util.ApiConstants;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.integrations.gera.GeraClient;
import bo.com.mc4.onboarding.integrations.gera.IGeraClient;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.ConsultaDirectorasResponseDto;
import bo.com.mc4.onboarding.integrations.gera.dto.input.ConsultaDirectorasQpDTO;
import bo.com.mc4.onboarding.model.business.dto.test.FakeCreditoDto;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import bo.com.mc4.onboarding.model.commons.dto.api.page.ResponsePage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@Tag(name = "utils", description = "API de utileria")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/utils")
public class UtilController {

    private final IGeraClient geraClient;


    @GetMapping("/test-search-people-gera")
    public ResponseEntity<ResponseBody<List<Map<String, Object>>>> testSearchPeopleApiGera(@RequestParam("token") String token){
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("access_token", token);
            params.put("url", "https://hmlapinaturabo.geravd.com.br/api");

            params.put("document","5391842");
            params.put("includeOptions", Arrays.asList("telephones", "emails"));

            return ok(ApiUtil.buildResponseWithDefaults(geraClient.searchPeople(params)));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/test-directoras")
    public ResponseEntity<ResponseBody<List<ConsultaDirectorasResponseDto>>> testDirectoras(@RequestParam("token") String token,
                                                                                            @RequestParam(value = "page", defaultValue = "1") Integer page,
                                                                                            @RequestParam(value = "size", defaultValue = "10") Integer size){
        try {
            GeraClient.Service dataConnection = new GeraClient.Service();
            dataConnection.setUrl("https://hmlapinaturabo.geravd.com.br/api");
            dataConnection.setToken(token);
            dataConnection.setConnectTimeout(20000);
            dataConnection.setReadTimeout(20000);

            ConsultaDirectorasQpDTO dto = new ConsultaDirectorasQpDTO();

            List<ConsultaDirectorasResponseDto> resp = geraClient.requestConsultaDirectoras(dto, "", page, size, dataConnection).getData();
            return ok(ApiUtil.buildResponseWithDefaults(resp));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio test-directoras, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio test-directoras: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }

    /*@GetMapping("/test-creditos-fake")
    @Operation(summary = "",
            description = "",
            tags = {"credito-fake"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<ResponsePage<FakeCreditoDto>>> getCreditosList(@RequestParam("page") int page,
                                                                                         @RequestParam("size") int size,
                                                                                         @RequestParam(value = "sortBy", defaultValue = "id") String sortBy,
                                                                                         @RequestParam(value = "sortDir", defaultValue = "DESC") Sort.Direction sortDir,
                                                                                         @RequestParam(value = "filtroTexto", defaultValue = "") String filtroTexto) {
        try {
            Arrays.asList(FakeCreditoDto.builder()
                    .id(1)
                    .fechaSolicitud(new Date())
                    .codigoConsultora("ADSAD21212")
                    .nombreCompleto("Consultora B Apellido")
                    .nroDocumento("7841515")
                    .telefono("64582155")
                    .correo("algo@example.com")
                    .gerencia("General")
                    .directoraAsignada("Lucia Perez")
                    .estado("En curso")
                    .build()
                    ,
                    FakeCreditoDto.builder()
                            .id(1)
                            .fechaSolicitud(new Date())
                            .codigoConsultora("PDSA2121")
                            .nombreCompleto("Consultora A Apellido A")
                            .nroDocumento("1234567")
                            .telefono("64582155")
                            .correo("alsgo@example.com")
                            .gerencia("General")
                            .directoraAsignada("Lucia Mojica")
                            .estado("En curso")
                            .build()
            );

            Page<FakeCreditoDto> pageFake = this.consultoraService.getConsultorasList(filtro, ApiUtil.buildPageableWithSort(page, size, sortBy, sortDir));
            return ok(ApiUtil.buildResponseWithDefaults(
                    ApiUtil.buildResponsePaged(pageFake, pageFake.getContent())));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }*/

}
