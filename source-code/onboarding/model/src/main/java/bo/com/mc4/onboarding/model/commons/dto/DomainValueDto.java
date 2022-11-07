package bo.com.mc4.onboarding.model.commons.dto;

import bo.com.mc4.onboarding.model.commons.DomainValue;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DomainValueDto implements Serializable {
    private Long id;
    private String value;
    private String idDomain;


    public static DomainValueDto buildFromDomainValue(DomainValue domainValue) {
        return DomainValueDto.builder()
                .id(domainValue.getId())
                .value(domainValue.getValue())
                .idDomain(domainValue.getIdDomain().getId())
                .build();
    }
}
