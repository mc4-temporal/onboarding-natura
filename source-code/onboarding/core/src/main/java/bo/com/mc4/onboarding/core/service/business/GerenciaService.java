package bo.com.mc4.onboarding.core.service.business;

import bo.com.mc4.onboarding.model.business.Gerencia;
import bo.com.mc4.onboarding.model.business.dto.GerenciaDto;

import java.util.List;

public interface GerenciaService {

    List<Gerencia> getGereciasList () throws Exception;
}
