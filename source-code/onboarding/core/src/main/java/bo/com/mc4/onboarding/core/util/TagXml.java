package bo.com.mc4.onboarding.core.util;

/**
 * Created by :MC4
 * Author :Ricardo Laredo
 * Email :rlaredo@mc4.com.bo
 * Date :7/14/22
 * Project onboarding-source
 * Package :bo.com.mc4.onboarding.core.util
 * Copyright :MC4
 */
public interface TagXml {
    String TAG_PREFIX = "ds:";
    String TAG_5A = "<error>";
    String TAG_SIGNATURE = TAG_PREFIX + "Signature";
    String TAG_OBJECT = TAG_PREFIX + "Object";
    String TAG_2A_MESSAGE_PARENT = "ach_destinatario";
    String TAG_2A_MESSAGE = "ach_destinatario_original";
    String TAG_1A_MESSAGE = "Originante_ACH";
    String TAG_1A_MESSAGE_PARENT = "raiz";
    String TAG_1B_MESSAGE = "respuesta";
    String TAG_4A_MESSAGE = "ach_destinatario_original";
    String TAG_3A_MESSAGE = "Destinatario_ACH";
    String TAG_5A_MESSAGE = "respuesta";
    String TAG_CODIGO_LOG = "num_orden_originante";

    String TAG_RECEPTOR_REQUEST = "receptorRequest";
    String TAG_RECEPTOR = "receptor";
    String TAG_RECEPTOR_PROCESADAS_REQUEST = "receptorProcesadasRequest";
    String TAG_RECEPTOR_PROCESADAS = "receptorProcesadas";

    String TAG_RECEPTOR_EXPRESS_REQUEST = "receptorExpressRequest";
    String TAG_RECEPTOR_EXPRESS = "receptorExpress";

    String TAG_PARAMETERS = "parameters";

    String TAG_RESPONSE_RECEPTOR_AXON = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
            "  <soap:Header/>\n" +
            "  <soap:Body>\n" +
            "    <ns2:receptorResponse xmlns:ns2=\"http://tempuri.org/\">\n" +
            "      <return>{{BODY}}</return>\n" +
            "    </ns2:receptorResponse>\n" +
            "  </soap:Body>\n" +
            "</soap:Envelope>";
    String TAG_RESPONSE_RECEPTOR_PROCESADAS_AXON = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
            "  <soap:Header/>\n" +
            "  <soap:Body>\n" +
            "    <ns2:receptorProcesadasResponse xmlns:ns2=\"http://tempuri.org/\">\n" +
            "      <return>{{BODY}}</return>\n" +
            "    </ns2:receptorProcesadasResponse>\n" +
            "  </soap:Body>\n" +
            "</soap:Envelope>";

    String TAG_RESPONSE_RECEPTOR_EXPRESS_AXON = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
            "  <soap:Header/>\n" +
            "  <soap:Body>\n" +
            "    <ns2:receptorExpressResponse xmlns:ns2=\"http://tempuri.org/\">\n" +
            "      <return>{{BODY}}</return>\n" +
            "    </ns2:receptorExpressResponse>\n" +
            "  </soap:Body>\n" +
            "</soap:Envelope>";


    String TAG_RESPONSE_RECEPTOR_UNILINK = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
            "   <soapenv:Header/>\n" +
            "   <soapenv:Body>\n" +
            "      <receptorResponse xmlns=\"http://servicios.sicom.ws.unilink.com.bo/\">\n" +
            "         <return><![CDATA[{{BODY}}]]></return>\n" +
            "      </receptorResponse>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>";

    String TAG_RESPONSE_RECEPTOR_PROCESADAS_UNILINK = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
            "   <soapenv:Header/>\n" +
            "   <soapenv:Body>\n" +
            "      <receptorProcesadasResponse xmlns=\"http://servicios.sicom.ws.unilink.com.bo/\">\n" +
            "         <return><![CDATA[{{BODY}}]]></return>\n" +
            "      </receptorProcesadasResponse>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>";

    String TAG_RESPONSE_RECEPTOR_EXPRESS_PROCESADAS_UNILINK = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n" +
            "   <soapenv:Header/>\n" +
            "   <soapenv:Body>\n" +
            "      <receptorExpressResponse xmlns=\"http://servicios.sicom.ws.unilink.com.bo/\">\n" +
            "         <return><![CDATA[{{BODY}}]]></return>\n" +
            "      </receptorProcesadasResponse>\n" +
            "   </soapenv:Body>\n" +
            "</soapenv:Envelope>";
}
