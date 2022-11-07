package bo.com.mc4.onboarding.repository.auth;

import bo.com.mc4.onboarding.model.commons.Log;
import bo.com.mc4.onboarding.model.commons.enums.ProcessType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface LogRepository extends PagingAndSortingRepository<Log, Long> {

    @Query("    SELECT log " +
            "   FROM Log log " +
            "   WHERE log.createdDate BETWEEN :inicio AND :fin " +
            "   AND (:proceso IS NULL OR log.processType = :proceso) " +
            "   AND log.log LIKE CONCAT('%', :coincidencia, '%') " +
            "   ORDER BY log.id DESC ")
    Page<Log> listByFilters(@Param("inicio") Date inicio,
                  @Param("fin") Date fin,
                  @Param("proceso") ProcessType proceso,
                  @Param("coincidencia") String coincidencia,
                  Pageable pageable);

    @Query( "SELECT l " +
            "FROM Log l " +
            "WHERE l.processType = :processType " +
            "AND l.username = :username ")
    Page<Log> listarPorProcesoPorUsuario(@Param("processType") ProcessType sesion,
                                         @Param("username") String username,
                                         Pageable pageable);
}
