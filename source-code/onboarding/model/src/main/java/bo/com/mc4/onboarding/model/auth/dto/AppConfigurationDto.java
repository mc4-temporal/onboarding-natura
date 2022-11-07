package bo.com.mc4.onboarding.model.auth.dto;

import bo.com.mc4.onboarding.model.auth.enums.ApplicationType;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppConfigurationDto implements Serializable {
    private Long id;
    private ApplicationType applicationType;
    private String jsonConfig;
    private Long idAuthUser;
}
