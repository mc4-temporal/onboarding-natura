package bo.com.mc4.onboarding.repository.business;


import bo.com.mc4.onboarding.model.business.Credito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CreditoRepository extends JpaRepository<Credito,Long> {

    @Query( "SELECT c" +
            " FROM Credito c" +
            " WHERE c.deleted = false ")
    List<Credito> obtienteCreditos ();
}
