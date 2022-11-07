package bo.com.mc4.onboarding.repository.auth;

import bo.com.mc4.onboarding.model.auth.AuthAction;
import bo.com.mc4.onboarding.model.auth.AuthResource;
import bo.com.mc4.onboarding.model.auth.AuthRole;
import bo.com.mc4.onboarding.model.auth.dto.UserAccessDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AuthResourceRepository extends JpaRepository<AuthResource, Long> {

    @Query( "SELECT ar " +
            "FROM AuthResource ar " +
            "WHERE ar.deleted = FALSE " +
            "AND ar.resourceStatus <> bo.com.mc4.onboarding.model.commons.enums.EntityState.ELIMINADO " +
            "AND ar.id = :resourceId ")
    Optional<AuthResource> findById(@Param("resourceId") Long resourceId);

    @Query( "SELECT ares " +
            "FROM AuthResource ares " +
            "INNER JOIN AuthRoleResource arr ON arr.idAuthResource = ares " +
            "INNER JOIN AuthRole ar ON ar = arr.idAuthRole " +
            "WHERE ares.deleted = FALSE " +
            "AND ar = :idAuthRole")
    List<AuthResource> findByRole(@Param("idAuthRole") AuthRole authRole);

    AuthResource findByUrl(String url);

    @Query( "SELECT ar " +
            "FROM AuthResource ar " +
            "WHERE ar.deleted = FALSE " +
            "AND ar.resourceStatus = bo.com.mc4.onboarding.model.commons.enums.EntityState.ACTIVO " +
            "AND ar.idAuthResourceParent IS NULL ")
    List<AuthResource> findAllParents();

    @Query( "SELECT new  bo.com.mc4.onboarding.model.auth.dto.UserAccessDto(ar.id, ar.name, false, ar.url, case when arr is not null then true else false end, arr.id) " +
            "FROM AuthResource ar " +
            "LEFT JOIN AuthRoleResource arr ON arr.idAuthResource = ar AND (arr IS NULL OR arr.idAuthRole = :roleId)" +
            "WHERE ar.deleted = FALSE " +
            "AND ar.resourceStatus = bo.com.mc4.onboarding.model.commons.enums.EntityState.ACTIVO " +
            "AND ar.idAuthResourceParent = :parentId ")
    List<UserAccessDto> findAccessByRoleAndParent(@Param("roleId") AuthRole authRole,
                                                  @Param("parentId") AuthResource parent);

    @Query( "SELECT aa " +
            "FROM AuthResource ar " +
            "INNER JOIN AuthRoleResource arr ON arr.deleted = false AND arr.idAuthResource = ar " +
            "INNER JOIN AuthRole ar2 ON ar2.deleted = false AND ar2 = arr.idAuthRole " +
            "INNER JOIN AuthPrivilege ap ON ap.deleted = false AND ap.idAuthRoleResource = arr " +
            "INNER JOIN AuthAction aa ON aa.deleted = false AND aa = ap.idAuthAction " +
            "WHERE ar.deleted = false " +
            "AND ar2 = :roleId " +
            "AND ar.frontendCode = :frontendCode ")
    List<AuthAction> getActionsByRoleAndFrontendCode(@Param("roleId") AuthRole idAuthRole,
                                                     @Param("frontendCode") String frontendCode);
}
