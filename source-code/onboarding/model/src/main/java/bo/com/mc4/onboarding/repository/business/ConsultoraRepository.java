package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.Consultora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ConsultoraRepository extends JpaRepository<Consultora, Long> {
    @Query( "select c " +
            "from Consultora c " +
            "where c.deleted = false " +
            "and c.id = :id ")
    Optional<Consultora> findById(@Param("id") Long id);
}
