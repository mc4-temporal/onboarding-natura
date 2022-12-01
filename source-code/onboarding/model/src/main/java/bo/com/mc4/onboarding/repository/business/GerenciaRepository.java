package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.Gerencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface GerenciaRepository extends JpaRepository<Gerencia, Long> {

    @Query( "select g " +
            "from Gerencia g " +
            "where g.deleted = false " +
            "and g.codigoGera = :codigo")
    Optional<Gerencia> findByCodigoGera(@Param("codigo") String code);

    List<Gerencia> findAllByDeleted(Boolean deleted);


    @Query(" SELECT g " +
            " FROM Gerencia g"+
            " WHERE g.deleted = false")
    List<Gerencia> obtieneGerenecias();
}
