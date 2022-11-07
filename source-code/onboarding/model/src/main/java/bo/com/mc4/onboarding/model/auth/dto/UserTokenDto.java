package bo.com.mc4.onboarding.model.auth.dto;

import bo.com.mc4.onboarding.model.auth.AuthUser;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserTokenDto implements Serializable {
    AuthUser authUser;
    String fechaExpiracion;
}
