package bo.com.mc4.onboarding.backoffice.job;

import bo.com.mc4.onboarding.core.quartz.service.JobDto;
import bo.com.mc4.onboarding.core.service.business.SincronizacionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.scheduling.quartz.QuartzJobBean;

@Slf4j
@RequiredArgsConstructor
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class DirectoraSyncJob extends QuartzJobBean {
    private static final String TRIGGER_NAME = DirectoraSyncJob.class.getName() + "-Trigger";
    public static final String JOB_NAME = DirectoraSyncJob.class.getName();
    public static final String JOB_DESCRIPTION = "Proceso automático para sincronización de directoras";

    private final SincronizacionService sincronizacionService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobKey key = jobExecutionContext.getJobDetail().getKey();
        log.info("Ejecutando job: {}, {}", key.getGroup(), key.getName());
        try {
            sincronizacionService.sincronizarDirectorasGera();
            log.info("Fin job: {}, {}", key.getGroup(), key.getName());
        } catch (Exception e) {
            log.error("Error Job: ", e);
        }
    }

    public static JobDto getJobDto(String groupName, String jobName) {
        return JobDto.builder()
                .groupName(groupName)
                .jobName(jobName)
                .jobClass(DirectoraSyncJob.class)
                .triggerKey(TRIGGER_NAME)
                .build();
    }
}
