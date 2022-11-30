package bo.com.mc4.onboarding.landing.rest.commons;

import bo.com.mc4.onboarding.core.util.ApiConstants;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.integrations.gera.GeraClient;
import bo.com.mc4.onboarding.integrations.gera.IGeraClient;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.ConsultaDirectorasResponseDto;
import bo.com.mc4.onboarding.integrations.gera.dto.input.ConsultaDirectorasQpDTO;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

}
