package bo.com.mc4.onboarding.model.business.enums;

import lombok.Getter;

@Getter
public enum TipoServicio {
    GERA("GERA"),
    AUTH_GERA("AUTH_GERA"),
    DIGICERT("DIGICERT"),
    INFOCENTER("INFOCENTER"),
    INFOBIP("INFOBIP");
    private String tipo;
    TipoServicio(String tipo){
        this.tipo = tipo;
    }
}
