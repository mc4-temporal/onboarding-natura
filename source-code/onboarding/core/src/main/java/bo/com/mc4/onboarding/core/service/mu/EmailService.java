package bo.com.mc4.onboarding.core.service.mu;

public interface EmailService {
    void notificacionPassword(String username, String nombre, String email, String password,String urlSistema);
    void notificacionInicioSesion(String nombre, String email);
    void recuperacionCredenciales(String username, String nombre, String email, String password,String urlSistema);
    void notificacionError(String asunto,String email,String mensaje, Throwable causa);
}
