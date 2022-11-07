package bo.com.mc4.onboarding.core.cache;

import java.math.BigDecimal;
import java.util.Date;

public interface CacheService {

    String getValue(String codigo);
    Boolean getBoolean(String codigo);
    BigDecimal getNumber(String codigo);
    Date getDate(String codigo);
    Integer getInt(String codigo);
}
