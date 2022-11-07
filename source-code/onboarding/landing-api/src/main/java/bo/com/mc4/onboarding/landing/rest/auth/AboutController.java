package bo.com.mc4.onboarding.landing.rest.auth;

import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/about")
public class AboutController {
    @Value("${build.version}")
    private String version;

    @GetMapping("/version")
    ResponseEntity<ResponseBody<String>> version() {
        return ResponseEntity.ok(ApiUtil.buildResponseWithDefaults(version));
    }
}
