package bo.com.mc4.onboarding.model.auth.enums;

public enum ResourceType {
    item("item"),
    subheading("subheading");
    private final String type;
    ResourceType(String type){
        this.type = type;
    }
}
