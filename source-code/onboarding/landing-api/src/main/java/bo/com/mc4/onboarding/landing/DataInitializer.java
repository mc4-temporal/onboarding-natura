package bo.com.mc4.onboarding.landing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataInitializer implements CommandLineRunner {

    @Value("${spring.profiles.actives}")
    private String activeProfile;

    @Override
    public void run(String... args) throws Exception {
        log.info("Landing API started with '{}' profile", activeProfile);
    }
}
