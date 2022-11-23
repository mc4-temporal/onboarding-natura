package bo.com.mc4.onboarding.integrations.gera;

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
}
