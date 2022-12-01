package bo.com.mc4.onboarding.core.service.business.impl;

import bo.com.mc4.onboarding.core.service.business.ConsultoraService;
import bo.com.mc4.onboarding.model.business.dto.ConsultoraDto;
import bo.com.mc4.onboarding.model.business.dto.input.FiltroConsultoraDto;
import bo.com.mc4.onboarding.model.util.StringUtil;
import bo.com.mc4.onboarding.repository.business.ConsultoraRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by    : msaavedra
 * Date          : 30/11/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.core.service.business.impl
 **/

@Slf4j
@Service("consultoraService")
public class ConsultoraServiceImpl implements ConsultoraService {

    private final ConsultoraRepository consultoraRepository;

    public ConsultoraServiceImpl(ConsultoraRepository consultoraRepository) {
        this.consultoraRepository = consultoraRepository;
    }

    @Override
    public Page<ConsultoraDto> getConsultorasList(FiltroConsultoraDto filtro, Pageable pageable) {
        boolean filtroTextoValido = !StringUtil.isEmptyOrNull(filtro.getFiltroTexto());
        boolean idCanalOnboardingValido = filtro.getIdCanalOnboarding() != 0;
        boolean idMunicipioValido = filtro.getIdMunicipio() != 0;

        String filtroTexto = !filtroTextoValido ? "%%" : "%" + filtro.getFiltroTexto() + "%";
        String filtroIdCanalOnboarding = !idCanalOnboardingValido ? "%%" : "%" + filtro.getIdCanalOnboarding() + "%";
        String filtroIdMunicipio = !idMunicipioValido ? "%%" : "%" + filtro.getIdMunicipio() + "%";

        return consultoraRepository.getConsultorasListByFilters(
                String.valueOf(filtro.getIdUser()),
                filtroTexto,
                filtro.getTipoConsultora(),
                filtroIdCanalOnboarding,
                filtroIdMunicipio,
                filtro.getFechaRegistroDesde(),
                filtro.getFechaRegistroHasta(),
                pageable);
    }
}
