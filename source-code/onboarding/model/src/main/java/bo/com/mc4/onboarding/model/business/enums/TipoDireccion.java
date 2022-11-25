package bo.com.mc4.onboarding.model.business.enums;

import lombok.Getter;

@Getter
public enum TipoDireccion {
    DOMICILIO("DOMICILIO"),
    ENTREGA("ENTREGA"),
    AMBOS("AMBOS");
    private String tipo;
    TipoDireccion(String tipo){
        this.tipo = tipo;
    }
}
