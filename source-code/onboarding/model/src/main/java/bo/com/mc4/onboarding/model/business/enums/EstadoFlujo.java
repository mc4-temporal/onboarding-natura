package bo.com.mc4.onboarding.model.business.enums;

import lombok.Getter;

@Getter
public enum EstadoFlujo {
    FORM_DATOS_PERSONALES("DATOS_PERSONALES"),
    FORM_DIRECCIONES("DIRECCIONES"),
    FORM_ASIGNACION_DIRECTORA("ASIGNACION_DIRECTORA"),
    FORM_RESUMEN_VERIFICACION("RESUMEN_VERIFICACION"),
    FORM_AL_CONTADO("AL_CONTADO"),
    FORM_TERMINOS_CONDICIONES("TERMINOS_CONDICIONES"),
    FORM_FOTOGRAFIAS("FOTOGRAFIAS"),
    FORM_AL_CREDITO("AL_CREDITO");
    private String estado;
    EstadoFlujo(String estado){
        this.estado = estado;
    }
}
