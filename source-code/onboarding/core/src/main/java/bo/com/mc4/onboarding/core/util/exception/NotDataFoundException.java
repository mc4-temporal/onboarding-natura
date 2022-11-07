package bo.com.mc4.onboarding.core.util.exception;

public class NotDataFoundException extends RuntimeException {
    public NotDataFoundException(String message, Throwable cause) {
        super(message,cause);
    }
    public NotDataFoundException(String message) {
        super(message);
    }
}
