package bo.com.mc4.onboarding.integrations.gera.dto.input;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * ConsultaDirectorasQpDTO
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class ConsultaConsultorasQpDTO {

    private Integer functionCode;

    private List<Integer> code;

    private String name;

    private String aliasBusinessName;

    private String initialBirthday;

    private String finalBirthday;

    private Date initialBirthdayComplete;

    private Date finalBirthdayComplete;

    private Integer indicatorCode;

    private String indicatorName;

    private Integer initialTimeWorkingCycles;

    private Integer finalTimeWorkingCycles;

    private Integer initialCurrentCycle;

    private Integer finalCurrentCycle;

    private Integer initialFirstOrderCycle;

    private Integer finalFirstOrderCycle;

    private Integer initialCeaseCycle;

    private Integer finalCeaseCycle;

    private Integer initialReactivatedCycle;

    private Integer finalReactivatedCycle;

    private Integer initialInactiveCycles;

    private Integer finalInactiveCycles;

    private Date initialFirstOrderDate;

    private Date finalFirstOrderDate;

    private Date initialAllocationDate;

    private Date finalAllocationDate;

    private Boolean blocked;

    private List<String> comercialSituation;

    private List<String> businessRoleActive;

    private List<String> businessRoleInactive;

    private Integer trainingSituation;

    private Date initialRegistrationDate;

    private Date finalRegistrationDate;

    private Integer registrationSituation;

    private Integer registrationOrigin;

    private Boolean expiredData;

    private Boolean allowedDisclosureData;

    private Integer leaderCode;

    private Integer groupCode;

    private Boolean searchWholeNetwork;

    private Integer geographicalStructureCode;

    private Integer commercialStructureCode;

    private String email;

    private String document;

    private String telephone;

    private Boolean inDebit;

    private List<String> includeOptions;

    private List<String> roleCode;

}
