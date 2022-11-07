package bo.com.mc4.onboarding.repository.commons;

import bo.com.mc4.onboarding.model.auth.dto.ParameterDto;
import bo.com.mc4.onboarding.model.commons.Parameter;
import bo.com.mc4.onboarding.model.commons.ParameterGroup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ParameterRepository extends JpaRepository<Parameter, Long> {

   @Query("    SELECT par " +
           "   FROM Parameter par " +
           "   WHERE par.deleted = false " +
           "   AND TRIM(UPPER(par.code)) = TRIM(UPPER(:codigo)) ")
   Optional<Parameter> findParametroByCodigo(@Param("codigo") String codigo);

   @Query("    SELECT new  bo.com.mc4.onboarding.model.auth.dto.ParameterDto(par) " +
           "   FROM Parameter par" +
           "   WHERE par.deleted = false" +
           "   ORDER BY par.id DESC")
   List<ParameterDto> list();

   @Query("    SELECT a" +
           "   FROM Parameter a" +
           "   WHERE " +
           "   a.deleted = false" +
           "   AND (" +
           "      TRIM(LOWER(a.code)) like TRIM(LOWER(:criterioBusqueda))" +
           "   )" +
           "   ORDER BY a.id DESC")
   List<Parameter> searchAll(@Param("criterioBusqueda") String criterioBusqueda);

   @Query("    SELECT new  bo.com.mc4.onboarding.model.auth.dto.ParameterDto(par) " +
           "   FROM Parameter par " +
           "   WHERE par.deleted = false " +
           "   AND par.idParameterGroup = :grupoId" +
           "   ORDER BY par.code ASC")
   List<ParameterDto> obtenerParametros(@Param("grupoId") Long grupoId);

   @Query("    SELECT a" +
           "   FROM Parameter a" +
           "   WHERE a.code = :codigo" +
           " AND a.deleted = false ")
   Parameter getByCodigo(@Param("codigo") String codigo);

   @Query( " SELECT par " +
           " FROM Parameter par " +
           " WHERE par.deleted = FALSE " +
           " AND (UPPER(par.code) LIKE UPPER(:filter) OR " +
           "      UPPER(par.description) LIKE UPPER(:filter) " +
           ") " +
           " AND par.idParameterGroup = :grupoId ")
   Page<Parameter> getParametersPageWithFilter(@Param("grupoId") ParameterGroup grupoId, @Param("filter") String filter,
                                               Pageable pageable);
}
