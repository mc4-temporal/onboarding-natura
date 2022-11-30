package bo.com.mc4.onboarding.core.service.business.impl;

import bo.com.mc4.onboarding.core.service.business.GerenciaService;
import bo.com.mc4.onboarding.model.business.Gerencia;
import bo.com.mc4.onboarding.model.business.dto.GerenciaDto;
import bo.com.mc4.onboarding.model.commons.Log;
import bo.com.mc4.onboarding.repository.business.GerenciaRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Service("gerenciaService")
public class GerenciaServiceImpl implements GerenciaService {

    private final GerenciaRepository gerenciaRepository;

    public GerenciaServiceImpl(GerenciaRepository gerenciaRepository) {
        this.gerenciaRepository = gerenciaRepository;
    }

    @Override
    public List<Gerencia> getGereciasList(){
            List<Gerencia> gerencias = this.gerenciaRepository.obtieneGerenecias();
            return gerencias;
    }
}
