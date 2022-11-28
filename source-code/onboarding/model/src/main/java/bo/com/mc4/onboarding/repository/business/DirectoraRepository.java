package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.Directora;
import bo.com.mc4.onboarding.model.business.Municipio;
import bo.com.mc4.onboarding.model.business.dto.DirectoraDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DirectoraRepository extends JpaRepository<Directora, Long> {

    @Query( "select new bo.com.mc4.onboarding.model.business.dto.DirectoraDto(d.id, d.codigoDirectora, d.nombre) " +
            "from Directora d " +
            "inner join Region r on r = d.idRegion and d.deleted = false " +
            "inner join RegionMunicipioFm rm on rm.idRegion = r " +
            "inner join Municipio m on m = rm.idMunicipio and m.deleted = false " +
            "where d.deleted = false " +
            "and m = :idMunicipio " +
            "order by d.nombre asc ")
    List<DirectoraDto> directorasDisponiblesEnMunicipioList(@Param("idMunicipio") Municipio idMunicipio);

    @Query( "select count(d) > 0 " +
            "from Directora d " +
            "where d.deleted = false " +
            "and d.codigoDirectora = :codigoGera ")
    boolean existsByCodigoDirectora(@Param("codigoGera") String codigoGera);
}
