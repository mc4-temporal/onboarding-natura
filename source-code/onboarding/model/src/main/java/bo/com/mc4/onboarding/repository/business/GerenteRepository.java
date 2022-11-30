package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.Gerente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface GerenteRepository extends JpaRepository<Gerente, Long> {

    @Query( "select g " +
            "from Gerente g " +
            "where g.deleted = false " +
            "and g.codigoGera = :codigo")
    Optional<Gerente> findByCodigoGera(@Param("codigo") String code);
}
