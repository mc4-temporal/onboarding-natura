package bo.com.mc4.onboarding.repository.commons;

import bo.com.mc4.onboarding.model.commons.ParameterGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ParameterGroupRepository extends JpaRepository<ParameterGroup, Long> {

    @Query( "   SELECT gp " +
            "   FROM ParameterGroup gp " +
            "   WHERE gp.deleted = false ")
    List<ParameterGroup> listaGruposParametro();

    @Query( "   SELECT gp " +
            "   FROM ParameterGroup gp " +
            "   WHERE gp.deleted = false " +
            " AND gp.groupName=:grupo")
    Optional<ParameterGroup> findByGrupo(@Param("grupo")String grupo);

}
