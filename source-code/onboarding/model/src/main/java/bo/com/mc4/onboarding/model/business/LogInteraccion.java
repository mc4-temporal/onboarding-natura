package bo.com.mc4.onboarding.model.business;

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
@Table(name = "LOG_INTERACCION")
@Where(clause = "DELETED=false")
public class LogInteraccion extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "FECHA_SOLICITUD", nullable = false)
    private Date fechaSolicitud;

    @Column(name = "FECHA_RESPUESTA", nullable = false)
    private Date fechaRespuesta;

    @Column(name = "CODIGO_RESPUESTA", nullable = false)
    private long codigoRespuesta;

    @Column(name = "ERROR", nullable = false)
    private boolean error;

    @Column(name = "RUTA_ARCHIVO", nullable = false, length = 500)
    private long rutaArchivo;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_SERVICIO", nullable = false)
    private Servicio servicio;


    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CREDITO", nullable = false)
    private Credito credito;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CONSULTORA")
    private Consultora consultora;


}
