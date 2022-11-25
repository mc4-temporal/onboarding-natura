package bo.com.mc4.onboarding.model;

import bo.com.mc4.onboarding.model.auth.enums.EntidadExterna;
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
@Table(name = "PROCESO")
@Where(clause = "DELETED=false")
public class Proceso extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "ENTIDAD_EXTERNA",nullable = false)
    private EntidadExterna entidadExterna;

    @Column(name = "NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "DETALLE")
    private String detalle;

    @Column(name = "RUTA_ARCHIVO")
    private String rutaArchivo;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CREDITO")
    private Credito credito;




}
