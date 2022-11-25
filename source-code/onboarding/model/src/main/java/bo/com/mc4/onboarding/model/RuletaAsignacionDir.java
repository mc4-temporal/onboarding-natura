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
@Table(name = "RULETE_ASIGNACION_DIR")
@Where(clause = "DELETED=false")
public class RuletaAsignacionDir extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_DIRECTORIA", referencedColumnName = "id")
    private Directora directora;

    @ManyToOne
    @JoinColumn(name = "ID_MUNICIPIO", referencedColumnName = "id")
    private Municipio municipio;

    @Column(name = "EN_TURNO", nullable = false)
    private boolean enTurno;

}
