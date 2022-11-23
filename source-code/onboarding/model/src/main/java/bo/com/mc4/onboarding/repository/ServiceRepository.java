package bo.com.mc4.onboarding.repository;

import bo.com.mc4.onboarding.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by    : msaavedra
 * Date          : 22/11/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.repository
 **/

public interface ServiceRepository extends JpaRepository<Service, Long> {

    Optional<Service> findByName(String name);

}
