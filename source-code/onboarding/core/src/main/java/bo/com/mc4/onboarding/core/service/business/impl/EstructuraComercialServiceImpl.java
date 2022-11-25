package bo.com.mc4.onboarding.core.service.business.impl;

import bo.com.mc4.onboarding.core.service.business.EstructuraComercialService;
import bo.com.mc4.onboarding.core.util.exception.ExceptionUtil;
import bo.com.mc4.onboarding.model.business.Consultora;
import bo.com.mc4.onboarding.model.business.dto.ConsultoraRecomendanteDto;
import bo.com.mc4.onboarding.model.business.dto.DirectoraDto;
import bo.com.mc4.onboarding.repository.business.ConsultoraRepository;
import bo.com.mc4.onboarding.repository.business.DirectoraFmRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("estructuraComercialService")
public class EstructuraComercialServiceImpl implements EstructuraComercialService {

    private final DirectoraFmRepository directoraFmRepository;
    private final ConsultoraRepository consultoraRepository;

    public EstructuraComercialServiceImpl(DirectoraFmRepository directoraFmRepository, ConsultoraRepository consultoraRepository) {
        this.directoraFmRepository = directoraFmRepository;
        this.consultoraRepository = consultoraRepository;
    }

    @Override
    public List<DirectoraDto> directorasDisponiblesPorConsultoraList(Long prospectoId) {
        Consultora prospecto = consultoraRepository.findById(prospectoId).orElseThrow(ExceptionUtil.throwFindFail(prospectoId.toString(), "Prospecto"));
        return directoraFmRepository.directorasDisponiblesEnMunicipioList(prospecto.getIdMunicipio());
    }

    @Override
    public List<ConsultoraRecomendanteDto> consultoraRecomendanteList(Long prospectoId) {
        Consultora prospecto = consultoraRepository.findById(prospectoId).orElseThrow(ExceptionUtil.throwFindFail(prospectoId.toString(), "Prospecto"));
        return consultoraRepository.consultoraRecomendanteList(prospecto.getId(), prospecto.getIdMunicipio());
    }
}
