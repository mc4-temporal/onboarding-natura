/**
 * RetornoBuscarCentroDistribuicao.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 *  RetornoBuscarCentroDistribuicao bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class RetornoBuscarCentroDistribuicao extends bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoWebService
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = RetornoBuscarCentroDistribuicao
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for CodigoCD
     */


    protected int localCodigoCD;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoCD() {
        return localCodigoCD;
    }


    /**
     * Auto generated setter method
     * @param param CodigoCD
     */
    public void setCodigoCD(int param) {

        this.localCodigoCD = param;


    }


    /**
     * field for CodigoPessoaJuridica
     */


    protected int localCodigoPessoaJuridica;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoPessoaJuridica() {
        return localCodigoPessoaJuridica;
    }


    /**
     * Auto generated setter method
     * @param param CodigoPessoaJuridica
     */
    public void setCodigoPessoaJuridica(int param) {

        this.localCodigoPessoaJuridica = param;


    }


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
     * field for CNPJ
     */


    protected java.lang.String localCNPJ;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCNPJTracker = false;

    public boolean isCNPJSpecified() {
        return localCNPJTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCNPJ() {
        return localCNPJ;
    }


    /**
     * Auto generated setter method
     * @param param CNPJ
     */
    public void setCNPJ(java.lang.String param) {
        localCNPJTracker = param != null;

        this.localCNPJ = param;


    }


    /**
     * field for Endereco
     */


    protected java.lang.String localEndereco;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnderecoTracker = false;

    public boolean isEnderecoSpecified() {
        return localEnderecoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEndereco() {
        return localEndereco;
    }


    /**
     * Auto generated setter method
     * @param param Endereco
     */
    public void setEndereco(java.lang.String param) {
        localEnderecoTracker = param != null;

        this.localEndereco = param;


    }


    /**
     * field for Numero
     */


    protected java.lang.String localNumero;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumeroTracker = false;

    public boolean isNumeroSpecified() {
        return localNumeroTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNumero() {
        return localNumero;
    }


    /**
     * Auto generated setter method
     * @param param Numero
     */
    public void setNumero(java.lang.String param) {
        localNumeroTracker = param != null;

        this.localNumero = param;


    }


    /**
     * field for Complemento
     */


    protected java.lang.String localComplemento;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localComplementoTracker = false;

    public boolean isComplementoSpecified() {
        return localComplementoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getComplemento() {
        return localComplemento;
    }


    /**
     * Auto generated setter method
     * @param param Complemento
     */
    public void setComplemento(java.lang.String param) {
        localComplementoTracker = param != null;

        this.localComplemento = param;


    }


    /**
     * field for Bairro
     */


    protected java.lang.String localBairro;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBairroTracker = false;

    public boolean isBairroSpecified() {
        return localBairroTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBairro() {
        return localBairro;
    }


    /**
     * Auto generated setter method
     * @param param Bairro
     */
    public void setBairro(java.lang.String param) {
        localBairroTracker = param != null;

        this.localBairro = param;


    }


    /**
     * field for Cidade
     */


    protected java.lang.String localCidade;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCidadeTracker = false;

    public boolean isCidadeSpecified() {
        return localCidadeTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCidade() {
        return localCidade;
    }


    /**
     * Auto generated setter method
     * @param param Cidade
     */
    public void setCidade(java.lang.String param) {
        localCidadeTracker = param != null;

        this.localCidade = param;


    }


    /**
     * field for Estado
     */


    protected java.lang.String localEstado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEstadoTracker = false;

    public boolean isEstadoSpecified() {
        return localEstadoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEstado() {
        return localEstado;
    }


    /**
     * Auto generated setter method
     * @param param Estado
     */
    public void setEstado(java.lang.String param) {
        localEstadoTracker = param != null;

        this.localEstado = param;


    }


    /**
     * field for Cep
     */


    protected java.lang.String localCep;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCepTracker = false;

    public boolean isCepSpecified() {
        return localCepTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCep() {
        return localCep;
    }


    /**
     * Auto generated setter method
     * @param param Cep
     */
    public void setCep(java.lang.String param) {
        localCepTracker = param != null;

        this.localCep = param;


    }


    /**
     * field for Telefone
     */


    protected java.lang.String localTelefone;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelefoneTracker = false;

    public boolean isTelefoneSpecified() {
        return localTelefoneTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTelefone() {
        return localTelefone;
    }


    /**
     * Auto generated setter method
     * @param param Telefone
     */
    public void setTelefone(java.lang.String param) {
        localTelefoneTracker = param != null;

        this.localTelefone = param;


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
                    namespacePrefix + ":RetornoBuscarCentroDistribuicao",
                    xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "RetornoBuscarCentroDistribuicao",
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
        writeStartElement(null, namespace, "CodigoCD", xmlWriter);

        if (localCodigoCD == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoCD cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoCD));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoPessoaJuridica", xmlWriter);

        if (localCodigoPessoaJuridica == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoPessoaJuridica cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPessoaJuridica));
        }

        xmlWriter.writeEndElement();
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
        if (localCNPJTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "CNPJ", xmlWriter);


            if (localCNPJ == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CNPJ cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCNPJ);

            }

            xmlWriter.writeEndElement();
        }
        if (localEnderecoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Endereco", xmlWriter);


            if (localEndereco == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Endereco cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEndereco);

            }

            xmlWriter.writeEndElement();
        }
        if (localNumeroTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Numero", xmlWriter);


            if (localNumero == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Numero cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNumero);

            }

            xmlWriter.writeEndElement();
        }
        if (localComplementoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Complemento", xmlWriter);


            if (localComplemento == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Complemento cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localComplemento);

            }

            xmlWriter.writeEndElement();
        }
        if (localBairroTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Bairro", xmlWriter);


            if (localBairro == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Bairro cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localBairro);

            }

            xmlWriter.writeEndElement();
        }
        if (localCidadeTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Cidade", xmlWriter);


            if (localCidade == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Cidade cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCidade);

            }

            xmlWriter.writeEndElement();
        }
        if (localEstadoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Estado", xmlWriter);


            if (localEstado == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Estado cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localEstado);

            }

            xmlWriter.writeEndElement();
        }
        if (localCepTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Cep", xmlWriter);


            if (localCep == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Cep cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCep);

            }

            xmlWriter.writeEndElement();
        }
        if (localTelefoneTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Telefone", xmlWriter);


            if (localTelefone == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Telefone cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localTelefone);

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
        attribList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoBuscarCentroDistribuicao"));
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
                "CodigoCD"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoCD));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoPessoaJuridica"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPessoaJuridica));
        if (localRazaoSocialTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "RazaoSocial"));

            if (localRazaoSocial != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRazaoSocial));
            } else {
                throw new org.apache.axis2.databinding.ADBException("RazaoSocial cannot be null!!");
            }
        }
        if (localCNPJTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "CNPJ"));

            if (localCNPJ != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCNPJ));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CNPJ cannot be null!!");
            }
        }
        if (localEnderecoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Endereco"));

            if (localEndereco != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndereco));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Endereco cannot be null!!");
            }
        }
        if (localNumeroTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Numero"));

            if (localNumero != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumero));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Numero cannot be null!!");
            }
        }
        if (localComplementoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Complemento"));

            if (localComplemento != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComplemento));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Complemento cannot be null!!");
            }
        }
        if (localBairroTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Bairro"));

            if (localBairro != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBairro));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Bairro cannot be null!!");
            }
        }
        if (localCidadeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Cidade"));

            if (localCidade != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCidade));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Cidade cannot be null!!");
            }
        }
        if (localEstadoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Estado"));

            if (localEstado != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEstado));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Estado cannot be null!!");
            }
        }
        if (localCepTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Cep"));

            if (localCep != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCep));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Cep cannot be null!!");
            }
        }
        if (localTelefoneTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Telefone"));

            if (localTelefone != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTelefone));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Telefone cannot be null!!");
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
        public static RetornoBuscarCentroDistribuicao parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RetornoBuscarCentroDistribuicao object =
                    new RetornoBuscarCentroDistribuicao();

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

                        if (!"RetornoBuscarCentroDistribuicao".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RetornoBuscarCentroDistribuicao) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoCD").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoCD(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoPessoaJuridica").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoPessoaJuridica(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CNPJ").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCNPJ(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Endereco").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEndereco(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Numero").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNumero(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Complemento").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setComplemento(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Bairro").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setBairro(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Cidade").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCidade(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Estado").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEstado(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Cep").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCep(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Telefone").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTelefone(
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
           
