package bo.com.mc4.onboarding.model.auth.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConfigurationDto {
    private Long id;
    private Long asignacionId;
    private Boolean nuevo;
    private String acciones;
}
