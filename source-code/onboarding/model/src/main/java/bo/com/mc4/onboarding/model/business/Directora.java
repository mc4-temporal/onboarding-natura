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
@Table(name = "DIRECTORA")
public class Directora extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CODIGO_DIRECTORA", nullable = false, length = 30)
    private String codigoDirectora;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "CORREO")
    private String correo;

    @Column(name = "TOKEN_INVITACION")
    private String tokenInvitacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REGION")
    private Region idRegion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_GERENCIA")
    private Gerencia idGerencia;
}
