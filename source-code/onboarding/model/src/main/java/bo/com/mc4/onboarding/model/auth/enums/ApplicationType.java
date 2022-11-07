package bo.com.mc4.onboarding.model.auth.enums;

public enum ApplicationType {
    WEB("WEB"),
    MOVIL("MOVIL");
    private String tipo;
    ApplicationType(String tipo){
        this.tipo = tipo;
    }
}
