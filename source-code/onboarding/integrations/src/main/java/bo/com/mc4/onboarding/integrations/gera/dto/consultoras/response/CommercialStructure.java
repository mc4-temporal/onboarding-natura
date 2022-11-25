package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * CommercialStructure
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class CommercialStructure {

    private Integer code;

    private String name;

    private Parent parent;

    private ResponsibleUser responsibleUser;

    private List<CoresponsibleUser> coresponsibleUsers;

    private Level level;

    private Boolean isLeaf;

    private Boolean isActive;

    private Indications indications;

    private List<History> history;

    private List<GeographicalCoverage> geographicalCoverage;

    private LatestOpenedCycle latestOpenedCycle;

}