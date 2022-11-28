package bo.com.mc4.onboarding.core.quartz.service;

import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.quartz.*;
import org.quartz.Trigger.TriggerState;
import org.quartz.impl.matchers.GroupMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.text.ParseException;
import java.util.*;

@Slf4j
@Service
public class JobServiceImpl implements JobService {
//    @Autowired
//    @Lazy
//    private SchedulerFactoryBean schedulerFactoryBean;
    @Autowired
    private Scheduler scheduler;
    @Autowired
    private ApplicationContext context;

    private JobKey getJobKey(String groupName, String paramJobName) throws SchedulerException {
        try {
            for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
                String jobName = jobKey.getName();
                if (jobName != null && jobName.equals(paramJobName))
                    return jobKey;
            }
        } catch (Exception e) {
            log.error("Error inesperado al obtener el jobKey, causa:[{}] ", e.getMessage(), e);
            throw e;
        }
        return null;
    }

    @Override
    public String getJobNameStartWith(String groupName, String paramJobName) {
        try {
            for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
                if (jobKey.getName() != null && jobKey.getName().startsWith(paramJobName))
                    return jobKey.getName();
            }
        } catch (Exception e) {
            log.error("Error inesperado al obtener el jobName, causa:[{}] ", e.getMessage());
        }
        return null;
    }

    @Override
    public boolean existJobName(String groupName, String paramJobName) {
        try {
            for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
                if (jobKey.getName() != null && jobKey.getName().equals(paramJobName))
                    return true;
            }
        } catch (Exception e) {
            log.error("Error inesperado al obtener el jobName. ", e);
        }
        return false;
    }

    @Override
    public boolean existJobName(String groupName) {
        try {
            Set<JobKey> jobKeySet = scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName));
            return !jobKeySet.isEmpty();
        } catch (Exception e) {
            log.error("Error inesperado al obtener el jobName. ", e);
        }
        return false;
    }

    @Override
    public boolean existJobNameStartWith(String groupName, String paramJobNameStartWith) {
        try {
            for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
                if (jobKey.getName() != null && jobKey.getName().startsWith(paramJobNameStartWith))
                    return true;
            }
        } catch (Exception e) {
            log.error("Error inesperado al obtener el jobName. ", e);
        }
        return false;
    }

    @Override
    public boolean createJob(String groupName, String jobName, Class<? extends QuartzJobBean> jobClass, Map<String, String> data, String description) {
        log.info("[{}] [{}] Creando job ", groupName, jobName);
        JobDetail jobDetail = JobUtil.createJob(jobClass, true, context, jobName, groupName, data, description);
        try {
            scheduler.addJob(jobDetail, true);
        } catch (SchedulerException e) {
            log.error("E");
        }
        return true;
    }

    @Override
    public boolean scheduleOneTimeJob(JobDto jobDto, Date startTime, Map<String, String> data, int repeatCount, long repeatInterval, String description) {
        return scheduleOneTimeJob(jobDto.getGroupName(), jobDto.getJobName(), jobDto.getTriggerKey(), jobDto.getJobClass(), startTime, data, repeatCount, repeatInterval, description);
    }

    /**
     * Schedule a job by jobName at given date.
     */
    @Override
    public boolean scheduleOneTimeJob(String groupName, String jobName, String triggerKey, Class<? extends QuartzJobBean> jobClass, Date startTime, Map<String, String> data, int repeatCount, long repeatInterval, String description) {
        log.info("[{}] [{}] Creando job", groupName, jobName);
        data.put(JobUtil.KEY_ATTEMPT, String.valueOf(0));
        data.put(JobUtil.KEY_MAX_ATTEMPT, String.valueOf(repeatCount));

        JobDetail jobDetail = JobUtil.createJob(jobClass, false, context, jobName, groupName, data,description);
        log.info("[{}] [{}] Creando trigger con nombre: [{}] ", groupName, jobName, triggerKey);
        Date st = new Date(startTime.getTime() - repeatInterval);
        Trigger cronTriggerBean = JobUtil.createSingleTrigger(null, triggerKey, st, SimpleTrigger.MISFIRE_INSTRUCTION_RESCHEDULE_NOW_WITH_REMAINING_REPEAT_COUNT, repeatCount, repeatInterval, data);
        try {
            Date dt = scheduler.scheduleJob(jobDetail, cronTriggerBean);
            log.info("[{}] [{}] Job creado exitosamente para ejecutarse en : [{}]", groupName, jobName, dt);
            return true;
        } catch (SchedulerException e) {
            log.error("[{}] [{}] Error al crear el job", groupName, jobName, e);
        }
        return false;
    }

    @Override
    public boolean createTriggerOneTimeJob(String groupName, String jobName, String triggerKey, Date startTime, Map<String, String> data, int repeatCount, long repeatInterval) {
        log.info("[{}] [{}] Creando el trigger con la expresion ", groupName, jobName);
        try {
            JobKey jkey = new JobKey(jobName, groupName);
            JobDetail jobDetail = scheduler.getJobDetail(jkey);
            Trigger trigger = JobUtil.createSingleTrigger(jobDetail, triggerKey, startTime, SimpleTrigger.MISFIRE_INSTRUCTION_RESCHEDULE_NEXT_WITH_REMAINING_COUNT, repeatCount, repeatInterval, data);
            log.info("[{}] [{}] Trigger creado correctamente, proxima fecha de ejecucion: [{}]", groupName, jobName, trigger.getNextFireTime());

            Date dt = scheduler.scheduleJob(trigger);
            log.info("[{}] [{}] Se ha creado exitosamente el trigger:[{}] ", groupName, jobName, triggerKey);
            return true;
        } catch (SchedulerException e) {
            log.error("[{}] [{}] Error al crear el trigger:[{}] ", groupName, jobName, triggerKey, e);
        }
        return false;
    }

    @Override
    public void scheduleCronJob(JobDto jobDto, Date startTime, String cronExpression, Map<String, String> data, String description) {
        scheduleCronJob(jobDto.getGroupName(), jobDto.getJobName(), jobDto.getTriggerKey(), jobDto.getJobClass(), startTime, cronExpression, data, description);
    }

    /**
     * Schedule a job by jobName at given date.
     */
    @Override
    public void scheduleCronJob(String groupName, String jobName, String triggerKey, Class<? extends QuartzJobBean> jobClass, Date startTime, String cronExpression, Map<String, String> data, String description) {
        log.info("[{}] [{}] Creando nuevo Job ", groupName, jobName);
        JobDetail jobDetail = JobUtil.createJob(jobClass, false, context, jobName, groupName, data, description);
        log.info("[{}] [{}] Job creado correctamente ", groupName, jobName);
        try {
            log.info("[{}] [{}] Creando el trigger con la expresion cron: [{}]", groupName, jobName, cronExpression);
            Trigger cronTriggerBean = JobUtil.createCronTrigger(null, triggerKey, startTime, cronExpression, SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW, data);
            log.info("[{}] [{}] Trigger creado correctamente, proxima fecha de ejecucion: [{}]", groupName, jobName, cronTriggerBean.getNextFireTime());

            scheduler.scheduleJob(jobDetail, cronTriggerBean);

            log.info("[{}] [{}] Se ha creado exitosamente el trigger:[{}] ", groupName, jobName, triggerKey);
        } catch (ObjectAlreadyExistsException e) {
            log.error("[{}] [{}] Ya existe el cronJob [{}]", groupName, jobName, triggerKey);
            // DON'T THROW NOTHING EXCEPTION
        } catch (SchedulerException e) {
            log.error("[{}] [{}] Error SchedulerException al crear cronJob:[{}] ", groupName, jobName, triggerKey, e);
            throw new OperationException("Error al crear cronJob.");
        } catch (ParseException e) {
            log.error("[{}] [{}] Error  ParseException al crear cronJob:[{}] ", groupName, jobName, triggerKey, e);
            throw new OperationException("Error al crear cronJob.");
        }
    }

    @Override
    public void createTrigger(String groupName, String jobName, String triggerKey, Date date, String cronExpression, Map<String, String> data) {
        log.info("[{}] [{}] Creando el trigger con la expresion cron: [{}]", groupName, jobName, cronExpression);
        try {
            JobKey jkey = new JobKey(jobName, groupName);
            JobDetail jobDetail = scheduler.getJobDetail(jkey);
            Trigger cronTriggerBean = JobUtil.createCronTrigger(jobDetail, triggerKey, date, cronExpression, SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW, data);
            log.info("[{}] [{}] Trigger creado correctamente, proxima fecha de ejecucion: [{}]", groupName, jobName, cronTriggerBean.getNextFireTime());
            scheduler.scheduleJob(cronTriggerBean);
            log.info("[{}] [{}] Se ha creado exitosamente el trigger:[{}] ", groupName, jobName, triggerKey);
        } catch (SchedulerException e) {
            log.error("[{}] [{}] Error SchedulerException al crear cronTrigger:[{}] ", groupName, jobName, triggerKey, e);
            throw new OperationException("Error al crear cronJob.");
        } catch (ParseException e) {
            log.error("[{}] [{}] Error  ParseException al crear cronTrigger:[{}] ", groupName, jobName, triggerKey, e);
            throw new OperationException("Error al crear cronJob.");
        }

    }


    /**
     * Update one time scheduled job.
     */
    @Override
    public boolean updateOneTimeJob(String jobKey, Date date) {
        log.info("Request received for updating one time job.");
        log.info("Parameters received for updating one time job : jobKey :" + jobKey + ", date: " + date);
        try {
            //Trigger newTrigger = JobUtil.createSingleTrigger(jobKey, date, SimpleTrigger.MISFIRE_INSTRUCTION_RESCHEDULE_NEXT_WITH_REMAINING_COUNT);
            Trigger newTrigger = JobUtil.createSingleTrigger(jobKey, date, SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW);

            Date dt = scheduler.rescheduleJob(TriggerKey.triggerKey(jobKey), newTrigger);
            log.info("Trigger associated with jobKey :" + jobKey + " rescheduled successfully for date :" + dt);
            return true;
        } catch (Exception e) {
            log.error("SchedulerException while updating one time job with key :" + jobKey + " message :" + e.getMessage());
            log.error("{}", e);
            return false;
        }
    }

    @Override
    public boolean updateOneTimeJob(String groupName, String jobName, Date date) {
        if (jobName == null || jobName.trim().length() == 0) {
            log.error("[{}] [{}] Error jobName no valido", groupName, jobName);
            return false;
        }
        JobKey jobKey = new JobKey(jobName, groupName);
        try {
            List<Trigger> triggers = (List<Trigger>) scheduler.getTriggersOfJob(jobKey);

            SimpleTrigger simpleTrigger = null;
            for (Trigger trigger : triggers) {
                log.info("Nombre de Trigger: [{}]", trigger.getKey().getName());
                if (trigger instanceof SimpleTrigger) {
                    log.info("Se encontro cronTrigger:[{}]", trigger.getKey().getName());
                    simpleTrigger = (SimpleTrigger) trigger;
                    break;
                }
            }
            if (simpleTrigger == null) {
                log.error("No se encontro ningun cronTrigger");
                throw new OperationException("No se encontro ningun trigger");
            }

            JobDetail jobDetail = scheduler.getJobDetail(jobKey);
            Map<String, String> data = JobUtil.getMap(jobDetail.getJobDataMap());

            // OLD TRIGGER KEY
//            TriggerKey oldTriggerKey = TriggerKey.triggerKey(jobName);
            TriggerKey oldTriggerKey = triggers.get(0).getKey();

            // NEW TRIGGER

            Trigger newTrigger = JobUtil.createSingleTrigger(oldTriggerKey.getName(), date, SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW, data);
            Date dt = scheduler.rescheduleJob(oldTriggerKey, newTrigger);
            log.info("updateCronJob jobKey :" + jobKey.getName() + " rescheduled successfully for date :" + dt);
            return false;
        } catch (SchedulerException e) {
            log.error("[{}] [{}] SchedulerException. Error al reprogramar el job", groupName, jobName, e);
            throw new OperationException("Excepcion al reprogramar el job: [" + groupName + " , " + jobName + " ] revise los intervalos");
        } catch (Exception e) {
            log.error("[{}] [{}] Exception. Error al reprogramar el job", groupName, jobName, e);
            throw new OperationException("Excepcion al reprogramar el job: [" + groupName + " , " + jobName + " ]");
        }
    }


    @Override
    public boolean updateCronJob(String groupName, String jobName, Date startTime, String cronExpression ) {
        if (jobName == null || jobName.trim().length() == 0) {
            log.error("[{}] [{}] Error jobName no valido", groupName, jobName);
            return false;
        }
        JobKey jobKey = new JobKey(jobName, groupName);
        try {
            List<Trigger> triggers = (List<Trigger>) scheduler.getTriggersOfJob(jobKey);
            if (cronExpression == null) {
                cronExpression = ((CronTrigger) triggers.get(0)).getCronExpression();
            } else {
                CronTrigger cronTrigger = null;
                for (Trigger trigger : triggers) {
                    if(trigger instanceof  CronTrigger ){
                        cronTrigger = (CronTrigger)trigger;
                        break;
                    }
                }
                if(cronTrigger == null){
                    log.error("[{}, {} ] No se encontro ningun cronTrigger", groupName, jobName);
                    throw new OperationException("No se encontro ningun trigger");
                }
                String oldCronExpresion = cronTrigger.getCronExpression();
                if (oldCronExpresion.equals(cronExpression)) {
                    log.info("[{}, {} ] No es necesario actualizar la expresion CRON", groupName, jobName);
                    return false; // not neccessary update, same CronExpression
                }
            }
            JobDetail jobDetail = scheduler.getJobDetail(jobKey);
            Map<String, String> data = JobUtil.getMap(jobDetail.getJobDataMap());
            JobDetail newJobDetail = JobUtil.createJob((Class<? extends QuartzJobBean>) jobDetail.getJobClass(), false, context, jobName, jobKey.getGroup(), data, jobDetail.getDescription());

            // OLD TRIGGER KEY
//            TriggerKey oldTriggerKey = TriggerKey.triggerKey(jobName);
            TriggerKey oldTriggerKey = triggers.get(0).getKey();

            // NEW TRIGGER
            Trigger newTrigger = JobUtil.createCronTrigger(newJobDetail, oldTriggerKey.getName(), startTime, cronExpression, SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW, data);
            Date dt = scheduler.rescheduleJob(oldTriggerKey, newTrigger);
            log.info("[{}, {} ] Job actualizado correctamente proxima fecha de ejecucion: {}", groupName, jobName, DateUtil.formatDefault(dt));
            return false;
        } catch (SchedulerException e) {
            log.error("[{}] [{}] SchedulerException. Error al reprogramar el job", groupName, jobName, e);
            throw new OperationException("Excepcion al reprogramar el job: [" + groupName + " , " + jobName + " ]. Considere revisar la expresion cron [" + cronExpression + "]");
        } catch (ParseException e) {
            log.error("[{}] [{}] ParseException. Error al reprogramar el job", groupName, jobName, e);
            throw new OperationException("Excepcion al reprogramar el job: [" + groupName + " , " + jobName + " ]");
        } catch (Exception e) {
            log.error("[{}] [{}] Exception. Error al reprogramar el job", groupName, jobName, e);
            throw new OperationException("Excepcion al reprogramar el job: [" + groupName + " , " + jobName + " ]");
        }
    }

    @Override
    public boolean updateCronJob(String groupName, String jobName, String triggerName, Date date, String cronExpression) {
        JobKey jobKey = new JobKey(jobName, groupName);
        try {
            List<Trigger> triggers = (List<Trigger>) scheduler.getTriggersOfJob(jobKey);
            if (cronExpression == null) {
                cronExpression = ((CronTrigger) triggers.get(0)).getCronExpression();
            } else {
                CronTrigger cronTrigger = null;
                for (Trigger trigger : triggers) {
                    log.info("Nombre de Trigger: [{}]",trigger.getKey().getName());
                    if(trigger instanceof  CronTrigger && trigger.getKey().getName().equals(triggerName)){
                        log.info("Se encontro cronTrigger:[{}]",trigger.getKey().getName());
                        cronTrigger = (CronTrigger)trigger;
                    }
                }
                if(cronTrigger == null){
                    log.error("No se encontro ningun cronTrigger");
                    throw new OperationException("No se encontro ningun trigger");
                }
                String oldCronExpresion = cronTrigger.getCronExpression();
                if (oldCronExpresion.equals(cronExpression)) {
                    return true; // not neccessary update, same CronExpression
                }
            }
            JobDetail jobDetail = scheduler.getJobDetail(jobKey);
            Map<String, String> data = JobUtil.getMap(jobDetail.getJobDataMap());
            JobDetail newJobDetail = JobUtil.createJob((Class<? extends QuartzJobBean>) jobDetail.getJobClass(), false, context, jobName, jobKey.getGroup(), data, jobDetail.getDescription());

            // OLD TRIGGER KEY
//            TriggerKey oldTriggerKey = TriggerKey.triggerKey(jobName);
            TriggerKey oldTriggerKey = triggers.get(0).getKey();

            // NEW TRIGGER
            Trigger newTrigger = JobUtil.createCronTrigger(newJobDetail, oldTriggerKey.getName(), date, cronExpression, SimpleTrigger.MISFIRE_INSTRUCTION_FIRE_NOW, data);

            Date dt = scheduler.rescheduleJob(oldTriggerKey, newTrigger);
            log.info("updateCronJob jobKey :" + jobKey.getName() + " rescheduled successfully for date :" + dt);
            return false;
        } catch (SchedulerException e) {
            log.error("[{}] [{}] SchedulerException. Error al reprogramar el job", groupName, jobName, e);
            throw new OperationException("Excepcion al reprogramar el job: [" + groupName + " , " + jobName + " ]. Considere revisar la expresion cron [" + cronExpression + "]");
        } catch (ParseException e) {
            log.error("[{}] [{}] ParseException. Error al reprogramar el job", groupName, jobName, e);
            throw new OperationException("Excepcion al reprogramar el job: [" + groupName + " , " + jobName + " ]");
        } catch (Exception e) {
            log.error("[{}] [{}] Exception. Error al reprogramar el job", groupName, jobName, e);
            throw new OperationException("Excepcion al reprogramar el job: [" + groupName + " , " + jobName + " ]");
        }
    }

    @Override
    public boolean jobWillStartIn(String groupName, String jobName, Integer secondsToStart) {
        try {
            if (jobName == null) {
                return false;
            } else if (!existJobName(groupName, jobName)) {
                return false;
            }
            JobKey jobKey = getJobKey(groupName, jobName);
            if (jobKey == null) return false;
            List<Trigger> triggers = (List<Trigger>) scheduler.getTriggersOfJob(jobKey);

            if (triggers.size() > 0) {
                Date nextFireTime = triggers.get(0).getNextFireTime();
                return nextFireTime.before(DateUtil.plusSeconds(new Date(), secondsToStart));
            }
        } catch (Exception e) {
            log.error("jobWillStartIn exception with key: " + jobName + ", message: " + e.getMessage(), e);
        }
        return false;
    }

    /**
     * Remove the indicated Trigger from the scheduler.
     * If the related job does not have any other triggers, and the job is not durable, then the job will also be deleted.
     */
    @Override
    public boolean unScheduleJob(String jobName) {
        log.info("Request received for Unscheduleding job.");
        TriggerKey tkey = new TriggerKey(jobName);
        log.info("Parameters received for unscheduling job : tkey :" + jobName);
        try {
            boolean status = scheduler.unscheduleJob(tkey);
            log.info("Trigger associated with jobKey :" + jobName + " unscheduled with status :" + status);
            return status;
        } catch (SchedulerException e) {
            log.error("SchedulerException while unscheduling job with key :" + jobName + " message :" + e.getMessage());
            log.error("{}", e);
            return false;
        }
    }

    /**
     * Delete the identified Job from the Scheduler - and any associated Triggers.
     */
    @Override
    public boolean deleteJob(String jobName, String groupName) {
        JobKey jkey = new JobKey(jobName, groupName);
        log.info("[{}] [{}] Eliminando job", groupName, jobName);
        try {
            boolean status = scheduler.deleteJob(jkey);
            log.info("[{}] [{}] Job eliminado satisfactoriamente", groupName, jobName);
            return status;
        } catch (SchedulerException e) {
            log.error("[{}] [{}] Error al eliminanar job", groupName, jobName, e);
            return false;
        }
    }

    /**
     * Pause a job
     */
    @Override
    public boolean pauseJob(String groupKey, String jobName) {
        log.info("[{}] [{}] Pausando el job", groupKey, jobName);
        JobKey jkey = new JobKey(jobName, groupKey);
        try {
            scheduler.pauseJob(jkey);
            log.info("[{}] [{}] Se pauso correctamente el job", groupKey, jobName);
            return true;
        } catch (SchedulerException e) {
            log.error("[{}] [{}] Error al pausar el job. causa: {}", groupKey, jobName, e.getMessage());
            return false;
        }
    }

    @Override
    public boolean pauseJob(JobDto jobDto) {
        return pauseJob(jobDto.getGroupName(), jobDto.getJobName());
    }

    /**
     * Resume paused job
     */
    @Override
    public boolean resumeJob(String groupKey, String jobName) {
        log.info("[{}] [{}] Reiniciando el job", groupKey, jobName);
        JobKey jKey = new JobKey(jobName, groupKey);
        try {
            scheduler.resumeJob(jKey);
            log.info("[{}] [{}] Job reiniciado correctamente", groupKey, jobName);
            return true;
        } catch (SchedulerException e) {
            log.error("[{}] [{}] Error al reiniciar el job. causa: {}", groupKey, jobName, e.getMessage());
            return false;
        }
    }

    @Override
    public boolean resumeJob(JobDto jobDto) {
        return resumeJob(jobDto.getGroupName(), jobDto.getJobName());
    }

    /**
     * Método para ejecutar un job. Este método crea un trigger para ejecución inmediata para el job indicado
     *
     * @param groupKey
     * @param jobKey
     * @param data     Opcional
     * @throws OperationException en caso de que no se encuentre el job ó cualquier error se genera una excepción con el
     *                            detalle
     */
    @Override
    public void startJobNow(String groupKey, String jobKey, JobDataMap data) throws OperationException {
        try {
            JobKey jKey = getJobKey(groupKey, jobKey);
            log.info("[{}] [{}] Ejecutando la funcion startNow", groupKey, jobKey);
            scheduler.triggerJob(jKey);
            log.info("[{}] [{}] El Job se ejecutó de manera correcta", groupKey, jobKey);
        } catch (SchedulerException e) {
            log.error("[{}] [{}] El job no se logró ejecutar de manera correcta. causa:{}", groupKey, jobKey, e.getMessage());
            throw new OperationException("Se generó una excepción al ejecutar el job:" + jobKey);
        }
    }

    @Override
    public void startJobNow(JobDto jobDto, JobDataMap data) throws OperationException {
        JobKey jKey = new JobKey(jobDto.getJobName(), jobDto.getGroupName());
        log.info("[{}] [{}] Ejecutando la funcion startNow", jobDto.getGroupName(), jobDto.getJobName());
        try {
            if (data != null) {
                scheduler.triggerJob(jKey, data);
            } else {
                scheduler.triggerJob(jKey);
            }
            log.info("[{}] [{}] El Job se ejecutó de manera correcta", jobDto.getGroupName(), jobDto.getJobName());
        } catch (SchedulerException e) {
            log.error("[{}] [{}] El job no se logró ejecutar de manera correcta. causa:{}", jobDto.getGroupName(), jobDto.getJobName(), e.getMessage());
            throw new OperationException("Se generó una excepción al ejecutar el job:" + jobDto.getJobName());
        }
    }

    /**
     * Check if job is already running
     */
    @Override
    public boolean isJobRunning(String groupKey, String jobName) {
        log.info("[{}] [{}] Verificando si se está ejecutando", groupKey, jobName);
        try {
            List<JobExecutionContext> currentJobs = scheduler.getCurrentlyExecutingJobs();
            if (currentJobs != null) {
                for (JobExecutionContext jobCtx : currentJobs) {
                    String jobNameDB = jobCtx.getJobDetail().getKey().getName();
                    String groupNameDB = jobCtx.getJobDetail().getKey().getGroup();
                    if (jobName.equalsIgnoreCase(jobNameDB) && groupKey.equalsIgnoreCase(groupNameDB)) {
                        return true;
                    }
                }
            }
        } catch (SchedulerException e) {
            log.error("[{}] [{}] Error al verificar si se está ejecutando un job", groupKey, jobName);
            return false;
        }
        return false;
    }

    /**
     * Get all jobs
     */
    @Override
    public List<JobDto> getAllJobs(String groupName) {
        List<JobDto> list = new ArrayList<>();
        try {
            for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
                JobDetail jobDetail = scheduler.getJobDetail(jobKey);
                String jobName = jobKey.getName();
                List<Trigger> triggers = (List<Trigger>) scheduler.getTriggersOfJob(jobKey);
                Date scheduleTime = triggers.get(0).getStartTime();
                Date nextFireTime = triggers.get(0).getNextFireTime();
                Date lastFiredTime = triggers.get(0).getPreviousFireTime();
                JobDto jobDto = new JobDto();
                jobDto.setGroupName(groupName);
                jobDto.setJobName(jobName);
                jobDto.setScheduleTime(scheduleTime);
                jobDto.setLastFiredTime(lastFiredTime);
                jobDto.setNextFireTime(nextFireTime);
                jobDto.setDescription(jobDetail.getDescription());
                if (triggers.get(0) instanceof CronTrigger) {
                    CronTrigger cronTrigger = (CronTrigger) triggers.get(0);
                    jobDto.setCronExpression(cronTrigger.getCronExpression());
                }

                if (isJobRunning(jobKey.getGroup(), jobName)) {
                    jobDto.setJobStatus("RUNNING");
                } else {
                    String jobState = getJobState(jobKey.getGroup(), jobName);
                    jobDto.setJobStatus(jobState);
                }
                list.add(jobDto);
            }

        } catch (SchedulerException e) {
            log.error("SchedulerException. Error al listar todos los job. causa: {}", e.getMessage());
        } catch (Exception e){
            log.error("Error al listar todos los job. causa:", e);
        }
        return list;
    }


    @Override
    public List<JobDto> getJobInfo(String groupName, String jobName) {
        List<JobDto> list = new ArrayList<>();
        try {
            for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
                if (jobKey.getName().equals(jobName)) {
                    String jobGroup = jobKey.getGroup();
                    List<Trigger> triggers = (List<Trigger>) scheduler.getTriggersOfJob(jobKey);
                    Date scheduleTime = triggers.get(0).getStartTime();
                    Date nextFireTime = triggers.get(0).getNextFireTime();
                    Date lastFiredTime = triggers.get(0).getPreviousFireTime();
                    String description = triggers.get(0).getDescription();
                    String cronExpression = "";
                    if (triggers.get(0) instanceof CronTrigger) {
                        CronTrigger cronTrigger = (CronTrigger) triggers.get(0);
                        cronExpression = cronTrigger.getCronExpression();
                    }

                    JobDto jobDto = new JobDto();
                    jobDto.setGroupName(groupName);
                    jobDto.setJobName(jobName);
                    jobDto.setScheduleTime(scheduleTime);
                    jobDto.setLastFiredTime(lastFiredTime);
                    jobDto.setNextFireTime(nextFireTime);
                    jobDto.setDescription(description);
                    jobDto.setCronExpression(cronExpression);
                    if (isJobRunning(jobGroup, jobName)) {
                        jobDto.setJobStatus("RUNNING");
                    } else {
                        String jobState = getJobState(jobGroup, jobName);
                        jobDto.setJobStatus(jobState);
                    }
                    list.add(jobDto);
                }
            }

        } catch (SchedulerException e) {
            log.error("Error al listar  los job por GroupName:{} y JobName:{}. causa: {}", groupName, jobName, e.getMessage());
        }
        return list;
    }

    /**
     * Check job exist with given name
     */
    @Override
    public boolean isJobWithNamePresent(String groupName, String jobName) {
        try {
            JobKey jobKey = new JobKey(jobName, groupName);
            if (scheduler.checkExists(jobKey)) {
                return true;
            }
        } catch (SchedulerException e) {
            log.error("SchedulerException while checking job with name and group exist:" + e.getMessage());
        }
        return false;
    }

    /**
     * Get the current state of job
     */
    public String getJobState(String groupKey, String jobName) {
        log.info("[{}][{}] Verificando el estadoTransaccion del job", groupKey, jobName);
        try {
            JobKey jobKey = new JobKey(jobName, groupKey);
            JobDetail jobDetail = scheduler.getJobDetail(jobKey);
            List<? extends Trigger> triggers = scheduler.getTriggersOfJob(jobDetail.getKey());
            if (triggers != null && triggers.size() > 0) {
                for (Trigger trigger : triggers) {
                    TriggerState triggerState = scheduler.getTriggerState(trigger.getKey());
                    if (TriggerState.PAUSED.equals(triggerState)) {
                        return "PAUSED";
                    } else if (TriggerState.BLOCKED.equals(triggerState)) {
                        return "BLOCKED";
                    } else if (TriggerState.COMPLETE.equals(triggerState)) {
                        return "COMPLETE";
                    } else if (TriggerState.ERROR.equals(triggerState)) {
                        return "ERROR";
                    } else if (TriggerState.NONE.equals(triggerState)) {
                        return "NONE";
                    } else if (TriggerState.NORMAL.equals(triggerState)) {
                        return "SCHEDULED";
                    }
                }
            }
        } catch (SchedulerException e) {
            log.error("[{}][{}] Error al verificar el estadoTransaccion de del job. causa: {}", groupKey, jobName, e.getMessage());
        }
        return null;
    }

    /**
     * Stop a job
     */
    @Override
    public boolean stopJob(String groupName, String jobName) {
        log.info("JobServiceImpl.stopJob()");
        try {
            JobKey jkey = new JobKey(jobName, groupName);
            return scheduler.interrupt(jkey);
        } catch (SchedulerException e) {
            log.error("SchedulerException while stopping job. error message :" + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean stopJob(JobDto jobDto) {
        return stopJob(jobDto.getGroupName(), jobDto.getJobName());
    }

    /**
     * Obtiene un job por nombre del job y el grupo
     */
    public JobDetail getJobDetail(String jobName, String groupKey) {
        try {
            JobKey jobKey = new JobKey(jobName, groupKey);
            return scheduler.getJobDetail(jobKey);
        } catch (SchedulerException e) {
            log.info("[{}] [{}] No se logro getEmpresa el job", groupKey, jobName, e);
        }
        return null;
    }

    @Override
    public boolean isValidExpression(String cronExpression) {
        Assert.notNull(cronExpression,"La expresión cron no puede ser nulo");
//        return org.quartz.CronExpression.isValidExpression(cronExpression);
        return true;
    }

    @Override
    public void startNowCronJob(JobDto jobDto, JobDataMap data) {
        try {
            CronExpression cronExpression1 = new CronExpression(CronExpressionConstant.CRON_X_30_SEG);
            Date date = cronExpression1.getTimeAfter(new Date());
            JobKey jobKey = new JobKey(jobDto.getGroupName(), jobDto.getJobName());
            Trigger trigger = getTrigger(jobKey, jobDto.getTriggerKey());
            Date date1 = new Date(System.currentTimeMillis() - date.getTime());

        } catch (ParseException e) {
            log.error("{}", e);
        }
    }

    @Override
    public void pause(String groupName) {
        try {
            for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
                log.info("Pausando job [{}, {}]",jobKey.getGroup(), jobKey.getName());
                scheduler.pauseJob(jobKey);
            }
        } catch (SchedulerException e) {
            log.error("Error al pasusar los job del grupo:{}", groupName,e);
        }
    }

    @Override
    public void resume(String groupName) {
        try {
            for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
                log.info("Reiniciando job [{}, {}]",jobKey.getGroup(), jobKey.getName());
                scheduler.resumeJob(jobKey);
            }
        } catch (SchedulerException e) {
            log.error("Error al reiniciando los job del grupo:{}", groupName,e);
        }
    }

    @Override
    public void delete(String groupName) {
        try {
            for (JobKey jobKey : scheduler.getJobKeys(GroupMatcher.jobGroupEquals(groupName))) {
                log.info("Eliminando job [{}, {}]",jobKey.getGroup(), jobKey.getName());
                scheduler.deleteJob(jobKey);
            }
        } catch (SchedulerException e) {
            log.error("Error al Eliminando los job del grupo:{}", groupName,e);
        }
    }

    @Override
    public void deleteJob(String jobName, String groupName, String triggerName) {

    }

    @Override
    public void updateDataMapCronJob(String groupName, String jobName, Map<String, String> parametros) {
        JobKey jobKey = new JobKey(jobName, groupName);
        try {
            JobDetail jobDetail = scheduler.getJobDetail(jobKey);
            for (Map.Entry<String, String> item : parametros.entrySet())
                jobDetail.getJobDataMap().put(item.getKey(), item.getValue());

            scheduler.addJob(jobDetail, true, true);
        } catch (SchedulerException e) {
            log.error("Error al actualizar data map de job: nombre: [{}], grupo: [{}]", jobName, groupName);
        }
    }

    @Override
    public void removeItemsDataMap(String jobName, String groupName, List<String> lista) {
        JobKey jobKey = new JobKey(jobName, groupName);
        try {
            JobDetail jobDetail = scheduler.getJobDetail(jobKey);
            for (String key : lista) jobDetail.getJobDataMap().remove(key);

            scheduler.addJob(jobDetail, true, true);
        } catch (SchedulerException e) {
            log.error("Error al actualizar data map de job: nombre: [{}], grupo: [{}]", jobName, groupName);
        }
    }

    private Trigger getTrigger(JobKey jobKey, String triggerKey) {
        try {
            List<Trigger> triggers = (List<Trigger>) scheduler.getTriggersOfJob(jobKey);
            for (Trigger trigger : triggers) {
                if (trigger.getKey().getName().equals(triggerKey)){
                    return trigger;
                }
            }
        } catch (SchedulerException e) {
            log.error("{}", e);
        }
        return null;
    }
}

