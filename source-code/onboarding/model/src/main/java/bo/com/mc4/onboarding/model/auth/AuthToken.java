package bo.com.mc4.onboarding.model.auth;

import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import bo.com.mc4.onboarding.model.commons.enums.EntityState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by :cesaraugusto
 * Date       :30-10-18
 * Project    onboarding
 * Package    :bo.com.mc4.onboarding.model
 */
@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AUTH_TOKEN")
public class AuthToken extends AuditableEntity implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "ESTADO", nullable = false)
    @Enumerated(EnumType.STRING)
    private EntityState tokenStatus;

    @Lob
    @Type(type = "text")
    @Column(name = "TOKEN")
    private String token;

    @JsonIgnore
    @OneToOne()
    @JoinColumn(name = "ID_AUTH_USER", referencedColumnName = "ID", nullable = false)
    private AuthUser idAuthUser;

}
