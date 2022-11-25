package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.DirectoraFm;
import bo.com.mc4.onboarding.model.business.Municipio;
import bo.com.mc4.onboarding.model.business.dto.DirectoraDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DirectoraFmRepository extends JpaRepository<DirectoraFm, Long> {

    @Query( "select new bo.com.mc4.onboarding.model.business.dto.DirectoraDto(d.id, d.codigoDirectora, d.nombre) " +
            "from DirectoraFm d " +
            "inner join RegionFm r on r = d.idRegion and d.deleted = false " +
            "inner join RegionMunicipioFm rm on rm.idRegion = r " +
            "inner join Municipio m on m = rm.idMunicipio and m.deleted = false " +
            "where d.deleted = false " +
            "and m = :idMunicipio " +
            "order by d.nombre asc ")
    List<DirectoraDto> directorasDisponiblesEnMunicipioList(@Param("idMunicipio") Municipio idMunicipio);
}
