/**
 * RetornoObterControleIndicacao.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 *  RetornoObterControleIndicacao bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class RetornoObterControleIndicacao extends bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoWebService
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = RetornoObterControleIndicacao
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for CodigoPessoaIndicada
     */


    protected int localCodigoPessoaIndicada;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoPessoaIndicada() {
        return localCodigoPessoaIndicada;
    }


    /**
     * Auto generated setter method
     * @param param CodigoPessoaIndicada
     */
    public void setCodigoPessoaIndicada(int param) {

        this.localCodigoPessoaIndicada = param;


    }


    /**
     * field for SituacaoPessoaIndicada
     */


    protected org.apache.axis2.databinding.types.UnsignedByte localSituacaoPessoaIndicada;


    /**
     * Auto generated getter method
     * @return org.apache.axis2.databinding.types.UnsignedByte
     */
    public org.apache.axis2.databinding.types.UnsignedByte getSituacaoPessoaIndicada() {
        return localSituacaoPessoaIndicada;
    }


    /**
     * Auto generated setter method
     * @param param SituacaoPessoaIndicada
     */
    public void setSituacaoPessoaIndicada(org.apache.axis2.databinding.types.UnsignedByte param) {

        this.localSituacaoPessoaIndicada = param;


    }


    /**
     * field for NomePessoaIndicada
     */


    protected java.lang.String localNomePessoaIndicada;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomePessoaIndicadaTracker = false;

    public boolean isNomePessoaIndicadaSpecified() {
        return localNomePessoaIndicadaTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomePessoaIndicada() {
        return localNomePessoaIndicada;
    }


    /**
     * Auto generated setter method
     * @param param NomePessoaIndicada
     */
    public void setNomePessoaIndicada(java.lang.String param) {
        localNomePessoaIndicadaTracker = param != null;

        this.localNomePessoaIndicada = param;


    }


    /**
     * field for TelResidencialPessoaIndicada
     */


    protected java.lang.String localTelResidencialPessoaIndicada;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelResidencialPessoaIndicadaTracker = false;

    public boolean isTelResidencialPessoaIndicadaSpecified() {
        return localTelResidencialPessoaIndicadaTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelResidencialPessoaIndicada() {
        return localTelResidencialPessoaIndicada;
    }


    /**
     * Auto generated setter method
     * @param param TelResidencialPessoaIndicada
     */
    public void setTelResidencialPessoaIndicada(java.lang.String param) {
        localTelResidencialPessoaIndicadaTracker = param != null;

        this.localTelResidencialPessoaIndicada = param;


    }


    /**
     * field for TelComercialPessoaIndicada
     */


    protected java.lang.String localTelComercialPessoaIndicada;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelComercialPessoaIndicadaTracker = false;

    public boolean isTelComercialPessoaIndicadaSpecified() {
        return localTelComercialPessoaIndicadaTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelComercialPessoaIndicada() {
        return localTelComercialPessoaIndicada;
    }


    /**
     * Auto generated setter method
     * @param param TelComercialPessoaIndicada
     */
    public void setTelComercialPessoaIndicada(java.lang.String param) {
        localTelComercialPessoaIndicadaTracker = param != null;

        this.localTelComercialPessoaIndicada = param;


    }


    /**
     * field for TelCelularPessoaIndicada
     */


    protected java.lang.String localTelCelularPessoaIndicada;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelCelularPessoaIndicadaTracker = false;

    public boolean isTelCelularPessoaIndicadaSpecified() {
        return localTelCelularPessoaIndicadaTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelCelularPessoaIndicada() {
        return localTelCelularPessoaIndicada;
    }


    /**
     * Auto generated setter method
     * @param param TelCelularPessoaIndicada
     */
    public void setTelCelularPessoaIndicada(java.lang.String param) {
        localTelCelularPessoaIndicadaTracker = param != null;

        this.localTelCelularPessoaIndicada = param;


    }


    /**
     * field for EnderecoPessoaIndicada
     */


    protected java.lang.String localEnderecoPessoaIndicada;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnderecoPessoaIndicadaTracker = false;

    public boolean isEnderecoPessoaIndicadaSpecified() {
        return localEnderecoPessoaIndicadaTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEnderecoPessoaIndicada() {
        return localEnderecoPessoaIndicada;
    }


    /**
     * Auto generated setter method
     * @param param EnderecoPessoaIndicada
     */
    public void setEnderecoPessoaIndicada(java.lang.String param) {
        localEnderecoPessoaIndicadaTracker = param != null;

        this.localEnderecoPessoaIndicada = param;


    }


    /**
     * field for DataConvite
     */


    protected java.util.Calendar localDataConvite;


    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataConvite() {
        return localDataConvite;
    }


    /**
     * Auto generated setter method
     * @param param DataConvite
     */
    public void setDataConvite(java.util.Calendar param) {

        this.localDataConvite = param;


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
                    namespacePrefix + ":RetornoObterControleIndicacao",
                    xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "RetornoObterControleIndicacao",
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
        writeStartElement(null, namespace, "CodigoPessoaIndicada", xmlWriter);

        if (localCodigoPessoaIndicada == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoPessoaIndicada cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPessoaIndicada));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "SituacaoPessoaIndicada", xmlWriter);


        if (localSituacaoPessoaIndicada == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("SituacaoPessoaIndicada cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSituacaoPessoaIndicada));

        }

        xmlWriter.writeEndElement();
        if (localNomePessoaIndicadaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "NomePessoaIndicada", xmlWriter);


            if (localNomePessoaIndicada == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("NomePessoaIndicada cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomePessoaIndicada);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelResidencialPessoaIndicadaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelResidencialPessoaIndicada", xmlWriter);


            if (localTelResidencialPessoaIndicada == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelResidencialPessoaIndicada cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelResidencialPessoaIndicada);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelComercialPessoaIndicadaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelComercialPessoaIndicada", xmlWriter);


            if (localTelComercialPessoaIndicada == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelComercialPessoaIndicada cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelComercialPessoaIndicada);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelCelularPessoaIndicadaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "TelCelularPessoaIndicada", xmlWriter);


            if (localTelCelularPessoaIndicada == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("TelCelularPessoaIndicada cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelCelularPessoaIndicada);

            }

            xmlWriter.writeEndElement();
        }
        if (localEnderecoPessoaIndicadaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "EnderecoPessoaIndicada", xmlWriter);


            if (localEnderecoPessoaIndicada == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("EnderecoPessoaIndicada cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEnderecoPessoaIndicada);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "DataConvite", xmlWriter);


        if (localDataConvite == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("DataConvite cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataConvite));

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
        attribList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoObterControleIndicacao"));
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
                "CodigoPessoaIndicada"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPessoaIndicada));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "SituacaoPessoaIndicada"));

        if (localSituacaoPessoaIndicada != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSituacaoPessoaIndicada));
        } else {
            throw new org.apache.axis2.databinding.ADBException("SituacaoPessoaIndicada cannot be null!!");
        }
        if (localNomePessoaIndicadaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomePessoaIndicada"));

            if (localNomePessoaIndicada != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomePessoaIndicada));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomePessoaIndicada cannot be null!!");
            }
        }
        if (localTelResidencialPessoaIndicadaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelResidencialPessoaIndicada"));

            if (localTelResidencialPessoaIndicada != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelResidencialPessoaIndicada));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelResidencialPessoaIndicada cannot be null!!");
            }
        }
        if (localTelComercialPessoaIndicadaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelComercialPessoaIndicada"));

            if (localTelComercialPessoaIndicada != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelComercialPessoaIndicada));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelComercialPessoaIndicada cannot be null!!");
            }
        }
        if (localTelCelularPessoaIndicadaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "TelCelularPessoaIndicada"));

            if (localTelCelularPessoaIndicada != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelCelularPessoaIndicada));
            } else {
                throw new org.apache.axis2.databinding.ADBException("TelCelularPessoaIndicada cannot be null!!");
            }
        }
        if (localEnderecoPessoaIndicadaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "EnderecoPessoaIndicada"));

            if (localEnderecoPessoaIndicada != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnderecoPessoaIndicada));
            } else {
                throw new org.apache.axis2.databinding.ADBException("EnderecoPessoaIndicada cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "DataConvite"));

        if (localDataConvite != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataConvite));
        } else {
            throw new org.apache.axis2.databinding.ADBException("DataConvite cannot be null!!");
        }

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
        public static RetornoObterControleIndicacao parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RetornoObterControleIndicacao object =
                    new RetornoObterControleIndicacao();

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

                        if (!"RetornoObterControleIndicacao".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RetornoObterControleIndicacao) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoPessoaIndicada").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoPessoaIndicada(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "SituacaoPessoaIndicada").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSituacaoPessoaIndicada(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedByte(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomePessoaIndicada").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomePessoaIndicada(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelResidencialPessoaIndicada").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelResidencialPessoaIndicada(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelComercialPessoaIndicada").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelComercialPessoaIndicada(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TelCelularPessoaIndicada").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelCelularPessoaIndicada(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EnderecoPessoaIndicada").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEnderecoPessoaIndicada(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DataConvite").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDataConvite(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

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
           
