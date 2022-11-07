package bo.com.mc4.onboarding.model.commons.dto.api;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseBody<T> {
    String code = "000";
    String message;
    T data;
}
