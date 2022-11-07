package bo.com.mc4.onboarding.core.service.commons.impl;

import bo.com.mc4.onboarding.core.service.commons.DomainService;
import bo.com.mc4.onboarding.model.commons.DomainValue;
import bo.com.mc4.onboarding.repository.commons.DomainRepository;
import bo.com.mc4.onboarding.repository.commons.DomainValueRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service("domainService")
public class DomainServiceImpl implements DomainService {
    private final DomainRepository domainRepository;
    private final DomainValueRepository domainValueRepository;

    public DomainServiceImpl(DomainRepository domainRepository, DomainValueRepository domainValueRepository) {
        this.domainRepository = domainRepository;
        this.domainValueRepository = domainValueRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<DomainValue> findDomainValueByDomain(String domainId) {
        return this.domainValueRepository.findDomainValueByDomain(domainId);
    }
}
