package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "REGION_MUNICIPIO_FM")
public class RegionMunicipioFm extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REGION", nullable = false)
    private Region idRegion;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MUNICIPIO", nullable = false, referencedColumnName = "CODIGO_GERA")
    private Municipio idMunicipio;
}
