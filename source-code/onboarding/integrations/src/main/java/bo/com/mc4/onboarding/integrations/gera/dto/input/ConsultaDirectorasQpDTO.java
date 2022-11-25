package bo.com.mc4.onboarding.integrations.gera.dto.input;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * ConsultaDirectorasQpDTO
 *
 * @author Marcos Quispe
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class ConsultaDirectorasQpDTO {

    private List<Integer> code;

    private String name;

    private Integer parentCode;

    private Integer responsibleUserCode;

    private Integer coresponsibleUserCode;

    private Integer responsibleOrcoresponsibleUserCode;

    private Integer levelCode;

    private Integer cycle;

    private Boolean isActive;

    private List<String> includeOptions;

}
