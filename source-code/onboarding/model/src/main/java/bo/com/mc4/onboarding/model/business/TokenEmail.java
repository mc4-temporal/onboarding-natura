package bo.com.mc4.onboarding.model.business;

import bo.com.mc4.onboarding.model.auth.enums.EstadoTokenEmail;
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
@Table(name = "TOKEN_EMAIL")
@Where(clause = "DELETED=false")
public class TokenEmail extends AuditableEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TOKEN", nullable = false)
    private String token;

    @Enumerated(EnumType.STRING)
    @Column(name = "ESTADO_TOKEN_EMAIL",nullable = false)
    private EstadoTokenEmail estado;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CONSULTORA")
    private Consultora consultora;




}
