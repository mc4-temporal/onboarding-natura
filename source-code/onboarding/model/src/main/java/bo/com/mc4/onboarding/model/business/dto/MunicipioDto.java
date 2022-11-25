package bo.com.mc4.onboarding.model.business.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MunicipioDto {
    private Integer codigoGera;
    private String nombre;
    private String latitud;
    private String longitud;
    private Integer idProvincia;
}
