package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * BusinessData
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class BusinessData {

    private Indicator indicator;

    private Integer timeWorkingCycles;

    private Integer currentCycle;

    private Integer firstOrderCycle;

    private Integer ceaseCycle;

    private Integer reactivatedCycle;

    private Integer inactiveCycles;

    private String firstOrderDate;

    private String allocationDate;

    private Boolean blocked;

    private Integer blockReason;

    private Integer comercialSituation;

    private String timeWorking;

    private Integer nextCycle;

}