package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.business.enums.EstadoFlujo;
import bo.com.mc4.onboarding.model.business.enums.TipoConsultora;
import bo.com.mc4.onboarding.model.business.enums.TipoDocumento;
import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CONSULTORA")
public class Consultora extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOMBRES", nullable = false, length = 100)
    private String nombres;

    @Column(name = "APELLIDOS", nullable = false, length = 100)
    private String apellidos;

    @Column(name = "NRO_DOCUMENTO", nullable = false, length = 30)
    private String nroDocumento;

    @Column(name = "TIPO_DOCUMENTO", nullable = false, length = 30)
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;

    @Column(name = "EXPEDICION_DOCUMENTO", length = 2)
    private String expedicion;

    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Column(name = "TELEFONO", length = 15, nullable = false)
    private String telefono;

    @Column(name = "CORREO", length = 100, nullable = false)
    private String correo;

    @Column(name = "TIPO_CONSULTORA", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoConsultora tipoConsultora;

    @Column(name = "NOMBRES_REFERENCIA", length = 100)
    private String nombresReferencia;

    @Column(name = "APELLIDOS_REFERENCIA", length = 100)
    private String apellidosReferencia;

    @Column(name = "TELEFONO_REFERENCIA", length = 15)
    private String telefonoReferencia;

    @Column(name = "CODIGO_CONSULTORA", length = 30)
    private String codigoCOsultora;

    @Column(name = "FECHA_OBTENCION_CODIGO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaObtencionCodigo;

    @Column(name = "MOTIVO_RESET")
    private String motivoReset;

    @Column(name = "ESTADO_FLUJO", nullable = false)
    @Enumerated(EnumType.STRING)
    private EstadoFlujo estadoFlujo;

    @Column(name = "CONTACTADO")
    private Boolean contactado;

    @Column(name = "FECHA_CONTACTADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaContactado;

    @Column(name = "TEMRINOS_CONDICIONES")
    private Boolean terminosCondiciones;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CANAL_ONBOARDING", nullable = false)
    private CanalOnboarding idCanalOnboarding;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MUNICIPIO")
    private Municipio idMunicipio;
}
