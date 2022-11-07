package bo.com.mc4.onboarding.model.auth;

import bo.com.mc4.onboarding.model.auth.enums.ApplicationType;
import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AUTH_APP_CONFIGURATION")
public class AuthAppConfiguration extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "APPLICATION_TYPE", nullable = false)
    @Enumerated(EnumType.STRING)
    private ApplicationType applicationType;

    @Lob
    @Type(type = "text")
    @Column(name = "JSON_CONFIG", nullable = false)
    private String jsonConfig;

    @JoinColumn(name = "ID_AUTH_USER", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AuthUser idAuthUser;
}
