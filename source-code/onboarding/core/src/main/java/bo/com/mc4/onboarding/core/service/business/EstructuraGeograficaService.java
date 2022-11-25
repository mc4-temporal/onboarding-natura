package bo.com.mc4.onboarding.core.service.business;

import bo.com.mc4.onboarding.model.business.dto.DepartamentoDto;
import bo.com.mc4.onboarding.model.business.dto.MunicipioDto;

import java.util.List;

public interface EstructuraGeograficaService {

    /**
     * Listar departamentos
     * @return lista de departamentos
     */
    List<DepartamentoDto> departamentoList();

    /**
     * Listar municipios por departamento
     * @param codigoDepartamento codigoGera de departamento
     * @return lista de municipios
     */
    List<MunicipioDto> municipioPorDepartamentoList(Integer codigoDepartamento);
}
