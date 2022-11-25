package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.auth.enums.EstadoObservacion;
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
@Table(name = "OBSERVACION")
@Where(clause = "DELETED=false")
public class Observacion extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "EMPRESA", nullable = false, length = 100)
    private String empresa;

    @Column(name = "DETALLE", nullable = true, length = 200)
    private String detalle;

    @Enumerated(EnumType.STRING)
    @Column(name = "ESTADO_OBSERVACION",nullable = false)
    private EstadoObservacion estadoObservacion;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_VERIFICACION")
    private Verificacion verificacion;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_AGENTE_CREDITO_APROBADOR")
    private AgenteCredito agenteCreditoAprobador;




}
