package bo.com.mc4.onboarding.core.util.exception;

import bo.com.mc4.onboarding.core.util.FormatUtil;

import java.util.function.Supplier;

public class ExceptionUtil {
    public static Supplier<OperationException> throwFindFail(String entityId, String objeto) {
        return () -> new OperationException(FormatUtil.noRegistrado(objeto, entityId));
    }
}
