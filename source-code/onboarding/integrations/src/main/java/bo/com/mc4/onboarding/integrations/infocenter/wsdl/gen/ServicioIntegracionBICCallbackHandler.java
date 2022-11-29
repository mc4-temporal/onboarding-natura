/**
 * ServicioIntegracionBICCallbackHandler.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

package bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen;

/**
 *  ServicioIntegracionBICCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class ServicioIntegracionBICCallbackHandler {


    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public ServicioIntegracionBICCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public ServicioIntegracionBICCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */

    public Object getClientData() {
        return clientData;
    }


    /**
     * auto generated Axis2 call back method for consultar_persona_segip method
     * override this method for handling normal response from consultar_persona_segip operation
     */
    public void receiveResultconsultar_persona_segip(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segipResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultar_persona_segip operation
     */
    public void receiveErrorconsultar_persona_segip(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultar_persona_scoring method
     * override this method for handling normal response from consultar_persona_scoring operation
     */
    public void receiveResultconsultar_persona_scoring(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoringResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultar_persona_scoring operation
     */
    public void receiveErrorconsultar_persona_scoring(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for procesar_analisis_personas method
     * override this method for handling normal response from procesar_analisis_personas operation
     */
    public void receiveResultprocesar_analisis_personas(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personasResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from procesar_analisis_personas operation
     */
    public void receiveErrorprocesar_analisis_personas(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for add_Dat_Xml_Resultado method
     * override this method for handling normal response from add_Dat_Xml_Resultado operation
     */
    public void receiveResultadd_Dat_Xml_Resultado(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_ResultadoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from add_Dat_Xml_Resultado operation
     */
    public void receiveErroradd_Dat_Xml_Resultado(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for verificaciones_consultar_estado method
     * override this method for handling normal response from verificaciones_consultar_estado operation
     */
    public void receiveResultverificaciones_consultar_estado(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estadoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from verificaciones_consultar_estado operation
     */
    public void receiveErrorverificaciones_consultar_estado(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for verificaciones_Get_Dat_Verificaciones method
     * override this method for handling normal response from verificaciones_Get_Dat_Verificaciones operation
     */
    public void receiveResultverificaciones_Get_Dat_Verificaciones(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_VerificacionesResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from verificaciones_Get_Dat_Verificaciones operation
     */
    public void receiveErrorverificaciones_Get_Dat_Verificaciones(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultar_persona_deudas method
     * override this method for handling normal response from consultar_persona_deudas operation
     */
    public void receiveResultconsultar_persona_deudas(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudasResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultar_persona_deudas operation
     */
    public void receiveErrorconsultar_persona_deudas(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultar_persona_indicadores method
     * override this method for handling normal response from consultar_persona_indicadores operation
     */
    public void receiveResultconsultar_persona_indicadores(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadoresResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultar_persona_indicadores operation
     */
    public void receiveErrorconsultar_persona_indicadores(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for verificaciones_Add_Dat_Verificaciones method
     * override this method for handling normal response from verificaciones_Add_Dat_Verificaciones operation
     */
    public void receiveResultverificaciones_Add_Dat_Verificaciones(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_VerificacionesResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from verificaciones_Add_Dat_Verificaciones operation
     */
    public void receiveErrorverificaciones_Add_Dat_Verificaciones(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultar_persona_motor method
     * override this method for handling normal response from consultar_persona_motor operation
     */
    public void receiveResultconsultar_persona_motor(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motorResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultar_persona_motor operation
     */
    public void receiveErrorconsultar_persona_motor(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultar_ponderado method
     * override this method for handling normal response from consultar_ponderado operation
     */
    public void receiveResultconsultar_ponderado(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderadoResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultar_ponderado operation
     */
    public void receiveErrorconsultar_ponderado(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultar_deudas_MC method
     * override this method for handling normal response from consultar_deudas_MC operation
     */
    public void receiveResultconsultar_deudas_MC(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MCResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultar_deudas_MC operation
     */
    public void receiveErrorconsultar_deudas_MC(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultar_contrastacion_segip method
     * override this method for handling normal response from consultar_contrastacion_segip operation
     */
    public void receiveResultconsultar_contrastacion_segip(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segipResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultar_contrastacion_segip operation
     */
    public void receiveErrorconsultar_contrastacion_segip(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for consultar_persona method
     * override this method for handling normal response from consultar_persona operation
     */
    public void receiveResultconsultar_persona(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_personaResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from consultar_persona operation
     */
    public void receiveErrorconsultar_persona(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for get_analisis_personas method
     * override this method for handling normal response from get_analisis_personas operation
     */
    public void receiveResultget_analisis_personas(
            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personasResponse result
    ) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from get_analisis_personas operation
     */
    public void receiveErrorget_analisis_personas(java.lang.Exception e) {
    }


}
