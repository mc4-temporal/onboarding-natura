package bo.com.mc4.onboarding.core.util.exception;

public class ValidationException extends RuntimeException {
    public ValidationException(String message, Throwable cause) {
        super(message,cause);
    }
    public ValidationException(String message) {
        super(message);
    }
}
