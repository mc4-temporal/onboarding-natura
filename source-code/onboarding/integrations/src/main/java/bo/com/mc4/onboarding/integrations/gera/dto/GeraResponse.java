package bo.com.mc4.onboarding.integrations.gera.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GeraResponse<T> {
    private T data;
    private Integer total;
}
