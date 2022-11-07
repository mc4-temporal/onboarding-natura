package bo.com.mc4.onboarding.model.auth.dto.v1;

import bo.com.mc4.onboarding.model.auth.AuthResource;
import bo.com.mc4.onboarding.model.auth.enums.ResourceType;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResourceDto implements Serializable {
    private Long id;
    private Long idResourceParent;
    private String name;
    private String icon;
    private String route;
    private List<ResourceDto> subItems;
    private Integer position;
    private Boolean pathMatchExact;
    private ResourceType type;
    private String badge;
    private String badgeColor;
    private String customClass;

    public static ResourceDto buildFromAuthResource(AuthResource authResource) {
        AuthResource idAuthResourcePadre = authResource.getIdAuthResourceParent();
        return ResourceDto.builder()
                .id(authResource.getId())
                .name(authResource.getName())
                .icon(authResource.getIcon())
                .route(authResource.getUrl())
                .subItems(new ArrayList<>())
                .position(authResource.getMenuPosition())
                .pathMatchExact(null)
                .badge(authResource.getBadge())
                .badgeColor(authResource.getBadgeColor())
                .type(authResource.getType())
                .customClass(authResource.getCustomClass())
                .idResourceParent(idAuthResourcePadre != null ? idAuthResourcePadre.getId() : null)
                .build();
    }
}
