package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * BankAccount
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class BankAccount {

    private Integer informationNumber;

    private String bankName;

    private Integer bankCode;

    private String accountAgency;

    private String accountNumber;

    private Integer accountType;

    private Boolean defaultAccount;

    private String updatedDate;

}