package bo.com.mc4.onboarding.repository.auth;

import bo.com.mc4.onboarding.model.auth.AuthAppConfiguration;
import bo.com.mc4.onboarding.model.auth.AuthUser;
import bo.com.mc4.onboarding.model.auth.enums.ApplicationType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AuthAppConfigurationRepository extends JpaRepository<AuthAppConfiguration, Long> {

    @Query( "SELECT aac " +
            "FROM AuthAppConfiguration aac " +
            "WHERE aac.deleted = FALSE " +
            "AND aac.idAuthUser = :userId " +
            "AND aac.applicationType = :type ")
    Optional<AuthAppConfiguration> findByUserAndType(@Param("userId") AuthUser authUser,
                                                     @Param("type") ApplicationType applicationType);


}
