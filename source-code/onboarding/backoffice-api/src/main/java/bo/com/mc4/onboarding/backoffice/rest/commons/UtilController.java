package bo.com.mc4.onboarding.backoffice.rest.commons;

import bo.com.mc4.onboarding.core.util.ApiConstants;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.integrations.gera.GeraClient;
import bo.com.mc4.onboarding.integrations.gera.IGeraClient;
import bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response.ConsultaConsultorasResponseDto;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.ConsultaDirectorasResponseDto;
import bo.com.mc4.onboarding.integrations.gera.dto.input.ConsultaConsultorasQpDTO;
import bo.com.mc4.onboarding.integrations.gera.dto.input.ConsultaDirectorasQpDTO;
import bo.com.mc4.onboarding.integrations.gera.dto.output.ResponseAuthApiGeraDto;
import bo.com.mc4.onboarding.model.commons.dto.EnumDto;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import bo.com.mc4.onboarding.model.commons.enums.ProcessType;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@Tag(name = "utils", description = "API de utileria")
@RestController
@RequestMapping("/api/v1/utils")
@RequiredArgsConstructor
public class UtilController {

    private final IGeraClient geraClient;

    @PostMapping("/test-gera-auth")
    public ResponseEntity<ResponseBody<ResponseAuthApiGeraDto>> testRetrieveAuthPermissionGera(){
        try {
            Map<String, String> params = new HashMap<String, String>();
            params.put("client_id","EscritorioVirtual");
            params.put("client_secret","9244B35CFF3243E5A29C5ADDD7A514E63D3F3D42");
            params.put("grant_type","password");
            params.put("username","136241");
            params.put("password","Cn2022");
            params.put("url", "https://hmlapiauthnaturabo.geravd.com.br/api");
            return ok(ApiUtil.buildResponseWithDefaults(geraClient.retrieveAuthToken(params)));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/test-search-people-gera")
    public ResponseEntity<ResponseBody<List<Map<String, Object>>>> testSearchPeopleApiGera(){
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("access_token", "2e6VUbUYej7EGtLK3jFg5xLPptVmXIojY-1_tm-EZgVsltmnUVadJlU3-IW4DlwHhgOVY_WXnhBdbK7Qs-JRqNBhnEUiLZOhZGjPUbO4lxSxFJ16XtR-F83oEqIPmG74S6hrWptRSxiF72M9e5t4TTd2rTT0yqlBVx-0OiVOrvQqEx7d5gq1VaTxlq45Wp3-ziAh3zdpBjL4RXGSWOCcYO7tLXiMUMSlnBK3Gi0j468ClKMkIAjsEqQIwZE-zXeMg972QFfsB-fnpHbFhpjRI-SqMsEx3z1HB4ltQxWpnkQeNWqGBTnpEOTfmEQ-YctpUYZhR_5hz12agB-DcuOeyuNiOmeMvgUDLXqwTRJeLvmVJzPRqH7bDGuC77Xud5dOYojIxp7iNXjDTSkAfjX1QgNmicwf53aHZbY47dvot3ci45GfwLjrBUbnkudUMgvk_2ehYbGUOefkPdtA_LZ9dUKlCFsgtIRAku8xhycLAJ6b4K3JOo5AeaW97nJDbuKDVnxMWiXwHmTyodIzFXlS4m4dhLo");
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

    @GetMapping("/test-directoras")
    public ResponseEntity<ResponseBody<List<ConsultaDirectorasResponseDto>>> testDirectoras(){
        try {
            GeraClient.Service dataConnection = new GeraClient.Service();
            dataConnection.setUrl("https://hmlapinaturabo.geravd.com.br/api");
            dataConnection.setToken("pAeZItBzfO8zLSgFRpvEzeZ_2Eect5joZ2I6Yhf9XeHg6AIVduQuA1evYsDdSS7sNlOF5-lXzuigvaye-M0ytawkoPg0Ek4UdpCivxGw8qS_7zTvJ76Thtj4KZMRXxry-EryvK3gZQzrU4FlVVjQrzmGhlZm5UdmMfySZVzbCFqpJ94sYwUxVbLG_wHFzvskOQn8m0MgzskmlkTpoJY2FLwElacBz-gPVFN4u4JPYvTmiy81c8DzwZ95AfEvwPY_qFcj9P1V5PCsXKawH_4ILVghDYzHFG1D8qG28WLFqo8FPNYAwzNABeTTpmAZJ_T0o92WteRPkARRjiHEgXhokljMPJVNmXh69pZUDM8xoXFzkxTmh05juIhPCl6pmw2DKf6CUjlRvKAeOLpvpPPNzV2tYoSijJXs9_mzsKYhXrnVR8Io96W_lEph7a_NH3HQm7ew9c0F719uZD_Qw0DfWbYVeT7d-IOKYy9YTPhMAws5eTUrBrYL8iUY572w5f0nLs5jNA");
            dataConnection.setConnectTimeout(20000);
            dataConnection.setReadTimeout(20000);

            ConsultaDirectorasQpDTO dto = new ConsultaDirectorasQpDTO();

            return ok(ApiUtil.buildResponseWithDefaults(geraClient.requestConsultaDirectoras(dto, "", null, null, dataConnection)));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio test-directoras, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio test-directoras: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/test-consultoras")
    public ResponseEntity<ResponseBody<List<ConsultaConsultorasResponseDto>>> testConsultoras(){
        try {
            GeraClient.Service dataConnection = new GeraClient.Service();
            dataConnection.setUrl("https://hmlapinaturabo.geravd.com.br/api");
            dataConnection.setToken("pAeZItBzfO8zLSgFRpvEzeZ_2Eect5joZ2I6Yhf9XeHg6AIVduQuA1evYsDdSS7sNlOF5-lXzuigvaye-M0ytawkoPg0Ek4UdpCivxGw8qS_7zTvJ76Thtj4KZMRXxry-EryvK3gZQzrU4FlVVjQrzmGhlZm5UdmMfySZVzbCFqpJ94sYwUxVbLG_wHFzvskOQn8m0MgzskmlkTpoJY2FLwElacBz-gPVFN4u4JPYvTmiy81c8DzwZ95AfEvwPY_qFcj9P1V5PCsXKawH_4ILVghDYzHFG1D8qG28WLFqo8FPNYAwzNABeTTpmAZJ_T0o92WteRPkARRjiHEgXhokljMPJVNmXh69pZUDM8xoXFzkxTmh05juIhPCl6pmw2DKf6CUjlRvKAeOLpvpPPNzV2tYoSijJXs9_mzsKYhXrnVR8Io96W_lEph7a_NH3HQm7ew9c0F719uZD_Qw0DfWbYVeT7d-IOKYy9YTPhMAws5eTUrBrYL8iUY572w5f0nLs5jNA");
            dataConnection.setConnectTimeout(20000);
            dataConnection.setReadTimeout(20000);

            ConsultaConsultorasQpDTO dto = new ConsultaConsultorasQpDTO();
            dto.setFunctionCode(1);

            return ok(ApiUtil.buildResponseWithDefaults(geraClient.requestConsultaConsultoras(dto, "", null, null, dataConnection)));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio test-directoras, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio test-directoras: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }
}
