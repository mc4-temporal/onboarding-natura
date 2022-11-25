package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Registration
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class Registration {

    private String registrationDate;

    private Integer registrationSituation;

    private Integer registrationOrigin;

    private Boolean expiredData;

    private Boolean allowedDisclosureData;

}