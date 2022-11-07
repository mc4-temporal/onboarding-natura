package bo.com.mc4.onboarding.model.auth.dto;

import bo.com.mc4.onboarding.model.auth.AuthResource;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserAccessDto implements Serializable {
    private Long resourceId;
    private String name;
    private Boolean isParent;
    private String url;
    private Boolean checked;
    private Long idRoleResource;

    public static UserAccessDto buildFromResourceParent(AuthResource parent) {
        return UserAccessDto.builder()
                .resourceId(parent.getId())
                .name(parent.getName())
                .isParent(true)
                .build();
    }
}
