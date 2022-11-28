package bo.com.mc4.onboarding.core.quartz.service;

import lombok.*;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.io.Serializable;
import java.util.Date;

/**
 * @Autor :Ricardo Laredo
 * @Date :2021-09-24
 * @Project :ap
 * @Package :bo.com.comunidad.ap.api.quartz.service
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class JobDto implements Serializable {
    /**
     * se usa tambien al momento de registrar un job
     */
    private String groupName;
    /**
     * se usa tambien al momento de registrar un job
     */
    private String jobName;

    private String triggerName;

    private Date scheduleTime;
    private Date lastFiredTime;
    private Date nextFireTime;
    private String jobStatus;
    private String description;
    private String cronExpression;

    /**
     * parametro auxiliar usado al momento de registrar un job
     */
    private String triggerKey;
    /**
     * parametro auxiliar usado al momento de registrar un job
     */
    private Class<? extends QuartzJobBean> jobClass;
}
