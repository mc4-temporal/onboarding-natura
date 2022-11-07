package bo.com.mc4.onboarding.model.auth;

import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import bo.com.mc4.onboarding.model.commons.enums.EntityState;
import lombok.*;

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
@Table(name = "AUTH_ROLE")
public class AuthRole extends AuditableEntity implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "NAME", nullable = false, length = 35)
    private String name;

    @Basic
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    @Column(name = "BASE_ROLE", nullable = false)
    private boolean baseRole = false;


    @Column(name = "ROLE_STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private EntityState roleStatus;
}
