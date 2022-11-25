package bo.com.mc4.onboarding.model;

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
@Table(name = "DIRECCION")
@Where(clause = "DELETED=false")
public class Direccion extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "BARRIO_ZONA", length = 200)
    private String barrioZona;

    @Column(name = "AV_CALLE", length = 200)
    private String avCalle;

    @Column(name = "NRO_CASA", length = 10)
    private String nroCasa;

    @Column(name = "REFERENCIA")
    private String referencia;

    @Column(name = "LATITUD", nullable = false)
    private float latitud;

    @Column(name = "LONGITUD", nullable = false)
    private float longitud;

}
