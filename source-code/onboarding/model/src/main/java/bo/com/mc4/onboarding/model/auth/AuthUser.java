package bo.com.mc4.onboarding.model.auth;

import bo.com.mc4.onboarding.model.auth.enums.UserStatus;
import bo.com.mc4.onboarding.model.commons.AuditableEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "AUTH_USER")
public class AuthUser extends AuditableEntity implements UserDetails {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Basic
    @Column(name = "USERNAME", nullable = false, length = 20)
    private String username;

    @Basic
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Basic
    @Column(name = "LASTNAME", nullable = false, length = 100)
    private String lastname;

    @Column(name = "USER_STATUS", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserStatus userStatus;

    @Basic
    @Column(name = "EMAIL", length = 250)
    private String email;

    @Column(name = "GENERATED_PASSWORD", nullable = false)
    private boolean generatedPassword = true;

    @Basic
    @JsonIgnore
    @Column(name = "PASSWORD", nullable = false, length = 500)
    private String password;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_AUTH_ROLE", nullable = false)
    private AuthRole idAuthRole;

    @Override
    public Collection<? extends SimpleGrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(idAuthRole.getName()));
        return authorities ;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.userStatus == UserStatus.ACTIVO;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return !this.isDeleted();
    }
}
