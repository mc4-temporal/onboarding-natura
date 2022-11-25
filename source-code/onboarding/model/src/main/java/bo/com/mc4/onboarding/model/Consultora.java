package bo.com.mc4.onboarding.model;

import bo.com.mc4.onboarding.model.auth.enums.EstadoFlujo;
import bo.com.mc4.onboarding.model.auth.enums.TipoConsultora;
import bo.com.mc4.onboarding.model.auth.enums.TipoDocumento;
import bo.com.mc4.onboarding.model.auth.enums.TipoExpedicion;
import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
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
@Table(name = "CONSULTORA")
@Where(clause = "DELETED=false")
public class Consultora extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "DOCUMENTO_IDENTIDAD", nullable = false, length = 50)
    private String documentoIdentidad;

    @Column(name = "NOMBRES", nullable = false, length = 100)
    private String nombres;

    @Column(name = "APELLIDOS", nullable = false, length = 100)
    private String apellidos;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_DOCUMENTO", nullable = false)
    private TipoDocumento tipoDocumento;

    @Column(name = "COMPLEMENTO", nullable = false, length = 10)
    private String complemento;

    @Enumerated(EnumType.STRING)
    @Column(name = "EXPEDICION", nullable = false)
    private TipoExpedicion expedicion;

    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private Date fechaNacimiento;

    @Column(name = "TELEFONO", nullable = false, length = 40)
    private String telefono;

    @Column(name = "EMAIL", nullable = false, length = 50)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO", nullable = false)
    private TipoConsultora tipo;

    @Column(name = "NOMBRE_REFERENCIA", nullable = false, length = 100)
    private String nombreReferencia;

    @Column(name = "APELLIDO_REFERENCIA", nullable = false, length = 100)
    private String apellidoReferencia;

    @Column(name = "TELEFONO_REFERENCIA", nullable = false, length = 40)
    private String telefonoReferencia;

    @Column(name = "CODIGO_CONSULTORA", nullable = false, length = 40)
    private String codigoConsultora;

    @Column(name = "FECHA_OBTENCION_CODIGO", nullable = false)
    private Date fechaObtencionCodigo;

    @Column(name = "MOTIVO_RESTAURACION", nullable = false)
    private String motivoRestauracion;

    @Enumerated(EnumType.STRING)
    @Column(name = "ESTADO_FLUJO", nullable = false)
    private EstadoFlujo estadoFlujo;

    @Column(name = "CONTACTADO", nullable = false)
    private boolean contactado;

    @Column(name = "FECHA_CONTACTADO", nullable = false)
    private Date fechaContactado;



    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_MUNICIPIO", nullable = false)
    private Municipio municipio;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CANAL_ONBOARDING")
    private CanalOnboarding canalOnboarding;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_DIRECTORA_ASIGNADA")
    private Directora directoraAsignada;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_DIRECTORA_CONOCIDA")
    private Directora directoraConocida;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_AGENTE_CREDITO")
    private AgenteCredito agenteCredito;

    @ManyToOne
    @JoinColumn(name = "ID_CONSULTORA")
    private Consultora consultora;

    @OneToMany(mappedBy = "consultora")
    private Set<Consultora> promotoras = new HashSet<>();
}
