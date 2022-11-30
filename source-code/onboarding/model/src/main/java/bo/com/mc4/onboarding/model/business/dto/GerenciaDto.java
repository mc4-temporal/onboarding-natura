package bo.com.mc4.onboarding.model.business.dto;

import bo.com.mc4.onboarding.model.auth.dto.UserDto;
import bo.com.mc4.onboarding.model.business.Gerencia;
import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import bo.com.mc4.onboarding.model.commons.dto.AbstractAuditableDto;
import lombok.*;

import javax.persistence.Column;
import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
public class GerenciaDto implements Serializable {

    private Long id;
    private String codigoGera;
    private String nombre;
    private String oficina;

    public GerenciaDto(){
    }
    public GerenciaDto(Gerencia gerencia){

        this.id = gerencia.getId();
        this.codigoGera = gerencia.getCodigoGera();
        this.nombre = gerencia.getNombre();
        this.oficina = gerencia.getOficina();
    }

    public static GerenciaDto fromGerencia (Gerencia gerencia){
        return GerenciaDto.builder()
                .id(gerencia.getId())
                .codigoGera(gerencia.getCodigoGera())
                .nombre(gerencia.getNombre())
                .oficina(gerencia.getOficina())
                .build();
    }

}
