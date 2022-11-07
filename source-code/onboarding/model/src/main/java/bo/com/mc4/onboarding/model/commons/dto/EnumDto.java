package bo.com.mc4.onboarding.model.commons.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EnumDto implements Serializable {
    private String codigo;
    private String descripcion;
}
