/**
 * RetornoObterInformacoesAdicionaisPessoa.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 *  RetornoObterInformacoesAdicionaisPessoa bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class RetornoObterInformacoesAdicionaisPessoa extends bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoWebService
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = RetornoObterInformacoesAdicionaisPessoa
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for Documento
     */


    protected java.lang.String localDocumento;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDocumentoTracker = false;

    public boolean isDocumentoSpecified() {
        return localDocumentoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDocumento() {
        return localDocumento;
    }


    /**
     * Auto generated setter method
     * @param param Documento
     */
    public void setDocumento(java.lang.String param) {
        localDocumentoTracker = param != null;

        this.localDocumento = param;


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
     * field for TelefoneComercial
     */


    protected java.lang.String localTelefoneComercial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneComercialTracker = false;

    public boolean isTelefoneComercialSpecified() {
        return localTelefoneComercialTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneComercial() {
        return localTelefoneComercial;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneComercial
     */
    public void setTelefoneComercial(java.lang.String param) {
        localTelefoneComercialTracker = param != null;

        this.localTelefoneComercial = param;


    }


    /**
     * field for TelefoneCelular
     */


    protected java.lang.String localTelefoneCelular;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneCelularTracker = false;

    public boolean isTelefoneCelularSpecified() {
        return localTelefoneCelularTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneCelular() {
        return localTelefoneCelular;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneCelular
     */
    public void setTelefoneCelular(java.lang.String param) {
        localTelefoneCelularTracker = param != null;

        this.localTelefoneCelular = param;


    }


    /**
     * field for Endereco
     */


    protected java.lang.String localEndereco;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnderecoTracker = false;

    public boolean isEnderecoSpecified() {
        return localEnderecoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEndereco() {
        return localEndereco;
    }


    /**
     * Auto generated setter method
     * @param param Endereco
     */
    public void setEndereco(java.lang.String param) {
        localEnderecoTracker = param != null;

        this.localEndereco = param;


    }


    /**
     * field for DataNascimento
     */


    protected java.util.Calendar localDataNascimento;


    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataNascimento() {
        return localDataNascimento;
    }


    /**
     * Auto generated setter method
     * @param param DataNascimento
     */
    public void setDataNascimento(java.util.Calendar param) {

        this.localDataNascimento = param;


    }


    /**
     * field for DocumentoPrincipal
     */


    protected java.lang.String localDocumentoPrincipal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDocumentoPrincipalTracker = false;

    public boolean isDocumentoPrincipalSpecified() {
        return localDocumentoPrincipalTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDocumentoPrincipal() {
        return localDocumentoPrincipal;
    }


    /**
     * Auto generated setter method
     * @param param DocumentoPrincipal
     */
    public void setDocumentoPrincipal(java.lang.String param) {
        localDocumentoPrincipalTracker = param != null;

        this.localDocumentoPrincipal = param;


    }


    /**
     * field for InformacaoExtraDocPrincipal
     */


    protected java.lang.String localInformacaoExtraDocPrincipal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInformacaoExtraDocPrincipalTracker = false;

    public boolean isInformacaoExtraDocPrincipalSpecified() {
        return localInformacaoExtraDocPrincipalTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getInformacaoExtraDocPrincipal() {
        return localInformacaoExtraDocPrincipal;
    }


    /**
     * Auto generated setter method
     * @param param InformacaoExtraDocPrincipal
     */
    public void setInformacaoExtraDocPrincipal(java.lang.String param) {
        localInformacaoExtraDocPrincipalTracker = param != null;

        this.localInformacaoExtraDocPrincipal = param;


    }


    /**
     * field for DocumentoSecundario
     */


    protected java.lang.String localDocumentoSecundario;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDocumentoSecundarioTracker = false;

    public boolean isDocumentoSecundarioSpecified() {
        return localDocumentoSecundarioTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDocumentoSecundario() {
        return localDocumentoSecundario;
    }


    /**
     * Auto generated setter method
     * @param param DocumentoSecundario
     */
    public void setDocumentoSecundario(java.lang.String param) {
        localDocumentoSecundarioTracker = param != null;

        this.localDocumentoSecundario = param;


    }


    /**
     * field for InformacaoExtraDocSecundario
     */


    protected java.lang.String localInformacaoExtraDocSecundario;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localInformacaoExtraDocSecundarioTracker = false;

    public boolean isInformacaoExtraDocSecundarioSpecified() {
        return localInformacaoExtraDocSecundarioTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getInformacaoExtraDocSecundario() {
        return localInformacaoExtraDocSecundario;
    }


    /**
     * Auto generated setter method
     * @param param InformacaoExtraDocSecundario
     */
    public void setInformacaoExtraDocSecundario(java.lang.String param) {
        localInformacaoExtraDocSecundarioTracker = param != null;

        this.localInformacaoExtraDocSecundario = param;


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
     * field for DataInicio
     */


    protected java.util.Calendar localDataInicio;


    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataInicio() {
        return localDataInicio;
    }


    /**
     * Auto generated setter method
     * @param param DataInicio
     */
    public void setDataInicio(java.util.Calendar param) {

        this.localDataInicio = param;


    }


    /**
     * field for EnderecoResidencialCompleto
     */


    protected java.lang.String localEnderecoResidencialCompleto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnderecoResidencialCompletoTracker = false;

    public boolean isEnderecoResidencialCompletoSpecified() {
        return localEnderecoResidencialCompletoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEnderecoResidencialCompleto() {
        return localEnderecoResidencialCompleto;
    }


    /**
     * Auto generated setter method
     * @param param EnderecoResidencialCompleto
     */
    public void setEnderecoResidencialCompleto(java.lang.String param) {
        localEnderecoResidencialCompletoTracker = param != null;

        this.localEnderecoResidencialCompleto = param;


    }


    /**
     * field for EnderecoEntregaCompleto
     */


    protected java.lang.String localEnderecoEntregaCompleto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnderecoEntregaCompletoTracker = false;

    public boolean isEnderecoEntregaCompletoSpecified() {
        return localEnderecoEntregaCompletoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEnderecoEntregaCompleto() {
        return localEnderecoEntregaCompleto;
    }


    /**
     * Auto generated setter method
     * @param param EnderecoEntregaCompleto
     */
    public void setEnderecoEntregaCompleto(java.lang.String param) {
        localEnderecoEntregaCompletoTracker = param != null;

        this.localEnderecoEntregaCompleto = param;


    }


    /**
     * field for EnderecoEntregaAlternativoCompleto
     */


    protected java.lang.String localEnderecoEntregaAlternativoCompleto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnderecoEntregaAlternativoCompletoTracker = false;

    public boolean isEnderecoEntregaAlternativoCompletoSpecified() {
        return localEnderecoEntregaAlternativoCompletoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEnderecoEntregaAlternativoCompleto() {
        return localEnderecoEntregaAlternativoCompleto;
    }


    /**
     * Auto generated setter method
     * @param param EnderecoEntregaAlternativoCompleto
     */
    public void setEnderecoEntregaAlternativoCompleto(java.lang.String param) {
        localEnderecoEntregaAlternativoCompletoTracker = param != null;

        this.localEnderecoEntregaAlternativoCompleto = param;


    }


    /**
     * field for EnderecoEntregaAlternativo2Completo
     */


    protected java.lang.String localEnderecoEntregaAlternativo2Completo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnderecoEntregaAlternativo2CompletoTracker = false;

    public boolean isEnderecoEntregaAlternativo2CompletoSpecified() {
        return localEnderecoEntregaAlternativo2CompletoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEnderecoEntregaAlternativo2Completo() {
        return localEnderecoEntregaAlternativo2Completo;
    }


    /**
     * Auto generated setter method
     * @param param EnderecoEntregaAlternativo2Completo
     */
    public void setEnderecoEntregaAlternativo2Completo(java.lang.String param) {
        localEnderecoEntregaAlternativo2CompletoTracker = param != null;

        this.localEnderecoEntregaAlternativo2Completo = param;


    }


    /**
     * field for TelefoneEntrega
     */


    protected java.lang.String localTelefoneEntrega;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneEntregaTracker = false;

    public boolean isTelefoneEntregaSpecified() {
        return localTelefoneEntregaTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneEntrega() {
        return localTelefoneEntrega;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneEntrega
     */
    public void setTelefoneEntrega(java.lang.String param) {
        localTelefoneEntregaTracker = param != null;

        this.localTelefoneEntrega = param;


    }


    /**
     * field for TelefoneEntregaAlternativo
     */


    protected java.lang.String localTelefoneEntregaAlternativo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneEntregaAlternativoTracker = false;

    public boolean isTelefoneEntregaAlternativoSpecified() {
        return localTelefoneEntregaAlternativoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneEntregaAlternativo() {
        return localTelefoneEntregaAlternativo;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneEntregaAlternativo
     */
    public void setTelefoneEntregaAlternativo(java.lang.String param) {
        localTelefoneEntregaAlternativoTracker = param != null;

        this.localTelefoneEntregaAlternativo = param;


    }


    /**
     * field for TelefoneEntregaAlternativo2
     */


    protected java.lang.String localTelefoneEntregaAlternativo2;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneEntregaAlternativo2Tracker = false;

    public boolean isTelefoneEntregaAlternativo2Specified() {
        return localTelefoneEntregaAlternativo2Tracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefoneEntregaAlternativo2() {
        return localTelefoneEntregaAlternativo2;
    }


    /**
     * Auto generated setter method
     * @param param TelefoneEntregaAlternativo2
     */
    public void setTelefoneEntregaAlternativo2(java.lang.String param) {
        localTelefoneEntregaAlternativo2Tracker = param != null;

        this.localTelefoneEntregaAlternativo2 = param;


    }


    /**
     * field for QuantidadePedidos
     */


    protected int localQuantidadePedidos;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getQuantidadePedidos() {
        return localQuantidadePedidos;
    }


    /**
     * Auto generated setter method
     * @param param QuantidadePedidos
     */
    public void setQuantidadePedidos(int param) {

        this.localQuantidadePedidos = param;


    }


    /**
     * field for Papel
     */


    protected java.lang.String localPapel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPapelTracker = false;

    public boolean isPapelSpecified() {
        return localPapelTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPapel() {
        return localPapel;
    }


    /**
     * Auto generated setter method
     * @param param Papel
     */
    public void setPapel(java.lang.String param) {
        localPapelTracker = param != null;

        this.localPapel = param;


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


        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.geravd.com.br/Servicos/PessoaWebService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":RetornoObterInformacoesAdicionaisPessoa",
                    xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "RetornoObterInformacoesAdicionaisPessoa",
                    xmlWriter);
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
        if (localDocumentoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Documento", xmlWriter);


            if (localDocumento == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Documento cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localDocumento);

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
        if (localTelefoneComercialTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneComercial", xmlWriter);


            if (localTelefoneComercial == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneComercial cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneComercial);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneCelularTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneCelular", xmlWriter);


            if (localTelefoneCelular == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneCelular cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneCelular);

            }

            xmlWriter.writeEndElement();
        }
        if (localEnderecoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Endereco", xmlWriter);


            if (localEndereco == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Endereco cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEndereco);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "DataNascimento", xmlWriter);


        if (localDataNascimento == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("DataNascimento cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataNascimento));

        }

        xmlWriter.writeEndElement();
        if (localDocumentoPrincipalTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "DocumentoPrincipal", xmlWriter);


            if (localDocumentoPrincipal == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("DocumentoPrincipal cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localDocumentoPrincipal);

            }

            xmlWriter.writeEndElement();
        }
        if (localInformacaoExtraDocPrincipalTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "InformacaoExtraDocPrincipal", xmlWriter);


            if (localInformacaoExtraDocPrincipal == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("InformacaoExtraDocPrincipal cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localInformacaoExtraDocPrincipal);

            }

            xmlWriter.writeEndElement();
        }
        if (localDocumentoSecundarioTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "DocumentoSecundario", xmlWriter);


            if (localDocumentoSecundario == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("DocumentoSecundario cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localDocumentoSecundario);

            }

            xmlWriter.writeEndElement();
        }
        if (localInformacaoExtraDocSecundarioTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "InformacaoExtraDocSecundario", xmlWriter);


            if (localInformacaoExtraDocSecundario == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("InformacaoExtraDocSecundario cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localInformacaoExtraDocSecundario);

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
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "DataInicio", xmlWriter);


        if (localDataInicio == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("DataInicio cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataInicio));

        }

        xmlWriter.writeEndElement();
        if (localEnderecoResidencialCompletoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EnderecoResidencialCompleto", xmlWriter);


            if (localEnderecoResidencialCompleto == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EnderecoResidencialCompleto cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEnderecoResidencialCompleto);

            }

            xmlWriter.writeEndElement();
        }
        if (localEnderecoEntregaCompletoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EnderecoEntregaCompleto", xmlWriter);


            if (localEnderecoEntregaCompleto == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EnderecoEntregaCompleto cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEnderecoEntregaCompleto);

            }

            xmlWriter.writeEndElement();
        }
        if (localEnderecoEntregaAlternativoCompletoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EnderecoEntregaAlternativoCompleto", xmlWriter);


            if (localEnderecoEntregaAlternativoCompleto == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EnderecoEntregaAlternativoCompleto cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEnderecoEntregaAlternativoCompleto);

            }

            xmlWriter.writeEndElement();
        }
        if (localEnderecoEntregaAlternativo2CompletoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EnderecoEntregaAlternativo2Completo", xmlWriter);


            if (localEnderecoEntregaAlternativo2Completo == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EnderecoEntregaAlternativo2Completo cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEnderecoEntregaAlternativo2Completo);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneEntregaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneEntrega", xmlWriter);


            if (localTelefoneEntrega == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneEntrega cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneEntrega);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneEntregaAlternativoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneEntregaAlternativo", xmlWriter);


            if (localTelefoneEntregaAlternativo == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneEntregaAlternativo cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneEntregaAlternativo);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneEntregaAlternativo2Tracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelefoneEntregaAlternativo2", xmlWriter);


            if (localTelefoneEntregaAlternativo2 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelefoneEntregaAlternativo2 cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefoneEntregaAlternativo2);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "QuantidadePedidos", xmlWriter);

        if (localQuantidadePedidos == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("QuantidadePedidos cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantidadePedidos));
        }

        xmlWriter.writeEndElement();
        if (localPapelTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Papel", xmlWriter);


            if (localPapel == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Papel cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localPapel);

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


        attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
        attribList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoObterInformacoesAdicionaisPessoa"));
        if (localMensagemErroTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "MensagemErro"));

            if (localMensagemErro != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMensagemErro));
            } else {
                throw new org.apache.axis2.databinding.ADBException("MensagemErro cannot be null!!");
            }
        }
        if (localDocumentoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Documento"));

            if (localDocumento != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumento));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Documento cannot be null!!");
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
        if (localTelefoneComercialTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneComercial"));

            if (localTelefoneComercial != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneComercial));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneComercial cannot be null!!");
            }
        }
        if (localTelefoneCelularTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneCelular"));

            if (localTelefoneCelular != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneCelular));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneCelular cannot be null!!");
            }
        }
        if (localEnderecoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Endereco"));

            if (localEndereco != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndereco));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Endereco cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "DataNascimento"));

        if (localDataNascimento != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataNascimento));
        } else {
            throw new org.apache.axis2.databinding.ADBException("DataNascimento cannot be null!!");
        }
        if (localDocumentoPrincipalTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "DocumentoPrincipal"));

            if (localDocumentoPrincipal != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentoPrincipal));
            } else {
                throw new org.apache.axis2.databinding.ADBException("DocumentoPrincipal cannot be null!!");
            }
        }
        if (localInformacaoExtraDocPrincipalTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "InformacaoExtraDocPrincipal"));

            if (localInformacaoExtraDocPrincipal != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInformacaoExtraDocPrincipal));
            } else {
                throw new org.apache.axis2.databinding.ADBException("InformacaoExtraDocPrincipal cannot be null!!");
            }
        }
        if (localDocumentoSecundarioTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "DocumentoSecundario"));

            if (localDocumentoSecundario != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDocumentoSecundario));
            } else {
                throw new org.apache.axis2.databinding.ADBException("DocumentoSecundario cannot be null!!");
            }
        }
        if (localInformacaoExtraDocSecundarioTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "InformacaoExtraDocSecundario"));

            if (localInformacaoExtraDocSecundario != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInformacaoExtraDocSecundario));
            } else {
                throw new org.apache.axis2.databinding.ADBException("InformacaoExtraDocSecundario cannot be null!!");
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
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "DataInicio"));

        if (localDataInicio != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataInicio));
        } else {
            throw new org.apache.axis2.databinding.ADBException("DataInicio cannot be null!!");
        }
        if (localEnderecoResidencialCompletoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EnderecoResidencialCompleto"));

            if (localEnderecoResidencialCompleto != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnderecoResidencialCompleto));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EnderecoResidencialCompleto cannot be null!!");
            }
        }
        if (localEnderecoEntregaCompletoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EnderecoEntregaCompleto"));

            if (localEnderecoEntregaCompleto != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnderecoEntregaCompleto));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EnderecoEntregaCompleto cannot be null!!");
            }
        }
        if (localEnderecoEntregaAlternativoCompletoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EnderecoEntregaAlternativoCompleto"));

            if (localEnderecoEntregaAlternativoCompleto != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnderecoEntregaAlternativoCompleto));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EnderecoEntregaAlternativoCompleto cannot be null!!");
            }
        }
        if (localEnderecoEntregaAlternativo2CompletoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EnderecoEntregaAlternativo2Completo"));

            if (localEnderecoEntregaAlternativo2Completo != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnderecoEntregaAlternativo2Completo));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EnderecoEntregaAlternativo2Completo cannot be null!!");
            }
        }
        if (localTelefoneEntregaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneEntrega"));

            if (localTelefoneEntrega != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneEntrega));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneEntrega cannot be null!!");
            }
        }
        if (localTelefoneEntregaAlternativoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneEntregaAlternativo"));

            if (localTelefoneEntregaAlternativo != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneEntregaAlternativo));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneEntregaAlternativo cannot be null!!");
            }
        }
        if (localTelefoneEntregaAlternativo2Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelefoneEntregaAlternativo2"));

            if (localTelefoneEntregaAlternativo2 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefoneEntregaAlternativo2));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelefoneEntregaAlternativo2 cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "QuantidadePedidos"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQuantidadePedidos));
        if (localPapelTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Papel"));

            if (localPapel != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPapel));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Papel cannot be null!!");
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
        public static RetornoObterInformacoesAdicionaisPessoa parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RetornoObterInformacoesAdicionaisPessoa object =
                    new RetornoObterInformacoesAdicionaisPessoa();

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

                        if (!"RetornoObterInformacoesAdicionaisPessoa".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RetornoObterInformacoesAdicionaisPessoa) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }


                    }


                }


                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();


                reader.next();


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "MensagemErro").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setMensagemErro(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Documento").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDocumento(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneComercial").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneComercial(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneCelular").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneCelular(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Endereco").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEndereco(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DataNascimento").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDataNascimento(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DocumentoPrincipal").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDocumentoPrincipal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "InformacaoExtraDocPrincipal").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setInformacaoExtraDocPrincipal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DocumentoSecundario").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDocumentoSecundario(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "InformacaoExtraDocSecundario").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setInformacaoExtraDocSecundario(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DataInicio").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDataInicio(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EnderecoResidencialCompleto").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEnderecoResidencialCompleto(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EnderecoEntregaCompleto").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEnderecoEntregaCompleto(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EnderecoEntregaAlternativoCompleto").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEnderecoEntregaAlternativoCompleto(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EnderecoEntregaAlternativo2Completo").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEnderecoEntregaAlternativo2Completo(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneEntrega").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneEntrega(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneEntregaAlternativo").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneEntregaAlternativo(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelefoneEntregaAlternativo2").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefoneEntregaAlternativo2(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "QuantidadePedidos").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setQuantidadePedidos(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Papel").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setPapel(
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
           
