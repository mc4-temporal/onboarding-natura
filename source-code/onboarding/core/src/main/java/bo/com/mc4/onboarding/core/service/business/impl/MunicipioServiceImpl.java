package bo.com.mc4.onboarding.core.service.business.impl;

import bo.com.mc4.onboarding.core.service.business.MunicipioService;
import bo.com.mc4.onboarding.model.business.dto.MunicipioDto;
import bo.com.mc4.onboarding.repository.business.MunicipioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by    : msaavedra
 * Date          : 29/11/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.core.service.business.impl
 **/
@Slf4j
@Service("municipioService")
public class MunicipioServiceImpl implements MunicipioService {

    private final MunicipioRepository municipioRepository;


    public MunicipioServiceImpl(MunicipioRepository municipioRepository) {
        this.municipioRepository = municipioRepository;
    }

    @Override
    public List<MunicipioDto> municipiosListByIdRegion(long idRegion) {
        return municipioRepository.findAllMunicipiosByIdRegion(idRegion);
    }
}
