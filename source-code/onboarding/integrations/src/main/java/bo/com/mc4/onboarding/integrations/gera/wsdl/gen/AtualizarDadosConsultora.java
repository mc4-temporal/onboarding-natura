/**
 * AtualizarDadosConsultora.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 * AtualizarDadosConsultora bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class AtualizarDadosConsultora
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.geravd.com.br/Servicos/PessoaWebService",
            "AtualizarDadosConsultora",
            "ns1");


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
     * field for TipoEndereco
     */


    protected int localTipoEndereco;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getTipoEndereco() {
        return localTipoEndereco;
    }


    /**
     * Auto generated setter method
     *
     * @param param TipoEndereco
     */
    public void setTipoEndereco(int param) {

        this.localTipoEndereco = param;


    }


    /**
     * field for CodigoRegiao
     */


    protected int localCodigoRegiao;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCodigoRegiao() {
        return localCodigoRegiao;
    }


    /**
     * Auto generated setter method
     *
     * @param param CodigoRegiao
     */
    public void setCodigoRegiao(int param) {

        this.localCodigoRegiao = param;


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
     *
     * @return java.lang.String
     */
    public java.lang.String getNumero() {
        return localNumero;
    }


    /**
     * Auto generated setter method
     *
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
     *
     * @return java.lang.String
     */
    public java.lang.String getCodigoPostal() {
        return localCodigoPostal;
    }


    /**
     * Auto generated setter method
     *
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
     *
     * @return java.lang.String
     */
    public java.lang.String getComplemento() {
        return localComplemento;
    }


    /**
     * Auto generated setter method
     *
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
     *
     * @return java.lang.String
     */
    public java.lang.String getReferencia() {
        return localReferencia;
    }


    /**
     * Auto generated setter method
     *
     * @param param Referencia
     */
    public void setReferencia(java.lang.String param) {
        localReferenciaTracker = param != null;

        this.localReferencia = param;


    }


    /**
     * field for TelResidencial
     */


    protected java.lang.String localTelResidencial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelResidencialTracker = false;

    public boolean isTelResidencialSpecified() {
        return localTelResidencialTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTelResidencial() {
        return localTelResidencial;
    }


    /**
     * Auto generated setter method
     *
     * @param param TelResidencial
     */
    public void setTelResidencial(java.lang.String param) {
        localTelResidencialTracker = param != null;

        this.localTelResidencial = param;


    }


    /**
     * field for TelMovel
     */


    protected java.lang.String localTelMovel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelMovelTracker = false;

    public boolean isTelMovelSpecified() {
        return localTelMovelTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTelMovel() {
        return localTelMovel;
    }


    /**
     * Auto generated setter method
     *
     * @param param TelMovel
     */
    public void setTelMovel(java.lang.String param) {
        localTelMovelTracker = param != null;

        this.localTelMovel = param;


    }


    /**
     * field for TelRecado
     */


    protected java.lang.String localTelRecado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelRecadoTracker = false;

    public boolean isTelRecadoSpecified() {
        return localTelRecadoTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getTelRecado() {
        return localTelRecado;
    }


    /**
     * Auto generated setter method
     *
     * @param param TelRecado
     */
    public void setTelRecado(java.lang.String param) {
        localTelRecadoTracker = param != null;

        this.localTelRecado = param;


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
     *
     * @return java.lang.String
     */
    public java.lang.String getFalarCom() {
        return localFalarCom;
    }


    /**
     * Auto generated setter method
     *
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
     *
     * @return java.lang.String
     */
    public java.lang.String getEmailPessoal() {
        return localEmailPessoal;
    }


    /**
     * Auto generated setter method
     *
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
     *
     * @return java.lang.String
     */
    public java.lang.String getEmailAlternativo() {
        return localEmailAlternativo;
    }


    /**
     * Auto generated setter method
     *
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
     * field for PermiteDivulgarDados
     */


    protected org.apache.axis2.databinding.types.UnsignedByte localPermiteDivulgarDados;


    /**
     * Auto generated getter method
     *
     * @return org.apache.axis2.databinding.types.UnsignedByte
     */
    public org.apache.axis2.databinding.types.UnsignedByte getPermiteDivulgarDados() {
        return localPermiteDivulgarDados;
    }


    /**
     * Auto generated setter method
     *
     * @param param PermiteDivulgarDados
     */
    public void setPermiteDivulgarDados(org.apache.axis2.databinding.types.UnsignedByte param) {

        this.localPermiteDivulgarDados = param;


    }


    /**
     * field for FormatoEnvioFatura
     */


    protected org.apache.axis2.databinding.types.UnsignedByte localFormatoEnvioFatura;


    /**
     * Auto generated getter method
     *
     * @return org.apache.axis2.databinding.types.UnsignedByte
     */
    public org.apache.axis2.databinding.types.UnsignedByte getFormatoEnvioFatura() {
        return localFormatoEnvioFatura;
    }


    /**
     * Auto generated setter method
     *
     * @param param FormatoEnvioFatura
     */
    public void setFormatoEnvioFatura(org.apache.axis2.databinding.types.UnsignedByte param) {

        this.localFormatoEnvioFatura = param;


    }


    /**
     * field for FormatoEnvioExtratoPedido
     */


    protected org.apache.axis2.databinding.types.UnsignedByte localFormatoEnvioExtratoPedido;


    /**
     * Auto generated getter method
     *
     * @return org.apache.axis2.databinding.types.UnsignedByte
     */
    public org.apache.axis2.databinding.types.UnsignedByte getFormatoEnvioExtratoPedido() {
        return localFormatoEnvioExtratoPedido;
    }


    /**
     * Auto generated setter method
     *
     * @param param FormatoEnvioExtratoPedido
     */
    public void setFormatoEnvioExtratoPedido(org.apache.axis2.databinding.types.UnsignedByte param) {

        this.localFormatoEnvioExtratoPedido = param;


    }


    /**
     * field for FormatoEnvioBoleto
     */


    protected org.apache.axis2.databinding.types.UnsignedByte localFormatoEnvioBoleto;


    /**
     * Auto generated getter method
     *
     * @return org.apache.axis2.databinding.types.UnsignedByte
     */
    public org.apache.axis2.databinding.types.UnsignedByte getFormatoEnvioBoleto() {
        return localFormatoEnvioBoleto;
    }


    /**
     * Auto generated setter method
     *
     * @param param FormatoEnvioBoleto
     */
    public void setFormatoEnvioBoleto(org.apache.axis2.databinding.types.UnsignedByte param) {

        this.localFormatoEnvioBoleto = param;


    }


    /**
     * field for Login
     */


    protected java.lang.String localLogin;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLoginTracker = false;

    public boolean isLoginSpecified() {
        return localLoginTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLogin() {
        return localLogin;
    }


    /**
     * Auto generated setter method
     *
     * @param param Login
     */
    public void setLogin(java.lang.String param) {
        localLoginTracker = param != null;

        this.localLogin = param;


    }


    /**
     * field for ChaveAcesso
     */


    protected java.lang.String localChaveAcesso;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localChaveAcessoTracker = false;

    public boolean isChaveAcessoSpecified() {
        return localChaveAcessoTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getChaveAcesso() {
        return localChaveAcesso;
    }


    /**
     * Auto generated setter method
     *
     * @param param ChaveAcesso
     */
    public void setChaveAcesso(java.lang.String param) {
        localChaveAcessoTracker = param != null;

        this.localChaveAcesso = param;


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
                new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
        return factory.createOMElement(dataSource, MY_QNAME);

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
                        namespacePrefix + ":AtualizarDadosConsultora",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "AtualizarDadosConsultora",
                        xmlWriter);
            }


        }

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "codigoPessoa", xmlWriter);

        if (localCodigoPessoa == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("codigoPessoa cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPessoa));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "tipoEndereco", xmlWriter);

        if (localTipoEndereco == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("tipoEndereco cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipoEndereco));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "codigoRegiao", xmlWriter);

        if (localCodigoRegiao == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("codigoRegiao cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRegiao));
        }

        xmlWriter.writeEndElement();
        if (localNumeroTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "numero", xmlWriter);


            if (localNumero == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("numero cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNumero);

            }

            xmlWriter.writeEndElement();
        }
        if (localCodigoPostalTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "codigoPostal", xmlWriter);


            if (localCodigoPostal == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("codigoPostal cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCodigoPostal);

            }

            xmlWriter.writeEndElement();
        }
        if (localComplementoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "complemento", xmlWriter);


            if (localComplemento == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("complemento cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localComplemento);

            }

            xmlWriter.writeEndElement();
        }
        if (localReferenciaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "referencia", xmlWriter);


            if (localReferencia == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("referencia cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localReferencia);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelResidencialTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "telResidencial", xmlWriter);


            if (localTelResidencial == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("telResidencial cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelResidencial);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelMovelTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "telMovel", xmlWriter);


            if (localTelMovel == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("telMovel cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelMovel);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelRecadoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "telRecado", xmlWriter);


            if (localTelRecado == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("telRecado cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelRecado);

            }

            xmlWriter.writeEndElement();
        }
        if (localFalarComTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "falarCom", xmlWriter);


            if (localFalarCom == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("falarCom cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localFalarCom);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailPessoalTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "emailPessoal", xmlWriter);


            if (localEmailPessoal == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("emailPessoal cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailPessoal);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailAlternativoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "emailAlternativo", xmlWriter);


            if (localEmailAlternativo == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("emailAlternativo cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailAlternativo);

            }

            xmlWriter.writeEndElement();
        }
        if (localLinkBlogTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "linkBlog", xmlWriter);


            if (localLinkBlog == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("linkBlog cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLinkBlog);

            }

            xmlWriter.writeEndElement();
        }
        if (localLinkOrkutTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "linkOrkut", xmlWriter);


            if (localLinkOrkut == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("linkOrkut cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLinkOrkut);

            }

            xmlWriter.writeEndElement();
        }
        if (localLinkFacebookTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "linkFacebook", xmlWriter);


            if (localLinkFacebook == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("linkFacebook cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLinkFacebook);

            }

            xmlWriter.writeEndElement();
        }
        if (localLinkTwitterTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "linkTwitter", xmlWriter);


            if (localLinkTwitter == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("linkTwitter cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLinkTwitter);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailMSNTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "emailMSN", xmlWriter);


            if (localEmailMSN == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("emailMSN cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailMSN);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "permiteDivulgarDados", xmlWriter);


        if (localPermiteDivulgarDados == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("permiteDivulgarDados cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPermiteDivulgarDados));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "formatoEnvioFatura", xmlWriter);


        if (localFormatoEnvioFatura == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("formatoEnvioFatura cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFormatoEnvioFatura));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "formatoEnvioExtratoPedido", xmlWriter);


        if (localFormatoEnvioExtratoPedido == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("formatoEnvioExtratoPedido cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFormatoEnvioExtratoPedido));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "formatoEnvioBoleto", xmlWriter);


        if (localFormatoEnvioBoleto == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("formatoEnvioBoleto cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFormatoEnvioBoleto));

        }

        xmlWriter.writeEndElement();
        if (localLoginTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "login", xmlWriter);


            if (localLogin == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("login cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLogin);

            }

            xmlWriter.writeEndElement();
        }
        if (localChaveAcessoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "chaveAcesso", xmlWriter);


            if (localChaveAcesso == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("chaveAcesso cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localChaveAcesso);

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
                "codigoPessoa"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPessoa));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "tipoEndereco"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipoEndereco));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "codigoRegiao"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoRegiao));
        if (localNumeroTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "numero"));

            if (localNumero != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumero));
            } else {
                throw new org.apache.axis2.databinding.ADBException("numero cannot be null!!");
            }
        }
        if (localCodigoPostalTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "codigoPostal"));

            if (localCodigoPostal != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPostal));
            } else {
                throw new org.apache.axis2.databinding.ADBException("codigoPostal cannot be null!!");
            }
        }
        if (localComplementoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "complemento"));

            if (localComplemento != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComplemento));
            } else {
                throw new org.apache.axis2.databinding.ADBException("complemento cannot be null!!");
            }
        }
        if (localReferenciaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "referencia"));

            if (localReferencia != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReferencia));
            } else {
                throw new org.apache.axis2.databinding.ADBException("referencia cannot be null!!");
            }
        }
        if (localTelResidencialTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "telResidencial"));

            if (localTelResidencial != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelResidencial));
            } else {
                throw new org.apache.axis2.databinding.ADBException("telResidencial cannot be null!!");
            }
        }
        if (localTelMovelTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "telMovel"));

            if (localTelMovel != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelMovel));
            } else {
                throw new org.apache.axis2.databinding.ADBException("telMovel cannot be null!!");
            }
        }
        if (localTelRecadoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "telRecado"));

            if (localTelRecado != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelRecado));
            } else {
                throw new org.apache.axis2.databinding.ADBException("telRecado cannot be null!!");
            }
        }
        if (localFalarComTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "falarCom"));

            if (localFalarCom != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFalarCom));
            } else {
                throw new org.apache.axis2.databinding.ADBException("falarCom cannot be null!!");
            }
        }
        if (localEmailPessoalTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "emailPessoal"));

            if (localEmailPessoal != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailPessoal));
            } else {
                throw new org.apache.axis2.databinding.ADBException("emailPessoal cannot be null!!");
            }
        }
        if (localEmailAlternativoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "emailAlternativo"));

            if (localEmailAlternativo != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailAlternativo));
            } else {
                throw new org.apache.axis2.databinding.ADBException("emailAlternativo cannot be null!!");
            }
        }
        if (localLinkBlogTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "linkBlog"));

            if (localLinkBlog != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkBlog));
            } else {
                throw new org.apache.axis2.databinding.ADBException("linkBlog cannot be null!!");
            }
        }
        if (localLinkOrkutTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "linkOrkut"));

            if (localLinkOrkut != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkOrkut));
            } else {
                throw new org.apache.axis2.databinding.ADBException("linkOrkut cannot be null!!");
            }
        }
        if (localLinkFacebookTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "linkFacebook"));

            if (localLinkFacebook != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkFacebook));
            } else {
                throw new org.apache.axis2.databinding.ADBException("linkFacebook cannot be null!!");
            }
        }
        if (localLinkTwitterTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "linkTwitter"));

            if (localLinkTwitter != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLinkTwitter));
            } else {
                throw new org.apache.axis2.databinding.ADBException("linkTwitter cannot be null!!");
            }
        }
        if (localEmailMSNTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "emailMSN"));

            if (localEmailMSN != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailMSN));
            } else {
                throw new org.apache.axis2.databinding.ADBException("emailMSN cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "permiteDivulgarDados"));

        if (localPermiteDivulgarDados != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPermiteDivulgarDados));
        } else {
            throw new org.apache.axis2.databinding.ADBException("permiteDivulgarDados cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "formatoEnvioFatura"));

        if (localFormatoEnvioFatura != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFormatoEnvioFatura));
        } else {
            throw new org.apache.axis2.databinding.ADBException("formatoEnvioFatura cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "formatoEnvioExtratoPedido"));

        if (localFormatoEnvioExtratoPedido != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFormatoEnvioExtratoPedido));
        } else {
            throw new org.apache.axis2.databinding.ADBException("formatoEnvioExtratoPedido cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "formatoEnvioBoleto"));

        if (localFormatoEnvioBoleto != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFormatoEnvioBoleto));
        } else {
            throw new org.apache.axis2.databinding.ADBException("formatoEnvioBoleto cannot be null!!");
        }
        if (localLoginTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "login"));

            if (localLogin != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogin));
            } else {
                throw new org.apache.axis2.databinding.ADBException("login cannot be null!!");
            }
        }
        if (localChaveAcessoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "chaveAcesso"));

            if (localChaveAcesso != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChaveAcesso));
            } else {
                throw new org.apache.axis2.databinding.ADBException("chaveAcesso cannot be null!!");
            }
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
        public static AtualizarDadosConsultora parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AtualizarDadosConsultora object =
                    new AtualizarDadosConsultora();

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

                        if (!"AtualizarDadosConsultora".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (AtualizarDadosConsultora) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }


                    }


                }


                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();


                reader.next();


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "codigoPessoa").equals(reader.getName())) {

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "tipoEndereco").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTipoEndereco(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "codigoRegiao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoRegiao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "numero").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNumero(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "codigoPostal").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoPostal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "complemento").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setComplemento(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "referencia").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setReferencia(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "telResidencial").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelResidencial(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "telMovel").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelMovel(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "telRecado").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelRecado(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "falarCom").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setFalarCom(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "emailPessoal").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailPessoal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "emailAlternativo").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailAlternativo(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "linkBlog").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLinkBlog(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "linkOrkut").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLinkOrkut(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "linkFacebook").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLinkFacebook(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "linkTwitter").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLinkTwitter(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "emailMSN").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailMSN(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "permiteDivulgarDados").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setPermiteDivulgarDados(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedByte(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "formatoEnvioFatura").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setFormatoEnvioFatura(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedByte(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "formatoEnvioExtratoPedido").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setFormatoEnvioExtratoPedido(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedByte(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "formatoEnvioBoleto").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setFormatoEnvioBoleto(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedByte(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "login").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLogin(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "chaveAcesso").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setChaveAcesso(
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
           
