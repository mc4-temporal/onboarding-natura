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
@Table(name = "REGION")
public class Region extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    // incoming relationship
    @OneToMany(mappedBy = "idRegion", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<RegionMunicipioFm> regionMunicipioFms = new ArrayList<>();

}
