/**
 * RetornoEstruturasResponsavelPorEstrutura.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 *  RetornoEstruturasResponsavelPorEstrutura bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class RetornoEstruturasResponsavelPorEstrutura
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = RetornoEstruturasResponsavelPorEstrutura
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for CodigoEstrutura
     */


    protected int localCodigoEstrutura;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoEstrutura() {
        return localCodigoEstrutura;
    }


    /**
     * Auto generated setter method
     * @param param CodigoEstrutura
     */
    public void setCodigoEstrutura(int param) {

        this.localCodigoEstrutura = param;


    }


    /**
     * field for NomeEstrutura
     */


    protected java.lang.String localNomeEstrutura;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeEstruturaTracker = false;

    public boolean isNomeEstruturaSpecified() {
        return localNomeEstruturaTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeEstrutura() {
        return localNomeEstrutura;
    }


    /**
     * Auto generated setter method
     * @param param NomeEstrutura
     */
    public void setNomeEstrutura(java.lang.String param) {
        localNomeEstruturaTracker = param != null;

        this.localNomeEstrutura = param;


    }


    /**
     * field for CodigoEstruturaPai
     */


    protected int localCodigoEstruturaPai;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoEstruturaPai() {
        return localCodigoEstruturaPai;
    }


    /**
     * Auto generated setter method
     * @param param CodigoEstruturaPai
     */
    public void setCodigoEstruturaPai(int param) {

        this.localCodigoEstruturaPai = param;


    }


    /**
     * field for NomeEstruturaPai
     */


    protected java.lang.String localNomeEstruturaPai;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeEstruturaPaiTracker = false;

    public boolean isNomeEstruturaPaiSpecified() {
        return localNomeEstruturaPaiTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeEstruturaPai() {
        return localNomeEstruturaPai;
    }


    /**
     * Auto generated setter method
     * @param param NomeEstruturaPai
     */
    public void setNomeEstruturaPai(java.lang.String param) {
        localNomeEstruturaPaiTracker = param != null;

        this.localNomeEstruturaPai = param;


    }


    /**
     * field for CicloAtual
     */


    protected int localCicloAtual;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCicloAtual() {
        return localCicloAtual;
    }


    /**
     * Auto generated setter method
     * @param param CicloAtual
     */
    public void setCicloAtual(int param) {

        this.localCicloAtual = param;


    }


    /**
     * field for Revendedor
     * This was an Array!
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura[] localRevendedor;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRevendedorTracker = false;

    public boolean isRevendedorSpecified() {
        return localRevendedorTracker;
    }


    /**
     * Auto generated getter method
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura[]
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura[] getRevendedor() {
        return localRevendedor;
    }


    /**
     * validate the array for Revendedor
     */
    protected void validateRevendedor(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura[] param) {

    }


    /**
     * Auto generated setter method
     * @param param Revendedor
     */
    public void setRevendedor(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura[] param) {

        validateRevendedor(param);

        localRevendedorTracker = param != null;

        this.localRevendedor = param;
    }


    /**
     * Auto generated add method for the array for convenience
     * @param param bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura
     */
    public void addRevendedor(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura param) {
        if (localRevendedor == null) {
            localRevendedor = new bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura[]{};
        }


        //update the setting tracker
        localRevendedorTracker = true;


        java.util.List list =
                org.apache.axis2.databinding.utils.ConverterUtil.toList(localRevendedor);
        list.add(param);
        this.localRevendedor =
                (bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura[]) list.toArray(
                        new bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura[list.size()]);

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
                        namespacePrefix + ":RetornoEstruturasResponsavelPorEstrutura",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "RetornoEstruturasResponsavelPorEstrutura",
                        xmlWriter);
            }


        }

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoEstrutura", xmlWriter);

        if (localCodigoEstrutura == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoEstrutura cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoEstrutura));
        }

        xmlWriter.writeEndElement();
        if (localNomeEstruturaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "NomeEstrutura", xmlWriter);


            if (localNomeEstrutura == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("NomeEstrutura cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomeEstrutura);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoEstruturaPai", xmlWriter);

        if (localCodigoEstruturaPai == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoEstruturaPai cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoEstruturaPai));
        }

        xmlWriter.writeEndElement();
        if (localNomeEstruturaPaiTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "NomeEstruturaPai", xmlWriter);


            if (localNomeEstruturaPai == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("NomeEstruturaPai cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomeEstruturaPai);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CicloAtual", xmlWriter);

        if (localCicloAtual == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CicloAtual cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCicloAtual));
        }

        xmlWriter.writeEndElement();
        if (localRevendedorTracker) {
            if (localRevendedor != null) {
                for (int i = 0; i < localRevendedor.length; i++) {
                    if (localRevendedor[i] != null) {
                        localRevendedor[i].serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Revendedor"),
                                xmlWriter);
                    } else {

                        // we don't have to do any thing since minOccures is zero

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("Revendedor cannot be null!!");

            }
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


        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoEstrutura"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoEstrutura));
        if (localNomeEstruturaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomeEstrutura"));

            if (localNomeEstrutura != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomeEstrutura));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomeEstrutura cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoEstruturaPai"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoEstruturaPai));
        if (localNomeEstruturaPaiTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomeEstruturaPai"));

            if (localNomeEstruturaPai != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomeEstruturaPai));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomeEstruturaPai cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CicloAtual"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCicloAtual));
        if (localRevendedorTracker) {
            if (localRevendedor != null) {
                for (int i = 0; i < localRevendedor.length; i++) {

                    if (localRevendedor[i] != null) {
                        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                                "Revendedor"));
                        elementList.add(localRevendedor[i]);
                    } else {

                        // nothing to do

                    }

                }
            } else {

                throw new org.apache.axis2.databinding.ADBException("Revendedor cannot be null!!");

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
        public static RetornoEstruturasResponsavelPorEstrutura parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RetornoEstruturasResponsavelPorEstrutura object =
                    new RetornoEstruturasResponsavelPorEstrutura();

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

                        if (!"RetornoEstruturasResponsavelPorEstrutura".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RetornoEstruturasResponsavelPorEstrutura) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }


                    }


                }


                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();


                reader.next();

                java.util.ArrayList list6 = new java.util.ArrayList();


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoEstrutura").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoEstrutura(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomeEstrutura").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomeEstrutura(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoEstruturaPai").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoEstruturaPai(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomeEstruturaPai").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomeEstruturaPai(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CicloAtual").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCicloAtual(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Revendedor").equals(reader.getName())) {


                    // Process the array and step past its final element's end.
                    list6.add(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura.Factory.parse(reader));

                    //loop until we find a start element that is not part of this array
                    boolean loopDone6 = false;
                    while (!loopDone6) {
                        // We should be at the end element, but make sure
                        while (!reader.isEndElement())
                            reader.next();
                        // Step out of this element
                        reader.next();
                        // Step to next element event.
                        while (!reader.isStartElement() && !reader.isEndElement())
                            reader.next();
                        if (reader.isEndElement()) {
                            //two continuous end elements means we are exiting the xml structure
                            loopDone6 = true;
                        } else {
                            if (new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Revendedor").equals(reader.getName())) {
                                list6.add(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura.Factory.parse(reader));

                            } else {
                                loopDone6 = true;
                            }
                        }
                    }
                    // call the converter utility  to convert and set the array

                    object.setRevendedor((bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura[])
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                    bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoRevendedoresResponsavelPorEstrutura.class,
                                    list6));

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
           
