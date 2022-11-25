package bo.com.mc4.onboarding.model.business.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DirectoraDto {
    private Long id;
    private String codigoDirectora;
    private String nombre;
}
