/**
 * ParametroPessoaReferenciaProfissional.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 *  ParametroPessoaReferenciaProfissional bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class ParametroPessoaReferenciaProfissional
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = ParametroPessoaReferenciaProfissional
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for RazaoSocial
     */


    protected java.lang.String localRazaoSocial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRazaoSocialTracker = false;

    public boolean isRazaoSocialSpecified() {
        return localRazaoSocialTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRazaoSocial() {
        return localRazaoSocial;
    }


    /**
     * Auto generated setter method
     * @param param RazaoSocial
     */
    public void setRazaoSocial(java.lang.String param) {
        localRazaoSocialTracker = param != null;

        this.localRazaoSocial = param;


    }


    /**
     * field for Ramo
     */


    protected int localRamo;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getRamo() {
        return localRamo;
    }


    /**
     * Auto generated setter method
     * @param param Ramo
     */
    public void setRamo(int param) {

        this.localRamo = param;


    }


    /**
     * field for FoneComercial
     */


    protected java.lang.String localFoneComercial;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFoneComercialTracker = false;

    public boolean isFoneComercialSpecified() {
        return localFoneComercialTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFoneComercial() {
        return localFoneComercial;
    }


    /**
     * Auto generated setter method
     * @param param FoneComercial
     */
    public void setFoneComercial(java.lang.String param) {
        localFoneComercialTracker = param != null;

        this.localFoneComercial = param;


    }


    /**
     * field for Ramal
     */


    protected java.lang.String localRamal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRamalTracker = false;

    public boolean isRamalSpecified() {
        return localRamalTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRamal() {
        return localRamal;
    }


    /**
     * Auto generated setter method
     * @param param Ramal
     */
    public void setRamal(java.lang.String param) {
        localRamalTracker = param != null;

        this.localRamal = param;


    }


    /**
     * field for Nome
     */


    protected java.lang.String localNome;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeTracker = false;

    public boolean isNomeSpecified() {
        return localNomeTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNome() {
        return localNome;
    }


    /**
     * Auto generated setter method
     * @param param Nome
     */
    public void setNome(java.lang.String param) {
        localNomeTracker = param != null;

        this.localNome = param;


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
                        namespacePrefix + ":ParametroPessoaReferenciaProfissional",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "ParametroPessoaReferenciaProfissional",
                        xmlWriter);
            }


        }
        if (localRazaoSocialTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "RazaoSocial", xmlWriter);


            if (localRazaoSocial == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("RazaoSocial cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localRazaoSocial);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "Ramo", xmlWriter);

        if (localRamo == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("Ramo cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRamo));
        }

        xmlWriter.writeEndElement();
        if (localFoneComercialTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "FoneComercial", xmlWriter);


            if (localFoneComercial == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("FoneComercial cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localFoneComercial);

            }

            xmlWriter.writeEndElement();
        }
        if (localRamalTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Ramal", xmlWriter);


            if (localRamal == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Ramal cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localRamal);

            }

            xmlWriter.writeEndElement();
        }
        if (localNomeTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Nome", xmlWriter);


            if (localNome == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Nome cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNome);

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

        if (localRazaoSocialTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "RazaoSocial"));

            if (localRazaoSocial != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRazaoSocial));
            } else {
                throw new org.apache.axis2.databinding.ADBException("RazaoSocial cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "Ramo"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRamo));
        if (localFoneComercialTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "FoneComercial"));

            if (localFoneComercial != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFoneComercial));
            } else {
                throw new org.apache.axis2.databinding.ADBException("FoneComercial cannot be null!!");
            }
        }
        if (localRamalTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Ramal"));

            if (localRamal != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRamal));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Ramal cannot be null!!");
            }
        }
        if (localNomeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Nome"));

            if (localNome != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNome));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Nome cannot be null!!");
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
        public static ParametroPessoaReferenciaProfissional parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ParametroPessoaReferenciaProfissional object =
                    new ParametroPessoaReferenciaProfissional();

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

                        if (!"ParametroPessoaReferenciaProfissional".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (ParametroPessoaReferenciaProfissional) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }


                    }


                }


                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();


                reader.next();


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "RazaoSocial").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setRazaoSocial(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Ramo").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setRamo(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "FoneComercial").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setFoneComercial(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Ramal").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setRamal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Nome").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNome(
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
           
