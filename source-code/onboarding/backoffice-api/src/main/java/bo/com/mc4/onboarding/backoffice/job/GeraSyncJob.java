package bo.com.mc4.onboarding.backoffice.job;

import bo.com.mc4.onboarding.core.service.business.SincronizacionService;
import bo.com.mc4.onboarding.core.util.exception.ExceptionUtil;
import bo.com.mc4.onboarding.integrations.gera.GeraClient;
import bo.com.mc4.onboarding.integrations.gera.IGeraClient;
import bo.com.mc4.onboarding.integrations.gera.dto.output.ResponseAuthApiGeraDto;
import bo.com.mc4.onboarding.model.business.Servicio;
import bo.com.mc4.onboarding.model.business.enums.TipoServicio;
import bo.com.mc4.onboarding.repository.ServicioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.springframework.scheduling.quartz.QuartzJobBean;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

@Slf4j
@RequiredArgsConstructor
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class GeraSyncJob extends QuartzJobBean {
    private static final String TRIGGER_NAME = GeraSyncJob.class.getSimpleName() + "-Trigger";
    public static final String JOB_NAME = GeraSyncJob.class.getSimpleName();
    public static final String JOB_DESCRIPTION = "Proceso automático para sincronización de directoras";

    private final SincronizacionService sincronizacionService;
    private final IGeraClient iGeraClient;
    private final ServicioRepository servicioRepository;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobKey key = jobExecutionContext.getJobDetail().getKey();
        log.info("Ejecutando job: {}, {}", key.getGroup(), key.getName());
        try {
            Servicio servicioGeraAuth = servicioRepository.findByTipo(TipoServicio.AUTH_GERA)
                    .orElseThrow(ExceptionUtil.throwFindFail(TipoServicio.AUTH_GERA.getTipo(), "Servicio"));
            GeraClient.Service dataConnectionAuth = new GeraClient.Service();
            dataConnectionAuth.setUrl(servicioGeraAuth.getUrl());
            dataConnectionAuth.setConnectTimeout(servicioGeraAuth.getConnectionTimeout());
            dataConnectionAuth.setReadTimeout(servicioGeraAuth.getRequestTimeout());
            dataConnectionAuth.setClientId(servicioGeraAuth.getClientId());
            dataConnectionAuth.setClientSecret(servicioGeraAuth.getClientSecret());
            dataConnectionAuth.setGrantType(servicioGeraAuth.getGrantType());
            dataConnectionAuth.setUsername(servicioGeraAuth.getUsername());
            dataConnectionAuth.setPassword(servicioGeraAuth.getPassword());

            ResponseAuthApiGeraDto responseAuthApiGeraDto = iGeraClient.retrieveAuthToken(dataConnectionAuth);

            sincronizacionService.sincronizacionGerencias(responseAuthApiGeraDto.getAccess_token());
            sincronizacionService.sincronizarDirectorasGera(responseAuthApiGeraDto.getAccess_token());
            log.info("Fin job: {}, {}", key.getGroup(), key.getName());
        } catch (Exception e) {
            log.error("Error Job: ", e);
        }
    }

    public static JobDetail getJobDto(String groupName, String jobName) {
        return JobBuilder.newJob()
                .ofType(GeraSyncJob.class)
                .withIdentity(jobName, groupName)
                .withDescription(JOB_DESCRIPTION)
                .build();
    }

    public static Trigger getTrigger(JobDetail job) {
        return TriggerBuilder.newTrigger().forJob(job)
                .withIdentity(TRIGGER_NAME)
                .withDescription(JOB_DESCRIPTION)
                .withSchedule(simpleSchedule().repeatForever().withIntervalInSeconds(30))
                .build();
    }
}
