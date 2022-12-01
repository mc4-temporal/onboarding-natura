package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "MUNICIPIO")
public class Municipio extends AuditableEntity implements Serializable {
    @Id
    @Column(name = "CODIGO_GERA", nullable = false)
    private Integer codigoGera;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "LATITUD")
    private String latitud;

    @Column(name = "LONGITUD")
    private String longitud;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PROVINCIA", nullable = false, referencedColumnName = "CODIGO_GERA")
    private Provincia idProvincia;

    // incoming relationship
    @OneToMany(mappedBy = "idMunicipio", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<RegionMunicipioFm> regionMunicipioFms = new ArrayList<>();
}
