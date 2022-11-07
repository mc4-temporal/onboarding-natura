package bo.com.mc4.onboarding.repository.commons;

import bo.com.mc4.onboarding.model.commons.Domain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface DomainRepository extends JpaRepository<Domain, String> {
    @Query( "SELECT d " +
            "FROM Domain d " +
            "WHERE d.deleted = FALSE " +
            "AND d.id = :domainId ")
    Optional<Domain> findById(@Param("domainId") String domainId);
}
