package bo.com.mc4.onboarding.core.service.business;

import bo.com.mc4.onboarding.model.auth.AuthUser;
import bo.com.mc4.onboarding.model.business.Consultora;
import bo.com.mc4.onboarding.model.business.dto.ConsultoraDto;
import bo.com.mc4.onboarding.model.business.dto.input.FiltroConsultoraDto;
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
public interface ConsultoraService {

    Page<ConsultoraDto> getConsultorasList(FiltroConsultoraDto filtro, Pageable pageable);
}
