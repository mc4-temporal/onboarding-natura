/**
 * ArrayOfRetornoManterControleIndicacao2.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 * ArrayOfRetornoManterControleIndicacao2 bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class ArrayOfRetornoManterControleIndicacao2
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = ArrayOfRetornoManterControleIndicacao2
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for RetornoManterControleIndicacao2
     * This was an Array!
     */


    protected bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2[] localRetornoManterControleIndicacao2;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRetornoManterControleIndicacao2Tracker = false;

    public boolean isRetornoManterControleIndicacao2Specified() {
        return localRetornoManterControleIndicacao2Tracker;
    }


    /**
     * Auto generated getter method
     *
     * @return bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2[]
     */
    public bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2[] getRetornoManterControleIndicacao2() {
        return localRetornoManterControleIndicacao2;
    }


    /**
     * validate the array for RetornoManterControleIndicacao2
     */
    protected void validateRetornoManterControleIndicacao2(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2[] param) {

    }


    /**
     * Auto generated setter method
     *
     * @param param RetornoManterControleIndicacao2
     */
    public void setRetornoManterControleIndicacao2(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2[] param) {

        validateRetornoManterControleIndicacao2(param);

        localRetornoManterControleIndicacao2Tracker = true;

        this.localRetornoManterControleIndicacao2 = param;
    }


    /**
     * Auto generated add method for the array for convenience
     *
     * @param param bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2
     */
    public void addRetornoManterControleIndicacao2(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2 param) {
        if (localRetornoManterControleIndicacao2 == null) {
            localRetornoManterControleIndicacao2 = new bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2[]{};
        }


        //update the setting tracker
        localRetornoManterControleIndicacao2Tracker = true;


        java.util.List list =
                org.apache.axis2.databinding.utils.ConverterUtil.toList(localRetornoManterControleIndicacao2);
        list.add(param);
        this.localRetornoManterControleIndicacao2 =
                (bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2[]) list.toArray(
                        new bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2[list.size()]);

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
                        namespacePrefix + ":ArrayOfRetornoManterControleIndicacao2",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "ArrayOfRetornoManterControleIndicacao2",
                        xmlWriter);
            }


        }
        if (localRetornoManterControleIndicacao2Tracker) {
            if (localRetornoManterControleIndicacao2 != null) {
                for (int i = 0; i < localRetornoManterControleIndicacao2.length; i++) {
                    if (localRetornoManterControleIndicacao2[i] != null) {
                        localRetornoManterControleIndicacao2[i].serialize(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoManterControleIndicacao2"),
                                xmlWriter);
                    } else {

                        writeStartElement(null, "http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoManterControleIndicacao2", xmlWriter);

                        // write the nil attribute
                        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                        xmlWriter.writeEndElement();

                    }

                }
            } else {

                writeStartElement(null, "http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoManterControleIndicacao2", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
                xmlWriter.writeEndElement();

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

        if (localRetornoManterControleIndicacao2Tracker) {
            if (localRetornoManterControleIndicacao2 != null) {
                for (int i = 0; i < localRetornoManterControleIndicacao2.length; i++) {

                    if (localRetornoManterControleIndicacao2[i] != null) {
                        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                                "RetornoManterControleIndicacao2"));
                        elementList.add(localRetornoManterControleIndicacao2[i]);
                    } else {

                        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                                "RetornoManterControleIndicacao2"));
                        elementList.add(null);

                    }

                }
            } else {

                elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                        "RetornoManterControleIndicacao2"));
                elementList.add(localRetornoManterControleIndicacao2);

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
        public static ArrayOfRetornoManterControleIndicacao2 parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ArrayOfRetornoManterControleIndicacao2 object =
                    new ArrayOfRetornoManterControleIndicacao2();

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

                        if (!"ArrayOfRetornoManterControleIndicacao2".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (ArrayOfRetornoManterControleIndicacao2) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }


                    }


                }


                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();


                reader.next();

                java.util.ArrayList list1 = new java.util.ArrayList();


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoManterControleIndicacao2").equals(reader.getName())) {


                    // Process the array and step past its final element's end.

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        list1.add(null);
                        reader.next();
                    } else {
                        list1.add(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2.Factory.parse(reader));
                    }
                    //loop until we find a start element that is not part of this array
                    boolean loopDone1 = false;
                    while (!loopDone1) {
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
                            loopDone1 = true;
                        } else {
                            if (new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoManterControleIndicacao2").equals(reader.getName())) {

                                nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                                if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                    list1.add(null);
                                    reader.next();
                                } else {
                                    list1.add(bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2.Factory.parse(reader));
                                }
                            } else {
                                loopDone1 = true;
                            }
                        }
                    }
                    // call the converter utility  to convert and set the array

                    object.setRetornoManterControleIndicacao2((bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2[])
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                    bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoManterControleIndicacao2.class,
                                    list1));

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
           