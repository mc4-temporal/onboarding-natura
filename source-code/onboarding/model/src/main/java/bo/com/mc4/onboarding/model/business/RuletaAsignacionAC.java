package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

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
@Table(name = "RULETA_ASIGNACION_AC")
@Where(clause = "DELETED=false")
public class RuletaAsignacionAC extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "EN_TURNO", nullable = false, length = 100)
    private boolean enTurno;

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_AGENTE_CREDITO")
    private AgenteCredito agenteCredito;


}
