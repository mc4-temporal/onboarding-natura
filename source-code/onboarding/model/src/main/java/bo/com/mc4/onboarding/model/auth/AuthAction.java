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
@Table(name = "AUTH_ACTION")
public class AuthAction extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ACTION", nullable = false, length = 30)
    private String action;

    @Column(name = "CODE", nullable = false, length = 30, unique = true)
    private String code;

    @Column(name = "BASE_ACTION", nullable = false)
    private boolean baseAction;
}
