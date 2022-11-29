/**
 * RetornoObterDadosSiteConsultor.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 *  RetornoObterDadosSiteConsultor bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class RetornoObterDadosSiteConsultor
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = RetornoObterDadosSiteConsultor
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for NomeConsultora
     */


    protected java.lang.String localNomeConsultora;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeConsultoraTracker = false;

    public boolean isNomeConsultoraSpecified() {
        return localNomeConsultoraTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeConsultora() {
        return localNomeConsultora;
    }


    /**
     * Auto generated setter method
     * @param param NomeConsultora
     */
    public void setNomeConsultora(java.lang.String param) {
        localNomeConsultoraTracker = param != null;

        this.localNomeConsultora = param;


    }


    /**
     * field for CodigoConsultor
     */


    protected int localCodigoConsultor;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoConsultor() {
        return localCodigoConsultor;
    }


    /**
     * Auto generated setter method
     * @param param CodigoConsultor
     */
    public void setCodigoConsultor(int param) {

        this.localCodigoConsultor = param;


    }


    /**
     * field for CodigoEstruturaComercial
     */


    protected int localCodigoEstruturaComercial;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoEstruturaComercial() {
        return localCodigoEstruturaComercial;
    }


    /**
     * Auto generated setter method
     * @param param CodigoEstruturaComercial
     */
    public void setCodigoEstruturaComercial(int param) {

        this.localCodigoEstruturaComercial = param;


    }


    /**
     * field for NomeEstruturaComercial
     */


    protected java.lang.String localNomeEstruturaComercial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeEstruturaComercialTracker = false;

    public boolean isNomeEstruturaComercialSpecified() {
        return localNomeEstruturaComercialTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeEstruturaComercial() {
        return localNomeEstruturaComercial;
    }


    /**
     * Auto generated setter method
     * @param param NomeEstruturaComercial
     */
    public void setNomeEstruturaComercial(java.lang.String param) {
        localNomeEstruturaComercialTracker = param != null;

        this.localNomeEstruturaComercial = param;


    }


    /**
     * field for ModeloComercial
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfRetornoModeloComercial localModeloComercial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localModeloComercialTracker = false;

    public boolean isModeloComercialSpecified() {
        return localModeloComercialTracker;
    }


    /**
     * Auto generated getter method
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfRetornoModeloComercial
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfRetornoModeloComercial getModeloComercial() {
        return localModeloComercial;
    }


    /**
     * Auto generated setter method
     * @param param ModeloComercial
     */
    public void setModeloComercial(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfRetornoModeloComercial param) {
        localModeloComercialTracker = param != null;

        this.localModeloComercial = param;


    }


    /**
     * field for EnderecoCompleto
     */


    protected java.lang.String localEnderecoCompleto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnderecoCompletoTracker = false;

    public boolean isEnderecoCompletoSpecified() {
        return localEnderecoCompletoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEnderecoCompleto() {
        return localEnderecoCompleto;
    }


    /**
     * Auto generated setter method
     * @param param EnderecoCompleto
     */
    public void setEnderecoCompleto(java.lang.String param) {
        localEnderecoCompletoTracker = param != null;

        this.localEnderecoCompleto = param;


    }


    /**
     * field for Numero
     */


    protected java.lang.String localNumero;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumeroTracker = false;

    public boolean isNumeroSpecified() {
        return localNumeroTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumero() {
        return localNumero;
    }


    /**
     * Auto generated setter method
     * @param param Numero
     */
    public void setNumero(java.lang.String param) {
        localNumeroTracker = param != null;

        this.localNumero = param;


    }


    /**
     * field for CodigoPostal
     */


    protected java.lang.String localCodigoPostal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCodigoPostalTracker = false;

    public boolean isCodigoPostalSpecified() {
        return localCodigoPostalTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCodigoPostal() {
        return localCodigoPostal;
    }


    /**
     * Auto generated setter method
     * @param param CodigoPostal
     */
    public void setCodigoPostal(java.lang.String param) {
        localCodigoPostalTracker = param != null;

        this.localCodigoPostal = param;


    }


    /**
     * field for Complemento
     */


    protected java.lang.String localComplemento;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localComplementoTracker = false;

    public boolean isComplementoSpecified() {
        return localComplementoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getComplemento() {
        return localComplemento;
    }


    /**
     * Auto generated setter method
     * @param param Complemento
     */
    public void setComplemento(java.lang.String param) {
        localComplementoTracker = param != null;

        this.localComplemento = param;


    }


    /**
     * field for Referencia
     */


    protected java.lang.String localReferencia;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReferenciaTracker = false;

    public boolean isReferenciaSpecified() {
        return localReferenciaTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getReferencia() {
        return localReferencia;
    }


    /**
     * Auto generated setter method
     * @param param Referencia
     */
    public void setReferencia(java.lang.String param) {
        localReferenciaTracker = param != null;

        this.localReferencia = param;


    }


    /**
     * field for TelefoneResidencial
     */


    protected java.lang.String localTelefoneResidencial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneResidencialTracker = false;

    public boolean isTelefoneResidencialSpecified() {
        return localTelefoneResidencialTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneResidencial() {
        return localTelefoneResidencial;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneResidencial
     */
    public void setTelefoneResidencial(java.lang.String param) {
        localTelefoneResidencialTracker = param != null;

        this.localTelefoneResidencial = param;


    }


    /**
     * field for TelefoneCeluar
     */


    protected java.lang.String localTelefoneCeluar;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneCeluarTracker = false;

    public boolean isTelefoneCeluarSpecified() {
        return localTelefoneCeluarTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneCeluar() {
        return localTelefoneCeluar;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneCeluar
     */
    public void setTelefoneCeluar(java.lang.String param) {
        localTelefoneCeluarTracker = param != null;

        this.localTelefoneCeluar = param;


    }


    /**
     * field for TelefoneRecado
     */


    protected java.lang.String localTelefoneRecado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneRecadoTracker = false;

    public boolean isTelefoneRecadoSpecified() {
        return localTelefoneRecadoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneRecado() {
        return localTelefoneRecado;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneRecado
     */
    public void setTelefoneRecado(java.lang.String param) {
        localTelefoneRecadoTracker = param != null;

        this.localTelefoneRecado = param;


    }


    /**
     * field for FalarCom
     */


    protected java.lang.String localFalarCom;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFalarComTracker = false;

    public boolean isFalarComSpecified() {
        return localFalarComTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFalarCom() {
        return localFalarCom;
    }


    /**
     * Auto generated setter method
     * @param param FalarCom
     */
    public void setFalarCom(java.lang.String param) {
        localFalarComTracker = param != null;

        this.localFalarCom = param;


    }


    /**
     * field for EmailPessoal
     */


    protected java.lang.String localEmailPessoal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailPessoalTracker = false;

    public boolean isEmailPessoalSpecified() {
        return localEmailPessoalTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailPessoal() {
        return localEmailPessoal;
    }


    /**
     * Auto generated setter method
     * @param param EmailPessoal
     */
    public void setEmailPessoal(java.lang.String param) {
        localEmailPessoalTracker = param != null;

        this.localEmailPessoal = param;


    }


    /**
     * field for EmailAlternativo
     */


    protected java.lang.String localEmailAlternativo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailAlternativoTracker = false;

    public boolean isEmailAlternativoSpecified() {
        return localEmailAlternativoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailAlternativo() {
        return localEmailAlternativo;
    }


    /**
     * Auto generated setter method
     * @param param EmailAlternativo
     */
    public void setEmailAlternativo(java.lang.String param) {
        localEmailAlternativoTracker = param != null;

        this.localEmailAlternativo = param;


    }


    /**
     * field for LinkBlog
     */


    protected java.lang.String localLinkBlog;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLinkBlogTracker = false;

    public boolean isLinkBlogSpecified() {
        return localLinkBlogTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLinkBlog() {
        return localLinkBlog;
    }


    /**
     * Auto generated setter method
     * @param param LinkBlog
     */
    public void setLinkBlog(java.lang.String param) {
        localLinkBlogTracker = param != null;

        this.localLinkBlog = param;


    }


    /**
     * field for LinkOrkut
     */


    protected java.lang.String localLinkOrkut;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLinkOrkutTracker = false;

    public boolean isLinkOrkutSpecified() {
        return localLinkOrkutTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLinkOrkut() {
        return localLinkOrkut;
    }


    /**
     * Auto generated setter method
     * @param param LinkOrkut
     */
    public void setLinkOrkut(java.lang.String param) {
        localLinkOrkutTracker = param != null;

        this.localLinkOrkut = param;


    }


    /**
     * field for LinkFacebook
     */


    protected java.lang.String localLinkFacebook;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLinkFacebookTracker = false;

    public boolean isLinkFacebookSpecified() {
        return localLinkFacebookTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLinkFacebook() {
        return localLinkFacebook;
    }


    /**
     * Auto generated setter method
     * @param param LinkFacebook
     */
    public void setLinkFacebook(java.lang.String param) {
        localLinkFacebookTracker = param != null;

        this.localLinkFacebook = param;


    }


    /**
     * field for LinkTwitter
     */


    protected java.lang.String localLinkTwitter;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLinkTwitterTracker = false;

    public boolean isLinkTwitterSpecified() {
        return localLinkTwitterTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLinkTwitter() {
        return localLinkTwitter;
    }


    /**
     * Auto generated setter method
     * @param param LinkTwitter
     */
    public void setLinkTwitter(java.lang.String param) {
        localLinkTwitterTracker = param != null;

        this.localLinkTwitter = param;


    }


    /**
     * field for EmailMSN
     */


    protected java.lang.String localEmailMSN;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailMSNTracker = false;

    public boolean isEmailMSNSpecified() {
        return localEmailMSNTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailMSN() {
        return localEmailMSN;
    }


    /**
     * Auto generated setter method
     * @param param EmailMSN
     */
    public void setEmailMSN(java.lang.String param) {
        localEmailMSNTracker = param != null;

        this.localEmailMSN = param;


    }


    /**
     * field for NomeCompletoGV
     */


    protected java.lang.String localNomeCompletoGV;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeCompletoGVTracker = false;

    public boolean isNomeCompletoGVSpecified() {
        return localNomeCompletoGVTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeCompletoGV() {
        return localNomeCompletoGV;
    }


    /**
     * Auto generated setter method
     * @param param NomeCompletoGV
     */
    public void setNomeCompletoGV(java.lang.String param) {
        localNomeCompletoGVTracker = param != null;

        this.localNomeCompletoGV = param;


    }


    /**
     * field for CodigoEstruturaComercialGV
     */


    protected int localCodigoEstruturaComercialGV;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoEstruturaComercialGV() {
        return localCodigoEstruturaComercialGV;
    }


    /**
     * Auto generated setter method
     * @param param CodigoEstruturaComercialGV
     */
    public void setCodigoEstruturaComercialGV(int param) {

        this.localCodigoEstruturaComercialGV = param;


    }


    /**
     * field for TelefoneResidencialGV
     */


    protected java.lang.String localTelefoneResidencialGV;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneResidencialGVTracker = false;

    public boolean isTelefoneResidencialGVSpecified() {
        return localTelefoneResidencialGVTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneResidencialGV() {
        return localTelefoneResidencialGV;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneResidencialGV
     */
    public void setTelefoneResidencialGV(java.lang.String param) {
        localTelefoneResidencialGVTracker = param != null;

        this.localTelefoneResidencialGV = param;


    }


    /**
     * field for TelefoneCeluarGV
     */


    protected java.lang.String localTelefoneCeluarGV;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneCeluarGVTracker = false;

    public boolean isTelefoneCeluarGVSpecified() {
        return localTelefoneCeluarGVTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneCeluarGV() {
        return localTelefoneCeluarGV;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneCeluarGV
     */
    public void setTelefoneCeluarGV(java.lang.String param) {
        localTelefoneCeluarGVTracker = param != null;

        this.localTelefoneCeluarGV = param;


    }


    /**
     * field for TelefoneRecadoGV
     */


    protected java.lang.String localTelefoneRecadoGV;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneRecadoGVTracker = false;

    public boolean isTelefoneRecadoGVSpecified() {
        return localTelefoneRecadoGVTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneRecadoGV() {
        return localTelefoneRecadoGV;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneRecadoGV
     */
    public void setTelefoneRecadoGV(java.lang.String param) {
        localTelefoneRecadoGVTracker = param != null;

        this.localTelefoneRecadoGV = param;


    }


    /**
     * field for FalarComGV
     */


    protected java.lang.String localFalarComGV;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFalarComGVTracker = false;

    public boolean isFalarComGVSpecified() {
        return localFalarComGVTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFalarComGV() {
        return localFalarComGV;
    }


    /**
     * Auto generated setter method
     * @param param FalarComGV
     */
    public void setFalarComGV(java.lang.String param) {
        localFalarComGVTracker = param != null;

        this.localFalarComGV = param;


    }


    /**
     * field for EmailPessoalGV
     */


    protected java.lang.String localEmailPessoalGV;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailPessoalGVTracker = false;

    public boolean isEmailPessoalGVSpecified() {
        return localEmailPessoalGVTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailPessoalGV() {
        return localEmailPessoalGV;
    }


    /**
     * Auto generated setter method
     * @param param EmailPessoalGV
     */
    public void setEmailPessoalGV(java.lang.String param) {
        localEmailPessoalGVTracker = param != null;

        this.localEmailPessoalGV = param;


    }


    /**
     * field for EmailAlternativoGV
     */


    protected java.lang.String localEmailAlternativoGV;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailAlternativoGVTracker = false;

    public boolean isEmailAlternativoGVSpecified() {
        return localEmailAlternativoGVTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailAlternativoGV() {
        return localEmailAlternativoGV;
    }


    /**
     * Auto generated setter method
     * @param param EmailAlternativoGV
     */
    public void setEmailAlternativoGV(java.lang.String param) {
        localEmailAlternativoGVTracker = param != null;

        this.localEmailAlternativoGV = param;


    }


    /**
     * field for EmailMSNGV
     */


    protected java.lang.String localEmailMSNGV;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailMSNGVTracker = false;

    public boolean isEmailMSNGVSpecified() {
        return localEmailMSNGVTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailMSNGV() {
        return localEmailMSNGV;
    }


    /**
     * Auto generated setter method
     * @param param EmailMSNGV
     */
    public void setEmailMSNGV(java.lang.String param) {
        localEmailMSNGVTracker = param != null;

        this.localEmailMSNGV = param;


    }


    /**
     * field for NomeCompletoGR
     */


    protected java.lang.String localNomeCompletoGR;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeCompletoGRTracker = false;

    public boolean isNomeCompletoGRSpecified() {
        return localNomeCompletoGRTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeCompletoGR() {
        return localNomeCompletoGR;
    }


    /**
     * Auto generated setter method
     * @param param NomeCompletoGR
     */
    public void setNomeCompletoGR(java.lang.String param) {
        localNomeCompletoGRTracker = param != null;

        this.localNomeCompletoGR = param;


    }


    /**
     * field for CodigoEstruturaComercialGR
     */


    protected int localCodigoEstruturaComercialGR;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoEstruturaComercialGR() {
        return localCodigoEstruturaComercialGR;
    }


    /**
     * Auto generated setter method
     * @param param CodigoEstruturaComercialGR
     */
    public void setCodigoEstruturaComercialGR(int param) {

        this.localCodigoEstruturaComercialGR = param;


    }


    /**
     * field for TelefoneResidencialGR
     */


    protected java.lang.String localTelefoneResidencialGR;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneResidencialGRTracker = false;

    public boolean isTelefoneResidencialGRSpecified() {
        return localTelefoneResidencialGRTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneResidencialGR() {
        return localTelefoneResidencialGR;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneResidencialGR
     */
    public void setTelefoneResidencialGR(java.lang.String param) {
        localTelefoneResidencialGRTracker = param != null;

        this.localTelefoneResidencialGR = param;


    }


    /**
     * field for TelefoneCeluarGR
     */


    protected java.lang.String localTelefoneCeluarGR;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneCeluarGRTracker = false;

    public boolean isTelefoneCeluarGRSpecified() {
        return localTelefoneCeluarGRTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneCeluarGR() {
        return localTelefoneCeluarGR;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneCeluarGR
     */
    public void setTelefoneCeluarGR(java.lang.String param) {
        localTelefoneCeluarGRTracker = param != null;

        this.localTelefoneCeluarGR = param;


    }


    /**
     * field for TelefoneRecadoGR
     */


    protected java.lang.String localTelefoneRecadoGR;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneRecadoGRTracker = false;

    public boolean isTelefoneRecadoGRSpecified() {
        return localTelefoneRecadoGRTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneRecadoGR() {
        return localTelefoneRecadoGR;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneRecadoGR
     */
    public void setTelefoneRecadoGR(java.lang.String param) {
        localTelefoneRecadoGRTracker = param != null;

        this.localTelefoneRecadoGR = param;


    }


    /**
     * field for FalarComGR
     */


    protected java.lang.String localFalarComGR;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFalarComGRTracker = false;

    public boolean isFalarComGRSpecified() {
        return localFalarComGRTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFalarComGR() {
        return localFalarComGR;
    }


    /**
     * Auto generated setter method
     * @param param FalarComGR
     */
    public void setFalarComGR(java.lang.String param) {
        localFalarComGRTracker = param != null;

        this.localFalarComGR = param;


    }


    /**
     * field for EmailPessoalGR
     */


    protected java.lang.String localEmailPessoalGR;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailPessoalGRTracker = false;

    public boolean isEmailPessoalGRSpecified() {
        return localEmailPessoalGRTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailPessoalGR() {
        return localEmailPessoalGR;
    }


    /**
     * Auto generated setter method
     * @param param EmailPessoalGR
     */
    public void setEmailPessoalGR(java.lang.String param) {
        localEmailPessoalGRTracker = param != null;

        this.localEmailPessoalGR = param;


    }


    /**
     * field for EmailAlternativoGR
     */


    protected java.lang.String localEmailAlternativoGR;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailAlternativoGRTracker = false;

    public boolean isEmailAlternativoGRSpecified() {
        return localEmailAlternativoGRTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailAlternativoGR() {
        return localEmailAlternativoGR;
    }


    /**
     * Auto generated setter method
     * @param param EmailAlternativoGR
     */
    public void setEmailAlternativoGR(java.lang.String param) {
        localEmailAlternativoGRTracker = param != null;

        this.localEmailAlternativoGR = param;


    }


    /**
     * field for EmailMSNGR
     */


    protected java.lang.String localEmailMSNGR;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailMSNGRTracker = false;

    public boolean isEmailMSNGRSpecified() {
        return localEmailMSNGRTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailMSNGR() {
        return localEmailMSNGR;
    }


    /**
     * Auto generated setter method
     * @param param EmailMSNGR
     */
    public void setEmailMSNGR(java.lang.String param) {
        localEmailMSNGRTracker = param != null;

        this.localEmailMSNGR = param;


    }


    /**
     * field for NomeCompletoGD
     */


    protected java.lang.String localNomeCompletoGD;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeCompletoGDTracker = false;

    public boolean isNomeCompletoGDSpecified() {
        return localNomeCompletoGDTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeCompletoGD() {
        return localNomeCompletoGD;
    }


    /**
     * Auto generated setter method
     * @param param NomeCompletoGD
     */
    public void setNomeCompletoGD(java.lang.String param) {
        localNomeCompletoGDTracker = param != null;

        this.localNomeCompletoGD = param;


    }


    /**
     * field for CodigoEstruturaComercialGD
     */


    protected int localCodigoEstruturaComercialGD;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoEstruturaComercialGD() {
        return localCodigoEstruturaComercialGD;
    }


    /**
     * Auto generated setter method
     * @param param CodigoEstruturaComercialGD
     */
    public void setCodigoEstruturaComercialGD(int param) {

        this.localCodigoEstruturaComercialGD = param;


    }


    /**
     * field for TelefoneResidencialGD
     */


    protected java.lang.String localTelefoneResidencialGD;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneResidencialGDTracker = false;

    public boolean isTelefoneResidencialGDSpecified() {
        return localTelefoneResidencialGDTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneResidencialGD() {
        return localTelefoneResidencialGD;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneResidencialGD
     */
    public void setTelefoneResidencialGD(java.lang.String param) {
        localTelefoneResidencialGDTracker = param != null;

        this.localTelefoneResidencialGD = param;


    }


    /**
     * field for TelefoneCeluarGD
     */


    protected java.lang.String localTelefoneCeluarGD;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneCeluarGDTracker = false;

    public boolean isTelefoneCeluarGDSpecified() {
        return localTelefoneCeluarGDTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneCeluarGD() {
        return localTelefoneCeluarGD;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneCeluarGD
     */
    public void setTelefoneCeluarGD(java.lang.String param) {
        localTelefoneCeluarGDTracker = param != null;

        this.localTelefoneCeluarGD = param;


    }


    /**
     * field for TelefoneRecadoGD
     */


    protected java.lang.String localTelefoneRecadoGD;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneRecadoGDTracker = false;

    public boolean isTelefoneRecadoGDSpecified() {
        return localTelefoneRecadoGDTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneRecadoGD() {
        return localTelefoneRecadoGD;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneRecadoGD
     */
    public void setTelefoneRecadoGD(java.lang.String param) {
        localTelefoneRecadoGDTracker = param != null;

        this.localTelefoneRecadoGD = param;


    }


    /**
     * field for FalarComGD
     */


    protected java.lang.String localFalarComGD;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFalarComGDTracker = false;

    public boolean isFalarComGDSpecified() {
        return localFalarComGDTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFalarComGD() {
        return localFalarComGD;
    }


    /**
     * Auto generated setter method
     * @param param FalarComGD
     */
    public void setFalarComGD(java.lang.String param) {
        localFalarComGDTracker = param != null;

        this.localFalarComGD = param;


    }


    /**
     * field for EmailPessoalGD
     */


    protected java.lang.String localEmailPessoalGD;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailPessoalGDTracker = false;

    public boolean isEmailPessoalGDSpecified() {
        return localEmailPessoalGDTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailPessoalGD() {
        return localEmailPessoalGD;
    }


    /**
     * Auto generated setter method
     * @param param EmailPessoalGD
     */
    public void setEmailPessoalGD(java.lang.String param) {
        localEmailPessoalGDTracker = param != null;

        this.localEmailPessoalGD = param;


    }


    /**
     * field for EmailAlternativoGD
     */


    protected java.lang.String localEmailAlternativoGD;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailAlternativoGDTracker = false;

    public boolean isEmailAlternativoGDSpecified() {
        return localEmailAlternativoGDTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailAlternativoGD() {
        return localEmailAlternativoGD;
    }


    /**
     * Auto generated setter method
     * @param param EmailAlternativoGD
     */
    public void setEmailAlternativoGD(java.lang.String param) {
        localEmailAlternativoGDTracker = param != null;

        this.localEmailAlternativoGD = param;


    }


    /**
     * field for EmailMSNGD
     */


    protected java.lang.String localEmailMSNGD;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailMSNGDTracker = false;

    public boolean isEmailMSNGDSpecified() {
        return localEmailMSNGDTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmailMSNGD() {
        return localEmailMSNGD;
    }


    /**
     * Auto generated setter method
     * @param param EmailMSNGD
     */
    public void setEmailMSNGD(java.lang.String param) {
        localEmailMSNGDTracker = param != null;

        this.localEmailMSNGD = param;


    }


    /**
     * field for MensagemErro
     */


    protected java.lang.String localMensagemErro;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMensagemErroTracker = false;

    public boolean isMensagemErroSpecified() {
        return localMensagemErroTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMensagemErro() {
        return localMensagemErro;
    }


    /**
     * Auto generated setter method
     * @param param MensagemErro
     */
    public void setMensagemErro(java.lang.String param) {
        localMensagemErroTracker = param != null;

        this.localMensagemErro = param;


    }


    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {


        org.apache.axiom.om.OMDataSource dataSource =
                new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
        return factory.createOMElement(dataSource, parentQName);

    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
                          javax.xml.stream.XMLStreamWriter xmlWriter,
                          boolean serializeType)
            throws javax.xml.stream.XMLStreamException {


        java.lang.String prefix = null;
        java.lang.String namespace = null;


        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

        if (serializeType) {


            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.geravd.com.br/Servicos/PessoaWebService");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":RetornoObterDadosSiteConsultor",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "RetornoObterDadosSiteConsultor",
                        xmlWriter);
            }


        }
        if (localNomeConsultoraTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "NomeConsultora", xmlWriter);


            if (localNomeConsultora == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("NomeConsultora cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomeConsultora);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoConsultor", xmlWriter);

        if (localCodigoConsultor == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoConsultor cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoConsultor));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoEstruturaComercial", xmlWriter);

        if (localCodigoEstruturaComercial == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoEstruturaComercial cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoEstruturaComercial));
        }

        xmlWriter.writeEndElement();
        if (localNomeEstruturaComercialTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "NomeEstruturaComercial", xmlWriter);


            if (localNomeEstruturaComercial == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("NomeEstruturaComercial cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomeEstruturaComercial);

            }

            xmlWriter.writeEndElement();
        }
        if (localModeloComercialTracker) {
            if (localModeloComercial == null) {
                throw new org.apache.axis2.databinding.ADBException("ModeloComercial cannot be null!!");
            }
            localModeloComercial.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ModeloComercial"),
                    xmlWriter);
        }
        if (localEnderecoCompletoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EnderecoCompleto", xmlWriter);


            if (localEnderecoCompleto == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EnderecoCompleto cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEnderecoCompleto);

            }

            xmlWriter.writeEndElement();
        }
        if (localNumeroTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Numero", xmlWriter);


            if (localNumero == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Numero cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNumero);

            }

            xmlWriter.writeEndElement();
        }
        if (localCodigoPostalTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "CodigoPostal", xmlWriter);


            if (localCodigoPostal == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CodigoPostal cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCodigoPostal);

            }

            xmlWriter.writeEndElement();
        }
        if (localComplementoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Complemento", xmlWriter);


            if (localComplemento == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Complemento cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localComplemento);

            }

            xmlWriter.writeEndElement();
        }
        if (localReferenciaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Referencia", xmlWriter);


            if (localReferencia == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Referencia cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localReferencia);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneResidencialTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneResidencial", xmlWriter);


            if (localTelefoneResidencial == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneResidencial cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneResidencial);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneCeluarTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneCeluar", xmlWriter);


            if (localTelefoneCeluar == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneCeluar cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneCeluar);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneRecadoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneRecado", xmlWriter);


            if (localTelefoneRecado == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneRecado cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneRecado);

            }

            xmlWriter.writeEndElement();
        }
        if (localFalarComTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "FalarCom", xmlWriter);


            if (localFalarCom == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("FalarCom cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localFalarCom);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailPessoalTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EmailPessoal", xmlWriter);


            if (localEmailPessoal == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EmailPessoal cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailPessoal);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailAlternativoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EmailAlternativo", xmlWriter);


            if (localEmailAlternativo == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EmailAlternativo cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailAlternativo);

            }

            xmlWriter.writeEndElement();
        }
        if (localLinkBlogTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "LinkBlog", xmlWriter);


            if (localLinkBlog == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("LinkBlog cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLinkBlog);

            }

            xmlWriter.writeEndElement();
        }
        if (localLinkOrkutTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "LinkOrkut", xmlWriter);


            if (localLinkOrkut == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("LinkOrkut cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLinkOrkut);

            }

            xmlWriter.writeEndElement();
        }
        if (localLinkFacebookTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "LinkFacebook", xmlWriter);


            if (localLinkFacebook == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("LinkFacebook cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLinkFacebook);

            }

            xmlWriter.writeEndElement();
        }
        if (localLinkTwitterTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "LinkTwitter", xmlWriter);


            if (localLinkTwitter == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("LinkTwitter cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLinkTwitter);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailMSNTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EmailMSN", xmlWriter);


            if (localEmailMSN == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EmailMSN cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailMSN);

            }

            xmlWriter.writeEndElement();
        }
        if (localNomeCompletoGVTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "NomeCompletoGV", xmlWriter);


            if (localNomeCompletoGV == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("NomeCompletoGV cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomeCompletoGV);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoEstruturaComercialGV", xmlWriter);

        if (localCodigoEstruturaComercialGV == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoEstruturaComercialGV cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoEstruturaComercialGV));
        }

        xmlWriter.writeEndElement();
        if (localTelefoneResidencialGVTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneResidencialGV", xmlWriter);


            if (localTelefoneResidencialGV == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneResidencialGV cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneResidencialGV);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneCeluarGVTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneCeluarGV", xmlWriter);


            if (localTelefoneCeluarGV == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneCeluarGV cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneCeluarGV);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneRecadoGVTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneRecadoGV", xmlWriter);


            if (localTelefoneRecadoGV == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneRecadoGV cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneRecadoGV);

            }

            xmlWriter.writeEndElement();
        }
        if (localFalarComGVTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "FalarComGV", xmlWriter);


            if (localFalarComGV == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("FalarComGV cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localFalarComGV);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailPessoalGVTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EmailPessoalGV", xmlWriter);


            if (localEmailPessoalGV == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EmailPessoalGV cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailPessoalGV);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailAlternativoGVTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EmailAlternativoGV", xmlWriter);


            if (localEmailAlternativoGV == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EmailAlternativoGV cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailAlternativoGV);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailMSNGVTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EmailMSNGV", xmlWriter);


            if (localEmailMSNGV == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EmailMSNGV cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailMSNGV);

            }

            xmlWriter.writeEndElement();
        }
        if (localNomeCompletoGRTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "NomeCompletoGR", xmlWriter);


            if (localNomeCompletoGR == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("NomeCompletoGR cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomeCompletoGR);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoEstruturaComercialGR", xmlWriter);

        if (localCodigoEstruturaComercialGR == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoEstruturaComercialGR cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoEstruturaComercialGR));
        }

        xmlWriter.writeEndElement();
        if (localTelefoneResidencialGRTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneResidencialGR", xmlWriter);


            if (localTelefoneResidencialGR == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneResidencialGR cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneResidencialGR);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneCeluarGRTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneCeluarGR", xmlWriter);


            if (localTelefoneCeluarGR == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneCeluarGR cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneCeluarGR);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneRecadoGRTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneRecadoGR", xmlWriter);


            if (localTelefoneRecadoGR == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneRecadoGR cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneRecadoGR);

            }

            xmlWriter.writeEndElement();
        }
        if (localFalarComGRTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "FalarComGR", xmlWriter);


            if (localFalarComGR == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("FalarComGR cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localFalarComGR);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailPessoalGRTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EmailPessoalGR", xmlWriter);


            if (localEmailPessoalGR == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EmailPessoalGR cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailPessoalGR);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailAlternativoGRTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EmailAlternativoGR", xmlWriter);


            if (localEmailAlternativoGR == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EmailAlternativoGR cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailAlternativoGR);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailMSNGRTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EmailMSNGR", xmlWriter);


            if (localEmailMSNGR == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EmailMSNGR cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailMSNGR);

            }

            xmlWriter.writeEndElement();
        }
        if (localNomeCompletoGDTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "NomeCompletoGD", xmlWriter);


            if (localNomeCompletoGD == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("NomeCompletoGD cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomeCompletoGD);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoEstruturaComercialGD", xmlWriter);

        if (localCodigoEstruturaComercialGD == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoEstruturaComercialGD cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoEstruturaComercialGD));
        }

        xmlWriter.writeEndElement();
        if (localTelefoneResidencialGDTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneResidencialGD", xmlWriter);


            if (localTelefoneResidencialGD == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneResidencialGD cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneResidencialGD);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneCeluarGDTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneCeluarGD", xmlWriter);


            if (localTelefoneCeluarGD == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneCeluarGD cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneCeluarGD);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneRecadoGDTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneRecadoGD", xmlWriter);


            if (localTelefoneRecadoGD == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneRecadoGD cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneRecadoGD);

            }

            xmlWriter.writeEndElement();
        }
        if (localFalarComGDTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "FalarComGD", xmlWriter);


            if (localFalarComGD == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("FalarComGD cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localFalarComGD);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailPessoalGDTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EmailPessoalGD", xmlWriter);


            if (localEmailPessoalGD == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EmailPessoalGD cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailPessoalGD);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailAlternativoGDTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EmailAlternativoGD", xmlWriter);


            if (localEmailAlternativoGD == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EmailAlternativoGD cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailAlternativoGD);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailMSNGDTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EmailMSNGD", xmlWriter);


            if (localEmailMSNGD == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EmailMSNGD cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailMSNGD);

            }

            xmlWriter.writeEndElement();
        }
        if (localMensagemErroTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "MensagemErro", xmlWriter);


            if (localMensagemErro == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("MensagemErro cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localMensagemErro);

            }

            xmlWriter.writeEndElement();
        }
        xmlWriter.writeEndElement();


    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.geravd.com.br/Servicos/PessoaWebService")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                   javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
                                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace, java.lang.String attName,
                                java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }


    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                     javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */

    private void writeQName(javax.xml.namespace.QName qname,
                            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
                             javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }


    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);
        if (prefix == null) {
            prefix = generatePrefix(namespace);
            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);
                if (uri == null || uri.length() == 0) {
                    break;
                }
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        return prefix;
    }


    /**
     * databinding method to get an XML representation of this object
     *
     */
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {


        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        if (localNomeConsultoraTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomeConsultora"));

            if (localNomeConsultora != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomeConsultora));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomeConsultora cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoConsultor"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoConsultor));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoEstruturaComercial"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoEstruturaComercial));
        if (localNomeEstruturaComercialTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomeEstruturaComercial"));

            if (localNomeEstruturaComercial != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomeEstruturaComercial));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomeEstruturaComercial cannot be null!!");
            }
        }
        if (localModeloComercialTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "ModeloComercial"));


            if (localModeloComercial == null) {
                throw new org.apache.axis2.databinding.ADBException("ModeloComercial cannot be null!!");
            }
            elementList.add(localModeloComercial);
        }
        if (localEnderecoCompletoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EnderecoCompleto"));

            if (localEnderecoCompleto != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnderecoCompleto));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EnderecoCompleto cannot be null!!");
            }
        }
        if (localNumeroTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Numero"));

            if (localNumero != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumero));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Numero cannot be null!!");
            }
        }
        if (localCodigoPostalTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "CodigoPostal"));

            if (localCodigoPostal != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPostal));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CodigoPostal cannot be null!!");
            }
        }
        if (localComplementoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Complemento"));

            if (localComplemento != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComplemento));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Complemento cannot be null!!");
            }
        }
        if (localReferenciaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Referencia"));

            if (localReferencia != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReferencia));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Referencia cannot be null!!");
            }
        }
        if (localTelefoneResidencialTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneResidencial"));

            if (localTelefoneResidencial != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneResidencial));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneResidencial cannot be null!!");
            }
        }
        if (localTelefoneCeluarTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneCeluar"));

            if (localTelefoneCeluar != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneCeluar));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneCeluar cannot be null!!");
            }
        }
        if (localTelefoneRecadoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneRecado"));

            if (localTelefoneRecado != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneRecado));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneRecado cannot be null!!");
            }
        }
        if (localFalarComTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "FalarCom"));

            if (localFalarCom != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFalarCom));
            } else {
                throw new org.apache.axis2.databinding.ADBException("FalarCom cannot be null!!");
            }
        }
        if (localEmailPessoalTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EmailPessoal"));

            if (localEmailPessoal != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailPessoal));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EmailPessoal cannot be null!!");
            }
        }
        if (localEmailAlternativoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EmailAlternativo"));

            if (localEmailAlternativo != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailAlternativo));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EmailAlternativo cannot be null!!");
            }
        }
        if (localLinkBlogTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "LinkBlog"));

            if (localLinkBlog != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkBlog));
            } else {
                throw new org.apache.axis2.databinding.ADBException("LinkBlog cannot be null!!");
            }
        }
        if (localLinkOrkutTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "LinkOrkut"));

            if (localLinkOrkut != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkOrkut));
            } else {
                throw new org.apache.axis2.databinding.ADBException("LinkOrkut cannot be null!!");
            }
        }
        if (localLinkFacebookTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "LinkFacebook"));

            if (localLinkFacebook != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkFacebook));
            } else {
                throw new org.apache.axis2.databinding.ADBException("LinkFacebook cannot be null!!");
            }
        }
        if (localLinkTwitterTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "LinkTwitter"));

            if (localLinkTwitter != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkTwitter));
            } else {
                throw new org.apache.axis2.databinding.ADBException("LinkTwitter cannot be null!!");
            }
        }
        if (localEmailMSNTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EmailMSN"));

            if (localEmailMSN != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailMSN));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EmailMSN cannot be null!!");
            }
        }
        if (localNomeCompletoGVTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomeCompletoGV"));

            if (localNomeCompletoGV != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomeCompletoGV));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomeCompletoGV cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoEstruturaComercialGV"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoEstruturaComercialGV));
        if (localTelefoneResidencialGVTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneResidencialGV"));

            if (localTelefoneResidencialGV != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneResidencialGV));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneResidencialGV cannot be null!!");
            }
        }
        if (localTelefoneCeluarGVTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneCeluarGV"));

            if (localTelefoneCeluarGV != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneCeluarGV));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneCeluarGV cannot be null!!");
            }
        }
        if (localTelefoneRecadoGVTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneRecadoGV"));

            if (localTelefoneRecadoGV != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneRecadoGV));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneRecadoGV cannot be null!!");
            }
        }
        if (localFalarComGVTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "FalarComGV"));

            if (localFalarComGV != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFalarComGV));
            } else {
                throw new org.apache.axis2.databinding.ADBException("FalarComGV cannot be null!!");
            }
        }
        if (localEmailPessoalGVTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EmailPessoalGV"));

            if (localEmailPessoalGV != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailPessoalGV));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EmailPessoalGV cannot be null!!");
            }
        }
        if (localEmailAlternativoGVTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EmailAlternativoGV"));

            if (localEmailAlternativoGV != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailAlternativoGV));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EmailAlternativoGV cannot be null!!");
            }
        }
        if (localEmailMSNGVTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EmailMSNGV"));

            if (localEmailMSNGV != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailMSNGV));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EmailMSNGV cannot be null!!");
            }
        }
        if (localNomeCompletoGRTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomeCompletoGR"));

            if (localNomeCompletoGR != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomeCompletoGR));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomeCompletoGR cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoEstruturaComercialGR"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoEstruturaComercialGR));
        if (localTelefoneResidencialGRTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneResidencialGR"));

            if (localTelefoneResidencialGR != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneResidencialGR));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneResidencialGR cannot be null!!");
            }
        }
        if (localTelefoneCeluarGRTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneCeluarGR"));

            if (localTelefoneCeluarGR != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneCeluarGR));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneCeluarGR cannot be null!!");
            }
        }
        if (localTelefoneRecadoGRTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneRecadoGR"));

            if (localTelefoneRecadoGR != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneRecadoGR));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneRecadoGR cannot be null!!");
            }
        }
        if (localFalarComGRTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "FalarComGR"));

            if (localFalarComGR != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFalarComGR));
            } else {
                throw new org.apache.axis2.databinding.ADBException("FalarComGR cannot be null!!");
            }
        }
        if (localEmailPessoalGRTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EmailPessoalGR"));

            if (localEmailPessoalGR != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailPessoalGR));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EmailPessoalGR cannot be null!!");
            }
        }
        if (localEmailAlternativoGRTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EmailAlternativoGR"));

            if (localEmailAlternativoGR != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailAlternativoGR));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EmailAlternativoGR cannot be null!!");
            }
        }
        if (localEmailMSNGRTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EmailMSNGR"));

            if (localEmailMSNGR != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailMSNGR));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EmailMSNGR cannot be null!!");
            }
        }
        if (localNomeCompletoGDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomeCompletoGD"));

            if (localNomeCompletoGD != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomeCompletoGD));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomeCompletoGD cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoEstruturaComercialGD"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoEstruturaComercialGD));
        if (localTelefoneResidencialGDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneResidencialGD"));

            if (localTelefoneResidencialGD != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneResidencialGD));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneResidencialGD cannot be null!!");
            }
        }
        if (localTelefoneCeluarGDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneCeluarGD"));

            if (localTelefoneCeluarGD != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneCeluarGD));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneCeluarGD cannot be null!!");
            }
        }
        if (localTelefoneRecadoGDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneRecadoGD"));

            if (localTelefoneRecadoGD != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneRecadoGD));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneRecadoGD cannot be null!!");
            }
        }
        if (localFalarComGDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "FalarComGD"));

            if (localFalarComGD != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFalarComGD));
            } else {
                throw new org.apache.axis2.databinding.ADBException("FalarComGD cannot be null!!");
            }
        }
        if (localEmailPessoalGDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EmailPessoalGD"));

            if (localEmailPessoalGD != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailPessoalGD));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EmailPessoalGD cannot be null!!");
            }
        }
        if (localEmailAlternativoGDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EmailAlternativoGD"));

            if (localEmailAlternativoGD != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailAlternativoGD));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EmailAlternativoGD cannot be null!!");
            }
        }
        if (localEmailMSNGDTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EmailMSNGD"));

            if (localEmailMSNGD != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailMSNGD));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EmailMSNGD cannot be null!!");
            }
        }
        if (localMensagemErroTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "MensagemErro"));

            if (localMensagemErro != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMensagemErro));
            } else {
                throw new org.apache.axis2.databinding.ADBException("MensagemErro cannot be null!!");
            }
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


    }


    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {


        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static RetornoObterDadosSiteConsultor parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RetornoObterDadosSiteConsultor object =
                    new RetornoObterDadosSiteConsultor();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();


                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                        if (!"RetornoObterDadosSiteConsultor".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RetornoObterDadosSiteConsultor) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }


                    }


                }


                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();


                reader.next();


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomeConsultora").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomeConsultora(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoConsultor").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoConsultor(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoEstruturaComercial").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoEstruturaComercial(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomeEstruturaComercial").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomeEstruturaComercial(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ModeloComercial").equals(reader.getName())) {

                    object.setModeloComercial(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfRetornoModeloComercial.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EnderecoCompleto").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEnderecoCompleto(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Numero").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNumero(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoPostal").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoPostal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Complemento").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setComplemento(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Referencia").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setReferencia(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneResidencial").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneResidencial(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneCeluar").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneCeluar(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneRecado").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneRecado(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "FalarCom").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setFalarCom(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EmailPessoal").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailPessoal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EmailAlternativo").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailAlternativo(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "LinkBlog").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLinkBlog(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "LinkOrkut").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLinkOrkut(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "LinkFacebook").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLinkFacebook(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "LinkTwitter").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLinkTwitter(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EmailMSN").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailMSN(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomeCompletoGV").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomeCompletoGV(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoEstruturaComercialGV").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoEstruturaComercialGV(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneResidencialGV").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneResidencialGV(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneCeluarGV").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneCeluarGV(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneRecadoGV").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneRecadoGV(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "FalarComGV").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setFalarComGV(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EmailPessoalGV").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailPessoalGV(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EmailAlternativoGV").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailAlternativoGV(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EmailMSNGV").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailMSNGV(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomeCompletoGR").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomeCompletoGR(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoEstruturaComercialGR").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoEstruturaComercialGR(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneResidencialGR").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneResidencialGR(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneCeluarGR").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneCeluarGR(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneRecadoGR").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneRecadoGR(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "FalarComGR").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setFalarComGR(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EmailPessoalGR").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailPessoalGR(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EmailAlternativoGR").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailAlternativoGR(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EmailMSNGR").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailMSNGR(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomeCompletoGD").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomeCompletoGD(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoEstruturaComercialGD").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoEstruturaComercialGD(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneResidencialGD").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneResidencialGD(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneCeluarGD").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneCeluarGD(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneRecadoGD").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneRecadoGD(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "FalarComGD").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setFalarComGD(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EmailPessoalGD").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailPessoalGD(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EmailAlternativoGD").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailAlternativoGD(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EmailMSNGD").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailMSNGD(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "MensagemErro").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setMensagemErro(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement())
                    // A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());


            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }//end of factory class


}
           
