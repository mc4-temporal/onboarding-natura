/**
 * ServicioIntegracionBICStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
package bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen;



/*
 *  ServicioIntegracionBICStub java implementation
 */


public class ServicioIntegracionBICStub extends org.apache.axis2.client.Stub
        implements ServicioIntegracionBIC {
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private final java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private final java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private final java.util.HashMap faultMessageMap = new java.util.HashMap();

    private static int counter = 0;

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }
        counter = counter + 1;
        return System.currentTimeMillis() + "_" + counter;
    }


    private void populateAxisService() throws org.apache.axis2.AxisFault {

        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("ServicioIntegracionBIC" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[15];

        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "consultar_persona_segip"));
        _service.addOperation(__operation);


        _operations[0] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "consultar_persona_scoring"));
        _service.addOperation(__operation);


        _operations[1] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "procesar_analisis_personas"));
        _service.addOperation(__operation);


        _operations[2] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "add_Dat_Xml_Resultado"));
        _service.addOperation(__operation);


        _operations[3] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "verificaciones_consultar_estado"));
        _service.addOperation(__operation);


        _operations[4] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "verificaciones_Get_Dat_Verificaciones"));
        _service.addOperation(__operation);


        _operations[5] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "consultar_persona_deudas"));
        _service.addOperation(__operation);


        _operations[6] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "consultar_persona_indicadores"));
        _service.addOperation(__operation);


        _operations[7] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "verificaciones_Add_Dat_Verificaciones"));
        _service.addOperation(__operation);


        _operations[8] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "consultar_persona_motor"));
        _service.addOperation(__operation);


        _operations[9] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "consultar_ponderado"));
        _service.addOperation(__operation);


        _operations[10] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "consultar_deudas_MC"));
        _service.addOperation(__operation);


        _operations[11] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "consultar_contrastacion_segip"));
        _service.addOperation(__operation);


        _operations[12] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "consultar_persona"));
        _service.addOperation(__operation);


        _operations[13] = __operation;


        __operation = new org.apache.axis2.description.OutInAxisOperation();


        __operation.setName(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "get_analisis_personas"));
        _service.addOperation(__operation);


        _operations[14] = __operation;


    }

    //populates the faults
    private void populateFaults() {


    }

    /**
     *Constructor that takes in a configContext
     */

    public ServicioIntegracionBICStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                                      java.lang.String targetEndpoint)
            throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }


    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public ServicioIntegracionBICStub(org.apache.axis2.context.ConfigurationContext configurationContext,
                                      java.lang.String targetEndpoint, boolean useSeparateListener)
            throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);


        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

        //Set the soap version
        _serviceClient.getOptions().setSoapVersionURI(org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);


    }

    /**
     * Default Constructor
     */
    public ServicioIntegracionBICStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {

        this(configurationContext, "http://200.87.205.38/Integracion_Enserbic/Standard_WS/ServicioIntegracionBIC.asmx");

    }

    /**
     * Default Constructor
     */
    public ServicioIntegracionBICStub() throws org.apache.axis2.AxisFault {

        this("http://200.87.205.38/Integracion_Enserbic/Standard_WS/ServicioIntegracionBIC.asmx");

    }

    /**
     * Constructor taking the target endpoint
     */
    public ServicioIntegracionBICStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }


    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#consultar_persona_segip
     * @param consultar_persona_segip30

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segipResponse consultar_persona_segip(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segip consultar_persona_segip30)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_persona_segip");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consultar_persona_segip30,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_persona_segip")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_persona_segip"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segipResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segipResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_segip"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_segip"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_segip"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startconsultar_persona_segip
     * @param consultar_persona_segip30

     */
    public void startconsultar_persona_segip(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segip consultar_persona_segip30,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_persona_segip");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consultar_persona_segip30,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_persona_segip")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_persona_segip"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segipResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultconsultar_persona_segip(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segipResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorconsultar_persona_segip(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_segip"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_segip"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_segip"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorconsultar_persona_segip(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_segip(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_segip(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_segip(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_segip(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_segip(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_segip(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_segip(f);
                            }
                        } else {
                            callback.receiveErrorconsultar_persona_segip(f);
                        }
                    } else {
                        callback.receiveErrorconsultar_persona_segip(f);
                    }
                } else {
                    callback.receiveErrorconsultar_persona_segip(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorconsultar_persona_segip(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[0].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[0].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#consultar_persona_scoring
     * @param consultar_persona_scoring32

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoringResponse consultar_persona_scoring(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoring consultar_persona_scoring32)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_persona_scoring");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consultar_persona_scoring32,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_persona_scoring")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_persona_scoring"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoringResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoringResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_scoring"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_scoring"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_scoring"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startconsultar_persona_scoring
     * @param consultar_persona_scoring32

     */
    public void startconsultar_persona_scoring(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoring consultar_persona_scoring32,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_persona_scoring");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consultar_persona_scoring32,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_persona_scoring")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_persona_scoring"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoringResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultconsultar_persona_scoring(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoringResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorconsultar_persona_scoring(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_scoring"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_scoring"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_scoring"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorconsultar_persona_scoring(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_scoring(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_scoring(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_scoring(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_scoring(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_scoring(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_scoring(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_scoring(f);
                            }
                        } else {
                            callback.receiveErrorconsultar_persona_scoring(f);
                        }
                    } else {
                        callback.receiveErrorconsultar_persona_scoring(f);
                    }
                } else {
                    callback.receiveErrorconsultar_persona_scoring(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorconsultar_persona_scoring(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[1].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[1].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#procesar_analisis_personas
     * @param procesar_analisis_personas34

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personasResponse procesar_analisis_personas(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personas procesar_analisis_personas34)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/Procesar_analisis_personas");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    procesar_analisis_personas34,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "procesar_analisis_personas")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "procesar_analisis_personas"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personasResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personasResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Procesar_analisis_personas"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Procesar_analisis_personas"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Procesar_analisis_personas"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startprocesar_analisis_personas
     * @param procesar_analisis_personas34

     */
    public void startprocesar_analisis_personas(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personas procesar_analisis_personas34,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/Procesar_analisis_personas");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                procesar_analisis_personas34,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "procesar_analisis_personas")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "procesar_analisis_personas"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personasResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultprocesar_analisis_personas(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personasResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorprocesar_analisis_personas(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Procesar_analisis_personas"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Procesar_analisis_personas"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Procesar_analisis_personas"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorprocesar_analisis_personas(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorprocesar_analisis_personas(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorprocesar_analisis_personas(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorprocesar_analisis_personas(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorprocesar_analisis_personas(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorprocesar_analisis_personas(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorprocesar_analisis_personas(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorprocesar_analisis_personas(f);
                            }
                        } else {
                            callback.receiveErrorprocesar_analisis_personas(f);
                        }
                    } else {
                        callback.receiveErrorprocesar_analisis_personas(f);
                    }
                } else {
                    callback.receiveErrorprocesar_analisis_personas(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorprocesar_analisis_personas(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[2].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[2].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#add_Dat_Xml_Resultado
     * @param add_Dat_Xml_Resultado36

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_ResultadoResponse add_Dat_Xml_Resultado(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_Resultado add_Dat_Xml_Resultado36)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/Add_Dat_Xml_Resultado");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    add_Dat_Xml_Resultado36,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "add_Dat_Xml_Resultado")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "add_Dat_Xml_Resultado"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_ResultadoResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_ResultadoResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Add_Dat_Xml_Resultado"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Add_Dat_Xml_Resultado"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Add_Dat_Xml_Resultado"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startadd_Dat_Xml_Resultado
     * @param add_Dat_Xml_Resultado36

     */
    public void startadd_Dat_Xml_Resultado(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_Resultado add_Dat_Xml_Resultado36,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/Add_Dat_Xml_Resultado");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                add_Dat_Xml_Resultado36,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "add_Dat_Xml_Resultado")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "add_Dat_Xml_Resultado"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_ResultadoResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultadd_Dat_Xml_Resultado(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_ResultadoResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErroradd_Dat_Xml_Resultado(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Add_Dat_Xml_Resultado"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Add_Dat_Xml_Resultado"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Add_Dat_Xml_Resultado"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErroradd_Dat_Xml_Resultado(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroradd_Dat_Xml_Resultado(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroradd_Dat_Xml_Resultado(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroradd_Dat_Xml_Resultado(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroradd_Dat_Xml_Resultado(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroradd_Dat_Xml_Resultado(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroradd_Dat_Xml_Resultado(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErroradd_Dat_Xml_Resultado(f);
                            }
                        } else {
                            callback.receiveErroradd_Dat_Xml_Resultado(f);
                        }
                    } else {
                        callback.receiveErroradd_Dat_Xml_Resultado(f);
                    }
                } else {
                    callback.receiveErroradd_Dat_Xml_Resultado(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErroradd_Dat_Xml_Resultado(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[3].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[3].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#verificaciones_consultar_estado
     * @param verificaciones_consultar_estado38

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estadoResponse verificaciones_consultar_estado(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estado verificaciones_consultar_estado38)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/verificaciones_consultar_estado");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    verificaciones_consultar_estado38,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "verificaciones_consultar_estado")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "verificaciones_consultar_estado"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estadoResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estadoResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "verificaciones_consultar_estado"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "verificaciones_consultar_estado"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "verificaciones_consultar_estado"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startverificaciones_consultar_estado
     * @param verificaciones_consultar_estado38

     */
    public void startverificaciones_consultar_estado(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estado verificaciones_consultar_estado38,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/verificaciones_consultar_estado");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                verificaciones_consultar_estado38,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "verificaciones_consultar_estado")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "verificaciones_consultar_estado"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estadoResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultverificaciones_consultar_estado(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estadoResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorverificaciones_consultar_estado(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "verificaciones_consultar_estado"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "verificaciones_consultar_estado"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "verificaciones_consultar_estado"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorverificaciones_consultar_estado(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_consultar_estado(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_consultar_estado(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_consultar_estado(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_consultar_estado(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_consultar_estado(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_consultar_estado(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_consultar_estado(f);
                            }
                        } else {
                            callback.receiveErrorverificaciones_consultar_estado(f);
                        }
                    } else {
                        callback.receiveErrorverificaciones_consultar_estado(f);
                    }
                } else {
                    callback.receiveErrorverificaciones_consultar_estado(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorverificaciones_consultar_estado(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[4].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[4].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#verificaciones_Get_Dat_Verificaciones
     * @param verificaciones_Get_Dat_Verificaciones40

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_VerificacionesResponse verificaciones_Get_Dat_Verificaciones(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_Verificaciones verificaciones_Get_Dat_Verificaciones40)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/Verificaciones_Get_Dat_Verificaciones");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    verificaciones_Get_Dat_Verificaciones40,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "verificaciones_Get_Dat_Verificaciones")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "verificaciones_Get_Dat_Verificaciones"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_VerificacionesResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_VerificacionesResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Verificaciones_Get_Dat_Verificaciones"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Verificaciones_Get_Dat_Verificaciones"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Verificaciones_Get_Dat_Verificaciones"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startverificaciones_Get_Dat_Verificaciones
     * @param verificaciones_Get_Dat_Verificaciones40

     */
    public void startverificaciones_Get_Dat_Verificaciones(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_Verificaciones verificaciones_Get_Dat_Verificaciones40,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/Verificaciones_Get_Dat_Verificaciones");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                verificaciones_Get_Dat_Verificaciones40,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "verificaciones_Get_Dat_Verificaciones")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "verificaciones_Get_Dat_Verificaciones"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_VerificacionesResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultverificaciones_Get_Dat_Verificaciones(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_VerificacionesResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorverificaciones_Get_Dat_Verificaciones(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Verificaciones_Get_Dat_Verificaciones"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Verificaciones_Get_Dat_Verificaciones"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Verificaciones_Get_Dat_Verificaciones"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorverificaciones_Get_Dat_Verificaciones(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Get_Dat_Verificaciones(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Get_Dat_Verificaciones(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Get_Dat_Verificaciones(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Get_Dat_Verificaciones(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Get_Dat_Verificaciones(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Get_Dat_Verificaciones(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Get_Dat_Verificaciones(f);
                            }
                        } else {
                            callback.receiveErrorverificaciones_Get_Dat_Verificaciones(f);
                        }
                    } else {
                        callback.receiveErrorverificaciones_Get_Dat_Verificaciones(f);
                    }
                } else {
                    callback.receiveErrorverificaciones_Get_Dat_Verificaciones(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorverificaciones_Get_Dat_Verificaciones(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[5].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[5].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#consultar_persona_deudas
     * @param consultar_persona_deudas42

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudasResponse consultar_persona_deudas(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudas consultar_persona_deudas42)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_persona_deudas");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consultar_persona_deudas42,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_persona_deudas")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_persona_deudas"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudasResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudasResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_deudas"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_deudas"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_deudas"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startconsultar_persona_deudas
     * @param consultar_persona_deudas42

     */
    public void startconsultar_persona_deudas(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudas consultar_persona_deudas42,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_persona_deudas");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consultar_persona_deudas42,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_persona_deudas")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_persona_deudas"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudasResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultconsultar_persona_deudas(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudasResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorconsultar_persona_deudas(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_deudas"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_deudas"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_deudas"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorconsultar_persona_deudas(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_deudas(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_deudas(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_deudas(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_deudas(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_deudas(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_deudas(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_deudas(f);
                            }
                        } else {
                            callback.receiveErrorconsultar_persona_deudas(f);
                        }
                    } else {
                        callback.receiveErrorconsultar_persona_deudas(f);
                    }
                } else {
                    callback.receiveErrorconsultar_persona_deudas(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorconsultar_persona_deudas(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[6].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[6].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#consultar_persona_indicadores
     * @param consultar_persona_indicadores44

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadoresResponse consultar_persona_indicadores(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadores consultar_persona_indicadores44)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_persona_indicadores");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consultar_persona_indicadores44,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_persona_indicadores")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_persona_indicadores"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadoresResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadoresResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_indicadores"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_indicadores"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_indicadores"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startconsultar_persona_indicadores
     * @param consultar_persona_indicadores44

     */
    public void startconsultar_persona_indicadores(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadores consultar_persona_indicadores44,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_persona_indicadores");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consultar_persona_indicadores44,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_persona_indicadores")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_persona_indicadores"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadoresResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultconsultar_persona_indicadores(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadoresResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorconsultar_persona_indicadores(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_indicadores"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_indicadores"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_indicadores"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorconsultar_persona_indicadores(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_indicadores(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_indicadores(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_indicadores(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_indicadores(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_indicadores(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_indicadores(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_indicadores(f);
                            }
                        } else {
                            callback.receiveErrorconsultar_persona_indicadores(f);
                        }
                    } else {
                        callback.receiveErrorconsultar_persona_indicadores(f);
                    }
                } else {
                    callback.receiveErrorconsultar_persona_indicadores(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorconsultar_persona_indicadores(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[7].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[7].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#verificaciones_Add_Dat_Verificaciones
     * @param verificaciones_Add_Dat_Verificaciones46

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_VerificacionesResponse verificaciones_Add_Dat_Verificaciones(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_Verificaciones verificaciones_Add_Dat_Verificaciones46)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/Verificaciones_Add_Dat_Verificaciones");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    verificaciones_Add_Dat_Verificaciones46,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "verificaciones_Add_Dat_Verificaciones")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "verificaciones_Add_Dat_Verificaciones"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_VerificacionesResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_VerificacionesResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Verificaciones_Add_Dat_Verificaciones"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Verificaciones_Add_Dat_Verificaciones"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Verificaciones_Add_Dat_Verificaciones"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startverificaciones_Add_Dat_Verificaciones
     * @param verificaciones_Add_Dat_Verificaciones46

     */
    public void startverificaciones_Add_Dat_Verificaciones(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_Verificaciones verificaciones_Add_Dat_Verificaciones46,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/Verificaciones_Add_Dat_Verificaciones");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                verificaciones_Add_Dat_Verificaciones46,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "verificaciones_Add_Dat_Verificaciones")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "verificaciones_Add_Dat_Verificaciones"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_VerificacionesResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultverificaciones_Add_Dat_Verificaciones(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_VerificacionesResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorverificaciones_Add_Dat_Verificaciones(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Verificaciones_Add_Dat_Verificaciones"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Verificaciones_Add_Dat_Verificaciones"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Verificaciones_Add_Dat_Verificaciones"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorverificaciones_Add_Dat_Verificaciones(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Add_Dat_Verificaciones(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Add_Dat_Verificaciones(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Add_Dat_Verificaciones(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Add_Dat_Verificaciones(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Add_Dat_Verificaciones(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Add_Dat_Verificaciones(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorverificaciones_Add_Dat_Verificaciones(f);
                            }
                        } else {
                            callback.receiveErrorverificaciones_Add_Dat_Verificaciones(f);
                        }
                    } else {
                        callback.receiveErrorverificaciones_Add_Dat_Verificaciones(f);
                    }
                } else {
                    callback.receiveErrorverificaciones_Add_Dat_Verificaciones(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorverificaciones_Add_Dat_Verificaciones(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[8].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[8].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#consultar_persona_motor
     * @param consultar_persona_motor48

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motorResponse consultar_persona_motor(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motor consultar_persona_motor48)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_persona_motor");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consultar_persona_motor48,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_persona_motor")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_persona_motor"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motorResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motorResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_motor"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_motor"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_motor"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startconsultar_persona_motor
     * @param consultar_persona_motor48

     */
    public void startconsultar_persona_motor(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motor consultar_persona_motor48,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_persona_motor");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consultar_persona_motor48,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_persona_motor")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_persona_motor"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motorResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultconsultar_persona_motor(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motorResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorconsultar_persona_motor(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_motor"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_motor"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona_motor"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorconsultar_persona_motor(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_motor(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_motor(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_motor(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_motor(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_motor(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_motor(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona_motor(f);
                            }
                        } else {
                            callback.receiveErrorconsultar_persona_motor(f);
                        }
                    } else {
                        callback.receiveErrorconsultar_persona_motor(f);
                    }
                } else {
                    callback.receiveErrorconsultar_persona_motor(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorconsultar_persona_motor(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[9].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[9].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#consultar_ponderado
     * @param consultar_ponderado50

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderadoResponse consultar_ponderado(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderado consultar_ponderado50)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_ponderado");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consultar_ponderado50,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_ponderado")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_ponderado"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderadoResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderadoResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_ponderado"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_ponderado"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_ponderado"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startconsultar_ponderado
     * @param consultar_ponderado50

     */
    public void startconsultar_ponderado(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderado consultar_ponderado50,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_ponderado");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consultar_ponderado50,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_ponderado")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_ponderado"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderadoResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultconsultar_ponderado(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderadoResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorconsultar_ponderado(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_ponderado"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_ponderado"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_ponderado"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorconsultar_ponderado(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_ponderado(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_ponderado(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_ponderado(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_ponderado(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_ponderado(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_ponderado(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_ponderado(f);
                            }
                        } else {
                            callback.receiveErrorconsultar_ponderado(f);
                        }
                    } else {
                        callback.receiveErrorconsultar_ponderado(f);
                    }
                } else {
                    callback.receiveErrorconsultar_ponderado(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorconsultar_ponderado(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[10].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[10].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#consultar_deudas_MC
     * @param consultar_deudas_MC52

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MCResponse consultar_deudas_MC(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MC consultar_deudas_MC52)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_deudas_MC");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consultar_deudas_MC52,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_deudas_MC")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_deudas_MC"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MCResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MCResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_deudas_MC"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_deudas_MC"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_deudas_MC"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startconsultar_deudas_MC
     * @param consultar_deudas_MC52

     */
    public void startconsultar_deudas_MC(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MC consultar_deudas_MC52,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_deudas_MC");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consultar_deudas_MC52,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_deudas_MC")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_deudas_MC"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MCResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultconsultar_deudas_MC(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MCResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorconsultar_deudas_MC(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_deudas_MC"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_deudas_MC"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_deudas_MC"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorconsultar_deudas_MC(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_deudas_MC(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_deudas_MC(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_deudas_MC(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_deudas_MC(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_deudas_MC(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_deudas_MC(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_deudas_MC(f);
                            }
                        } else {
                            callback.receiveErrorconsultar_deudas_MC(f);
                        }
                    } else {
                        callback.receiveErrorconsultar_deudas_MC(f);
                    }
                } else {
                    callback.receiveErrorconsultar_deudas_MC(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorconsultar_deudas_MC(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[11].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[11].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#consultar_contrastacion_segip
     * @param consultar_contrastacion_segip54

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segipResponse consultar_contrastacion_segip(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segip consultar_contrastacion_segip54)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_contrastacion_segip");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consultar_contrastacion_segip54,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_contrastacion_segip")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_contrastacion_segip"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segipResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segipResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_contrastacion_segip"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_contrastacion_segip"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_contrastacion_segip"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startconsultar_contrastacion_segip
     * @param consultar_contrastacion_segip54

     */
    public void startconsultar_contrastacion_segip(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segip consultar_contrastacion_segip54,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_contrastacion_segip");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consultar_contrastacion_segip54,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_contrastacion_segip")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_contrastacion_segip"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segipResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultconsultar_contrastacion_segip(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segipResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorconsultar_contrastacion_segip(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_contrastacion_segip"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_contrastacion_segip"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_contrastacion_segip"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorconsultar_contrastacion_segip(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_contrastacion_segip(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_contrastacion_segip(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_contrastacion_segip(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_contrastacion_segip(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_contrastacion_segip(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_contrastacion_segip(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_contrastacion_segip(f);
                            }
                        } else {
                            callback.receiveErrorconsultar_contrastacion_segip(f);
                        }
                    } else {
                        callback.receiveErrorconsultar_contrastacion_segip(f);
                    }
                } else {
                    callback.receiveErrorconsultar_contrastacion_segip(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorconsultar_contrastacion_segip(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[12].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[12].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#consultar_persona
     * @param consultar_persona56

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_personaResponse consultar_persona(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona consultar_persona56)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_persona");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    consultar_persona56,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_persona")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "consultar_persona"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_personaResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_personaResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startconsultar_persona
     * @param consultar_persona56

     */
    public void startconsultar_persona(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona consultar_persona56,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/consultar_persona");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                consultar_persona56,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_persona")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "consultar_persona"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_personaResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultconsultar_persona(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_personaResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorconsultar_persona(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "consultar_persona"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorconsultar_persona(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorconsultar_persona(f);
                            }
                        } else {
                            callback.receiveErrorconsultar_persona(f);
                        }
                    } else {
                        callback.receiveErrorconsultar_persona(f);
                    }
                } else {
                    callback.receiveErrorconsultar_persona(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorconsultar_persona(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[13].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[13].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }

    /**
     * Auto generated method signature
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#get_analisis_personas
     * @param get_analisis_personas58

     */


    public bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personasResponse get_analisis_personas(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personas get_analisis_personas58)


            throws java.rmi.RemoteException {
        org.apache.axis2.context.MessageContext _messageContext = null;
        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
            _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/Get_analisis_personas");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


            addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


            // create a message context
            _messageContext = new org.apache.axis2.context.MessageContext();


            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;


            env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                    get_analisis_personas58,
                    optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "get_analisis_personas")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                            "get_analisis_personas"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);


            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                    org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();


            java.lang.Object object = fromOM(
                    _returnEnv.getBody().getFirstElement(),
                    bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personasResponse.class,
                    getEnvelopeNamespaces(_returnEnv));


            return (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personasResponse) object;

        } catch (org.apache.axis2.AxisFault f) {

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Get_analisis_personas"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Get_analisis_personas"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Get_analisis_personas"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                messageClass);
                        m.invoke(ex, messageObject);


                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    } catch (java.lang.ClassCastException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                } else {
                    throw f;
                }
            } else {
                throw f;
            }
        } finally {
            if (_messageContext.getTransportOut() != null) {
                _messageContext.getTransportOut().getSender().cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @see bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBIC#startget_analisis_personas
     * @param get_analisis_personas58

     */
    public void startget_analisis_personas(

            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personas get_analisis_personas58,

            final bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ServicioIntegracionBICCallbackHandler callback)

            throws java.rmi.RemoteException {

        org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
        _operationClient.getOptions().setAction("http://tempuri.org/Enserbic_WS/Service1/Get_analisis_personas");
        _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);


        addPropertyToOperationClient(_operationClient, org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");


        // create SOAP envelope with that payload
        org.apache.axiom.soap.SOAPEnvelope env = null;
        final org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();


        //Style is Doc.


        env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                get_analisis_personas58,
                optimizeContent(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "get_analisis_personas")), new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                        "get_analisis_personas"));

        // adding SOAP soap_headers
        _serviceClient.addHeadersToEnvelope(env);
        // create message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message context to the operation client
        _operationClient.addMessageContext(_messageContext);


        _operationClient.setCallback(new org.apache.axis2.client.async.AxisCallback() {
            public void onMessage(org.apache.axis2.context.MessageContext resultContext) {
                try {
                    org.apache.axiom.soap.SOAPEnvelope resultEnv = resultContext.getEnvelope();

                    java.lang.Object object = fromOM(resultEnv.getBody().getFirstElement(),
                            bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personasResponse.class,
                            getEnvelopeNamespaces(resultEnv));
                    callback.receiveResultget_analisis_personas(
                            (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personasResponse) object);

                } catch (org.apache.axis2.AxisFault e) {
                    callback.receiveErrorget_analisis_personas(e);
                }
            }

            public void onError(java.lang.Exception error) {
                if (error instanceof org.apache.axis2.AxisFault) {
                    org.apache.axis2.AxisFault f = (org.apache.axis2.AxisFault) error;
                    org.apache.axiom.om.OMElement faultElt = f.getDetail();
                    if (faultElt != null) {
                        if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Get_analisis_personas"))) {
                            //make the fault by reflection
                            try {
                                java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Get_analisis_personas"));
                                java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                                java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                                //message class
                                java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Get_analisis_personas"));
                                java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                                java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
                                java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                        messageClass);
                                m.invoke(ex, messageObject);


                                callback.receiveErrorget_analisis_personas(new java.rmi.RemoteException(ex.getMessage(), ex));
                            } catch (java.lang.ClassCastException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorget_analisis_personas(f);
                            } catch (java.lang.ClassNotFoundException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorget_analisis_personas(f);
                            } catch (java.lang.NoSuchMethodException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorget_analisis_personas(f);
                            } catch (java.lang.reflect.InvocationTargetException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorget_analisis_personas(f);
                            } catch (java.lang.IllegalAccessException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorget_analisis_personas(f);
                            } catch (java.lang.InstantiationException e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorget_analisis_personas(f);
                            } catch (org.apache.axis2.AxisFault e) {
                                // we cannot intantiate the class - throw the original Axis fault
                                callback.receiveErrorget_analisis_personas(f);
                            }
                        } else {
                            callback.receiveErrorget_analisis_personas(f);
                        }
                    } else {
                        callback.receiveErrorget_analisis_personas(f);
                    }
                } else {
                    callback.receiveErrorget_analisis_personas(error);
                }
            }

            public void onFault(org.apache.axis2.context.MessageContext faultContext) {
                org.apache.axis2.AxisFault fault = org.apache.axis2.util.Utils.getInboundFaultFromMessageContext(faultContext);
                onError(fault);
            }

            public void onComplete() {
                try {
                    _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                } catch (org.apache.axis2.AxisFault axisFault) {
                    callback.receiveErrorget_analisis_personas(axisFault);
                }
            }
        });


        org.apache.axis2.util.CallbackReceiver _callbackReceiver = null;
        if (_operations[14].getMessageReceiver() == null && _operationClient.getOptions().isUseSeparateListener()) {
            _callbackReceiver = new org.apache.axis2.util.CallbackReceiver();
            _operations[14].setMessageReceiver(
                    _callbackReceiver);
        }

        //execute the operation client
        _operationClient.execute(false);

    }


    /**
     *  A utility method that copies the namepaces from the SOAPEnvelope
     */
    private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
        }
        return returnMap;
    }


    private final javax.xml.namespace.QName[] opNameArray = null;

    private boolean optimizeContent(javax.xml.namespace.QName opName) {


        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;
            }
        }
        return false;
    }

    //http://200.87.205.38/Integracion_Enserbic/Standard_WS/ServicioIntegracionBIC.asmx
    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segip param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segip.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segipResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segipResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoring param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoring.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoringResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoringResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personas.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personasResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_Resultado param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_Resultado.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_ResultadoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_ResultadoResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estado param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estado.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estadoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estadoResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_Verificaciones param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_Verificaciones.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_VerificacionesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_VerificacionesResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudas.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudasResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadores param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadores.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadoresResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadoresResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_Verificaciones param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_Verificaciones.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_VerificacionesResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_VerificacionesResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motor param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motor.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motorResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motorResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderado param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderado.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderadoResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderadoResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MC param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MC.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MCResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MCResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segip param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segip.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segipResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segipResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_personaResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_personaResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personas param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personas.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }

    private org.apache.axiom.om.OMElement toOM(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personasResponse param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {


        try {
            return param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personasResponse.MY_QNAME,
                    org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segip param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segip.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoring param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoring.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personas param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personas.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_Resultado param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_Resultado.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estado param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estado.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_Verificaciones param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_Verificaciones.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudas param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudas.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadores param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadores.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_Verificaciones param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_Verificaciones.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motor param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motor.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderado param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderado.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MC param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MC.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segip param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segip.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personas param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
            throws org.apache.axis2.AxisFault {


        try {

            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody().addChild(param.getOMElement(bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personas.MY_QNAME, factory));
            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }


    }


    /* methods to provide back word compatibility */


    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }


    private java.lang.Object fromOM(
            org.apache.axiom.om.OMElement param,
            java.lang.Class type,
            java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

        try {

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segip.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segip.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segipResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_segipResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoring.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoring.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoringResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_scoringResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personas.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personas.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personasResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Procesar_analisis_personasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_Resultado.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_Resultado.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_ResultadoResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Add_Dat_Xml_ResultadoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estado.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estado.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estadoResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_consultar_estadoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_Verificaciones.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_Verificaciones.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_VerificacionesResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Get_Dat_VerificacionesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudas.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudas.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudasResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_deudasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadores.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadores.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadoresResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_indicadoresResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_Verificaciones.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_Verificaciones.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_VerificacionesResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Verificaciones_Add_Dat_VerificacionesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motor.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motor.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motorResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona_motorResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderado.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderado.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderadoResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_ponderadoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MC.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MC.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MCResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_deudas_MCResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segip.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segip.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segipResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_contrastacion_segipResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_persona.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_personaResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Consultar_personaResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personas.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personas.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

            if (bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personasResponse.class.equals(type)) {

                return bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.Get_analisis_personasResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());


            }

        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
    }


}
