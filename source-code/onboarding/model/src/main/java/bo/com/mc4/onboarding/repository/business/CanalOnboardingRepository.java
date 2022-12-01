package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.CanalOnboarding;
import bo.com.mc4.onboarding.model.business.dto.CanalOnboardingDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CanalOnboardingRepository extends JpaRepository<CanalOnboarding, Long> {
    @Query("select co " +
            "from CanalOnboarding co " +
            "where co.codigo = :codigo ")
    Optional<CanalOnboarding> findByCodigo(@Param("codigo") String codigo);

    @Query("select new bo.com.mc4.onboarding.model.business.dto.CanalOnboardingDto(c.id, c.codigo, c.descripcion) " +
            "from CanalOnboarding c " +
            "where c.deleted = false ")
    List<CanalOnboardingDto> findAllDtos();
}
