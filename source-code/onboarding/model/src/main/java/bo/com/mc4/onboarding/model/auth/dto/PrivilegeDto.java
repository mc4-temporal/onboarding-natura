package bo.com.mc4.onboarding.model.auth.dto;

import bo.com.mc4.onboarding.model.auth.AuthPrivilege;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrivilegeDto implements Serializable {
    private Long id;
    private Long idAuthAction;
    private Long idAuthRoleResource;
    private Boolean enable;

    public static PrivilegeDto buildFromPrivilege(AuthPrivilege authPrivilege) {
        return PrivilegeDto.builder()
                .id(authPrivilege.getId())
                .idAuthAction(authPrivilege.getIdAuthAction().getId())
                .idAuthRoleResource(authPrivilege.getIdAuthRoleResource().getId())
                .enable(!authPrivilege.isDeleted())
                .build();
    }
}
