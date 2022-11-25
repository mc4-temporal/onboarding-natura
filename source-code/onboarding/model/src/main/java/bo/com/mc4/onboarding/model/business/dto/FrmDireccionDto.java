package bo.com.mc4.onboarding.model.business.dto;

import bo.com.mc4.onboarding.model.business.Direccion;
import bo.com.mc4.onboarding.model.business.enums.TipoDireccion;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FrmDireccionDto {
    private Integer departamentoId;
    private Integer localidadId;
    private String barrioZona;
    private String avenidaCalle;
    private String nroCasa;
    private String referencia;
    private String latitud;
    private String longitud;
    private String barrioZonaEntrega;
    private String avenidaCalleEntrega;
    private String nroCasaEntrega;
    private String referenciaEntrega;
    private String latitudEntrega;
    private String longitudEntrega;
    private Boolean mismaDireccionEntrega;

    public void validateFields() {

    }

    public Direccion toDireccionEntity() {
        return Direccion.builder()
                .barrioZona(barrioZona)
                .avenidaCalle(avenidaCalle)
                .nro(nroCasa)
                .referencia(referencia)
                .latitud(latitud)
                .longitud(longitud)
                .build();
    }

    public Direccion toDireccionEntregaEntity() {
        return Direccion.builder()
                .barrioZona(barrioZonaEntrega)
                .avenidaCalle(avenidaCalleEntrega)
                .nro(nroCasaEntrega)
                .referencia(referenciaEntrega)
                .latitud(latitudEntrega)
                .longitud(longitudEntrega)
                .build();
    }
}
