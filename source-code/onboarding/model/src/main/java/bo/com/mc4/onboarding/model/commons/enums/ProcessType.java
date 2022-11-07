package bo.com.mc4.onboarding.model.commons.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ProcessType {
    SESION,
    USUARIO,
    RECEPTOR,
    OBTENER_ORDEN,
    OBTENER_CERTIFICADOS,
    TRANSFERENCIA,
    RECEPTOR_EXPRESS,
    RECEPTOR_PROCESADAS,
    GENERAL,
    APLICACION_WEB
}
