package bo.com.mc4.onboarding.core.service.commons;


import bo.com.mc4.onboarding.model.commons.DomainValue;

import java.util.List;

public interface DomainService {

    List<DomainValue> findDomainValueByDomain(String domainId);
}
