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
@Table(name = "AUTH_ROLE_RESOURCE")
public class AuthRoleResource extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AUTH_ROLE", nullable = false)
    private AuthRole idAuthRole;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AUTH_RESOURCE", nullable = false)
    private AuthResource idAuthResource;
}
