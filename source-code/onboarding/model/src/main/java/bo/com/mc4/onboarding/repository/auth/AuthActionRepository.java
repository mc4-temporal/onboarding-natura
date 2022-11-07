package bo.com.mc4.onboarding.repository.auth;

import bo.com.mc4.onboarding.model.auth.AuthAction;
import bo.com.mc4.onboarding.model.auth.AuthPrivilege;
import bo.com.mc4.onboarding.model.auth.AuthResource;
import bo.com.mc4.onboarding.model.auth.AuthRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AuthActionRepository extends JpaRepository<AuthAction, Long> {
    @Query( "SELECT aa " +
            "FROM AuthAction aa " +
            "WHERE aa.deleted = FALSE " +
            "AND aa.id = :actionId ")
    Optional<AuthAction> findById(@Param("actionId") Long actionId);

    @Query( "SELECT aa " +
            "FROM AuthAction aa " +
            "WHERE aa.code = :code ")
    Optional<AuthAction> findByCode(@Param("code") String code);

    @Query( "SELECT aa " +
            "FROM AuthAction aa " +
            "WHERE aa.deleted = FALSE ")
    List<AuthAction> findAllActions();

    @Query( "SELECT ap " +
            "FROM AuthPrivilege ap " +
            "INNER JOIN AuthRoleResource arr ON arr = ap.idAuthRoleResource " +
            "INNER JOIN AuthResource ar ON ar = arr.idAuthResource " +
            "INNER JOIN AuthRole arole ON arole = arr.idAuthRole " +
            "WHERE ap.deleted = FALSE " +
            "AND arr.deleted = FALSE " +
            "AND ar.deleted = FALSE " +
            "AND arole.deleted = FALSE  " +
            "AND arole = :roleId " +
            "AND ar = :resourceId")
    List<AuthPrivilege> findPrivilegesByRoleAndResource(@Param("roleId") AuthRole authRole,
                                                        @Param("resourceId") AuthResource authResource);

    @Query( "SELECT aa " +
            "FROM AuthAction aa " +
            "INNER JOIN AuthResourceAction ara ON ara.idAuthAction = aa AND ara.deleted = FALSE " +
            "INNER JOIN AuthResource ar ON ar = ara.idAuthResource AND ar.deleted = FALSE " +
            "WHERE aa.deleted = FALSE " +
            "AND ar = :resourceId " +
            "ORDER BY aa.action ASC")
    List<AuthAction> findAvailableActionsByResource(@Param("resourceId") AuthResource authResource);
}
