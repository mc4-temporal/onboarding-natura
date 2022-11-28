package bo.com.mc4.onboarding.model.business.dto;

import bo.com.mc4.onboarding.model.business.enums.EstadoFlujo;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FrmResponseDto {
    private Long consultoraId;
    private String codigoConsultora;
    private boolean flujoPendiente;
    private EstadoFlujo estadoFlujo;
}
