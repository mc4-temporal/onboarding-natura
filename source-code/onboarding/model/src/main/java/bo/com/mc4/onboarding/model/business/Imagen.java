package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.auth.enums.TipoGerente;
import bo.com.mc4.onboarding.model.auth.enums.TipoImagen;
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
@Table(name = "IMAGEN")
@Where(clause = "DELETED=false")
public class Imagen extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO",nullable = false)
    private TipoImagen tipo;

    @Column(name = "RUTA", nullable = false)
    private String ruta;

    @Column(name = "DATOS_TEXTO")
    private String datosTexto;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CONSULTORA")
    private Consultora consultora;




}
