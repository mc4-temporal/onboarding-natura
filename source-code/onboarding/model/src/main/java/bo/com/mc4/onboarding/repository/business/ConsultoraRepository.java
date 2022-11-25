package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.Consultora;
import bo.com.mc4.onboarding.model.business.Municipio;
import bo.com.mc4.onboarding.model.business.dto.ConsultoraRecomendanteDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ConsultoraRepository extends JpaRepository<Consultora, Long> {
    @Query( "select c " +
            "from Consultora c " +
            "where c.deleted = false " +
            "and c.id = :id ")
    Optional<Consultora> findById(@Param("id") Long id);

    @Query( "select new bo.com.mc4.onboarding.model.business.dto.ConsultoraRecomendanteDto(c.id, concat(c.nombres, ' ', c.apellidos) , c.nroDocumento, c.codigoConsultora) " +
            "from Consultora c " +
            "inner join Municipio m on m = c.idMunicipio and m = :idMunicipio " +
            "where c.deleted = false " +
            "and c.tipoConsultora <> bo.com.mc4.onboarding.model.business.enums.TipoConsultora.PROSPECTO " +
            "and c.id <> :id ")
    List<ConsultoraRecomendanteDto> consultoraRecomendanteList(@Param("id") Long id,
                                                               @Param("idMunicipio") Municipio idMunicipio);
}
