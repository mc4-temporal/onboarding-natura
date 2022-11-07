package bo.com.mc4.onboarding.core.service.mu;

import bo.com.mc4.onboarding.model.commons.Log;
import bo.com.mc4.onboarding.model.commons.enums.ProcessType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Date;

public interface LogService {

    void info(ProcessType processType, String mensaje, Object... var2);
    void infoApp(ProcessType processType, String mensaje, String pagina, String username, String... var2);
    void warning(ProcessType processType, String mensaje);
    void warning(ProcessType processType, String mensaje, Object... var2);
    void warningApp(ProcessType processType, String mensaje, String pagina, String username, String... var2);
    void error(ProcessType processType, String mensaje, Object... var2);
    void errorApp(ProcessType processType, String mensaje, String pagina, String username, String... var2);
    void debug(ProcessType proceso, String mensaje,Object... arguments);
    Page<Log> listPageableByDatesAndType(Date inicio, Date fin, ProcessType proceso, String coincidencia, Pageable pageable);

}
