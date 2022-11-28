package bo.com.mc4.onboarding.model.business.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FrmDirectoraConsultoraDto {
    private Long directoraId;
    private Long consultoraId;
    private String correo;
    private Integer codigoConfirmacion;
}
