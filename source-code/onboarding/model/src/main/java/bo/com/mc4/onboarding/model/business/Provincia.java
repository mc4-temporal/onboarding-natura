package bo.com.mc4.onboarding.model.business;

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
@Table(name = "PROVINCIA")
public class Provincia extends AuditableEntity implements Serializable {
    @Id
    @Column(name = "CODIGO_GERA", nullable = false)
    private Long id;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "LATITUD")
    private String latitud;

    @Column(name = "LONGITUD")
    private String longitud;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DEPARTAMENTO", nullable = false)
    private Departamento departamento;
}
