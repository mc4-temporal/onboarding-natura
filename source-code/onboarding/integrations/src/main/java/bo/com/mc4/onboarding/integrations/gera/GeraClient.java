package bo.com.mc4.onboarding.integrations.gera;

import bo.com.mc4.onboarding.integrations.gera.dto.GeraResponse;
import bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response.ConsultaConsultorasResponseDto;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.ConsultaDirectorasResponseDto;
import bo.com.mc4.onboarding.integrations.gera.dto.input.AuthParamApiGeraDto;
import bo.com.mc4.onboarding.integrations.gera.dto.input.ConsultaConsultorasQpDTO;
import bo.com.mc4.onboarding.integrations.gera.dto.input.ConsultaDirectorasQpDTO;
import bo.com.mc4.onboarding.integrations.gera.dto.output.ResponseAuthApiGeraDto;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service("geraClient")
public class GeraClient implements IGeraClient {

    private RestTemplate restTemplate = new RestTemplate();
    private static final String ENDPOINT_POST_RETRIEVE_TOKEN_AUTH = "/token";
    private static final String ENDPOINT_GET_SEARCH_PEOPLE = "/people";

    private static final String ENDPOINT_GET_DIRECTORAS = "/commercialStructures";
    private static final String ENDPOINT_GET_CONSULTORAS = "/sellers";

    @Override
    public ResponseAuthApiGeraDto retrieveAuthToken(Map<String, String> params) {

        String baseUrl = params.remove("url");
        String finalUrlEndpoint = String.format("%s/%s", baseUrl, ENDPOINT_POST_RETRIEVE_TOKEN_AUTH);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED.toString());
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());


        MultiValueMap<String, String> requestBody = new LinkedMultiValueMap<>(
                params.entrySet().stream().collect(
                        Collectors.toMap(Map.Entry::getKey, e -> Arrays.asList(e.getValue()))
                )
        );
        HttpEntity formEntity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<ResponseAuthApiGeraDto> response =
                restTemplate.exchange(finalUrlEndpoint, HttpMethod.POST, formEntity, ResponseAuthApiGeraDto.class);

        return response.getBody();
    }

    @Override
    public List<Map<String, Object>> searchPeople(Map<String, Object> params) {
        String baseUrl = (String) params.remove("url");
        String finalUrlEndpoint = String.format("%s/%s", baseUrl, ENDPOINT_GET_SEARCH_PEOPLE);


        HttpHeaders headers = new HttpHeaders();
        String bearerToken = String.format("Bearer %s", params.remove("access_token"));
        headers.add("Authorization", bearerToken);
        headers.add("Content-Type", MediaType.APPLICATION_JSON.toString());
        //headers.add("Accept", MediaType.APPLICATION_JSON.toString());

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(finalUrlEndpoint);
        params.forEach((k, v) -> builder.queryParam(k, v));

        HttpEntity requestEntity = new HttpEntity<>(null, headers);

        ResponseEntity<List<Map<String, Object>>> response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, requestEntity, new ParameterizedTypeReference<>() {
        });

        return response.getBody();

    }

    @Override
    public GeraResponse<List<ConsultaDirectorasResponseDto>> requestConsultaDirectoras(ConsultaDirectorasQpDTO queryParamsDto, String sortOptions, Integer page, Integer size, Service dataConnection) {

        String baseUrl = dataConnection.getUrl();
        String finalUrlEndpoint = String.format("%s/%s", baseUrl, ENDPOINT_GET_DIRECTORAS);
        String queryParams = MapperDtoQueryParam.convertDtoToQueryParams(queryParamsDto, sortOptions, page, size);
        finalUrlEndpoint = queryParams.isEmpty() ? finalUrlEndpoint : finalUrlEndpoint + "?" + queryParams;

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED.toString());
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        headers.add("Authorization", "Bearer " + dataConnection.getToken());

        HttpEntity formEntity = new HttpEntity<>(headers);

        restTemplate.setRequestFactory(getClientHttpRequestFactory(dataConnection.getConnectTimeout(), dataConnection.getReadTimeout()));

        ResponseEntity<List<ConsultaDirectorasResponseDto>> response =
                restTemplate.exchange(finalUrlEndpoint, HttpMethod.GET, formEntity, new ParameterizedTypeReference<>() {});

        int total = 1000;
        String totalStr = response.getHeaders().getFirst("X-Record-Count");
        if (totalStr != null) {
            total = Integer.parseInt(totalStr);
        }
        return GeraResponse.<List<ConsultaDirectorasResponseDto>>builder()
                .data(response.getBody())
                .total(total)
                .build();
    }

    @Override
    public List<ConsultaConsultorasResponseDto> requestConsultaConsultoras(ConsultaConsultorasQpDTO queryParamsDto, String sortOptions, Integer page, Integer size, Service dataConnection) {

        String baseUrl = dataConnection.getUrl();
        String finalUrlEndpoint = String.format("%s/%s", baseUrl, ENDPOINT_GET_CONSULTORAS);
        String queryParams = MapperDtoQueryParam.convertDtoToQueryParams(queryParamsDto, sortOptions, page, size);
        finalUrlEndpoint = queryParams.isEmpty() ? finalUrlEndpoint : finalUrlEndpoint + "?" + queryParams;

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED.toString());
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        headers.add("Authorization", "Bearer " + dataConnection.getToken());

        HttpEntity formEntity = new HttpEntity<>(headers);

        restTemplate.setRequestFactory(getClientHttpRequestFactory(dataConnection.getConnectTimeout(), dataConnection.getReadTimeout()));

        ResponseEntity<List<ConsultaConsultorasResponseDto>> response =
                restTemplate.exchange(finalUrlEndpoint, HttpMethod.GET, formEntity, new ParameterizedTypeReference<>() {});

        return response.getBody();
    }

    private SimpleClientHttpRequestFactory getClientHttpRequestFactory(Integer connectTimeout, Integer readTimeout) {
        SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        clientHttpRequestFactory.setConnectTimeout(connectTimeout);
        clientHttpRequestFactory.setReadTimeout(readTimeout);

        return clientHttpRequestFactory;
    }

    @Getter
    @Setter
    public static class Service {
        private String url;
        private Integer connectTimeout;
        private Integer readTimeout;
        private String token;
    }
}
