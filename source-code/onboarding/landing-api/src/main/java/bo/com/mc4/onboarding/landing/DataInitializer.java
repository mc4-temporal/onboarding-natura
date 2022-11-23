package bo.com.mc4.onboarding.landing;

import bo.com.mc4.onboarding.model.business.Municipio;
import bo.com.mc4.onboarding.repository.business.DepartamentoRepository;
import bo.com.mc4.onboarding.repository.business.MunicipioRepository;
import bo.com.mc4.onboarding.repository.business.ProvinciaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataInitializer implements CommandLineRunner {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    private final DepartamentoRepository departamentoRepository;
    private final ProvinciaRepository provinciaRepository;
    private final MunicipioRepository municipioRepository;

    public DataInitializer(DepartamentoRepository departamentoRepository,
                           ProvinciaRepository provinciaRepository,
                           MunicipioRepository municipioRepository) {
        this.departamentoRepository = departamentoRepository;
        this.provinciaRepository = provinciaRepository;
        this.municipioRepository = municipioRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Landing API started with '{}' profile", activeProfile);
        if (activeProfile.contains("development")) {
            addMunicipio();
        }
    }

    private void addMunicipio() {

    }
}
