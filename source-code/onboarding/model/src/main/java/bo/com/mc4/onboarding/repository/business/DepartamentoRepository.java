package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.Departamento;
import bo.com.mc4.onboarding.model.business.dto.DepartamentoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer> {
    @Query( "select c " +
            "from Departamento c " +
            "where c.deleted = false " +
            "and c.codigoGera = :codigoGera ")
    Optional<Departamento> findById(@Param("codigoGera") Integer codigoGera);


    @Query( "select new bo.com.mc4.onboarding.model.business.dto.DepartamentoDto(c.codigoGera, c.nombre, c.latitud, c.longitud) " +
            "from Departamento c " +
            "where c.deleted = false ")
    List<DepartamentoDto> findAllDtoList();
}
