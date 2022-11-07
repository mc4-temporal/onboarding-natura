package bo.com.mc4.onboarding.model.auth.dto;

import bo.com.mc4.onboarding.model.commons.ParameterGroup;
import bo.com.mc4.onboarding.model.commons.dto.AbstractAuditableDto;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParameterGroupDto extends AbstractAuditableDto {
    private Long id;
    private String groupName;
    private String description;

    public ParameterGroupDto(ParameterGroup parameterGroup) {
        this.id = parameterGroup.getId();
        this.groupName = parameterGroup.getGroupName();
        this.description = parameterGroup.getDescription();
    }
    public static ParameterGroupDto fromParameterGroup(ParameterGroup parameterGroup) {
        return new ParameterGroupDto(parameterGroup);
    }

}
