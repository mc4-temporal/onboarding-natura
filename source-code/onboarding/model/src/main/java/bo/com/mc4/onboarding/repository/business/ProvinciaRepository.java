package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.Provincia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ProvinciaRepository extends JpaRepository<Provincia, Integer> {
    @Query( "select c " +
            "from Provincia c " +
            "where c.deleted = false " +
            "and c.codigoGera = :codigoGera ")
    Optional<Provincia> findById(@Param("codigoGera") Integer codigoGera);
}
