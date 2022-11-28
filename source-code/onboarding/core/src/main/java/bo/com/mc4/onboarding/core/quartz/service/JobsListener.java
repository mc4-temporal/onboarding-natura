package bo.com.mc4.onboarding.core.quartz.service;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;
import org.springframework.stereotype.Component;

@Component
public class JobsListener implements JobListener{
	@Override
	public String getName() {
		return "globalJob";
	}

	@Override
	public void jobToBeExecuted(JobExecutionContext context) {
		//LOGGER.info("JobsListener.jobToBeExecuted()");
	}

	@Override
	public void jobExecutionVetoed(JobExecutionContext context) {
		//LOGGER.info("JobsListener.jobExecutionVetoed()");
	}

	@Override
	public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
		//LOGGER.info("JobsListener.jobWasExecuted()");
	}

}
