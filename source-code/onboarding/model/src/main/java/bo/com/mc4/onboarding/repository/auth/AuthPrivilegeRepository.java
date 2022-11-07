package bo.com.mc4.onboarding.repository.auth;

import bo.com.mc4.onboarding.model.auth.AuthPrivilege;
import bo.com.mc4.onboarding.model.auth.AuthRoleResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AuthPrivilegeRepository extends JpaRepository<AuthPrivilege, Long> {
    @Query( "SELECT ap " +
            "FROM AuthPrivilege ap " +
            "WHERE ap.deleted = FALSE " +
            "AND ap.id = :privilegeId ")
    Optional<AuthPrivilege> findById(@Param("privilegeId") Long privilegeId);

    @Query( "SELECT COUNT(ap.id)" +
            "FROM AuthPrivilege ap " +
            "WHERE ap.deleted = FALSE " +
            "AND ap.idAuthRoleResource = :roleResId ")
    int countAllByRoleResource(@Param("roleResId") AuthRoleResource authRoleResource);
}
