/**
 * EnviarEmail.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 * EnviarEmail bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class EnviarEmail
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.geravd.com.br/Servicos/PessoaWebService",
            "EnviarEmail",
            "ns1");


    /**
     * field for CodigoPessoaSolicitante
     */


    protected int localCodigoPessoaSolicitante;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCodigoPessoaSolicitante() {
        return localCodigoPessoaSolicitante;
    }


    /**
     * Auto generated setter method
     *
     * @param param CodigoPessoaSolicitante
     */
    public void setCodigoPessoaSolicitante(int param) {

        this.localCodigoPessoaSolicitante = param;


    }


    /**
     * field for CodigoModuloSolicitante
     */


    protected org.apache.axis2.databinding.types.UnsignedByte localCodigoModuloSolicitante;


    /**
     * Auto generated getter method
     *
     * @return org.apache.axis2.databinding.types.UnsignedByte
     */
    public org.apache.axis2.databinding.types.UnsignedByte getCodigoModuloSolicitante() {
        return localCodigoModuloSolicitante;
    }


    /**
     * Auto generated setter method
     *
     * @param param CodigoModuloSolicitante
     */
    public void setCodigoModuloSolicitante(org.apache.axis2.databinding.types.UnsignedByte param) {

        this.localCodigoModuloSolicitante = param;


    }


    /**
     * field for NomeTemplate
     */


    protected java.lang.String localNomeTemplate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeTemplateTracker = false;

    public boolean isNomeTemplateSpecified() {
        return localNomeTemplateTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNomeTemplate() {
        return localNomeTemplate;
    }


    /**
     * Auto generated setter method
     *
     * @param param NomeTemplate
     */
    public void setNomeTemplate(java.lang.String param) {
        localNomeTemplateTracker = param != null;

        this.localNomeTemplate = param;


    }


    /**
     * field for EmailRemetente
     */


    protected java.lang.String localEmailRemetente;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailRemetenteTracker = false;

    public boolean isEmailRemetenteSpecified() {
        return localEmailRemetenteTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEmailRemetente() {
        return localEmailRemetente;
    }


    /**
     * Auto generated setter method
     *
     * @param param EmailRemetente
     */
    public void setEmailRemetente(java.lang.String param) {
        localEmailRemetenteTracker = param != null;

        this.localEmailRemetente = param;


    }


    /**
     * field for ListaDestinatarios
     */


    protected java.lang.String localListaDestinatarios;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localListaDestinatariosTracker = false;

    public boolean isListaDestinatariosSpecified() {
        return localListaDestinatariosTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getListaDestinatarios() {
        return localListaDestinatarios;
    }


    /**
     * Auto generated setter method
     *
     * @param param ListaDestinatarios
     */
    public void setListaDestinatarios(java.lang.String param) {
        localListaDestinatariosTracker = param != null;

        this.localListaDestinatarios = param;


    }


    /**
     * field for ListaCopiados
     */


    protected java.lang.String localListaCopiados;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localListaCopiadosTracker = false;

    public boolean isListaCopiadosSpecified() {
        return localListaCopiadosTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getListaCopiados() {
        return localListaCopiados;
    }


    /**
     * Auto generated setter method
     *
     * @param param ListaCopiados
     */
    public void setListaCopiados(java.lang.String param) {
        localListaCopiadosTracker = param != null;

        this.localListaCopiados = param;


    }


    /**
     * field for ListaCopiasOcultas
     */


    protected java.lang.String localListaCopiasOcultas;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localListaCopiasOcultasTracker = false;

    public boolean isListaCopiasOcultasSpecified() {
        return localListaCopiasOcultasTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getListaCopiasOcultas() {
        return localListaCopiasOcultas;
    }


    /**
     * Auto generated setter method
     *
     * @param param ListaCopiasOcultas
     */
    public void setListaCopiasOcultas(java.lang.String param) {
        localListaCopiasOcultasTracker = param != null;

        this.localListaCopiasOcultas = param;


    }


    /**
     * field for ListaValores
     */


    protected java.lang.String localListaValores;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localListaValoresTracker = false;

    public boolean isListaValoresSpecified() {
        return localListaValoresTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getListaValores() {
        return localListaValores;
    }


    /**
     * Auto generated setter method
     *
     * @param param ListaValores
     */
    public void setListaValores(java.lang.String param) {
        localListaValoresTracker = param != null;

        this.localListaValores = param;


    }


    /**
     * field for Assunto
     */


    protected java.lang.String localAssunto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAssuntoTracker = false;

    public boolean isAssuntoSpecified() {
        return localAssuntoTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAssunto() {
        return localAssunto;
    }


    /**
     * Auto generated setter method
     *
     * @param param Assunto
     */
    public void setAssunto(java.lang.String param) {
        localAssuntoTracker = param != null;

        this.localAssunto = param;


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
                        namespacePrefix + ":EnviarEmail",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "EnviarEmail",
                        xmlWriter);
            }


        }

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "codigoPessoaSolicitante", xmlWriter);

        if (localCodigoPessoaSolicitante == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("codigoPessoaSolicitante cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPessoaSolicitante));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "codigoModuloSolicitante", xmlWriter);


        if (localCodigoModuloSolicitante == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("codigoModuloSolicitante cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoModuloSolicitante));

        }

        xmlWriter.writeEndElement();
        if (localNomeTemplateTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "nomeTemplate", xmlWriter);


            if (localNomeTemplate == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("nomeTemplate cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomeTemplate);

            }

            xmlWriter.writeEndElement();
        }
        if (localEmailRemetenteTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "emailRemetente", xmlWriter);


            if (localEmailRemetente == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("emailRemetente cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEmailRemetente);

            }

            xmlWriter.writeEndElement();
        }
        if (localListaDestinatariosTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "listaDestinatarios", xmlWriter);


            if (localListaDestinatarios == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("listaDestinatarios cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localListaDestinatarios);

            }

            xmlWriter.writeEndElement();
        }
        if (localListaCopiadosTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "listaCopiados", xmlWriter);


            if (localListaCopiados == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("listaCopiados cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localListaCopiados);

            }

            xmlWriter.writeEndElement();
        }
        if (localListaCopiasOcultasTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "listaCopiasOcultas", xmlWriter);


            if (localListaCopiasOcultas == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("listaCopiasOcultas cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localListaCopiasOcultas);

            }

            xmlWriter.writeEndElement();
        }
        if (localListaValoresTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "listaValores", xmlWriter);


            if (localListaValores == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("listaValores cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localListaValores);

            }

            xmlWriter.writeEndElement();
        }
        if (localAssuntoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "assunto", xmlWriter);


            if (localAssunto == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("assunto cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localAssunto);

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
                "codigoPessoaSolicitante"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPessoaSolicitante));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "codigoModuloSolicitante"));

        if (localCodigoModuloSolicitante != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoModuloSolicitante));
        } else {
            throw new org.apache.axis2.databinding.ADBException("codigoModuloSolicitante cannot be null!!");
        }
        if (localNomeTemplateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "nomeTemplate"));

            if (localNomeTemplate != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomeTemplate));
            } else {
                throw new org.apache.axis2.databinding.ADBException("nomeTemplate cannot be null!!");
            }
        }
        if (localEmailRemetenteTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "emailRemetente"));

            if (localEmailRemetente != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEmailRemetente));
            } else {
                throw new org.apache.axis2.databinding.ADBException("emailRemetente cannot be null!!");
            }
        }
        if (localListaDestinatariosTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "listaDestinatarios"));

            if (localListaDestinatarios != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localListaDestinatarios));
            } else {
                throw new org.apache.axis2.databinding.ADBException("listaDestinatarios cannot be null!!");
            }
        }
        if (localListaCopiadosTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "listaCopiados"));

            if (localListaCopiados != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localListaCopiados));
            } else {
                throw new org.apache.axis2.databinding.ADBException("listaCopiados cannot be null!!");
            }
        }
        if (localListaCopiasOcultasTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "listaCopiasOcultas"));

            if (localListaCopiasOcultas != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localListaCopiasOcultas));
            } else {
                throw new org.apache.axis2.databinding.ADBException("listaCopiasOcultas cannot be null!!");
            }
        }
        if (localListaValoresTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "listaValores"));

            if (localListaValores != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localListaValores));
            } else {
                throw new org.apache.axis2.databinding.ADBException("listaValores cannot be null!!");
            }
        }
        if (localAssuntoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "assunto"));

            if (localAssunto != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAssunto));
            } else {
                throw new org.apache.axis2.databinding.ADBException("assunto cannot be null!!");
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
        public static EnviarEmail parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            EnviarEmail object =
                    new EnviarEmail();

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

                        if (!"EnviarEmail".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (EnviarEmail) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }


                    }


                }


                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();


                reader.next();


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "codigoPessoaSolicitante").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoPessoaSolicitante(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "codigoModuloSolicitante").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoModuloSolicitante(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedByte(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "nomeTemplate").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomeTemplate(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "emailRemetente").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEmailRemetente(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "listaDestinatarios").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setListaDestinatarios(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "listaCopiados").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setListaCopiados(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "listaCopiasOcultas").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setListaCopiasOcultas(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "listaValores").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setListaValores(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "assunto").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setAssunto(
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
           
