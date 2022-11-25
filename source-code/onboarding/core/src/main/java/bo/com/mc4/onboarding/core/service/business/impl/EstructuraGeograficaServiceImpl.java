package bo.com.mc4.onboarding.core.service.business.impl;

import bo.com.mc4.onboarding.core.service.business.EstructuraGeograficaService;
import bo.com.mc4.onboarding.core.util.exception.ExceptionUtil;
import bo.com.mc4.onboarding.model.business.Departamento;
import bo.com.mc4.onboarding.model.business.dto.DepartamentoDto;
import bo.com.mc4.onboarding.model.business.dto.MunicipioDto;
import bo.com.mc4.onboarding.repository.business.DepartamentoRepository;
import bo.com.mc4.onboarding.repository.business.MunicipioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("estructuraGeograficaService")
public class EstructuraGeograficaServiceImpl implements EstructuraGeograficaService {

    private final DepartamentoRepository departamentoRepository;
    private final MunicipioRepository municipioRepository;

    public EstructuraGeograficaServiceImpl(DepartamentoRepository departamentoRepository,
                                           MunicipioRepository municipioRepository) {
        this.departamentoRepository = departamentoRepository;
        this.municipioRepository = municipioRepository;
    }

    @Override
    public List<DepartamentoDto> departamentoList() {
        return departamentoRepository.findAllDtoList();
    }

    @Override
    public List<MunicipioDto> municipioPorDepartamentoList(Integer codigoDepartamento) {
        Departamento departamento = departamentoRepository.findById(codigoDepartamento)
                .orElseThrow(ExceptionUtil.throwFindFail(codigoDepartamento.toString(), "Departamento"));
        return municipioRepository.findByDepartamentoDtoList(departamento);
    }
}
