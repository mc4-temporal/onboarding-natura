package bo.com.mc4.onboarding.model.commons.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum LogType {
    INFO("INFO"),
    WARNING("WARNING"),
    ERROR("ERROR"),
    DEBUG("DEBUG");
    private final String level;
    LogType(String level){
        this.level = level;
    }

}
