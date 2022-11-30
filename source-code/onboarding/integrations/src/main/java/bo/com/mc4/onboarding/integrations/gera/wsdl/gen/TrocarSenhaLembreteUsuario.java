/**
 * TrocarSenhaLembreteUsuario.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 * TrocarSenhaLembreteUsuario bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class TrocarSenhaLembreteUsuario
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.geravd.com.br/Servicos/PessoaWebService",
            "TrocarSenhaLembreteUsuario",
            "ns1");


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
     * field for SenhaAtual
     */


    protected java.lang.String localSenhaAtual;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSenhaAtualTracker = false;

    public boolean isSenhaAtualSpecified() {
        return localSenhaAtualTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSenhaAtual() {
        return localSenhaAtual;
    }


    /**
     * Auto generated setter method
     *
     * @param param SenhaAtual
     */
    public void setSenhaAtual(java.lang.String param) {
        localSenhaAtualTracker = param != null;

        this.localSenhaAtual = param;


    }


    /**
     * field for NovaSenha
     */


    protected java.lang.String localNovaSenha;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNovaSenhaTracker = false;

    public boolean isNovaSenhaSpecified() {
        return localNovaSenhaTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNovaSenha() {
        return localNovaSenha;
    }


    /**
     * Auto generated setter method
     *
     * @param param NovaSenha
     */
    public void setNovaSenha(java.lang.String param) {
        localNovaSenhaTracker = param != null;

        this.localNovaSenha = param;


    }


    /**
     * field for LembreteSenha
     */


    protected java.lang.String localLembreteSenha;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLembreteSenhaTracker = false;

    public boolean isLembreteSenhaSpecified() {
        return localLembreteSenhaTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLembreteSenha() {
        return localLembreteSenha;
    }


    /**
     * Auto generated setter method
     *
     * @param param LembreteSenha
     */
    public void setLembreteSenha(java.lang.String param) {
        localLembreteSenhaTracker = param != null;

        this.localLembreteSenha = param;


    }


    /**
     * field for EmailParaAtualizar
     */


    protected java.lang.String localEmailParaAtualizar;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailParaAtualizarTracker = false;

    public boolean isEmailParaAtualizarSpecified() {
        return localEmailParaAtualizarTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEmailParaAtualizar() {
        return localEmailParaAtualizar;
    }


    /**
     * Auto generated setter method
     *
     * @param param EmailParaAtualizar
     */
    public void setEmailParaAtualizar(java.lang.String param) {
        localEmailParaAtualizarTracker = param != null;

        this.localEmailParaAtualizar = param;


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
                        namespacePrefix + ":TrocarSenhaLembreteUsuario",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "TrocarSenhaLembreteUsuario",
                        xmlWriter);
            }


        }
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
        if (localSenhaAtualTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "senhaAtual", xmlWriter);


            if (localSenhaAtual == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("senhaAtual cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localSenhaAtual);

            }

            xmlWriter.writeEndElement();
        }
        if (localNovaSenhaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "novaSenha", xmlWriter);


            if (localNovaSenha == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("novaSenha cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNovaSenha);

            }

            xmlWriter.writeEndElement();
        }
        if (localLembreteSenhaTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "lembreteSenha", xmlWriter);


            if (localLembreteSenha == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("lembreteSenha cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLembreteSenha);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailParaAtualizarTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "emailParaAtualizar", xmlWriter);


            if (localEmailParaAtualizar == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("emailParaAtualizar cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailParaAtualizar);

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

        if (localLoginTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "login"));

            if (localLogin != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLogin));
            } else {
                throw new org.apache.axis2.databinding.ADBException("login cannot be null!!");
            }
        }
        if (localSenhaAtualTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "senhaAtual"));

            if (localSenhaAtual != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSenhaAtual));
            } else {
                throw new org.apache.axis2.databinding.ADBException("senhaAtual cannot be null!!");
            }
        }
        if (localNovaSenhaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "novaSenha"));

            if (localNovaSenha != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNovaSenha));
            } else {
                throw new org.apache.axis2.databinding.ADBException("novaSenha cannot be null!!");
            }
        }
        if (localLembreteSenhaTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "lembreteSenha"));

            if (localLembreteSenha != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLembreteSenha));
            } else {
                throw new org.apache.axis2.databinding.ADBException("lembreteSenha cannot be null!!");
            }
        }
        if (localEmailParaAtualizarTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "emailParaAtualizar"));

            if (localEmailParaAtualizar != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailParaAtualizar));
            } else {
                throw new org.apache.axis2.databinding.ADBException("emailParaAtualizar cannot be null!!");
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
        public static TrocarSenhaLembreteUsuario parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            TrocarSenhaLembreteUsuario object =
                    new TrocarSenhaLembreteUsuario();

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

                        if (!"TrocarSenhaLembreteUsuario".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (TrocarSenhaLembreteUsuario) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }


                    }


                }


                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();


                reader.next();


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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "senhaAtual").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSenhaAtual(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "novaSenha").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNovaSenha(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "lembreteSenha").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLembreteSenha(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "emailParaAtualizar").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailParaAtualizar(
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
           
