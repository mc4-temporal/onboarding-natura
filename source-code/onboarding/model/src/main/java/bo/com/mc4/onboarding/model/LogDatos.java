package bo.com.mc4.onboarding.model;

import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;
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
@Table(name = "LOG_DATOS")
@Where(clause = "DELETED=false")
public class LogDatos extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "SOLICITUD", nullable = false)
    @Lob
    private Blob solicitud;

    @Column(name = "RESPUESTA", nullable = false)
    @Lob
    private Blob respuesta;

    @Column(name = "ERROR_MESSAGE", nullable = false)
    private String errorMessage;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_LOG_INTERACCION", nullable = false)
    private LogInteraccion logInteraccion;

    
}
