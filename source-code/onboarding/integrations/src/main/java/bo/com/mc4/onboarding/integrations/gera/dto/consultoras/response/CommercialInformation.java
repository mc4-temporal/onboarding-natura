package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * CommercialInformation
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class CommercialInformation {

    private Integer roleCode;

    private String roleName;

    private Integer roleStartCycle;

}