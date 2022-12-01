package bo.com.mc4.onboarding.model.business.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CanalOnboardingDto {
    private Long id;
    private String codigo;
    private String descripcion;
}
