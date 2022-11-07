package bo.com.mc4.onboarding.core.service.mu.impl;

import bo.com.mc4.onboarding.core.cache.CacheService;
import bo.com.mc4.onboarding.core.service.mu.LogService;
import bo.com.mc4.onboarding.core.util.Constants;
import bo.com.mc4.onboarding.model.commons.Log;
import bo.com.mc4.onboarding.model.commons.enums.LogType;
import bo.com.mc4.onboarding.model.commons.enums.ProcessType;
import bo.com.mc4.onboarding.repository.auth.LogRepository;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Transactional
@Service("logService")
public class LogServiceImpl implements LogService {
    private final LogRepository repository;
    private final CacheService cacheService;

    public LogServiceImpl(LogRepository repository, CacheService cacheService) {
        this.repository = repository;
        this.cacheService = cacheService;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Async
    public void info(ProcessType processType, String mensaje, Object... arguments) {
        if (arguments != null && arguments.length > 0) {
            FormattingTuple tp = MessageFormatter.arrayFormat(mensaje, arguments);
            mensaje = tp.getMessage();
        }
        Log sfeLog = Log.builder().processType(processType).logType(LogType.INFO).log(mensaje).build();
        this.repository.save(sfeLog);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Async
    public void infoApp(ProcessType processType, String mensaje, String pagina, String username, String... arguments) {
        StringBuilder sb = new StringBuilder(mensaje + "\n");
        if (arguments != null && arguments.length > 0) {
            for (Object msg : arguments) {
                sb.append(msg);
            }
        }
        this.repository.save(Log.builder()
                .processType(processType)
                .logType(LogType.INFO)
                .log(sb.toString())
                .pagina(pagina)
                .username(username)
                .build());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Async
    public void warning(ProcessType processType, String mensaje) {
        Log sfeLog = Log.builder().processType(processType).logType(LogType.WARNING).log(mensaje).build();
        this.repository.save(sfeLog);
    }

    @Override
    @Async
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void warning(ProcessType processType, String mensaje, Object... arguments) {
        if (arguments != null && arguments.length > 0) {
            FormattingTuple tp = MessageFormatter.arrayFormat(mensaje, arguments);
            mensaje = tp.getMessage();
        }
        Log sfeLog = Log.builder().processType(processType).logType(LogType.WARNING).log(mensaje).build();
        this.repository.save(sfeLog);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Async
    public void warningApp(ProcessType processType, String mensaje, String pagina, String username, String... arguments) {
        StringBuilder sb = new StringBuilder(mensaje + "\n");
        if (arguments != null && arguments.length > 0) {
            for (Object msg : arguments) {
                sb.append(msg);
            }
        }
        this.repository.save(Log.builder()
                .processType(processType)
                .logType(LogType.WARNING)
                .log(sb.toString())
                .pagina(pagina)
                .username(username)
                .build());
    }

    @Override
    @Async
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void error(ProcessType processType, String mensaje, Object... arguments) {
        if (arguments != null && arguments.length > 0) {
            FormattingTuple tp = MessageFormatter.arrayFormat(mensaje, arguments);
            mensaje = tp.getMessage();
        }
        Log sfeLog = Log.builder().processType(processType).logType(LogType.ERROR).log(mensaje).build();
        this.repository.save(sfeLog);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Async
    public void errorApp(ProcessType processType, String mensaje, String pagina, String username, String... arguments) {
        StringBuilder sb = new StringBuilder(mensaje + "\n");
        if (arguments != null && arguments.length > 0) {
            for (Object msg : arguments) {
                sb.append(msg);
            }
        }
        this.repository.save(Log.builder()
                .processType(processType)
                .logType(LogType.ERROR)
                .log(sb.toString())
                .pagina(pagina)
                .username(username)
                .build());
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    @Async
    public void debug(ProcessType processType, String mensaje, Object... arguments) {
        if (!cacheService.getBoolean(Constants.Params.LOG_LEVEL_DEBUG)) {
            return;
        }
        if (arguments != null && arguments.length > 0) {
            FormattingTuple tp = MessageFormatter.arrayFormat(mensaje, arguments);
            mensaje = tp.getMessage();
        }
        if (mensaje.length() >= 10000) {
            mensaje = mensaje.substring(0, 9999);
        }

        this.repository.save(Log.builder()
                .processType(processType)
                .logType(LogType.DEBUG)
                .log(mensaje)
                .build());
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Log> listPageableByDatesAndType(Date inicio, Date fin, ProcessType proceso, String coincidencia, Pageable pageable) {
        return this.repository.listByFilters(inicio, fin, proceso, coincidencia, pageable);
    }
}
