package bo.com.mc4.onboarding.core.quartz.config;

import org.springframework.scheduling.quartz.CronTriggerFactoryBean;

import java.text.ParseException;

/**
 * Needed to set Quartz useProperties=true when using Spring classes,
 * because Spring sets an object reference on JobDataMap that is not a String
 * 
 * @see http://site.trimplement.com/using-spring-and-quartz-with-jobstore-properties/
 * @see http://forum.springsource.org/showthread.php?130984-Quartz-error-IOException
 */
public class PersistableCronTriggerFactoryBean extends CronTriggerFactoryBean {
	
	public static final String JOB_DETAIL_KEY = "jobDetail";
	
    @Override
    public void afterPropertiesSet() throws ParseException{
        super.afterPropertiesSet();

        //Remove the JobDetail element
        System.out.println(getJobDataMap().getWrappedMap().containsKey(JOB_DETAIL_KEY));
        System.out.printf(getJobDataMap().getWrappedMap().toString());
        getJobDataMap().remove(JOB_DETAIL_KEY);
    }
}
