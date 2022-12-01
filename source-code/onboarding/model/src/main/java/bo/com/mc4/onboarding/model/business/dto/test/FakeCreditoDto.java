package bo.com.mc4.onboarding.model.business.dto.test;

import lombok.*;

import java.util.Date;

/**
 * Created by    : msaavedra
 * Date          : 1/12/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.model.business.dto.test
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FakeCreditoDto {

    private int id;
    private Date fechaSolicitud;
    private String codigoConsultora;
    private String nombreCompleto;
    private String nroDocumento;
    private String telefono;
    private String correo;
    private String gerencia;
    private String directoraAsignada;
    private String estado;
}
