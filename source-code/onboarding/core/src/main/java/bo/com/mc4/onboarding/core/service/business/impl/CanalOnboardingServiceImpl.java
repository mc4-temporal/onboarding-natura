package bo.com.mc4.onboarding.core.service.business.impl;

import bo.com.mc4.onboarding.core.service.business.CanalOnboardingService;
import bo.com.mc4.onboarding.model.business.dto.CanalOnboardingDto;
import bo.com.mc4.onboarding.repository.business.CanalOnboardingRepository;
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
@Service("canalOnboardingService")
public class CanalOnboardingServiceImpl implements CanalOnboardingService {

    private final CanalOnboardingRepository canalOnboardingRepository;

    public CanalOnboardingServiceImpl(CanalOnboardingRepository canalOnboardingRepository) {
        this.canalOnboardingRepository = canalOnboardingRepository;
    }

    @Override
    public List<CanalOnboardingDto> canalesOnboardingList() {
        return this.canalOnboardingRepository.findAllDtos();
    }
}
