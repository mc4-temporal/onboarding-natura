package bo.com.mc4.onboarding.core.service.business;

import bo.com.mc4.onboarding.model.business.dto.FrmDatosPersonalesDto;
import bo.com.mc4.onboarding.model.business.dto.FrmDireccionDto;
import bo.com.mc4.onboarding.model.business.dto.FrmDirectoraConsultoraDto;
import bo.com.mc4.onboarding.model.business.dto.FrmResponseDto;

public interface OnboardingService {

    /**
     * Valida, registra los datos del formulario de datos personales
     * @param codigoCanalOnb canal donde inicio onboarding
     * @param frmDatosPersonalesDto datos enviados del frontend
     * @return datos de respuesta
     */
    FrmResponseDto saveFrmDatosPersonales(String codigoCanalOnb, FrmDatosPersonalesDto frmDatosPersonalesDto);

    /**
     * Registra datos del formulario de direccion del prospecto
     * @param prospectoId identificador del prospecto
     * @param frmDireccionDto datos enviados del frontend
     * @return datos de respuesta
     */
    FrmResponseDto saveFrmDireccion(Long prospectoId, FrmDireccionDto frmDireccionDto);

    FrmResponseDto saveFrmDirectoraConsultoraConocida(Long prospectoId, FrmDirectoraConsultoraDto frmDirectoraConsultoraDto);
}
