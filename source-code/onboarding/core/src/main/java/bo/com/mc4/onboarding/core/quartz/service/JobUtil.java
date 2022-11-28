package bo.com.mc4.onboarding.core.quartz.service;

import bo.com.mc4.onboarding.core.quartz.config.PersistableCronTriggerFactoryBean;
import bo.com.mc4.onboarding.core.quartz.config.PersistableSingleTriggerFactoryBean;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JobUtil {

    public static final String KEY_ATTEMPT = "ATTEMPT";
    public static final String KEY_ATTEMPT_ERROR = "ATTEMPT_ERROR";
    public static final String KEY_MAX_ATTEMPT = "MAX_ATTEMPT";



    /**
     * Create Quartz Job.
     *
     * @param jobClass  Class whose executeInternal() method needs to be called.
     * @param isDurable Job needs to be persisted even after completion. if true, job will be persisted, not otherwise.
     * @param context   Spring application context.
     * @param jobName   Job name.
     * @param jobGroup  Job group.
     * @return JobDetail object
     */
    protected static JobDetail createJob(Class<? extends QuartzJobBean> jobClass, boolean isDurable,
                                         ApplicationContext context, String jobName, String jobGroup, Map<String, String> data, String description) {
        JobDetailFactoryBean factoryBean = new JobDetailFactoryBean();
        factoryBean.setJobClass(jobClass);
        factoryBean.setDurability(isDurable);
        factoryBean.setApplicationContext(context);
        factoryBean.setName(jobName);
        factoryBean.setDescription(description);
        factoryBean.setGroup(jobGroup);
        if (data != null) {
            factoryBean.setJobDataAsMap(data);
        }
        factoryBean.afterPropertiesSet();
        return factoryBean.getObject();
    }


    /**
     * Create cron trigger.
     *
     * @param triggerName        Trigger name.
     * @param startTime          Trigger start time.
     * @param cronExpression     Cron expression.
     * @param misFireInstruction Misfire instruction (what to do in case of misfire happens).
     * @return Trigger
     */
    protected static Trigger createCronTrigger(JobDetail jobDetail, String triggerName, Date startTime, String cronExpression, int misFireInstruction, Map<String, String> data) throws ParseException {
        PersistableCronTriggerFactoryBean factoryBean = new PersistableCronTriggerFactoryBean();
        factoryBean.setName(triggerName);
        factoryBean.setStartTime(startTime);
        factoryBean.setCronExpression(cronExpression);
        factoryBean.setMisfireInstruction(misFireInstruction);
        factoryBean.setJobDetail(jobDetail);
        factoryBean.setStartDelay(0L);

        if (data != null) {
            factoryBean.setJobDataAsMap(data);
        }

        try {
            factoryBean.afterPropertiesSet();
        } catch (ParseException e) {
            throw e;
        }
        return factoryBean.getObject();
    }

    /**
     * Create a Single trigger.
     *
     * @param triggerName        Trigger name.
     * @param startTime          Trigger start time.
     * @param misFireInstruction Misfire instruction (what to do in case of misfire happens).
     * @return Trigger
     */
    protected static Trigger createSingleTrigger(String triggerName, Date startTime, int misFireInstruction) {
        SimpleTriggerFactoryBean factoryBean = new SimpleTriggerFactoryBean();
        factoryBean.setName(triggerName);
        factoryBean.setStartTime(startTime);
        factoryBean.setMisfireInstruction(misFireInstruction);
        factoryBean.setRepeatCount(0);

        factoryBean.afterPropertiesSet();
        return factoryBean.getObject();
    }

    /**
     * Create a Single trigger.
     *
     * @param triggerName        Trigger name.
     * @param startTime          Trigger start time.
     * @param misFireInstruction Misfire instruction (what to do in case of misfire happens).
     * @return Trigger
     */
    protected static Trigger createSingleTrigger(String triggerName, Date startTime, int misFireInstruction, Map<String, String> data) {
        SimpleTriggerFactoryBean factoryBean = new SimpleTriggerFactoryBean();
        factoryBean.setName(triggerName);
        factoryBean.setStartTime(startTime);
        factoryBean.setMisfireInstruction(misFireInstruction);
        factoryBean.setRepeatCount(0);
        if (data != null) {
            factoryBean.setJobDataAsMap(data);
        }

        factoryBean.afterPropertiesSet();
        return factoryBean.getObject();
    }

    /**
     * Crea un único trigger
     *
     * @param jobDetail
     * @param triggerName
     * @param startTime
     * @param misFireInstruction
     * @param repeatCount
     * @param repeatInterval
     * @param data
     * @return
     */
    protected static Trigger createSingleTrigger(JobDetail jobDetail, String triggerName, Date startTime, int misFireInstruction, int repeatCount, long repeatInterval, Map<String, String> data) {
        PersistableSingleTriggerFactoryBean factoryBean = new PersistableSingleTriggerFactoryBean();
        factoryBean.setName(triggerName);
        factoryBean.setStartTime(startTime);
        factoryBean.setMisfireInstruction(misFireInstruction);
        factoryBean.setRepeatCount(repeatCount);
        factoryBean.setRepeatInterval(repeatInterval);
        factoryBean.setJobDetail(jobDetail);
        factoryBean.setStartDelay(0L);
        if (data != null) {
            factoryBean.setJobDataAsMap(data);
        }
        factoryBean.afterPropertiesSet();
        return factoryBean.getObject();
    }

    public static void resetAttempt(JobDataMap jobDataMap){
        jobDataMap.put(KEY_ATTEMPT, String.valueOf(0));
    }

    public static int incrementAttempt(JobDataMap jobDataMap){
        int attempt = getIntValueOrDefault(jobDataMap, KEY_ATTEMPT, 0);
        attempt = attempt + 1;
        jobDataMap.put(KEY_ATTEMPT, String.valueOf(attempt));
        return attempt;
    }

    public static boolean isLastAttempt(JobDataMap jobDataMap){
        int attempt = getIntValueOrDefault(jobDataMap, KEY_ATTEMPT, 0);
        int maxAttempt = getIntValueOrDefault(jobDataMap, KEY_MAX_ATTEMPT, 2);
        return  (attempt == maxAttempt + 1);
    }

    public static Long getLongValue(JobDataMap jobDataMap, String key){
        if (jobDataMap.containsKey(key)) {
            Object object = jobDataMap.get(key);
            if (object != null && !object.toString().equals("")) {
                return jobDataMap.getLongValue(key);
            }
        }
        return null;
    }

    public static int getIntValueOrDefault(JobDataMap jobDataMap, String key, int defaultValue){
        return jobDataMap.containsKey(key) ? jobDataMap.getIntValue(key) : defaultValue;
    }

    public static Long getLongValueOrDefault(JobDataMap jobDataMap, String key, long defaultValue){
        if (!jobDataMap.containsKey(key)) {
            return defaultValue;
        } else {
            Object object = jobDataMap.get(key);
            if (object != null) {
                return jobDataMap.getLongValue(key);
            }
            return null;
        }
    }

    public static String getStringValueOrDefault(JobDataMap jobDataMap, String key, String defaultValue){
        return jobDataMap.containsKey(key) ? jobDataMap.getString(key) : defaultValue;
    }

    public static Map<String, String> getMap(JobDataMap jobDataMap){
        Map<String, String> parameters = new HashMap<String, String>();
        for (  Object key : jobDataMap.keySet()) {
            parameters.put((String)key, jobDataMap.get(key).toString());
        }
        return parameters;
    }


}
