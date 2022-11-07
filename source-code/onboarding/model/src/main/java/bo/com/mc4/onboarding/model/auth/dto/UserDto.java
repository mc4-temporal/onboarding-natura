package bo.com.mc4.onboarding.model.auth.dto;

import bo.com.mc4.onboarding.model.auth.AuthUser;
import bo.com.mc4.onboarding.model.auth.enums.UserStatus;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {
    private Long id;
    private String username;
    private String name;
    private String lastname;
    private String fullName;
    private UserStatus userStatus;
    private String email;
    private boolean generatedPassword;
    private Long idAuthRole;
    private String rolName;

    public static UserDto fromAuthUser(AuthUser authUser) {
        return UserDto.builder()
                .id(authUser.getId())
                .username(authUser.getUsername())
                .name(authUser.getName())
                .lastname(authUser.getLastname())
                .fullName(authUser.getName() + " " + authUser.getLastname())
                .userStatus(authUser.getUserStatus())
                .email(authUser.getEmail())
                .generatedPassword(authUser.isGeneratedPassword())
                .idAuthRole(authUser.getIdAuthRole().getId())
                .rolName(authUser.getIdAuthRole().getName())
                .build();
    }
}
