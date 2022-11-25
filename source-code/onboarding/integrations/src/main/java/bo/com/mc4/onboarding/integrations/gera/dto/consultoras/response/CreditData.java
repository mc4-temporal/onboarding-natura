package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * CreditData
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class CreditData {

    private Integer limit;

    private Integer allocatedToBill;

    private Integer allocatedToExpire;

    private Integer allocatedOverdue;

    private Integer availableBalance;

}