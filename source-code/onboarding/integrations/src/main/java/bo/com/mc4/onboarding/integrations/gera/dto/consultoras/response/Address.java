package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Address
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class Address {

    private Integer type;

    private String level0;

    private String level1;

    private String level2;

    private String level3;

    private String level4;

    private String level5;

    private String level6;

    private String level7;

    private String level8;

    private String level9;

    private String complement;

    private String number;

    private String reference;

    private String name;

    private String zipCode;

    private String completeAddress;

    private Integer geographicalStructureCode;

    private Boolean allowChangeOtherApplication;

}