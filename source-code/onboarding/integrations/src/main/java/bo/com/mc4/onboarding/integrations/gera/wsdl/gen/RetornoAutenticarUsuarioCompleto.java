/**
 * RetornoAutenticarUsuarioCompleto.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 *  RetornoAutenticarUsuarioCompleto bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class RetornoAutenticarUsuarioCompleto extends bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoAutenticarUsuario
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = RetornoAutenticarUsuarioCompleto
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for LoginOK
     */


    protected boolean localLoginOK;


    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getLoginOK() {
        return localLoginOK;
    }


    /**
     * Auto generated setter method
     * @param param LoginOK
     */
    public void setLoginOK(boolean param) {

        this.localLoginOK = param;


    }


    /**
     * field for PrazoExpiracao
     */


    protected java.util.Calendar localPrazoExpiracao;


    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getPrazoExpiracao() {
        return localPrazoExpiracao;
    }


    /**
     * Auto generated setter method
     * @param param PrazoExpiracao
     */
    public void setPrazoExpiracao(java.util.Calendar param) {

        this.localPrazoExpiracao = param;


    }


    /**
     * field for TipoPessoa
     */


    protected org.apache.axis2.databinding.types.UnsignedByte localTipoPessoa;


    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedByte
     */
    public org.apache.axis2.databinding.types.UnsignedByte getTipoPessoa() {
        return localTipoPessoa;
    }


    /**
     * Auto generated setter method
     * @param param TipoPessoa
     */
    public void setTipoPessoa(org.apache.axis2.databinding.types.UnsignedByte param) {

        this.localTipoPessoa = param;


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
     * @return java.lang.String
     */
    public java.lang.String getNomePessoa() {
        return localNomePessoa;
    }


    /**
     * Auto generated setter method
     * @param param NomePessoa
     */
    public void setNomePessoa(java.lang.String param) {
        localNomePessoaTracker = param != null;

        this.localNomePessoa = param;


    }


    /**
     * field for Apelido
     */


    protected java.lang.String localApelido;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localApelidoTracker = false;

    public boolean isApelidoSpecified() {
        return localApelidoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getApelido() {
        return localApelido;
    }


    /**
     * Auto generated setter method
     * @param param Apelido
     */
    public void setApelido(java.lang.String param) {
        localApelidoTracker = param != null;

        this.localApelido = param;


    }


    /**
     * field for Email
     */


    protected java.lang.String localEmail;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailTracker = false;

    public boolean isEmailSpecified() {
        return localEmailTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEmail() {
        return localEmail;
    }


    /**
     * Auto generated setter method
     * @param param Email
     */
    public void setEmail(java.lang.String param) {
        localEmailTracker = param != null;

        this.localEmail = param;


    }


    /**
     * field for CodigosFuncoes
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt localCodigosFuncoes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCodigosFuncoesTracker = false;

    public boolean isCodigosFuncoesSpecified() {
        return localCodigosFuncoesTracker;
    }


    /**
     * Auto generated getter method
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt getCodigosFuncoes() {
        return localCodigosFuncoes;
    }


    /**
     * Auto generated setter method
     * @param param CodigosFuncoes
     */
    public void setCodigosFuncoes(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt param) {
        localCodigosFuncoesTracker = param != null;

        this.localCodigosFuncoes = param;


    }


    /**
     * field for NomesFuncoes
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString localNomesFuncoes;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomesFuncoesTracker = false;

    public boolean isNomesFuncoesSpecified() {
        return localNomesFuncoesTracker;
    }


    /**
     * Auto generated getter method
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString getNomesFuncoes() {
        return localNomesFuncoes;
    }


    /**
     * Auto generated setter method
     * @param param NomesFuncoes
     */
    public void setNomesFuncoes(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString param) {
        localNomesFuncoesTracker = param != null;

        this.localNomesFuncoes = param;


    }


    /**
     * field for NomesPapeisPorFuncao
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfAnyType localNomesPapeisPorFuncao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomesPapeisPorFuncaoTracker = false;

    public boolean isNomesPapeisPorFuncaoSpecified() {
        return localNomesPapeisPorFuncaoTracker;
    }


    /**
     * Auto generated getter method
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfAnyType
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfAnyType getNomesPapeisPorFuncao() {
        return localNomesPapeisPorFuncao;
    }


    /**
     * Auto generated setter method
     * @param param NomesPapeisPorFuncao
     */
    public void setNomesPapeisPorFuncao(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfAnyType param) {
        localNomesPapeisPorFuncaoTracker = param != null;

        this.localNomesPapeisPorFuncao = param;


    }


    /**
     * field for CampanhaVigentePorFuncao
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString localCampanhaVigentePorFuncao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCampanhaVigentePorFuncaoTracker = false;

    public boolean isCampanhaVigentePorFuncaoSpecified() {
        return localCampanhaVigentePorFuncaoTracker;
    }


    /**
     * Auto generated getter method
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString getCampanhaVigentePorFuncao() {
        return localCampanhaVigentePorFuncao;
    }


    /**
     * Auto generated setter method
     * @param param CampanhaVigentePorFuncao
     */
    public void setCampanhaVigentePorFuncao(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString param) {
        localCampanhaVigentePorFuncaoTracker = param != null;

        this.localCampanhaVigentePorFuncao = param;


    }


    /**
     * field for SubCampanhaVigentePorFuncao
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString localSubCampanhaVigentePorFuncao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubCampanhaVigentePorFuncaoTracker = false;

    public boolean isSubCampanhaVigentePorFuncaoSpecified() {
        return localSubCampanhaVigentePorFuncaoTracker;
    }


    /**
     * Auto generated getter method
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString getSubCampanhaVigentePorFuncao() {
        return localSubCampanhaVigentePorFuncao;
    }


    /**
     * Auto generated setter method
     * @param param SubCampanhaVigentePorFuncao
     */
    public void setSubCampanhaVigentePorFuncao(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString param) {
        localSubCampanhaVigentePorFuncaoTracker = param != null;

        this.localSubCampanhaVigentePorFuncao = param;


    }


    /**
     * field for SituacaoPorFuncao
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString localSituacaoPorFuncao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSituacaoPorFuncaoTracker = false;

    public boolean isSituacaoPorFuncaoSpecified() {
        return localSituacaoPorFuncaoTracker;
    }


    /**
     * Auto generated getter method
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString getSituacaoPorFuncao() {
        return localSituacaoPorFuncao;
    }


    /**
     * Auto generated setter method
     * @param param SituacaoPorFuncao
     */
    public void setSituacaoPorFuncao(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString param) {
        localSituacaoPorFuncaoTracker = param != null;

        this.localSituacaoPorFuncao = param;


    }


    /**
     * field for CampanhasSemPedidoPorFuncao
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt localCampanhasSemPedidoPorFuncao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCampanhasSemPedidoPorFuncaoTracker = false;

    public boolean isCampanhasSemPedidoPorFuncaoSpecified() {
        return localCampanhasSemPedidoPorFuncaoTracker;
    }


    /**
     * Auto generated getter method
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt getCampanhasSemPedidoPorFuncao() {
        return localCampanhasSemPedidoPorFuncao;
    }


    /**
     * Auto generated setter method
     * @param param CampanhasSemPedidoPorFuncao
     */
    public void setCampanhasSemPedidoPorFuncao(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt param) {
        localCampanhasSemPedidoPorFuncaoTracker = param != null;

        this.localCampanhasSemPedidoPorFuncao = param;


    }


    /**
     * field for EstruturaPorFuncao
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfAnyType localEstruturaPorFuncao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEstruturaPorFuncaoTracker = false;

    public boolean isEstruturaPorFuncaoSpecified() {
        return localEstruturaPorFuncaoTracker;
    }


    /**
     * Auto generated getter method
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfAnyType
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfAnyType getEstruturaPorFuncao() {
        return localEstruturaPorFuncao;
    }


    /**
     * Auto generated setter method
     * @param param EstruturaPorFuncao
     */
    public void setEstruturaPorFuncao(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfAnyType param) {
        localEstruturaPorFuncaoTracker = param != null;

        this.localEstruturaPorFuncao = param;


    }


    /**
     * field for TempoDeCasa
     */


    protected java.lang.String localTempoDeCasa;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTempoDeCasaTracker = false;

    public boolean isTempoDeCasaSpecified() {
        return localTempoDeCasaTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTempoDeCasa() {
        return localTempoDeCasa;
    }


    /**
     * Auto generated setter method
     * @param param TempoDeCasa
     */
    public void setTempoDeCasa(java.lang.String param) {
        localTempoDeCasaTracker = param != null;

        this.localTempoDeCasa = param;


    }


    /**
     * field for TempoDeCasaEmCiclo
     */


    protected int localTempoDeCasaEmCiclo;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getTempoDeCasaEmCiclo() {
        return localTempoDeCasaEmCiclo;
    }


    /**
     * Auto generated setter method
     * @param param TempoDeCasaEmCiclo
     */
    public void setTempoDeCasaEmCiclo(int param) {

        this.localTempoDeCasaEmCiclo = param;


    }


    /**
     * field for CicloEmAtividade
     */


    protected int localCicloEmAtividade;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCicloEmAtividade() {
        return localCicloEmAtividade;
    }


    /**
     * Auto generated setter method
     * @param param CicloEmAtividade
     */
    public void setCicloEmAtividade(int param) {

        this.localCicloEmAtividade = param;


    }


    /**
     * field for DataCadastro
     */


    protected java.util.Calendar localDataCadastro;


    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataCadastro() {
        return localDataCadastro;
    }


    /**
     * Auto generated setter method
     * @param param DataCadastro
     */
    public void setDataCadastro(java.util.Calendar param) {

        this.localDataCadastro = param;


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
                    namespacePrefix + ":RetornoAutenticarUsuarioCompleto",
                    xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "RetornoAutenticarUsuarioCompleto",
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
        if (localChaveAcessoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "ChaveAcesso", xmlWriter);


            if (localChaveAcesso == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ChaveAcesso cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localChaveAcesso);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "TrocarSenha", xmlWriter);

        if (false) {

            throw new org.apache.axis2.databinding.ADBException("TrocarSenha cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrocarSenha));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoPessoa", xmlWriter);

        if (localCodigoPessoa == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoPessoa cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPessoa));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "DataHoraUltimoAcesso", xmlWriter);


        if (localDataHoraUltimoAcesso == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("DataHoraUltimoAcesso cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataHoraUltimoAcesso));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "LoginOK", xmlWriter);

        if (false) {

            throw new org.apache.axis2.databinding.ADBException("LoginOK cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoginOK));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "PrazoExpiracao", xmlWriter);


        if (localPrazoExpiracao == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("PrazoExpiracao cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrazoExpiracao));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "TipoPessoa", xmlWriter);


        if (localTipoPessoa == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("TipoPessoa cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipoPessoa));

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
        if (localApelidoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Apelido", xmlWriter);


            if (localApelido == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Apelido cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localApelido);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Email", xmlWriter);


            if (localEmail == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Email cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmail);

            }

            xmlWriter.writeEndElement();
        }
        if (localCodigosFuncoesTracker) {
            if (localCodigosFuncoes == null) {
                throw new org.apache.axis2.databinding.ADBException("CodigosFuncoes cannot be null!!");
            }
            localCodigosFuncoes.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigosFuncoes"),
                    xmlWriter);
        }
        if (localNomesFuncoesTracker) {
            if (localNomesFuncoes == null) {
                throw new org.apache.axis2.databinding.ADBException("NomesFuncoes cannot be null!!");
            }
            localNomesFuncoes.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomesFuncoes"),
                    xmlWriter);
        }
        if (localNomesPapeisPorFuncaoTracker) {
            if (localNomesPapeisPorFuncao == null) {
                throw new org.apache.axis2.databinding.ADBException("NomesPapeisPorFuncao cannot be null!!");
            }
            localNomesPapeisPorFuncao.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomesPapeisPorFuncao"),
                    xmlWriter);
        }
        if (localCampanhaVigentePorFuncaoTracker) {
            if (localCampanhaVigentePorFuncao == null) {
                throw new org.apache.axis2.databinding.ADBException("CampanhaVigentePorFuncao cannot be null!!");
            }
            localCampanhaVigentePorFuncao.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CampanhaVigentePorFuncao"),
                    xmlWriter);
        }
        if (localSubCampanhaVigentePorFuncaoTracker) {
            if (localSubCampanhaVigentePorFuncao == null) {
                throw new org.apache.axis2.databinding.ADBException("SubCampanhaVigentePorFuncao cannot be null!!");
            }
            localSubCampanhaVigentePorFuncao.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "SubCampanhaVigentePorFuncao"),
                    xmlWriter);
        }
        if (localSituacaoPorFuncaoTracker) {
            if (localSituacaoPorFuncao == null) {
                throw new org.apache.axis2.databinding.ADBException("SituacaoPorFuncao cannot be null!!");
            }
            localSituacaoPorFuncao.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "SituacaoPorFuncao"),
                    xmlWriter);
        }
        if (localCampanhasSemPedidoPorFuncaoTracker) {
            if (localCampanhasSemPedidoPorFuncao == null) {
                throw new org.apache.axis2.databinding.ADBException("CampanhasSemPedidoPorFuncao cannot be null!!");
            }
            localCampanhasSemPedidoPorFuncao.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CampanhasSemPedidoPorFuncao"),
                    xmlWriter);
        }
        if (localEstruturaPorFuncaoTracker) {
            if (localEstruturaPorFuncao == null) {
                throw new org.apache.axis2.databinding.ADBException("EstruturaPorFuncao cannot be null!!");
            }
            localEstruturaPorFuncao.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EstruturaPorFuncao"),
                    xmlWriter);
        }
        if (localTempoDeCasaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TempoDeCasa", xmlWriter);


            if (localTempoDeCasa == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TempoDeCasa cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTempoDeCasa);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "TempoDeCasaEmCiclo", xmlWriter);

        if (localTempoDeCasaEmCiclo == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("TempoDeCasaEmCiclo cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTempoDeCasaEmCiclo));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CicloEmAtividade", xmlWriter);

        if (localCicloEmAtividade == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CicloEmAtividade cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCicloEmAtividade));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "DataCadastro", xmlWriter);


        if (localDataCadastro == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("DataCadastro cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataCadastro));

        }

        xmlWriter.writeEndElement();

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
        attribList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoAutenticarUsuarioCompleto"));
        if (localMensagemErroTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "MensagemErro"));

            if (localMensagemErro != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMensagemErro));
            } else {
                throw new org.apache.axis2.databinding.ADBException("MensagemErro cannot be null!!");
            }
        }
        if (localChaveAcessoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "ChaveAcesso"));

            if (localChaveAcesso != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChaveAcesso));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ChaveAcesso cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "TrocarSenha"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTrocarSenha));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoPessoa"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPessoa));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "DataHoraUltimoAcesso"));

        if (localDataHoraUltimoAcesso != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataHoraUltimoAcesso));
        } else {
            throw new org.apache.axis2.databinding.ADBException("DataHoraUltimoAcesso cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "LoginOK"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLoginOK));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "PrazoExpiracao"));

        if (localPrazoExpiracao != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPrazoExpiracao));
        } else {
            throw new org.apache.axis2.databinding.ADBException("PrazoExpiracao cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "TipoPessoa"));

        if (localTipoPessoa != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipoPessoa));
        } else {
            throw new org.apache.axis2.databinding.ADBException("TipoPessoa cannot be null!!");
        }
        if (localNomePessoaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomePessoa"));

            if (localNomePessoa != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomePessoa));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomePessoa cannot be null!!");
            }
        }
        if (localApelidoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Apelido"));

            if (localApelido != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localApelido));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Apelido cannot be null!!");
            }
        }
        if (localEmailTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Email"));

            if (localEmail != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmail));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Email cannot be null!!");
            }
        }
        if (localCodigosFuncoesTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "CodigosFuncoes"));


            if (localCodigosFuncoes == null) {
                throw new org.apache.axis2.databinding.ADBException("CodigosFuncoes cannot be null!!");
            }
            elementList.add(localCodigosFuncoes);
        }
        if (localNomesFuncoesTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomesFuncoes"));


            if (localNomesFuncoes == null) {
                throw new org.apache.axis2.databinding.ADBException("NomesFuncoes cannot be null!!");
            }
            elementList.add(localNomesFuncoes);
        }
        if (localNomesPapeisPorFuncaoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomesPapeisPorFuncao"));


            if (localNomesPapeisPorFuncao == null) {
                throw new org.apache.axis2.databinding.ADBException("NomesPapeisPorFuncao cannot be null!!");
            }
            elementList.add(localNomesPapeisPorFuncao);
        }
        if (localCampanhaVigentePorFuncaoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "CampanhaVigentePorFuncao"));


            if (localCampanhaVigentePorFuncao == null) {
                throw new org.apache.axis2.databinding.ADBException("CampanhaVigentePorFuncao cannot be null!!");
            }
            elementList.add(localCampanhaVigentePorFuncao);
        }
        if (localSubCampanhaVigentePorFuncaoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "SubCampanhaVigentePorFuncao"));


            if (localSubCampanhaVigentePorFuncao == null) {
                throw new org.apache.axis2.databinding.ADBException("SubCampanhaVigentePorFuncao cannot be null!!");
            }
            elementList.add(localSubCampanhaVigentePorFuncao);
        }
        if (localSituacaoPorFuncaoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "SituacaoPorFuncao"));


            if (localSituacaoPorFuncao == null) {
                throw new org.apache.axis2.databinding.ADBException("SituacaoPorFuncao cannot be null!!");
            }
            elementList.add(localSituacaoPorFuncao);
        }
        if (localCampanhasSemPedidoPorFuncaoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "CampanhasSemPedidoPorFuncao"));


            if (localCampanhasSemPedidoPorFuncao == null) {
                throw new org.apache.axis2.databinding.ADBException("CampanhasSemPedidoPorFuncao cannot be null!!");
            }
            elementList.add(localCampanhasSemPedidoPorFuncao);
        }
        if (localEstruturaPorFuncaoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EstruturaPorFuncao"));


            if (localEstruturaPorFuncao == null) {
                throw new org.apache.axis2.databinding.ADBException("EstruturaPorFuncao cannot be null!!");
            }
            elementList.add(localEstruturaPorFuncao);
        }
        if (localTempoDeCasaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TempoDeCasa"));

            if (localTempoDeCasa != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTempoDeCasa));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TempoDeCasa cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "TempoDeCasaEmCiclo"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTempoDeCasaEmCiclo));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CicloEmAtividade"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCicloEmAtividade));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "DataCadastro"));

        if (localDataCadastro != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataCadastro));
        } else {
            throw new org.apache.axis2.databinding.ADBException("DataCadastro cannot be null!!");
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
        public static RetornoAutenticarUsuarioCompleto parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RetornoAutenticarUsuarioCompleto object =
                    new RetornoAutenticarUsuarioCompleto();

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

                        if (!"RetornoAutenticarUsuarioCompleto".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RetornoAutenticarUsuarioCompleto) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ChaveAcesso").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setChaveAcesso(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TrocarSenha").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTrocarSenha(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DataHoraUltimoAcesso").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDataHoraUltimoAcesso(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "LoginOK").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLoginOK(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "PrazoExpiracao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setPrazoExpiracao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TipoPessoa").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTipoPessoa(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedByte(content));

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Apelido").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setApelido(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Email").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmail(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigosFuncoes").equals(reader.getName())) {

                    object.setCodigosFuncoes(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomesFuncoes").equals(reader.getName())) {

                    object.setNomesFuncoes(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomesPapeisPorFuncao").equals(reader.getName())) {

                    object.setNomesPapeisPorFuncao(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfAnyType.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CampanhaVigentePorFuncao").equals(reader.getName())) {

                    object.setCampanhaVigentePorFuncao(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "SubCampanhaVigentePorFuncao").equals(reader.getName())) {

                    object.setSubCampanhaVigentePorFuncao(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "SituacaoPorFuncao").equals(reader.getName())) {

                    object.setSituacaoPorFuncao(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfString.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CampanhasSemPedidoPorFuncao").equals(reader.getName())) {

                    object.setCampanhasSemPedidoPorFuncao(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfInt.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EstruturaPorFuncao").equals(reader.getName())) {

                    object.setEstruturaPorFuncao(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfAnyType.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TempoDeCasa").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTempoDeCasa(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TempoDeCasaEmCiclo").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTempoDeCasaEmCiclo(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CicloEmAtividade").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCicloEmAtividade(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DataCadastro").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDataCadastro(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
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
           
