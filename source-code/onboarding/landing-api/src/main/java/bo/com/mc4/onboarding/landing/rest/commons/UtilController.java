package bo.com.mc4.onboarding.landing.rest.commons;

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
@RequiredArgsConstructor
@RequestMapping("/api/v1/utils")
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

    @GetMapping("/test-consultoras")
    public ResponseEntity<ResponseBody<List<ConsultaConsultorasResponseDto>>> testConsultoras(@RequestParam("token") String token,
                                                                                              @RequestParam(value = "page", defaultValue = "1") Integer page,
                                                                                              @RequestParam(value = "size", defaultValue = "10") Integer size){
        try {
            GeraClient.Service dataConnection = new GeraClient.Service();
            dataConnection.setUrl("https://hmlapinaturabo.geravd.com.br/api");
            dataConnection.setToken(token);
            dataConnection.setConnectTimeout(20000);
            dataConnection.setReadTimeout(20000);

            ConsultaConsultorasQpDTO dto = new ConsultaConsultorasQpDTO();
            dto.setFunctionCode(1);

            return ok(ApiUtil.buildResponseWithDefaults(geraClient.requestConsultaConsultoras(dto, "", page, size, dataConnection)));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio test-directoras, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio test-directoras: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }
}
