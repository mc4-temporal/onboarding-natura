package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.auth.enums.TipoGerente;
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
@Table(name = "GERENTE")
@Where(clause = "DELETED=false")
public class Gerente extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CODIGO_GERA", length = 50)
    private String codigoGera;

    @Column(name = "CI", length = 50)
    private String ci;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO",nullable = false)
    private TipoGerente tipo;

    @Column(name = "RUTA_FOTO")
    private String rutaFoto;

    @Column(name = "TELEFONO", length = 40)
    private String telefono;

    @OneToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_GERENCIA")
    private Gerencia gerencia;




}
