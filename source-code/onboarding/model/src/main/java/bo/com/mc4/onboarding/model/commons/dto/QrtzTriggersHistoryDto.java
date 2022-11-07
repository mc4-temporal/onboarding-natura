package bo.com.mc4.onboarding.model.commons.dto;

import bo.com.mc4.onboarding.model.commons.enums.JobState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * @Created by :MC4
 * @Autor :Ricardo Laredo
 * @Email :rlaredo@mc4.com.bo
 * @Date :9/29/22
 * @Project onboarding-source
 * @Package :bo.com.mc4.onboarding.model.commons
 * @Copyright :MC4
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class QrtzTriggersHistoryDto implements Serializable {
    private Long id;
    private String groupName;
    private String jobName;// Mostrar
    private Date startTime;// mostrar
    private Date endTime; // Mostrar
    private JobState jobState; // Mostrar
    private String message; // Mostrar
}
