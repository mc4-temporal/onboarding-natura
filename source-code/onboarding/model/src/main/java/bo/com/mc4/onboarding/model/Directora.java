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
@Table(name = "DIRECTORA")
@Where(clause = "DELETED=false")
public class Directora extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CI", nullable = false, length = 50)
    private String ci;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "RUTA_FOTO", nullable = false)
    private String rutaFoto;

    @Column(name = "TELEFONO", nullable = false, length = 40)
    private String telefono;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_GERENTE", nullable = false)
    private Gerente gerente;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_REGION")
    private Region region;

    @OneToMany(mappedBy = "directora")
    private Set<RuletaAsignacionDir> ruletaAsignacionDirs = new HashSet<>();


}
