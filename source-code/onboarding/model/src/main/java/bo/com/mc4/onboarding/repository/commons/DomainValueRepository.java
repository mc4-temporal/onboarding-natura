package bo.com.mc4.onboarding.repository.commons;

import bo.com.mc4.onboarding.model.commons.DomainValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface DomainValueRepository extends JpaRepository<DomainValue, Long> {
    @Query( "SELECT dv " +
            "FROM DomainValue dv " +
            "WHERE dv.deleted = FALSE " +
            "AND dv.id = :domainValueId ")
    Optional<DomainValue> findById(@Param("domainValueId") Long domainValueId);

    @Query( "SELECT dv " +
            "FROM DomainValue dv INNER JOIN dv.idDomain d " +
            "WHERE d.id =:domainId AND dv.deleted = FALSE " )
    List<DomainValue> findDomainValueByDomain(@Param("domainId") String domain);
}
