package bo.com.mc4.onboarding.model;

import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;
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
@Table(name = "MUNICIPIO")
@Where(clause = "DELETED=false")
public class Municipio extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "LATITUD", nullable = false)
    private float latitud;

    @Column(name = "LONGITUD", nullable = false)
    private float longitud;

    @Column(name = "CODIGO_GERA")
    private int codigoGera;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_PROVINCIA", nullable = false)
    private Provincia provincia;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "REGION_MUNICIPIO",
            joinColumns = {@JoinColumn(name = "ID_REGION")},
            inverseJoinColumns = {@JoinColumn(name = "ID_MUNICIPIO")}
    )
    private Set<Region> regiones = new HashSet<>();

    @OneToMany(mappedBy = "municipio")
    private Set<RuletaAsignacionDir> ruletaAsignacionDirs = new HashSet<>();



}
