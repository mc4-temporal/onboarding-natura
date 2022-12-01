package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.Departamento;
import bo.com.mc4.onboarding.model.business.Municipio;
import bo.com.mc4.onboarding.model.business.dto.MunicipioDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {
    @Query("select c " +
            "from Municipio c " +
            "where c.deleted = false " +
            "and c.codigoGera = :codigoGera ")
    Optional<Municipio> findById(@Param("codigoGera") Integer codigoGera);

    @Query("select new bo.com.mc4.onboarding.model.business.dto.MunicipioDto(c.codigoGera, c.nombre, c.latitud, c.longitud, p.codigoGera) " +
            "from Municipio c " +
            "inner join Provincia p on p = c.idProvincia and p.idDepartamento = :departamentoId " +
            "where c.deleted = false " +
            "and p.deleted = false ")
    List<MunicipioDto> findByDepartamentoDtoList(@Param("departamentoId") Departamento departamento);


    @Query("select new bo.com.mc4.onboarding.model.business.dto.MunicipioDto(c.codigoGera, c.nombre, c.latitud, c.longitud, c.idProvincia.codigoGera)" +
            "from Municipio c " +
            " inner join RegionMunicipioFm rm on rm.idMunicipio = c" +
            " inner join Region r on rm.idRegion = r" +
            " where r.id = :idRegion " +
            "and c.deleted = false ")
    List<MunicipioDto> findAllMunicipiosByIdRegion(@Param("idRegion") long idRegion);
}
