package bo.com.mc4.onboarding.core.service.mu.impl;

import bo.com.mc4.onboarding.core.service.mu.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service("emailService")
public class EmailServiceImpl implements EmailService {
    private static final String BANNER_PNG = "imagenes/footer_unilink.jpeg";
    @Value("${spring.profiles.actives}")
    private String activeProfile;


    @Override
    @Async
    public void notificacionPassword(String username, String nombre, String email, String newPassword,String urlSistema) {
        log.info("notificacionPassword");
    }

    @Override
    @Async
    public void notificacionInicioSesion(String nombre, String email) {
        log.info("notificacionInicioSesion");
    }

    @Override
    @Async
    public void recuperacionCredenciales(String username, String nombre, String email, String password, String urlSistema) {
        log.info("recuperacionCredenciales");
    }

    @Override
    @Async
    public void notificacionError(String asunto,String email,String mensaje, Throwable causa) {
        log.info("notificacionError");
    }

}
