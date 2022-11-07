package bo.com.mc4.onboarding.core.util.exception;

public class ValidationFieldException extends RuntimeException {
    public ValidationFieldException(String message, Throwable cause) {
        super(message,cause);
    }
    public ValidationFieldException(String message) {
        super(message);
    }
}
