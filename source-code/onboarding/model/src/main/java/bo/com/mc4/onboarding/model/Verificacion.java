package bo.com.mc4.onboarding.model;

import bo.com.mc4.onboarding.model.auth.enums.ResultadoObservacion;
import bo.com.mc4.onboarding.model.auth.enums.TipoVerificacion;
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
@Table(name = "VERIFICACION")
@Where(clause = "DELETED=false")
public class Verificacion extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_VERIFICACION",nullable = false)
    private TipoVerificacion tipoVerificacion;

    @Column(name = "RESULTADO", nullable = false)
    private ResultadoObservacion resultado;

    @Column(name = "FECHA_VERIFICACION", nullable = false)
    private Date fechaVerificacion;

    @Column(name = "RUTA_ARCHIVO")
    private String rutaArchivo;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CREDITO")
    private Credito credito;




}
