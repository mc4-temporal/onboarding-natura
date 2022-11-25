package bo.com.mc4.onboarding.core.service.business;

import bo.com.mc4.onboarding.model.business.dto.ConsultoraRecomendanteDto;
import bo.com.mc4.onboarding.model.business.dto.DirectoraDto;

import java.util.List;

public interface EstructuraComercialService {
    List<DirectoraDto> directorasDisponiblesPorConsultoraList(Long prospectoId);

    List<ConsultoraRecomendanteDto> consultoraRecomendanteList(Long prospectoId);
}
