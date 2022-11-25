package bo.com.mc4.onboarding.model;

import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by    : msaavedra
 * Date          : 25/11/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.model
 **/
@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "REGION")
@Where(clause = "DELETED=false")
public class Region extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;


    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @ManyToMany(mappedBy = "regiones", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Set<Municipio> municipios = new HashSet<>();


}
