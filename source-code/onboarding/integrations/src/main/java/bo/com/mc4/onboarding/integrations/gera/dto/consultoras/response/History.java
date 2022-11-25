package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * History
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class History {

    private Integer initialCycle;

    private Integer finalCycle;

    private String name;

    private Parent__2 parent;

    private ResponsibleUser__1 responsibleUser;

    private ChangeUser changeUser;

    private String changeDate;

}