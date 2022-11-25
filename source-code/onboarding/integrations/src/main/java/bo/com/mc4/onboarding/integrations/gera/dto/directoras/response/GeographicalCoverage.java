package bo.com.mc4.onboarding.integrations.gera.dto.directoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * GeographicalCoverage
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class GeographicalCoverage {

    private GeographicalStructure geographicalStructure;

    private Boolean denied;

    private ChangeUser changeUser;

}