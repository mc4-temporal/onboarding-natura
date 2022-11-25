package bo.com.mc4.onboarding.integrations.gera;

import bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response.ConsultaConsultorasResponseDto;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.ConsultaDirectorasResponseDto;
import bo.com.mc4.onboarding.integrations.gera.dto.input.ConsultaConsultorasQpDTO;
import bo.com.mc4.onboarding.integrations.gera.dto.input.ConsultaDirectorasQpDTO;
import bo.com.mc4.onboarding.integrations.gera.dto.output.ResponseAuthApiGeraDto;

import java.util.List;
import java.util.Map;

/**
 * Created by    : msaavedra
 * Date          : 22/11/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.integrations.gera
 **/


public interface IGeraClient {

    ResponseAuthApiGeraDto retrieveAuthToken(Map<String, String> params);

    List<Map<String,Object>> searchPeople(Map<String, Object> parmas);

    List<ConsultaDirectorasResponseDto> requestConsultaDirectoras(ConsultaDirectorasQpDTO queryParamsDto, String sortOptions, Integer page, Integer size, GeraClient.Service dataConnection);

    List<ConsultaConsultorasResponseDto> requestConsultaConsultoras(ConsultaConsultorasQpDTO queryParamsDto, String sortOptions, Integer page, Integer size, GeraClient.Service dataConnection);

}
