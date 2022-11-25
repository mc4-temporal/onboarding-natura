package bo.com.mc4.onboarding.repository;

import bo.com.mc4.onboarding.model.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by    : msaavedra
 * Date          : 22/11/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.repository
 **/

public interface ServicioRepository extends JpaRepository<Servicio, Long> {

    Optional<Servicio> findByNombre(String nombre);

}
