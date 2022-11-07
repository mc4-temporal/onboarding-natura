package bo.com.mc4.onboarding.model.commons.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppLogReq implements Serializable {
    private String message;
    private String pagina;
    private String stack;
}
