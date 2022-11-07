package bo.com.mc4.onboarding.core.service.commons;

import bo.com.mc4.onboarding.model.auth.dto.ParameterDto;
import bo.com.mc4.onboarding.model.commons.Parameter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface ParameterService {
    String getValue(String code);
    boolean getBoolean(String code);
    BigDecimal getNumber(String code);
    Date getDate(String code);
    int getInt(String code);
    void saveParameter(Parameter muParameter);
    List<ParameterDto> list(Long groupId);
    List<ParameterDto> list(String groupId);
    List<Parameter> searchList(String searchType);
    ParameterDto getParameter(String code);
    Long update(Parameter muParameter, Long id);
    Parameter getParam(String code);
    //V2
    Parameter createParameter(ParameterDto parameterDto);
    Parameter updateParameter(Long parametroId, ParameterDto muParameterDto);
    Page<Parameter> listParametersByGroup(Long group, String filter, Pageable pageable);
    void delete(Long idParameter);
}
