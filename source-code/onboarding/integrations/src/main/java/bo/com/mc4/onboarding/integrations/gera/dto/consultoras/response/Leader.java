package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Leader
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class Leader {

    private Integer code;

    private String name;

    private List<Alia> alias;

    private Integer roleCode;

    private Leader__1 leader;

    private String email;

    private String telephone;

    private String mobile;

    private String anniversary;

    private List<Role> roles;

    private CommercialStructure commercialStructure;

    private Boolean isCommercialStructureLeader;

    private List<Picture> pictures;

}