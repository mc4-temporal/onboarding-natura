package bo.com.mc4.onboarding.model.business.dto.input;

import bo.com.mc4.onboarding.model.business.enums.TipoConsultora;
import lombok.*;

import java.util.Date;

/**
 * Created by    : msaavedra
 * Date          : 30/11/22
 * Project       : onboarding
 * Package       : bo.com.mc4.onboarding.model.business.dto.input
 **/
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FiltroConsultoraDto {

    private String filtroTexto;
    private TipoConsultora tipoConsultora;
    private long idCanalOnboarding;
    private long idMunicipio;
    private Date fechaRegistroDesde;
    private Date fechaRegistroHasta;
    private long idUser;

}
