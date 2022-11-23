package bo.com.mc4.onboarding.integrations.gera;

import bo.com.mc4.onboarding.integrations.gera.dto.input.AuthParamApiGeraDto;
import bo.com.mc4.onboarding.integrations.gera.dto.output.ResponseAuthApiGeraDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
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

    // two service methods {auth, searchPerson} -> REST API Endpoint
    // Parametizer data URL
    @Autowired
    private RestTemplate restTemplate;
    private static final String ENDPOINT_POST_RETRIEVE_TOKEN_AUTH = "/token";
    private static final String ENDPOINT_GET_SEARCH_PEOPLE = "/people";

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


}
