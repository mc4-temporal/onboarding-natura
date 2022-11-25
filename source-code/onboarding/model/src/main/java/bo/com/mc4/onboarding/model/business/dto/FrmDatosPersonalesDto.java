package bo.com.mc4.onboarding.model.business.dto;

import bo.com.mc4.onboarding.model.business.Consultora;
import bo.com.mc4.onboarding.model.business.enums.TipoConsultora;
import bo.com.mc4.onboarding.model.business.enums.TipoDocumento;
import bo.com.mc4.onboarding.model.util.DateUtil;
import com.google.gson.Gson;
import lombok.*;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

import java.util.Date;
import java.util.stream.Stream;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FrmDatosPersonalesDto {
    private Long consultoraId;
    private String nombres;
    private String apellidos;
    private TipoDocumento tipoDocumento;
    private String nroDocumento;
    private String complemento;
    private String expedicion;
    private Date fechaNacimiento;
    private String telefono;
    private String correo;
    private boolean terminosCondiciones;

    public Consultora toConsultoraEntity() {
        if (!StringUtils.isBlank(complemento)) {
            nroDocumento += String.format("-%s", complemento);
        }
        return Consultora.builder()
                .nombres(nombres)
                .apellidos(apellidos)
                .tipoDocumento(tipoDocumento)
                .nroDocumento(nroDocumento)
                .expedicion(expedicion)
                .fechaNacimiento(fechaNacimiento)
                .telefono(telefono)
                .correo(correo)
                .terminosCondiciones(terminosCondiciones)
                .tipoConsultora(TipoConsultora.PROSPECTO)
                .build();
    }

    public void validateFields() {

    }

    public static FrmDatosPersonalesDto fromJson(JSONObject json) {
        return new Gson()
                .fromJson(json.toString(), FrmDatosPersonalesDto.class);
    }
}
