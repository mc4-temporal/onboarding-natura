package bo.com.mc4.onboarding.model.auth.dto;

import bo.com.mc4.onboarding.model.auth.AuthRole;
import bo.com.mc4.onboarding.model.commons.enums.EntityState;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleDto implements Serializable {
    private Long id;
    private String name;
    private String description;
    private boolean baseRole;
    private EntityState roleStatus;
    private String baseRoleStr;
    public RoleDto(AuthRole entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.description = entity.getDescription();
        this.baseRole = entity.isBaseRole();
        this.roleStatus = entity.getRoleStatus();
        this.baseRoleStr = entity.isBaseRole() ? "Si" : "No";
    }

    public static RoleDto fromAuthRole(AuthRole authRole) {
        return new RoleDto(authRole);
    }
}
