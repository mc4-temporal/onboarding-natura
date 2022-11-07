package bo.com.mc4.onboarding.model.auth;

import bo.com.mc4.onboarding.model.auth.enums.ResourceType;
import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import bo.com.mc4.onboarding.model.commons.enums.EntityState;
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
@Table(name = "AUTH_RESOURCE")
public class AuthResource extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "DESCRIPTION", length = 100)
    private String description;

    @Basic
    @Column(name = "URL", nullable = false)
    private String url;

    @Basic
    @Column(name = "ICON", length = 50, nullable = false)
    private String icon;

    @Basic
    @Column(name = "MENU_POSITION", nullable = false)
    private Integer menuPosition;

    @Column(name = "RESOURCE_STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private EntityState resourceStatus;

    @Column(name = "FRONTEND_CODE", length = 50)
    private String frontendCode;

    @Column(name = "TYPE")
    @Enumerated(EnumType.STRING)
    private ResourceType type;

    @Column(name = "BADGE", length = 2)
    private String badge;

    @Column(name = "BADGE_COLOR")
    private String badgeColor;

    @Column(name = "CUSTOM_CLASS")
    private String customClass;

    @JoinColumn(name = "ID_AUTH_RECURSO_PADRE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AuthResource idAuthResourceParent;

}
