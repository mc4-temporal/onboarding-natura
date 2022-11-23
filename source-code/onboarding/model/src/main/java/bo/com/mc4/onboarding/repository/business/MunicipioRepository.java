package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface MunicipioRepository extends JpaRepository<Municipio, Long> {
    @Query( "select c " +
            "from Municipio c " +
            "where c.deleted = false " +
            "and c.id = :codigoGera ")
    Optional<Municipio> findById(@Param("codigoGera") Long codigoGera);
}
