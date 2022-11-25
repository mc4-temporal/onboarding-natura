package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RegionFmRepository extends JpaRepository<Region, Long> {

    @Query(" select r " +
            "from Region r " +
            "where r.deleted = false " +
            "and r.nombre = :nombre ")
    Optional<Region> findByNombre(@Param("nombre") String nombre);
}
