package bo.com.mc4.onboarding.core.quartz.service;

public interface CronExpressionConstant {
    String CRON_START_NOW = "0/5 * * * * ?";
    String CRON_INIT_NOW = "0/10 * * * * ?";
    String CRON_X_15_SEG = "0/15 * * * * ?";
    String CRON_X_1_SEG = "0/1 * * * * ?";
    String CRON_X_30_SEG = "0/30 * * * * ?";
    String CRON_X_1_MIN = "0 0/1 * * * ?";
    String CRON_X_3_MIN = "0 0/3 * * * ?";
    String CRON_X_5_MIN = "0 0/5 * * * ?";
    String CRON_X_10_MIN = "0 0/10 * * * ?";
    String CRON_X_15_MIN = "0 0/15 * * * ?";
    String CRON_X_30_MIN = "0 0/30 * * * ?";

    String CRON_X_08_AM = "0 0 8 * * ?";
    String CRON_X_1_HR = "0 0 * ? * *";
    String CRON_LAST_DAY = "{SEGUNDO} {MINUTO} {HORA} L * ?";
    String CRON_DAYS_9_17_25 = "{SEGUNDO} {MINUTO} {HORA} {DAY} * ? *";
    //0 0 * ? * * ---BK
//PAGO--TR_02619
}
