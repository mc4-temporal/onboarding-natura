package bo.com.mc4.onboarding.core.quartz.service;

import org.quartz.JobExecutionContext;
import org.quartz.JobKey;
import org.quartz.Trigger;
import org.quartz.Trigger.CompletedExecutionInstruction;
import org.quartz.TriggerListener;
import org.springframework.stereotype.Component;

@Component
public class TriggerListner implements TriggerListener {
    @Override
    public String getName() {
        return "globalTrigger";
    }

    @Override
    public void triggerFired(Trigger trigger, JobExecutionContext context) {
        JobKey key = context.getJobDetail().getKey();
        //LOGGER.info("[{}] [{}] Ejecutando  TriggerListner.triggerFired() ",key.getGroup(),key.getName());
    }

    @Override
    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
        JobKey key = context.getJobDetail().getKey();
        //LOGGER.info("[{}] [{}] Ejecutando  TriggerListner.vetoJobExecution() ",key.getGroup(),key.getName());
        return false;
    }

    @Override
    public void triggerMisfired(Trigger trigger) {
        JobKey key = trigger.getJobKey();
        //LOGGER.info("[{}] [{}] Ejecutando  TriggerListner.triggerMisfired() ",key.getGroup(),key.getName());
        //LOGGER.info("[{}] [{}] Ejecutando  is misfired ",key.getGroup(),key.getName());
        
    }

    @Override
    public void triggerComplete(Trigger trigger, JobExecutionContext context, CompletedExecutionInstruction triggerInstructionCode) {
        JobKey key = trigger.getJobKey();
        //LOGGER.info("[{}] [{}] Ejecutando  TriggerListner.triggerComplete() ",key.getGroup(),key.getName());
    }

}
