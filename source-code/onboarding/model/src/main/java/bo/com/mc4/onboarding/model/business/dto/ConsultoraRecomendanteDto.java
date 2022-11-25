package bo.com.mc4.onboarding.model.business.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsultoraRecomendanteDto {
    private Long id;
    private String nombre;
    private String nroDocumento;
    private String codigoConsultora;
}
