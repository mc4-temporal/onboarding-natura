package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.auth.enums.EstadoRespaldo;
import bo.com.mc4.onboarding.model.auth.enums.TipoRespaldo;
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
@Table(name = "RESPALDO_OBSERVACION")
@Where(clause = "DELETED=false")
public class RespaldoObservacion extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_RESPALDO", nullable = false)
    private TipoRespaldo tipoRespaldo;

    @Enumerated(EnumType.STRING)
    @Column(name = "ESTADO_RESPALDO", nullable = false)
    private EstadoRespaldo estadoRespaldo;

    @Column(name = "RUTA_ARCHIVO")
    private String rutaArchivo;

    @Column(name = "DESCRIPCION")
    private String descripcion;


    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_OBSERVACION")
    private Observacion observacion;


}
