package bo.com.mc4.onboarding.integrations.gera.dto.directoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Email
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class Email {

    private Type type;

    private String email;

    private Boolean newsLetterAccepted;

}