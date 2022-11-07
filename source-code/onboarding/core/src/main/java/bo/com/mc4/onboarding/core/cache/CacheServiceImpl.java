package bo.com.mc4.onboarding.core.cache;

import bo.com.mc4.onboarding.core.service.commons.ParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Component
public class CacheServiceImpl implements CacheService{

    @Autowired
    private ParameterService paramService;

    @Override
    @Cacheable(value = "parametrosCache")
    public String getValue(String codigo) {
        return paramService.getValue(codigo);
    }

    @Override
    @Cacheable(value = "parametrosCache")
    public Boolean getBoolean(String codigo) {
        return paramService.getBoolean(codigo);
    }

    @Override
    @Cacheable(value = "parametrosCache")
    public Date getDate(String codigo) {
        return paramService.getDate(codigo);
    }

    @Override
    @Cacheable(value = "parametrosCache")
    public Integer getInt(String codigo) {
        return paramService.getNumber(codigo).intValue();
    }

    @Override
    @Cacheable(value = "parametrosCache")
    public BigDecimal getNumber(String codigo) {
        return paramService.getNumber(codigo);
    }
}
