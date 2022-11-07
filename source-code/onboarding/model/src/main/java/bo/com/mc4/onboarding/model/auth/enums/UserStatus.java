package bo.com.mc4.onboarding.model.auth.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum UserStatus {
    ACTIVO("ACTIVO"),
    INACTIVO("INACTIVO"),
    BLOQUEADO("BLOQUEADO"),
    ELIMINADO("ELIMINADO");
    private final String state;
    UserStatus(String state) {
        this.state = state;
    }
}
