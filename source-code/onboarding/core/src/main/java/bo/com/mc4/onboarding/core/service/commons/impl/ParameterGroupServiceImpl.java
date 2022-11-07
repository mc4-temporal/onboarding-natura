package bo.com.mc4.onboarding.core.service.commons.impl;

import bo.com.mc4.onboarding.core.service.commons.ParameterGroupService;
import bo.com.mc4.onboarding.model.commons.ParameterGroup;
import bo.com.mc4.onboarding.repository.commons.ParameterGroupRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("ParameterGroupService")
public class ParameterGroupServiceImpl implements ParameterGroupService {
    @Autowired
    private ParameterGroupRepository muParameterGroupRepository;
    @Override
    public List<ParameterGroup> getParameterGroupList() {
        return this.muParameterGroupRepository.listaGruposParametro();
    }
}
