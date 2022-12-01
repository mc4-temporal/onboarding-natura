package bo.com.mc4.onboarding.core.service.business;

import bo.com.mc4.onboarding.model.business.dto.MunicipioDto;

import java.util.List;

public interface MunicipioService {
    List<MunicipioDto> municipiosListByIdRegion(long idRegion);
}
