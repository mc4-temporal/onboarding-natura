package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.business.enums.TipoDireccion;
import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DIRECCION")
public class Direccion extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TIPO", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoDireccion tipo;

    @Column(name = "BARRIO_ZONA", length = 100, nullable = false)
    private String barrioZona;

    @Column(name = "AVENIDA_CALLE", length = 100, nullable = false)
    private String avenidaCalle;

    @Column(name = "NRO")
    private String nro;

    @Column(name = "REFERENCIA", nullable = false)
    private String referencia;

    @Column(name = "LATITUD")
    private String latitud;

    @Column(name = "LONGITUD")
    private String longitud;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONSULTORA", nullable = false)
    private Consultora idConsultora;
}
