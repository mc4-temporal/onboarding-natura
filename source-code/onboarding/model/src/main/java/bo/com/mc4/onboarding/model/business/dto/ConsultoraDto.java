package bo.com.mc4.onboarding.model.business.dto;

import bo.com.mc4.onboarding.model.auth.AuthUser;
import bo.com.mc4.onboarding.model.auth.dto.UserDto;
import bo.com.mc4.onboarding.model.business.Consultora;
import lombok.*;

import java.util.Date;

/**
 * Created by    : msaavedra
 * Date          : 30/11/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.model.business.dto
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsultoraDto {

    private long id;
    private Date fechaRegistro;
    private String canal;
    private String nombreCompleto;
    private String nroDocumento;
    private String ciudadLocalidad;
    private String tiempoEspera;
    private String telefono;
    private boolean contactado;

        // select new bo.com.mc4.onboarding
    // .model.business.dto.ConsultoraDto(c.id, c.createdDate, co.descripcion,
    // concat(c.nombres,' ',c.apellidos), c.nroDocumento, m.nombre, '', c.telefono, c.contactado)
    public static ConsultoraDto fromConsultoraEntity(Consultora consultora) {
        return ConsultoraDto.builder()
                .id(consultora.getId())
                .fechaRegistro(consultora.getCreatedDate())
                .canal(consultora.getIdCanalOnboarding().getDescripcion())
                .nombreCompleto(consultora.getNombres() + " " + consultora.getApellidos())
                .nroDocumento(consultora.getNroDocumento())
                .ciudadLocalidad(consultora.getIdMunicipio().getNombre())
                .telefono(consultora.getTelefono())
                .tiempoEspera(null)
                .contactado(consultora.getContactado())
                .build();
    }


}
