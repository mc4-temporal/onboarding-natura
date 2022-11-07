package bo.com.mc4.onboarding.model.commons.enums;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ParameterType {
    CADENA("CADENA"),
    NUMERICO("NUMERICO"),
    BOOLEANO("BOOLEANO"),
    FECHA("FECHA"),
    LOB("LOB"),
    UNDEFINED("UNDEFINED");
    private final String tipoDato;
    ParameterType(String tipoDato){
        this.tipoDato = tipoDato;
    }
}
