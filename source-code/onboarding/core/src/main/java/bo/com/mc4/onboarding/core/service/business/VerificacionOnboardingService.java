package bo.com.mc4.onboarding.core.service.business;

public interface VerificacionOnboardingService {
    /**
     * Verifica si ya se encuentra registrado el documento en Gera
     * @param documento, documento a buscar en Gera
     * @return true si existe
     */
    boolean existeDocumentoGera(String documento);

    /**
     * Verifica si ya se encuentra registrado el email en Gera
     * @param email, email a buscar en Gera
     * @return true si existe
     */
    boolean existeEmailGera(String email);
}
