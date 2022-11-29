/**
 * ParametroPessoa.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 * ParametroPessoa bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class ParametroPessoa
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = ParametroPessoa
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for CodigoPessoa
     */


    protected int localCodigoPessoa;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCodigoPessoa() {
        return localCodigoPessoa;
    }


    /**
     * Auto generated setter method
     *
     * @param param CodigoPessoa
     */
    public void setCodigoPessoa(int param) {

        this.localCodigoPessoa = param;


    }


    /**
     * field for NomePessoa
     */


    protected java.lang.String localNomePessoa;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomePessoaTracker = false;

    public boolean isNomePessoaSpecified() {
        return localNomePessoaTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNomePessoa() {
        return localNomePessoa;
    }


    /**
     * Auto generated setter method
     *
     * @param param NomePessoa
     */
    public void setNomePessoa(java.lang.String param) {
        localNomePessoaTracker = param != null;

        this.localNomePessoa = param;


    }


    /**
     * field for ApelidoPessoa
     */


    protected java.lang.String localApelidoPessoa;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localApelidoPessoaTracker = false;

    public boolean isApelidoPessoaSpecified() {
        return localApelidoPessoaTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getApelidoPessoa() {
        return localApelidoPessoa;
    }


    /**
     * Auto generated setter method
     *
     * @param param ApelidoPessoa
     */
    public void setApelidoPessoa(java.lang.String param) {
        localApelidoPessoaTracker = param != null;

        this.localApelidoPessoa = param;


    }


    /**
     * field for Enderecos
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaEndereco localEnderecos;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnderecosTracker = false;

    public boolean isEnderecosSpecified() {
        return localEnderecosTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaEndereco
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaEndereco getEnderecos() {
        return localEnderecos;
    }


    /**
     * Auto generated setter method
     *
     * @param param Enderecos
     */
    public void setEnderecos(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaEndereco param) {
        localEnderecosTracker = param != null;

        this.localEnderecos = param;


    }


    /**
     * field for Documentos
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaDocumento localDocumentos;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDocumentosTracker = false;

    public boolean isDocumentosSpecified() {
        return localDocumentosTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaDocumento
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaDocumento getDocumentos() {
        return localDocumentos;
    }


    /**
     * Auto generated setter method
     *
     * @param param Documentos
     */
    public void setDocumentos(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaDocumento param) {
        localDocumentosTracker = param != null;

        this.localDocumentos = param;


    }


    /**
     * field for Telefones
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaTelefone localTelefones;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefonesTracker = false;

    public boolean isTelefonesSpecified() {
        return localTelefonesTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaTelefone
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaTelefone getTelefones() {
        return localTelefones;
    }


    /**
     * Auto generated setter method
     *
     * @param param Telefones
     */
    public void setTelefones(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaTelefone param) {
        localTelefonesTracker = param != null;

        this.localTelefones = param;


    }


    /**
     * field for Emails
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaEmail localEmails;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailsTracker = false;

    public boolean isEmailsSpecified() {
        return localEmailsTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaEmail
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaEmail getEmails() {
        return localEmails;
    }


    /**
     * Auto generated setter method
     *
     * @param param Emails
     */
    public void setEmails(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaEmail param) {
        localEmailsTracker = param != null;

        this.localEmails = param;


    }


    /**
     * field for Sexo
     */


    protected int localSexo;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getSexo() {
        return localSexo;
    }


    /**
     * Auto generated setter method
     *
     * @param param Sexo
     */
    public void setSexo(int param) {

        this.localSexo = param;


    }


    /**
     * field for DtNascimento
     */


    protected java.util.Calendar localDtNascimento;


    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getDtNascimento() {
        return localDtNascimento;
    }


    /**
     * Auto generated setter method
     *
     * @param param DtNascimento
     */
    public void setDtNascimento(java.util.Calendar param) {

        this.localDtNascimento = param;


    }


    /**
     * field for Nacionalidade
     */


    protected int localNacionalidade;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getNacionalidade() {
        return localNacionalidade;
    }


    /**
     * Auto generated setter method
     *
     * @param param Nacionalidade
     */
    public void setNacionalidade(int param) {

        this.localNacionalidade = param;


    }


    /**
     * field for EstadoCivil
     */


    protected int localEstadoCivil;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getEstadoCivil() {
        return localEstadoCivil;
    }


    /**
     * Auto generated setter method
     *
     * @param param EstadoCivil
     */
    public void setEstadoCivil(int param) {

        this.localEstadoCivil = param;


    }


    /**
     * field for NomeConjuge
     */


    protected java.lang.String localNomeConjuge;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeConjugeTracker = false;

    public boolean isNomeConjugeSpecified() {
        return localNomeConjugeTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNomeConjuge() {
        return localNomeConjuge;
    }


    /**
     * Auto generated setter method
     *
     * @param param NomeConjuge
     */
    public void setNomeConjuge(java.lang.String param) {
        localNomeConjugeTracker = param != null;

        this.localNomeConjuge = param;


    }


    /**
     * field for Filhos
     */


    protected int localFilhos;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getFilhos() {
        return localFilhos;
    }


    /**
     * Auto generated setter method
     *
     * @param param Filhos
     */
    public void setFilhos(int param) {

        this.localFilhos = param;


    }


    /**
     * field for Escolaridade
     */


    protected int localEscolaridade;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getEscolaridade() {
        return localEscolaridade;
    }


    /**
     * Auto generated setter method
     *
     * @param param Escolaridade
     */
    public void setEscolaridade(int param) {

        this.localEscolaridade = param;


    }


    /**
     * field for Profissao
     */


    protected int localProfissao;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getProfissao() {
        return localProfissao;
    }


    /**
     * Auto generated setter method
     *
     * @param param Profissao
     */
    public void setProfissao(int param) {

        this.localProfissao = param;


    }


    /**
     * field for Computador
     */


    protected int localComputador;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getComputador() {
        return localComputador;
    }


    /**
     * Auto generated setter method
     *
     * @param param Computador
     */
    public void setComputador(int param) {

        this.localComputador = param;


    }


    /**
     * field for Internet
     */


    protected int localInternet;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getInternet() {
        return localInternet;
    }


    /**
     * Auto generated setter method
     *
     * @param param Internet
     */
    public void setInternet(int param) {

        this.localInternet = param;


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
     *
     * @return java.lang.String
     */
    public java.lang.String getLinkBlog() {
        return localLinkBlog;
    }


    /**
     * Auto generated setter method
     *
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
     *
     * @return java.lang.String
     */
    public java.lang.String getLinkOrkut() {
        return localLinkOrkut;
    }


    /**
     * Auto generated setter method
     *
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
     *
     * @return java.lang.String
     */
    public java.lang.String getLinkFacebook() {
        return localLinkFacebook;
    }


    /**
     * Auto generated setter method
     *
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
     *
     * @return java.lang.String
     */
    public java.lang.String getLinkTwitter() {
        return localLinkTwitter;
    }


    /**
     * Auto generated setter method
     *
     * @param param LinkTwitter
     */
    public void setLinkTwitter(java.lang.String param) {
        localLinkTwitterTracker = param != null;

        this.localLinkTwitter = param;


    }


    /**
     * field for LinkLinkedIn
     */


    protected java.lang.String localLinkLinkedIn;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLinkLinkedInTracker = false;

    public boolean isLinkLinkedInSpecified() {
        return localLinkLinkedInTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLinkLinkedIn() {
        return localLinkLinkedIn;
    }


    /**
     * Auto generated setter method
     *
     * @param param LinkLinkedIn
     */
    public void setLinkLinkedIn(java.lang.String param) {
        localLinkLinkedInTracker = param != null;

        this.localLinkLinkedIn = param;


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
     *
     * @return java.lang.String
     */
    public java.lang.String getEmailMSN() {
        return localEmailMSN;
    }


    /**
     * Auto generated setter method
     *
     * @param param EmailMSN
     */
    public void setEmailMSN(java.lang.String param) {
        localEmailMSNTracker = param != null;

        this.localEmailMSN = param;


    }


    /**
     * field for PessoasAutorizadas
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaAutorizada localPessoasAutorizadas;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPessoasAutorizadasTracker = false;

    public boolean isPessoasAutorizadasSpecified() {
        return localPessoasAutorizadasTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaAutorizada
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaAutorizada getPessoasAutorizadas() {
        return localPessoasAutorizadas;
    }


    /**
     * Auto generated setter method
     *
     * @param param PessoasAutorizadas
     */
    public void setPessoasAutorizadas(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaAutorizada param) {
        localPessoasAutorizadasTracker = param != null;

        this.localPessoasAutorizadas = param;


    }


    /**
     * field for PessoaIndicacao
     */


    protected int localPessoaIndicacao;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getPessoaIndicacao() {
        return localPessoaIndicacao;
    }


    /**
     * Auto generated setter method
     *
     * @param param PessoaIndicacao
     */
    public void setPessoaIndicacao(int param) {

        this.localPessoaIndicacao = param;


    }


    /**
     * field for EstruturaComercialIndicacao
     */


    protected int localEstruturaComercialIndicacao;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getEstruturaComercialIndicacao() {
        return localEstruturaComercialIndicacao;
    }


    /**
     * Auto generated setter method
     *
     * @param param EstruturaComercialIndicacao
     */
    public void setEstruturaComercialIndicacao(int param) {

        this.localEstruturaComercialIndicacao = param;


    }


    /**
     * field for ReferenciasProfissionais
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaProfissional localReferenciasProfissionais;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReferenciasProfissionaisTracker = false;

    public boolean isReferenciasProfissionaisSpecified() {
        return localReferenciasProfissionaisTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaProfissional
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaProfissional getReferenciasProfissionais() {
        return localReferenciasProfissionais;
    }


    /**
     * Auto generated setter method
     *
     * @param param ReferenciasProfissionais
     */
    public void setReferenciasProfissionais(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaProfissional param) {
        localReferenciasProfissionaisTracker = param != null;

        this.localReferenciasProfissionais = param;


    }


    /**
     * field for ReferenciasBancarias
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaBancaria localReferenciasBancarias;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReferenciasBancariasTracker = false;

    public boolean isReferenciasBancariasSpecified() {
        return localReferenciasBancariasTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaBancaria
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaBancaria getReferenciasBancarias() {
        return localReferenciasBancarias;
    }


    /**
     * Auto generated setter method
     *
     * @param param ReferenciasBancarias
     */
    public void setReferenciasBancarias(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaBancaria param) {
        localReferenciasBancariasTracker = param != null;

        this.localReferenciasBancarias = param;


    }


    /**
     * field for ReferenciasPessoais
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaPessoal localReferenciasPessoais;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReferenciasPessoaisTracker = false;

    public boolean isReferenciasPessoaisSpecified() {
        return localReferenciasPessoaisTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaPessoal
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaPessoal getReferenciasPessoais() {
        return localReferenciasPessoais;
    }


    /**
     * Auto generated setter method
     *
     * @param param ReferenciasPessoais
     */
    public void setReferenciasPessoais(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaPessoal param) {
        localReferenciasPessoaisTracker = param != null;

        this.localReferenciasPessoais = param;


    }


    /**
     * field for Senha
     */


    protected java.lang.String localSenha;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSenhaTracker = false;

    public boolean isSenhaSpecified() {
        return localSenhaTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSenha() {
        return localSenha;
    }


    /**
     * Auto generated setter method
     *
     * @param param Senha
     */
    public void setSenha(java.lang.String param) {
        localSenhaTracker = param != null;

        this.localSenha = param;


    }


    /**
     * field for DivulgarInformacoesCf
     */


    protected int localDivulgarInformacoesCf;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getDivulgarInformacoesCf() {
        return localDivulgarInformacoesCf;
    }


    /**
     * Auto generated setter method
     *
     * @param param DivulgarInformacoesCf
     */
    public void setDivulgarInformacoesCf(int param) {

        this.localDivulgarInformacoesCf = param;


    }


    /**
     * field for AutorizaLocalizador
     */


    protected int localAutorizaLocalizador;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getAutorizaLocalizador() {
        return localAutorizaLocalizador;
    }


    /**
     * Auto generated setter method
     *
     * @param param AutorizaLocalizador
     */
    public void setAutorizaLocalizador(int param) {

        this.localAutorizaLocalizador = param;


    }


    /**
     * field for Funcoes
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt localFuncoes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFuncoesTracker = false;

    public boolean isFuncoesSpecified() {
        return localFuncoesTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt getFuncoes() {
        return localFuncoes;
    }


    /**
     * Auto generated setter method
     *
     * @param param Funcoes
     */
    public void setFuncoes(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt param) {
        localFuncoesTracker = param != null;

        this.localFuncoes = param;


    }


    /**
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
                        namespacePrefix + ":ParametroPessoa",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "ParametroPessoa",
                        xmlWriter);
            }


        }

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoPessoa", xmlWriter);

        if (localCodigoPessoa == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoPessoa cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPessoa));
        }

        xmlWriter.writeEndElement();
        if (localNomePessoaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "NomePessoa", xmlWriter);


            if (localNomePessoa == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("NomePessoa cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomePessoa);

            }

            xmlWriter.writeEndElement();
        }
        if (localApelidoPessoaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "ApelidoPessoa", xmlWriter);


            if (localApelidoPessoa == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ApelidoPessoa cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localApelidoPessoa);

            }

            xmlWriter.writeEndElement();
        }
        if (localEnderecosTracker) {
            if (localEnderecos == null) {
                throw new org.apache.axis2.databinding.ADBException("Enderecos cannot be null!!");
            }
            localEnderecos.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Enderecos"),
                    xmlWriter);
        }
        if (localDocumentosTracker) {
            if (localDocumentos == null) {
                throw new org.apache.axis2.databinding.ADBException("Documentos cannot be null!!");
            }
            localDocumentos.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Documentos"),
                    xmlWriter);
        }
        if (localTelefonesTracker) {
            if (localTelefones == null) {
                throw new org.apache.axis2.databinding.ADBException("Telefones cannot be null!!");
            }
            localTelefones.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Telefones"),
                    xmlWriter);
        }
        if (localEmailsTracker) {
            if (localEmails == null) {
                throw new org.apache.axis2.databinding.ADBException("Emails cannot be null!!");
            }
            localEmails.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Emails"),
                    xmlWriter);
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "Sexo", xmlWriter);

        if (localSexo == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Sexo cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSexo));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "DtNascimento", xmlWriter);


        if (localDtNascimento == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("DtNascimento cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDtNascimento));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "Nacionalidade", xmlWriter);

        if (localNacionalidade == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Nacionalidade cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNacionalidade));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "EstadoCivil", xmlWriter);

        if (localEstadoCivil == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("EstadoCivil cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstadoCivil));
        }

        xmlWriter.writeEndElement();
        if (localNomeConjugeTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "NomeConjuge", xmlWriter);


            if (localNomeConjuge == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("NomeConjuge cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomeConjuge);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "Filhos", xmlWriter);

        if (localFilhos == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Filhos cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFilhos));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "Escolaridade", xmlWriter);

        if (localEscolaridade == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Escolaridade cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEscolaridade));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "Profissao", xmlWriter);

        if (localProfissao == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Profissao cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProfissao));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "Computador", xmlWriter);

        if (localComputador == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Computador cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComputador));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "Internet", xmlWriter);

        if (localInternet == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Internet cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInternet));
        }

        xmlWriter.writeEndElement();
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
        if (localLinkLinkedInTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "LinkLinkedIn", xmlWriter);


            if (localLinkLinkedIn == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("LinkLinkedIn cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLinkLinkedIn);

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
        if (localPessoasAutorizadasTracker) {
            if (localPessoasAutorizadas == null) {
                throw new org.apache.axis2.databinding.ADBException("PessoasAutorizadas cannot be null!!");
            }
            localPessoasAutorizadas.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "PessoasAutorizadas"),
                    xmlWriter);
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "PessoaIndicacao", xmlWriter);

        if (localPessoaIndicacao == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("PessoaIndicacao cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPessoaIndicacao));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "EstruturaComercialIndicacao", xmlWriter);

        if (localEstruturaComercialIndicacao == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("EstruturaComercialIndicacao cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstruturaComercialIndicacao));
        }

        xmlWriter.writeEndElement();
        if (localReferenciasProfissionaisTracker) {
            if (localReferenciasProfissionais == null) {
                throw new org.apache.axis2.databinding.ADBException("ReferenciasProfissionais cannot be null!!");
            }
            localReferenciasProfissionais.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ReferenciasProfissionais"),
                    xmlWriter);
        }
        if (localReferenciasBancariasTracker) {
            if (localReferenciasBancarias == null) {
                throw new org.apache.axis2.databinding.ADBException("ReferenciasBancarias cannot be null!!");
            }
            localReferenciasBancarias.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ReferenciasBancarias"),
                    xmlWriter);
        }
        if (localReferenciasPessoaisTracker) {
            if (localReferenciasPessoais == null) {
                throw new org.apache.axis2.databinding.ADBException("ReferenciasPessoais cannot be null!!");
            }
            localReferenciasPessoais.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ReferenciasPessoais"),
                    xmlWriter);
        }
        if (localSenhaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Senha", xmlWriter);


            if (localSenha == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Senha cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localSenha);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "DivulgarInformacoesCf", xmlWriter);

        if (localDivulgarInformacoesCf == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("DivulgarInformacoesCf cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDivulgarInformacoesCf));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "AutorizaLocalizador", xmlWriter);

        if (localAutorizaLocalizador == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("AutorizaLocalizador cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutorizaLocalizador));
        }

        xmlWriter.writeEndElement();
        if (localFuncoesTracker) {
            if (localFuncoes == null) {
                throw new org.apache.axis2.databinding.ADBException("Funcoes cannot be null!!");
            }
            localFuncoes.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Funcoes"),
                    xmlWriter);
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
     * method to handle Qnames
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
     */
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {


        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();


        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoPessoa"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPessoa));
        if (localNomePessoaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomePessoa"));

            if (localNomePessoa != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomePessoa));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomePessoa cannot be null!!");
            }
        }
        if (localApelidoPessoaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "ApelidoPessoa"));

            if (localApelidoPessoa != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApelidoPessoa));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ApelidoPessoa cannot be null!!");
            }
        }
        if (localEnderecosTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Enderecos"));


            if (localEnderecos == null) {
                throw new org.apache.axis2.databinding.ADBException("Enderecos cannot be null!!");
            }
            elementList.add(localEnderecos);
        }
        if (localDocumentosTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Documentos"));


            if (localDocumentos == null) {
                throw new org.apache.axis2.databinding.ADBException("Documentos cannot be null!!");
            }
            elementList.add(localDocumentos);
        }
        if (localTelefonesTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Telefones"));


            if (localTelefones == null) {
                throw new org.apache.axis2.databinding.ADBException("Telefones cannot be null!!");
            }
            elementList.add(localTelefones);
        }
        if (localEmailsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Emails"));


            if (localEmails == null) {
                throw new org.apache.axis2.databinding.ADBException("Emails cannot be null!!");
            }
            elementList.add(localEmails);
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "Sexo"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSexo));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "DtNascimento"));

        if (localDtNascimento != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDtNascimento));
        } else {
            throw new org.apache.axis2.databinding.ADBException("DtNascimento cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "Nacionalidade"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNacionalidade));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "EstadoCivil"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstadoCivil));
        if (localNomeConjugeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomeConjuge"));

            if (localNomeConjuge != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomeConjuge));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomeConjuge cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "Filhos"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFilhos));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "Escolaridade"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEscolaridade));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "Profissao"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProfissao));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "Computador"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComputador));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "Internet"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInternet));
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
        if (localLinkLinkedInTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "LinkLinkedIn"));

            if (localLinkLinkedIn != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkLinkedIn));
            } else {
                throw new org.apache.axis2.databinding.ADBException("LinkLinkedIn cannot be null!!");
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
        if (localPessoasAutorizadasTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "PessoasAutorizadas"));


            if (localPessoasAutorizadas == null) {
                throw new org.apache.axis2.databinding.ADBException("PessoasAutorizadas cannot be null!!");
            }
            elementList.add(localPessoasAutorizadas);
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "PessoaIndicacao"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPessoaIndicacao));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "EstruturaComercialIndicacao"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstruturaComercialIndicacao));
        if (localReferenciasProfissionaisTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "ReferenciasProfissionais"));


            if (localReferenciasProfissionais == null) {
                throw new org.apache.axis2.databinding.ADBException("ReferenciasProfissionais cannot be null!!");
            }
            elementList.add(localReferenciasProfissionais);
        }
        if (localReferenciasBancariasTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "ReferenciasBancarias"));


            if (localReferenciasBancarias == null) {
                throw new org.apache.axis2.databinding.ADBException("ReferenciasBancarias cannot be null!!");
            }
            elementList.add(localReferenciasBancarias);
        }
        if (localReferenciasPessoaisTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "ReferenciasPessoais"));


            if (localReferenciasPessoais == null) {
                throw new org.apache.axis2.databinding.ADBException("ReferenciasPessoais cannot be null!!");
            }
            elementList.add(localReferenciasPessoais);
        }
        if (localSenhaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Senha"));

            if (localSenha != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenha));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Senha cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "DivulgarInformacoesCf"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDivulgarInformacoesCf));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "AutorizaLocalizador"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAutorizaLocalizador));
        if (localFuncoesTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Funcoes"));


            if (localFuncoes == null) {
                throw new org.apache.axis2.databinding.ADBException("Funcoes cannot be null!!");
            }
            elementList.add(localFuncoes);
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());


    }


    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {


        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         * If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static ParametroPessoa parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ParametroPessoa object =
                    new ParametroPessoa();

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

                        if (!"ParametroPessoa".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (ParametroPessoa) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }


                    }


                }


                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();


                reader.next();


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoPessoa").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoPessoa(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomePessoa").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomePessoa(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ApelidoPessoa").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setApelidoPessoa(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Enderecos").equals(reader.getName())) {

                    object.setEnderecos(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaEndereco.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Documentos").equals(reader.getName())) {

                    object.setDocumentos(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaDocumento.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Telefones").equals(reader.getName())) {

                    object.setTelefones(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaTelefone.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Emails").equals(reader.getName())) {

                    object.setEmails(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaEmail.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Sexo").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSexo(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DtNascimento").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDtNascimento(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Nacionalidade").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNacionalidade(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EstadoCivil").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEstadoCivil(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomeConjuge").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomeConjuge(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Filhos").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setFilhos(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Escolaridade").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEscolaridade(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Profissao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setProfissao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Computador").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setComputador(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Internet").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setInternet(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "LinkLinkedIn").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLinkLinkedIn(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "PessoasAutorizadas").equals(reader.getName())) {

                    object.setPessoasAutorizadas(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaAutorizada.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "PessoaIndicacao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setPessoaIndicacao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EstruturaComercialIndicacao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEstruturaComercialIndicacao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ReferenciasProfissionais").equals(reader.getName())) {

                    object.setReferenciasProfissionais(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaProfissional.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ReferenciasBancarias").equals(reader.getName())) {

                    object.setReferenciasBancarias(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaBancaria.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ReferenciasPessoais").equals(reader.getName())) {

                    object.setReferenciasPessoais(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfParametroPessoaReferenciaPessoal.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Senha").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSenha(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DivulgarInformacoesCf").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDivulgarInformacoesCf(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "AutorizaLocalizador").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setAutorizaLocalizador(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Funcoes").equals(reader.getName())) {

                    object.setFuncoes(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt.Factory.parse(reader));

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
           
