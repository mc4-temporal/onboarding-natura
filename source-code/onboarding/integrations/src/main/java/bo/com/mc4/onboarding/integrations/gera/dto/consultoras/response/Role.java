package bo.com.mc4.onboarding.integrations.gera.dto.consultoras.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Role
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class Role {

    private Integer code;

    private String name;

    private Integer functionCode;

    private Boolean leaderConcept;

    private String pictureUrl;

    private String color;

}