package bo.com.mc4.onboarding.integrations.gera.dto.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by    : msaavedra
 * Date          : 22/11/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.model.dto.output
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseAuthApiGeraDto implements Serializable {

    public String access_token;

    private String token_type;

    private int expires_in;

    private String refresh_token;

    private String user_id;

    private String user_name;

    private String client_id;

    private String expired_password;

    private Date refreshToken_expires;

    @JsonProperty(".issued")
    private Date issued;

    @JsonProperty(".expires")
    private Date expires;
}
