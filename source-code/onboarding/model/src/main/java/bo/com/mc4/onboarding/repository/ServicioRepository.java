package bo.com.mc4.onboarding.repository;

import bo.com.mc4.onboarding.model.business.Servicio;
import bo.com.mc4.onboarding.model.business.enums.TipoServicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Created by    : msaavedra
 * Date          : 22/11/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.repository
 **/

public interface ServicioRepository extends JpaRepository<Servicio, Long> {

    @Query( "select s " +
            "from Servicio s " +
            "where s.deleted = false " +
            "and s.tipo = :tipo ")
    Optional<Servicio> findByTipo(@Param("tipo") TipoServicio tipoServicio);

}
