package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * PersonalReference
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class PersonalReference {

    private String name;

    private List<Document__1> document;

}