/**
 * Consultar_persona_scoring.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen;


/**
 *  Consultar_persona_scoring bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class Consultar_persona_scoring
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://tempuri.org/Enserbic_WS/Service1",
            "consultar_persona_scoring",
            "ns1");


    /**
     * field for Usuario
     */


    protected java.lang.String localUsuario;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUsuarioTracker = false;

    public boolean isUsuarioSpecified() {
        return localUsuarioTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUsuario() {
        return localUsuario;
    }


    /**
     * Auto generated setter method
     * @param param Usuario
     */
    public void setUsuario(java.lang.String param) {
        localUsuarioTracker = param != null;

        this.localUsuario = param;


    }


    /**
     * field for Contrasenia
     */


    protected java.lang.String localContrasenia;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localContraseniaTracker = false;

    public boolean isContraseniaSpecified() {
        return localContraseniaTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getContrasenia() {
        return localContrasenia;
    }


    /**
     * Auto generated setter method
     * @param param Contrasenia
     */
    public void setContrasenia(java.lang.String param) {
        localContraseniaTracker = param != null;

        this.localContrasenia = param;


    }


    /**
     * field for Xml
     */


    protected java.lang.String localXml;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localXmlTracker = false;

    public boolean isXmlSpecified() {
        return localXmlTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getXml() {
        return localXml;
    }


    /**
     * Auto generated setter method
     * @param param Xml
     */
    public void setXml(java.lang.String param) {
        localXmlTracker = param != null;

        this.localXml = param;


    }


    /**
     * field for Motivo_consultas
     */


    protected java.lang.String localMotivo_consultas;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMotivo_consultasTracker = false;

    public boolean isMotivo_consultasSpecified() {
        return localMotivo_consultasTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMotivo_consultas() {
        return localMotivo_consultas;
    }


    /**
     * Auto generated setter method
     * @param param Motivo_consultas
     */
    public void setMotivo_consultas(java.lang.String param) {
        localMotivo_consultasTracker = param != null;

        this.localMotivo_consultas = param;


    }


    /**
     * field for Tipo_persona
     */


    protected java.lang.String localTipo_persona;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTipo_personaTracker = false;

    public boolean isTipo_personaSpecified() {
        return localTipo_personaTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTipo_persona() {
        return localTipo_persona;
    }


    /**
     * Auto generated setter method
     * @param param Tipo_persona
     */
    public void setTipo_persona(java.lang.String param) {
        localTipo_personaTracker = param != null;

        this.localTipo_persona = param;


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


            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://tempuri.org/Enserbic_WS/Service1");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":consultar_persona_scoring",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "consultar_persona_scoring",
                        xmlWriter);
            }


        }
        if (localUsuarioTracker) {
            namespace = "http://tempuri.org/Enserbic_WS/Service1";
            writeStartElement(null, namespace, "usuario", xmlWriter);


            if (localUsuario == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("usuario cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localUsuario);

            }

            xmlWriter.writeEndElement();
        }
        if (localContraseniaTracker) {
            namespace = "http://tempuri.org/Enserbic_WS/Service1";
            writeStartElement(null, namespace, "contrasenia", xmlWriter);


            if (localContrasenia == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("contrasenia cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localContrasenia);

            }

            xmlWriter.writeEndElement();
        }
        if (localXmlTracker) {
            namespace = "http://tempuri.org/Enserbic_WS/Service1";
            writeStartElement(null, namespace, "xml", xmlWriter);


            if (localXml == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("xml cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localXml);

            }

            xmlWriter.writeEndElement();
        }
        if (localMotivo_consultasTracker) {
            namespace = "http://tempuri.org/Enserbic_WS/Service1";
            writeStartElement(null, namespace, "motivo_consultas", xmlWriter);


            if (localMotivo_consultas == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("motivo_consultas cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localMotivo_consultas);

            }

            xmlWriter.writeEndElement();
        }
        if (localTipo_personaTracker) {
            namespace = "http://tempuri.org/Enserbic_WS/Service1";
            writeStartElement(null, namespace, "tipo_persona", xmlWriter);


            if (localTipo_persona == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("tipo_persona cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTipo_persona);

            }

            xmlWriter.writeEndElement();
        }
        xmlWriter.writeEndElement();


    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://tempuri.org/Enserbic_WS/Service1")) {
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

        if (localUsuarioTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                    "usuario"));

            if (localUsuario != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUsuario));
            } else {
                throw new org.apache.axis2.databinding.ADBException("usuario cannot be null!!");
            }
        }
        if (localContraseniaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                    "contrasenia"));

            if (localContrasenia != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localContrasenia));
            } else {
                throw new org.apache.axis2.databinding.ADBException("contrasenia cannot be null!!");
            }
        }
        if (localXmlTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                    "xml"));

            if (localXml != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localXml));
            } else {
                throw new org.apache.axis2.databinding.ADBException("xml cannot be null!!");
            }
        }
        if (localMotivo_consultasTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                    "motivo_consultas"));

            if (localMotivo_consultas != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMotivo_consultas));
            } else {
                throw new org.apache.axis2.databinding.ADBException("motivo_consultas cannot be null!!");
            }
        }
        if (localTipo_personaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1",
                    "tipo_persona"));

            if (localTipo_persona != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTipo_persona));
            } else {
                throw new org.apache.axis2.databinding.ADBException("tipo_persona cannot be null!!");
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
        public static Consultar_persona_scoring parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            Consultar_persona_scoring object =
                    new Consultar_persona_scoring();

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

                        if (!"consultar_persona_scoring".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (Consultar_persona_scoring) bo.com.mc4.onboarding.integrations.infocenter.wsdl.gen.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }


                    }


                }


                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();


                reader.next();


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "usuario").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setUsuario(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "contrasenia").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setContrasenia(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "xml").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setXml(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "motivo_consultas").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setMotivo_consultas(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://tempuri.org/Enserbic_WS/Service1", "tipo_persona").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTipo_persona(
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
           
