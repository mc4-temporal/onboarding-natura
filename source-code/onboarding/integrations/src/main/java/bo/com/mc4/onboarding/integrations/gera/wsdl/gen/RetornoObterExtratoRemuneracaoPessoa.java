/**
 * RetornoObterExtratoRemuneracaoPessoa.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 *  RetornoObterExtratoRemuneracaoPessoa bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class RetornoObterExtratoRemuneracaoPessoa extends bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoWebService
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = RetornoObterExtratoRemuneracaoPessoa
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for CodigoPessoa
     */


    protected int localCodigoPessoa;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoPessoa() {
        return localCodigoPessoa;
    }


    /**
     * Auto generated setter method
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
     * field for CodigoPedido
     */


    protected int localCodigoPedido;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoPedido() {
        return localCodigoPedido;
    }


    /**
     * Auto generated setter method
     * @param param CodigoPedido
     */
    public void setCodigoPedido(int param) {

        this.localCodigoPedido = param;


    }


    /**
     * field for CampanhaBonificacao
     */


    protected int localCampanhaBonificacao;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCampanhaBonificacao() {
        return localCampanhaBonificacao;
    }


    /**
     * Auto generated setter method
     * @param param CampanhaBonificacao
     */
    public void setCampanhaBonificacao(int param) {

        this.localCampanhaBonificacao = param;


    }


    /**
     * field for CodigoSituacaoExtrato
     */


    protected org.apache.axis2.databinding.types.UnsignedByte localCodigoSituacaoExtrato;


    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedByte
     */
    public org.apache.axis2.databinding.types.UnsignedByte getCodigoSituacaoExtrato() {
        return localCodigoSituacaoExtrato;
    }


    /**
     * Auto generated setter method
     * @param param CodigoSituacaoExtrato
     */
    public void setCodigoSituacaoExtrato(org.apache.axis2.databinding.types.UnsignedByte param) {

        this.localCodigoSituacaoExtrato = param;


    }


    /**
     * field for SituacaoExtrato
     */


    protected java.lang.String localSituacaoExtrato;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSituacaoExtratoTracker = false;

    public boolean isSituacaoExtratoSpecified() {
        return localSituacaoExtratoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSituacaoExtrato() {
        return localSituacaoExtrato;
    }


    /**
     * Auto generated setter method
     * @param param SituacaoExtrato
     */
    public void setSituacaoExtrato(java.lang.String param) {
        localSituacaoExtratoTracker = param != null;

        this.localSituacaoExtrato = param;


    }


    /**
     * field for ValorBonificacao
     */


    protected java.math.BigDecimal localValorBonificacao;


    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValorBonificacao() {
        return localValorBonificacao;
    }


    /**
     * Auto generated setter method
     * @param param ValorBonificacao
     */
    public void setValorBonificacao(java.math.BigDecimal param) {

        this.localValorBonificacao = param;


    }


    /**
     * field for ValorDevolucao
     */


    protected java.math.BigDecimal localValorDevolucao;


    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValorDevolucao() {
        return localValorDevolucao;
    }


    /**
     * Auto generated setter method
     * @param param ValorDevolucao
     */
    public void setValorDevolucao(java.math.BigDecimal param) {

        this.localValorDevolucao = param;


    }


    /**
     * field for CodigoTipoBonificacao
     */


    protected int localCodigoTipoBonificacao;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoTipoBonificacao() {
        return localCodigoTipoBonificacao;
    }


    /**
     * Auto generated setter method
     * @param param CodigoTipoBonificacao
     */
    public void setCodigoTipoBonificacao(int param) {

        this.localCodigoTipoBonificacao = param;


    }


    /**
     * field for TipoBonificacao
     */


    protected java.lang.String localTipoBonificacao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTipoBonificacaoTracker = false;

    public boolean isTipoBonificacaoSpecified() {
        return localTipoBonificacaoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTipoBonificacao() {
        return localTipoBonificacao;
    }


    /**
     * Auto generated setter method
     * @param param TipoBonificacao
     */
    public void setTipoBonificacao(java.lang.String param) {
        localTipoBonificacaoTracker = param != null;

        this.localTipoBonificacao = param;


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
                    namespacePrefix + ":RetornoObterExtratoRemuneracaoPessoa",
                    xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "RetornoObterExtratoRemuneracaoPessoa",
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
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoPedido", xmlWriter);

        if (localCodigoPedido == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoPedido cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPedido));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CampanhaBonificacao", xmlWriter);

        if (localCampanhaBonificacao == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CampanhaBonificacao cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCampanhaBonificacao));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoSituacaoExtrato", xmlWriter);


        if (localCodigoSituacaoExtrato == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("CodigoSituacaoExtrato cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoSituacaoExtrato));

        }

        xmlWriter.writeEndElement();
        if (localSituacaoExtratoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "SituacaoExtrato", xmlWriter);


            if (localSituacaoExtrato == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("SituacaoExtrato cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localSituacaoExtrato);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "ValorBonificacao", xmlWriter);


        if (localValorBonificacao == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("ValorBonificacao cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValorBonificacao));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "ValorDevolucao", xmlWriter);


        if (localValorDevolucao == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("ValorDevolucao cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValorDevolucao));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoTipoBonificacao", xmlWriter);

        if (localCodigoTipoBonificacao == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoTipoBonificacao cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoTipoBonificacao));
        }

        xmlWriter.writeEndElement();
        if (localTipoBonificacaoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TipoBonificacao", xmlWriter);


            if (localTipoBonificacao == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TipoBonificacao cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTipoBonificacao);

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
        attribList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoObterExtratoRemuneracaoPessoa"));
        if (localMensagemErroTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "MensagemErro"));

            if (localMensagemErro != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMensagemErro));
            } else {
                throw new org.apache.axis2.databinding.ADBException("MensagemErro cannot be null!!");
            }
        }
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
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoPedido"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPedido));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CampanhaBonificacao"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCampanhaBonificacao));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoSituacaoExtrato"));

        if (localCodigoSituacaoExtrato != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoSituacaoExtrato));
        } else {
            throw new org.apache.axis2.databinding.ADBException("CodigoSituacaoExtrato cannot be null!!");
        }
        if (localSituacaoExtratoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "SituacaoExtrato"));

            if (localSituacaoExtrato != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSituacaoExtrato));
            } else {
                throw new org.apache.axis2.databinding.ADBException("SituacaoExtrato cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "ValorBonificacao"));

        if (localValorBonificacao != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValorBonificacao));
        } else {
            throw new org.apache.axis2.databinding.ADBException("ValorBonificacao cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "ValorDevolucao"));

        if (localValorDevolucao != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValorDevolucao));
        } else {
            throw new org.apache.axis2.databinding.ADBException("ValorDevolucao cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoTipoBonificacao"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoTipoBonificacao));
        if (localTipoBonificacaoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TipoBonificacao"));

            if (localTipoBonificacao != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipoBonificacao));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TipoBonificacao cannot be null!!");
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
        public static RetornoObterExtratoRemuneracaoPessoa parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RetornoObterExtratoRemuneracaoPessoa object =
                    new RetornoObterExtratoRemuneracaoPessoa();

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

                        if (!"RetornoObterExtratoRemuneracaoPessoa".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RetornoObterExtratoRemuneracaoPessoa) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoPedido").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoPedido(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CampanhaBonificacao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCampanhaBonificacao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoSituacaoExtrato").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoSituacaoExtrato(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedByte(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "SituacaoExtrato").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSituacaoExtrato(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ValorBonificacao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setValorBonificacao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ValorDevolucao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setValorDevolucao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoTipoBonificacao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoTipoBonificacao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TipoBonificacao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTipoBonificacao(
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
           
