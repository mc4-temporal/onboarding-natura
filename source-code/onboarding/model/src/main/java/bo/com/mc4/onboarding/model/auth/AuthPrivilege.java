package bo.com.mc4.onboarding.model.auth;

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
@Table(name = "AUTH_PRIVILEGE")
public class AuthPrivilege extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AUTH_ACTION", nullable = false)
    private AuthAction idAuthAction;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AUTH_ROLE_RESOURCE", nullable = false)
    private AuthRoleResource idAuthRoleResource;
}
