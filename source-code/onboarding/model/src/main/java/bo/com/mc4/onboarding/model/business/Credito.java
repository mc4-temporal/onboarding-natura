package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.auth.enums.EstadoCredito;
import bo.com.mc4.onboarding.model.auth.enums.EstadoFlujo;
import bo.com.mc4.onboarding.model.auth.enums.TipoGerente;
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
@Table(name = "CREDITO")
@Where(clause = "DELETED=false")
public class Credito extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;


    @Enumerated(EnumType.STRING)
    @Column(name = "ESTADO_FLUJO", nullable = false)
    private EstadoFlujo estadoFlujo;


    @Enumerated(EnumType.STRING)
    @Column(name = "ESTADO_CREDITO", nullable = false)
    private EstadoCredito estadoCredito;


    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CONSULTORA")
    private Consultora consultora;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_AGENTE_CREDITO")
    private AgenteCredito agenteCredito;


}
