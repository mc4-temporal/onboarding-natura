package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.CanalOnboarding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CanalOnboardingRepository extends JpaRepository<CanalOnboarding, Long> {
    @Query( "select co " +
            "from CanalOnboarding co " +
            "where co.codigo = :codigo ")
    Optional<CanalOnboarding> findByCodigo(@Param("codigo") String codigo);
}
