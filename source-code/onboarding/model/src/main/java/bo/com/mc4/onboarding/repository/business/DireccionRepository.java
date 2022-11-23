package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.Consultora;
import bo.com.mc4.onboarding.model.business.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {
    @Query( "select c " +
            "from Direccion c " +
            "where c.deleted = false " +
            "and c.id = :id ")
    Optional<Direccion> findById(@Param("id") Long id);

    @Modifying
    @Query( "update Direccion " +
            "set deleted = true " +
            "where idConsultora = :idConsultora " +
            "and deleted = false ")
    void deleteDireccionesExistentes(@Param("idConsultora") Consultora consultora);
}
