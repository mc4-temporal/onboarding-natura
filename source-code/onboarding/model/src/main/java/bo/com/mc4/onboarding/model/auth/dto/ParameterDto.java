package bo.com.mc4.onboarding.model.auth.dto;

import bo.com.mc4.onboarding.model.commons.Parameter;
import bo.com.mc4.onboarding.model.commons.enums.ParameterType;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParameterDto implements Serializable {
    private Long id;
    private String code;
    private String description;
    private String stringValue;
    private Boolean boolValue;
    private BigDecimal numberValue;
    private Date dateValue;
    private ParameterType parameterType;
    private Boolean encode;
    private String encodeStr;
    private String lobValue;
    private ParameterGroupDto idParameterGroup;

    public ParameterDto(Parameter parameter) {
        this.id = parameter.getId();
        this.code = parameter.getCode();
        this.description = parameter.getDescription();
        this.stringValue = parameter.getStringValue();
        this.boolValue = parameter.getBoolValue();
        this.numberValue = parameter.getNumberValue();
        this.dateValue = parameter.getDateValue();
        this.parameterType = parameter.getParameterType();
        this.encodeStr = parameter.isEncode() ? "Si" : "No";
        this.encode = parameter.isEncode();
        this.lobValue = parameter.getLobValue();
        this.idParameterGroup =   new ParameterGroupDto(parameter.getIdParameterGroup());
    }

    public static ParameterDto fromParameterDto(Parameter parameterDto) {
        return new ParameterDto(parameterDto);
    }
}
