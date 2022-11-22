package bo.com.mc4.onboarding.model.business.enums;

import lombok.Getter;

@Getter
public enum TipoConsultora {
    PROSPECTO("PROSPECTO"),
    CONTADO("CONTADO"),
    CREDITO("CREDITO");
    private String tipo;
    TipoConsultora(String tipo){
        this.tipo = tipo;
    }
}
