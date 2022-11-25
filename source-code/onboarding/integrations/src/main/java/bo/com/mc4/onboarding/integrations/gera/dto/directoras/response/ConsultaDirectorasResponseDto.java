package bo.com.mc4.onboarding.integrations.gera.dto.directoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * ConsultaDirectorasResponseDto
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class ConsultaDirectorasResponseDto {

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