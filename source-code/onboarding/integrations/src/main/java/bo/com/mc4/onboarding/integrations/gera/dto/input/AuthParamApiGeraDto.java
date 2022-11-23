package bo.com.mc4.onboarding.integrations.gera.dto.input;

import lombok.*;

import java.io.Serializable;

/**
 * Created by    : msaavedra
 * Date          : 22/11/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.integrations.gera.dto.input
 **/

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthParamApiGeraDto implements Serializable {

    private String clientId;

    private String clientSecret;

    private String granType;

    private String username;


}
