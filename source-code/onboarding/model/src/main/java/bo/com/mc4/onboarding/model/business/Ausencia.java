package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.auth.enums.TipoAusencia;
import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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
@Table(name = "AUSENCIA")
@Where(clause = "DELETED=false")
public class Ausencia extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO", nullable = false)
    private TipoAusencia tipo;

    @Column(name = "MOTIVO", nullable = false)
    private String motivo;

    @Column(name = "FECHA_INICIO", nullable = false)
    private Date fechaInicio;

    @Column(name = "FECHA_FIN", nullable = false)
    private Date fechaFin;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_AGENTE_CREDITO_SUPLENTE")
    private AgenteCredito agenteCreditoSuplente;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_AGENTE_CREDITO_TITULARR")
    private AgenteCredito agenteCreditoTitular;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_DIRECTORA_TITULAR")
    private Directora directoraTitular;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_DIRECTORA_SUPLENTE")
    private Directora directoraSuplente;

}
