package bo.com.mc4.onboarding.repository.business;

import bo.com.mc4.onboarding.model.business.Consultora;
import bo.com.mc4.onboarding.model.business.Municipio;
import bo.com.mc4.onboarding.model.business.dto.ConsultoraDto;
import bo.com.mc4.onboarding.model.business.dto.ConsultoraRecomendanteDto;
import bo.com.mc4.onboarding.model.business.dto.input.FiltroConsultoraDto;
import bo.com.mc4.onboarding.model.business.enums.TipoConsultora;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ConsultoraRepository extends JpaRepository<Consultora, Long> {
    @Query("select c " +
            "from Consultora c " +
            "where c.deleted = false " +
            "and c.id = :id ")
    Optional<Consultora> findById(@Param("id") Long id);

    @Query("select new bo.com.mc4.onboarding.model.business.dto.ConsultoraRecomendanteDto(c.id, concat(c.nombres, ' ', c.apellidos) , c.nroDocumento, c.codigoConsultora) " +
            "from Consultora c " +
            "where c.deleted = false " +
            "and c.tipoConsultora <> bo.com.mc4.onboarding.model.business.enums.TipoConsultora.PROSPECTO " +
            "and c.id <> :id ")
    List<ConsultoraRecomendanteDto> consultoraRecomendanteList(@Param("id") Long id);

    @Query("select c " +
            "from Consultora c " +
            "where c.deleted = false " +
            "and c.nroDocumento = :documento ")
    Optional<Consultora> findByDocumento(@Param("documento") String documento);

    @Query("select c " +
            "from Consultora c " +
            "where c.deleted = false " +
            "and c.correo like concat('%', :correo, '%') ")
    Optional<Consultora> findByCorreo(@Param("correo") String correo);

    @Query("select new bo.com.mc4.onboarding.model.business.dto.ConsultoraDto(c.id, c.createdDate, co.descripcion, concat(c.nombres,' ',c.apellidos), c.nroDocumento, m.nombre, '', c.telefono, c.contactado) " +
            "from Consultora c " +
            "inner join CanalOnboarding co on c.idCanalOnboarding = co " +
            "inner join Municipio m on c.idMunicipio = m " +
            "inner join Directora d on c.idDirectora = d " +
            "inner join AuthUser au on d.idUser = au " +
            "where c.deleted = false " +
            "and co.deleted = false " +
            "and m.deleted = false " +
            "and d.deleted = false " +
            //"and cast(d.id as string) like :idDirectora " +
            "and cast(au.id as string) like :idUser " +
            "and c.tipoConsultora = :tipoConsultora " +
            "and cast(co.id as string) like concat('%', :idCanalOnboarding, '%')" +
            "and cast(m.codigoGera as string) like concat('%',:idMunicipio,'%') " +
            "and c.createdDate between :fechaRegistroDesde and :fechaRegistroHasta " +
            "and (upper(c.nombres) like upper(:filtroTexto) or" +
            "     upper(c.nroDocumento) like upper(:filtroTexto)) "
    )
    Page<ConsultoraDto> getConsultorasListByFilters(
            @Param("idUser") String idUser,
            @Param("filtroTexto") String filtroTexto,
            @Param("tipoConsultora") TipoConsultora tipoConsultora,
            @Param("idCanalOnboarding") String idCanalOnboarding,
            @Param("idMunicipio") String idMunicipio,
            @Param("fechaRegistroDesde") Date fechaRegistroDesde,
            @Param("fechaRegistroHasta") Date fechaRegistroHasta,
            Pageable pageable);
}
