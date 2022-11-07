package bo.com.mc4.onboarding.repository.auth;

import bo.com.mc4.onboarding.model.auth.AuthUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {

    @Query("select u from AuthUser u where lower(u.username)=:usuario and u.deleted=false ")
    AuthUser findByUsuario(@Param("usuario") String usuario);

    @Query("select u from AuthUser u where lower(u.username) = :usuario and u.deleted = false")
    Optional<AuthUser> obtenerUsuarioParaAutentificacion(@Param("usuario") String usuario);

    @Query("select u from AuthUser u inner join u.idAuthRole r where u=:usuario and r.name='ROLE_INTEGRACION' and u.userStatus<>'eliminado'")
    AuthUser findUserPayment(@Param("usuario") AuthUser authUser);

    Optional<AuthUser> findByEmailIgnoreCaseAndDeletedFalse(String email);

    @Query( "SELECT au " +
            "FROM AuthUser au " +
            "WHERE au.deleted = FALSE " +
            "AND au.userStatus <> bo.com.mc4.onboarding.model.auth.enums.UserStatus.ELIMINADO " +
            "AND au.id = :userId ")
    Optional<AuthUser> findById(@Param("userId") Long userId);

    @Query( "SELECT au " +
            "FROM AuthUser au " +
            "WHERE au.deleted = FALSE " +
            "AND au.userStatus <> bo.com.mc4.onboarding.model.auth.enums.UserStatus.ELIMINADO " +
            "AND au.username = :username ")
    Optional<AuthUser> findByUsername(@Param("username") String username);

    @Query( "SELECT au " +
            "FROM AuthUser au " +
            "WHERE au.deleted = FALSE " +
            "AND au.userStatus <> bo.com.mc4.onboarding.model.commons.enums.EntityState.ELIMINADO " +
            "AND (  UPPER(au.name) LIKE UPPER(:filter) OR " +
            "       UPPER(au.lastname) LIKE UPPER(:filter) OR " +
            "       UPPER(au.email) LIKE UPPER(:filter) OR " +
            "       UPPER(au.username) LIKE UPPER(:filter) " +
            ")"
    )
    Page<AuthUser> pageWithFilter(@Param("filter") String filter,
                                  Pageable pageable);
}

