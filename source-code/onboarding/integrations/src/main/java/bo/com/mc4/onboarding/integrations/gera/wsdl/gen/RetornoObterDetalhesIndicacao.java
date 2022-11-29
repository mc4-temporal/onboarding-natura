/**
 * RetornoObterDetalhesIndicacao.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 *  RetornoObterDetalhesIndicacao bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class RetornoObterDetalhesIndicacao extends bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoWebService
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = RetornoObterDetalhesIndicacao
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for DataSituacaoEmAnalise
     */


    protected java.lang.String localDataSituacaoEmAnalise;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDataSituacaoEmAnaliseTracker = false;

    public boolean isDataSituacaoEmAnaliseSpecified() {
        return localDataSituacaoEmAnaliseTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDataSituacaoEmAnalise() {
        return localDataSituacaoEmAnalise;
    }


    /**
     * Auto generated setter method
     * @param param DataSituacaoEmAnalise
     */
    public void setDataSituacaoEmAnalise(java.lang.String param) {
        localDataSituacaoEmAnaliseTracker = param != null;

        this.localDataSituacaoEmAnalise = param;


    }


    /**
     * field for DataSituacaoCadastrada
     */


    protected java.lang.String localDataSituacaoCadastrada;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDataSituacaoCadastradaTracker = false;

    public boolean isDataSituacaoCadastradaSpecified() {
        return localDataSituacaoCadastradaTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDataSituacaoCadastrada() {
        return localDataSituacaoCadastrada;
    }


    /**
     * Auto generated setter method
     * @param param DataSituacaoCadastrada
     */
    public void setDataSituacaoCadastrada(java.lang.String param) {
        localDataSituacaoCadastradaTracker = param != null;

        this.localDataSituacaoCadastrada = param;


    }


    /**
     * field for DataSituacaoCancelado
     */


    protected java.lang.String localDataSituacaoCancelado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDataSituacaoCanceladoTracker = false;

    public boolean isDataSituacaoCanceladoSpecified() {
        return localDataSituacaoCanceladoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDataSituacaoCancelado() {
        return localDataSituacaoCancelado;
    }


    /**
     * Auto generated setter method
     * @param param DataSituacaoCancelado
     */
    public void setDataSituacaoCancelado(java.lang.String param) {
        localDataSituacaoCanceladoTracker = param != null;

        this.localDataSituacaoCancelado = param;


    }


    /**
     * field for DataSituacaoEfetivado
     */


    protected java.lang.String localDataSituacaoEfetivado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDataSituacaoEfetivadoTracker = false;

    public boolean isDataSituacaoEfetivadoSpecified() {
        return localDataSituacaoEfetivadoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDataSituacaoEfetivado() {
        return localDataSituacaoEfetivado;
    }


    /**
     * Auto generated setter method
     * @param param DataSituacaoEfetivado
     */
    public void setDataSituacaoEfetivado(java.lang.String param) {
        localDataSituacaoEfetivadoTracker = param != null;

        this.localDataSituacaoEfetivado = param;


    }


    /**
     * field for DataSituacaoCessado
     */


    protected java.lang.String localDataSituacaoCessado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDataSituacaoCessadoTracker = false;

    public boolean isDataSituacaoCessadoSpecified() {
        return localDataSituacaoCessadoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDataSituacaoCessado() {
        return localDataSituacaoCessado;
    }


    /**
     * Auto generated setter method
     * @param param DataSituacaoCessado
     */
    public void setDataSituacaoCessado(java.lang.String param) {
        localDataSituacaoCessadoTracker = param != null;

        this.localDataSituacaoCessado = param;


    }


    /**
     * field for Pedidos
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfArrayOfString localPedidos;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPedidosTracker = false;

    public boolean isPedidosSpecified() {
        return localPedidosTracker;
    }


    /**
     * Auto generated getter method
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfArrayOfString
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfArrayOfString getPedidos() {
        return localPedidos;
    }


    /**
     * Auto generated setter method
     * @param param Pedidos
     */
    public void setPedidos(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfArrayOfString param) {
        localPedidosTracker = param != null;

        this.localPedidos = param;


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
                    namespacePrefix + ":RetornoObterDetalhesIndicacao",
                    xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "RetornoObterDetalhesIndicacao",
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
        if (localDataSituacaoEmAnaliseTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "DataSituacaoEmAnalise", xmlWriter);


            if (localDataSituacaoEmAnalise == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("DataSituacaoEmAnalise cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localDataSituacaoEmAnalise);

            }

            xmlWriter.writeEndElement();
        }
        if (localDataSituacaoCadastradaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "DataSituacaoCadastrada", xmlWriter);


            if (localDataSituacaoCadastrada == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("DataSituacaoCadastrada cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localDataSituacaoCadastrada);

            }

            xmlWriter.writeEndElement();
        }
        if (localDataSituacaoCanceladoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "DataSituacaoCancelado", xmlWriter);


            if (localDataSituacaoCancelado == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("DataSituacaoCancelado cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localDataSituacaoCancelado);

            }

            xmlWriter.writeEndElement();
        }
        if (localDataSituacaoEfetivadoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "DataSituacaoEfetivado", xmlWriter);


            if (localDataSituacaoEfetivado == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("DataSituacaoEfetivado cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localDataSituacaoEfetivado);

            }

            xmlWriter.writeEndElement();
        }
        if (localDataSituacaoCessadoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "DataSituacaoCessado", xmlWriter);


            if (localDataSituacaoCessado == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("DataSituacaoCessado cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localDataSituacaoCessado);

            }

            xmlWriter.writeEndElement();
        }
        if (localPedidosTracker) {
            if (localPedidos == null) {
                throw new org.apache.axis2.databinding.ADBException("Pedidos cannot be null!!");
            }
            localPedidos.serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Pedidos"),
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
        attribList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoObterDetalhesIndicacao"));
        if (localMensagemErroTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "MensagemErro"));

            if (localMensagemErro != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMensagemErro));
            } else {
                throw new org.apache.axis2.databinding.ADBException("MensagemErro cannot be null!!");
            }
        }
        if (localDataSituacaoEmAnaliseTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "DataSituacaoEmAnalise"));

            if (localDataSituacaoEmAnalise != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataSituacaoEmAnalise));
            } else {
                throw new org.apache.axis2.databinding.ADBException("DataSituacaoEmAnalise cannot be null!!");
            }
        }
        if (localDataSituacaoCadastradaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "DataSituacaoCadastrada"));

            if (localDataSituacaoCadastrada != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataSituacaoCadastrada));
            } else {
                throw new org.apache.axis2.databinding.ADBException("DataSituacaoCadastrada cannot be null!!");
            }
        }
        if (localDataSituacaoCanceladoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "DataSituacaoCancelado"));

            if (localDataSituacaoCancelado != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataSituacaoCancelado));
            } else {
                throw new org.apache.axis2.databinding.ADBException("DataSituacaoCancelado cannot be null!!");
            }
        }
        if (localDataSituacaoEfetivadoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "DataSituacaoEfetivado"));

            if (localDataSituacaoEfetivado != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataSituacaoEfetivado));
            } else {
                throw new org.apache.axis2.databinding.ADBException("DataSituacaoEfetivado cannot be null!!");
            }
        }
        if (localDataSituacaoCessadoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "DataSituacaoCessado"));

            if (localDataSituacaoCessado != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataSituacaoCessado));
            } else {
                throw new org.apache.axis2.databinding.ADBException("DataSituacaoCessado cannot be null!!");
            }
        }
        if (localPedidosTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Pedidos"));


            if (localPedidos == null) {
                throw new org.apache.axis2.databinding.ADBException("Pedidos cannot be null!!");
            }
            elementList.add(localPedidos);
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
        public static RetornoObterDetalhesIndicacao parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RetornoObterDetalhesIndicacao object =
                    new RetornoObterDetalhesIndicacao();

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

                        if (!"RetornoObterDetalhesIndicacao".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RetornoObterDetalhesIndicacao) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DataSituacaoEmAnalise").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDataSituacaoEmAnalise(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DataSituacaoCadastrada").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDataSituacaoCadastrada(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DataSituacaoCancelado").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDataSituacaoCancelado(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DataSituacaoEfetivado").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDataSituacaoEfetivado(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DataSituacaoCessado").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDataSituacaoCessado(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Pedidos").equals(reader.getName())) {

                    object.setPedidos(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ArrayOfArrayOfString.Factory.parse(reader));

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
           
