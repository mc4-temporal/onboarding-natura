package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * CompanyData
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class CompanyData {

    private String name;

    private String trade;

    private BusinessRole businessRole;

    private IcmsTaxPayer icmsTaxPayer;

    private String site;

    private Boolean authorizeNewsletter;

}