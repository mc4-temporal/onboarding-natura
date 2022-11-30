/**
 * RetornoObterDadosTreinamento.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 *  RetornoObterDadosTreinamento bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class RetornoObterDadosTreinamento extends bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoWebService
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = RetornoObterDadosTreinamento
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for CodigoCurso
     */


    protected int localCodigoCurso;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getCodigoCurso() {
        return localCodigoCurso;
    }


    /**
     * Auto generated setter method
     * @param param CodigoCurso
     */
    public void setCodigoCurso(int param) {

        this.localCodigoCurso = param;


    }


    /**
     * field for NomeCurso
     */


    protected java.lang.String localNomeCurso;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomeCursoTracker = false;

    public boolean isNomeCursoSpecified() {
        return localNomeCursoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNomeCurso() {
        return localNomeCurso;
    }


    /**
     * Auto generated setter method
     * @param param NomeCurso
     */
    public void setNomeCurso(java.lang.String param) {
        localNomeCursoTracker = param != null;

        this.localNomeCurso = param;


    }


    /**
     * field for CursoObrigatorio
     */


    protected java.lang.String localCursoObrigatorio;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCursoObrigatorioTracker = false;

    public boolean isCursoObrigatorioSpecified() {
        return localCursoObrigatorioTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCursoObrigatorio() {
        return localCursoObrigatorio;
    }


    /**
     * Auto generated setter method
     * @param param CursoObrigatorio
     */
    public void setCursoObrigatorio(java.lang.String param) {
        localCursoObrigatorioTracker = param != null;

        this.localCursoObrigatorio = param;


    }


    /**
     * field for Situacao
     */


    protected java.lang.String localSituacao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSituacaoTracker = false;

    public boolean isSituacaoSpecified() {
        return localSituacaoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSituacao() {
        return localSituacao;
    }


    /**
     * Auto generated setter method
     * @param param Situacao
     */
    public void setSituacao(java.lang.String param) {
        localSituacaoTracker = param != null;

        this.localSituacao = param;


    }


    /**
     * field for CicloRealizacao
     */


    protected java.lang.String localCicloRealizacao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCicloRealizacaoTracker = false;

    public boolean isCicloRealizacaoSpecified() {
        return localCicloRealizacaoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCicloRealizacao() {
        return localCicloRealizacao;
    }


    /**
     * Auto generated setter method
     * @param param CicloRealizacao
     */
    public void setCicloRealizacao(java.lang.String param) {
        localCicloRealizacaoTracker = param != null;

        this.localCicloRealizacao = param;


    }


    /**
     * field for CicloLimiteInicialziacao
     */


    protected java.lang.String localCicloLimiteInicialziacao;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCicloLimiteInicialziacaoTracker = false;

    public boolean isCicloLimiteInicialziacaoSpecified() {
        return localCicloLimiteInicialziacaoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCicloLimiteInicialziacao() {
        return localCicloLimiteInicialziacao;
    }


    /**
     * Auto generated setter method
     * @param param CicloLimiteInicialziacao
     */
    public void setCicloLimiteInicialziacao(java.lang.String param) {
        localCicloLimiteInicialziacaoTracker = param != null;

        this.localCicloLimiteInicialziacao = param;


    }


    /**
     * field for CicloLimiteReagendamento
     */


    protected java.lang.String localCicloLimiteReagendamento;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCicloLimiteReagendamentoTracker = false;

    public boolean isCicloLimiteReagendamentoSpecified() {
        return localCicloLimiteReagendamentoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCicloLimiteReagendamento() {
        return localCicloLimiteReagendamento;
    }


    /**
     * Auto generated setter method
     * @param param CicloLimiteReagendamento
     */
    public void setCicloLimiteReagendamento(java.lang.String param) {
        localCicloLimiteReagendamentoTracker = param != null;

        this.localCicloLimiteReagendamento = param;


    }


    /**
     * field for MotivoReagendamento
     */


    protected java.lang.String localMotivoReagendamento;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMotivoReagendamentoTracker = false;

    public boolean isMotivoReagendamentoSpecified() {
        return localMotivoReagendamentoTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMotivoReagendamento() {
        return localMotivoReagendamento;
    }


    /**
     * Auto generated setter method
     * @param param MotivoReagendamento
     */
    public void setMotivoReagendamento(java.lang.String param) {
        localMotivoReagendamentoTracker = param != null;

        this.localMotivoReagendamento = param;


    }


    /**
     * field for Local
     */


    protected java.lang.String localLocal;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLocalTracker = false;

    public boolean isLocalSpecified() {
        return localLocalTracker;
    }


    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLocal() {
        return localLocal;
    }


    /**
     * Auto generated setter method
     * @param param Local
     */
    public void setLocal(java.lang.String param) {
        localLocalTracker = param != null;

        this.localLocal = param;


    }


    /**
     * field for DataInicio
     */


    protected java.util.Calendar localDataInicio;


    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataInicio() {
        return localDataInicio;
    }


    /**
     * Auto generated setter method
     * @param param DataInicio
     */
    public void setDataInicio(java.util.Calendar param) {

        this.localDataInicio = param;


    }


    /**
     * field for DataFim
     */


    protected java.util.Calendar localDataFim;


    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getDataFim() {
        return localDataFim;
    }


    /**
     * Auto generated setter method
     * @param param DataFim
     */
    public void setDataFim(java.util.Calendar param) {

        this.localDataFim = param;


    }


    /**
     * field for HoraInicio
     */


    protected int localHoraInicio;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getHoraInicio() {
        return localHoraInicio;
    }


    /**
     * Auto generated setter method
     * @param param HoraInicio
     */
    public void setHoraInicio(int param) {

        this.localHoraInicio = param;


    }


    /**
     * field for HoraFim
     */


    protected int localHoraFim;


    /**
     * Auto generated getter method
     * @return int
     */
    public int getHoraFim() {
        return localHoraFim;
    }


    /**
     * Auto generated setter method
     * @param param HoraFim
     */
    public void setHoraFim(int param) {

        this.localHoraFim = param;


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
                    namespacePrefix + ":RetornoObterDadosTreinamento",
                    xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "RetornoObterDadosTreinamento",
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
        writeStartElement(null, namespace, "CodigoCurso", xmlWriter);

        if (localCodigoCurso == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoCurso cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoCurso));
        }

        xmlWriter.writeEndElement();
        if (localNomeCursoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "NomeCurso", xmlWriter);


            if (localNomeCurso == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("NomeCurso cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomeCurso);

            }

            xmlWriter.writeEndElement();
        }
        if (localCursoObrigatorioTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "CursoObrigatorio", xmlWriter);


            if (localCursoObrigatorio == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CursoObrigatorio cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCursoObrigatorio);

            }

            xmlWriter.writeEndElement();
        }
        if (localSituacaoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Situacao", xmlWriter);


            if (localSituacao == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Situacao cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localSituacao);

            }

            xmlWriter.writeEndElement();
        }
        if (localCicloRealizacaoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "CicloRealizacao", xmlWriter);


            if (localCicloRealizacao == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CicloRealizacao cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCicloRealizacao);

            }

            xmlWriter.writeEndElement();
        }
        if (localCicloLimiteInicialziacaoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "CicloLimiteInicialziacao", xmlWriter);


            if (localCicloLimiteInicialziacao == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CicloLimiteInicialziacao cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCicloLimiteInicialziacao);

            }

            xmlWriter.writeEndElement();
        }
        if (localCicloLimiteReagendamentoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "CicloLimiteReagendamento", xmlWriter);


            if (localCicloLimiteReagendamento == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("CicloLimiteReagendamento cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localCicloLimiteReagendamento);

            }

            xmlWriter.writeEndElement();
        }
        if (localMotivoReagendamentoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "MotivoReagendamento", xmlWriter);


            if (localMotivoReagendamento == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("MotivoReagendamento cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localMotivoReagendamento);

            }

            xmlWriter.writeEndElement();
        }
        if (localLocalTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "Local", xmlWriter);


            if (localLocal == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("Local cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localLocal);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "DataInicio", xmlWriter);


        if (localDataInicio == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("DataInicio cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataInicio));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "DataFim", xmlWriter);


        if (localDataFim == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("DataFim cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataFim));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "HoraInicio", xmlWriter);

        if (localHoraInicio == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("HoraInicio cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHoraInicio));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "HoraFim", xmlWriter);

        if (localHoraFim == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("HoraFim cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHoraFim));
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
        attribList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoObterDadosTreinamento"));
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
                "CodigoCurso"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoCurso));
        if (localNomeCursoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomeCurso"));

            if (localNomeCurso != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomeCurso));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomeCurso cannot be null!!");
            }
        }
        if (localCursoObrigatorioTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "CursoObrigatorio"));

            if (localCursoObrigatorio != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCursoObrigatorio));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CursoObrigatorio cannot be null!!");
            }
        }
        if (localSituacaoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Situacao"));

            if (localSituacao != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSituacao));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Situacao cannot be null!!");
            }
        }
        if (localCicloRealizacaoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "CicloRealizacao"));

            if (localCicloRealizacao != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCicloRealizacao));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CicloRealizacao cannot be null!!");
            }
        }
        if (localCicloLimiteInicialziacaoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "CicloLimiteInicialziacao"));

            if (localCicloLimiteInicialziacao != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCicloLimiteInicialziacao));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CicloLimiteInicialziacao cannot be null!!");
            }
        }
        if (localCicloLimiteReagendamentoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "CicloLimiteReagendamento"));

            if (localCicloLimiteReagendamento != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCicloLimiteReagendamento));
            } else {
                throw new org.apache.axis2.databinding.ADBException("CicloLimiteReagendamento cannot be null!!");
            }
        }
        if (localMotivoReagendamentoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "MotivoReagendamento"));

            if (localMotivoReagendamento != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMotivoReagendamento));
            } else {
                throw new org.apache.axis2.databinding.ADBException("MotivoReagendamento cannot be null!!");
            }
        }
        if (localLocalTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "Local"));

            if (localLocal != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocal));
            } else {
                throw new org.apache.axis2.databinding.ADBException("Local cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "DataInicio"));

        if (localDataInicio != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataInicio));
        } else {
            throw new org.apache.axis2.databinding.ADBException("DataInicio cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "DataFim"));

        if (localDataFim != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDataFim));
        } else {
            throw new org.apache.axis2.databinding.ADBException("DataFim cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "HoraInicio"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHoraInicio));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "HoraFim"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHoraFim));


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
        public static RetornoObterDadosTreinamento parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RetornoObterDadosTreinamento object =
                    new RetornoObterDadosTreinamento();

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

                        if (!"RetornoObterDadosTreinamento".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RetornoObterDadosTreinamento) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoCurso").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoCurso(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomeCurso").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomeCurso(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CursoObrigatorio").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCursoObrigatorio(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Situacao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSituacao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CicloRealizacao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCicloRealizacao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CicloLimiteInicialziacao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCicloLimiteInicialziacao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CicloLimiteReagendamento").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCicloLimiteReagendamento(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "MotivoReagendamento").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setMotivoReagendamento(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "Local").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setLocal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DataInicio").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDataInicio(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "DataFim").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setDataFim(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "HoraInicio").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setHoraInicio(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "HoraFim").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setHoraFim(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

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
           
