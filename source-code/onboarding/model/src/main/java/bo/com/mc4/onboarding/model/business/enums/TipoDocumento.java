package bo.com.mc4.onboarding.model.business.enums;

import lombok.Getter;

@Getter
public enum TipoDocumento {
    CI("CI"),
    CI_EXTRANJERO("CI_EXTRANJERO"),
    PASAPORTE("PASPORTE");
    private String tipo;
    TipoDocumento(String tipo){
        this.tipo = tipo;
    }
}
