package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.RegionFm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RegionFmRepository extends JpaRepository<RegionFm, Long> {

    @Query(" select r " +
            "from RegionFm r " +
            "where r.deleted = false " +
            "and r.nombre = :nombre ")
    Optional<RegionFm> findByNombre(@Param("nombre") String nombre);
}
