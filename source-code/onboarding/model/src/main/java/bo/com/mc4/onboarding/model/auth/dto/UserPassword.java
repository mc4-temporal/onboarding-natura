package bo.com.mc4.onboarding.model.auth.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPassword implements Serializable {
    String presentPassword;
    String newPassword;
    String confirmPassword;
}
