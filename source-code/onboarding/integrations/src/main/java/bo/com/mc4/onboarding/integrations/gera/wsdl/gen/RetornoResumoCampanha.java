/**
 * RetornoResumoCampanha.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:23:23 CEST)
 */


package bo.com.mc4.onboarding.integrations.gera.wsdl.gen;


/**
 * RetornoResumoCampanha bean class
 */
@SuppressWarnings({"unchecked", "unused"})

public class RetornoResumoCampanha extends bo.com.mc4.onboarding.integrations.gera.wsdl.gen.RetornoWebService
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = RetornoResumoCampanha
                Namespace URI = http://www.geravd.com.br/Servicos/PessoaWebService
                Namespace Prefix = ns1
                */


    /**
     * field for TotalPedido
     */


    protected int localTotalPedido;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getTotalPedido() {
        return localTotalPedido;
    }


    /**
     * Auto generated setter method
     *
     * @param param TotalPedido
     */
    public void setTotalPedido(int param) {

        this.localTotalPedido = param;


    }


    /**
     * field for TotalPontosVendas
     */


    protected java.math.BigDecimal localTotalPontosVendas;


    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getTotalPontosVendas() {
        return localTotalPontosVendas;
    }


    /**
     * Auto generated setter method
     *
     * @param param TotalPontosVendas
     */
    public void setTotalPontosVendas(java.math.BigDecimal param) {

        this.localTotalPontosVendas = param;


    }


    /**
     * field for SaldoPendente
     */


    protected java.math.BigDecimal localSaldoPendente;


    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getSaldoPendente() {
        return localSaldoPendente;
    }


    /**
     * Auto generated setter method
     *
     * @param param SaldoPendente
     */
    public void setSaldoPendente(java.math.BigDecimal param) {

        this.localSaldoPendente = param;


    }


    /**
     * field for EncerramentoCiclo
     */


    protected java.util.Calendar localEncerramentoCiclo;


    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getEncerramentoCiclo() {
        return localEncerramentoCiclo;
    }


    /**
     * Auto generated setter method
     *
     * @param param EncerramentoCiclo
     */
    public void setEncerramentoCiclo(java.util.Calendar param) {

        this.localEncerramentoCiclo = param;


    }


    /**
     * field for UltimoPedido
     */


    protected int localUltimoPedido;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getUltimoPedido() {
        return localUltimoPedido;
    }


    /**
     * Auto generated setter method
     *
     * @param param UltimoPedido
     */
    public void setUltimoPedido(int param) {

        this.localUltimoPedido = param;


    }


    /**
     * field for SituacaoUltimoPedido
     */


    protected java.lang.String localSituacaoUltimoPedido;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSituacaoUltimoPedidoTracker = false;

    public boolean isSituacaoUltimoPedidoSpecified() {
        return localSituacaoUltimoPedidoTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSituacaoUltimoPedido() {
        return localSituacaoUltimoPedido;
    }


    /**
     * Auto generated setter method
     *
     * @param param SituacaoUltimoPedido
     */
    public void setSituacaoUltimoPedido(java.lang.String param) {
        localSituacaoUltimoPedidoTracker = param != null;

        this.localSituacaoUltimoPedido = param;


    }


    /**
     * field for ValorUltimoPedido
     */


    protected java.math.BigDecimal localValorUltimoPedido;


    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getValorUltimoPedido() {
        return localValorUltimoPedido;
    }


    /**
     * Auto generated setter method
     *
     * @param param ValorUltimoPedido
     */
    public void setValorUltimoPedido(java.math.BigDecimal param) {

        this.localValorUltimoPedido = param;


    }


    /**
     * field for EncerramentoCaptacao
     */


    protected java.util.Calendar localEncerramentoCaptacao;


    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getEncerramentoCaptacao() {
        return localEncerramentoCaptacao;
    }


    /**
     * Auto generated setter method
     *
     * @param param EncerramentoCaptacao
     */
    public void setEncerramentoCaptacao(java.util.Calendar param) {

        this.localEncerramentoCaptacao = param;


    }


    /**
     * field for CodigoPapel
     */


    protected int localCodigoPapel;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCodigoPapel() {
        return localCodigoPapel;
    }


    /**
     * Auto generated setter method
     *
     * @param param CodigoPapel
     */
    public void setCodigoPapel(int param) {

        this.localCodigoPapel = param;


    }


    /**
     * field for NomePapel
     */


    protected java.lang.String localNomePapel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNomePapelTracker = false;

    public boolean isNomePapelSpecified() {
        return localNomePapelTracker;
    }


    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getNomePapel() {
        return localNomePapel;
    }


    /**
     * Auto generated setter method
     *
     * @param param NomePapel
     */
    public void setNomePapel(java.lang.String param) {
        localNomePapelTracker = param != null;

        this.localNomePapel = param;


    }


    /**
     * field for CreditoDisponivel
     */


    protected int localCreditoDisponivel;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCreditoDisponivel() {
        return localCreditoDisponivel;
    }


    /**
     * Auto generated setter method
     *
     * @param param CreditoDisponivel
     */
    public void setCreditoDisponivel(int param) {

        this.localCreditoDisponivel = param;


    }


    /**
     * field for CreditoTotal
     */


    protected int localCreditoTotal;


    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCreditoTotal() {
        return localCreditoTotal;
    }


    /**
     * Auto generated setter method
     *
     * @param param CreditoTotal
     */
    public void setCreditoTotal(int param) {

        this.localCreditoTotal = param;


    }


    /**
     * field for CreditoAFaturar
     */


    protected java.math.BigDecimal localCreditoAFaturar;


    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getCreditoAFaturar() {
        return localCreditoAFaturar;
    }


    /**
     * Auto generated setter method
     *
     * @param param CreditoAFaturar
     */
    public void setCreditoAFaturar(java.math.BigDecimal param) {

        this.localCreditoAFaturar = param;


    }


    /**
     * field for CreditoAVencer
     */


    protected java.math.BigDecimal localCreditoAVencer;


    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getCreditoAVencer() {
        return localCreditoAVencer;
    }


    /**
     * Auto generated setter method
     *
     * @param param CreditoAVencer
     */
    public void setCreditoAVencer(java.math.BigDecimal param) {

        this.localCreditoAVencer = param;


    }


    /**
     * field for CreditoVencido
     */


    protected java.math.BigDecimal localCreditoVencido;


    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getCreditoVencido() {
        return localCreditoVencido;
    }


    /**
     * Auto generated setter method
     *
     * @param param CreditoVencido
     */
    public void setCreditoVencido(java.math.BigDecimal param) {

        this.localCreditoVencido = param;


    }


    /**
     * field for PedidoMinimo
     */


    protected java.math.BigDecimal localPedidoMinimo;


    /**
     * Auto generated getter method
     *
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getPedidoMinimo() {
        return localPedidoMinimo;
    }


    /**
     * Auto generated setter method
     *
     * @param param PedidoMinimo
     */
    public void setPedidoMinimo(java.math.BigDecimal param) {

        this.localPedidoMinimo = param;


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


        java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.geravd.com.br/Servicos/PessoaWebService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":RetornoResumoCampanha",
                    xmlWriter);
        } else {
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "RetornoResumoCampanha",
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
        writeStartElement(null, namespace, "TotalPedido", xmlWriter);

        if (localTotalPedido == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("TotalPedido cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPedido));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "TotalPontosVendas", xmlWriter);


        if (localTotalPontosVendas == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("TotalPontosVendas cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPontosVendas));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "SaldoPendente", xmlWriter);


        if (localSaldoPendente == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("SaldoPendente cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSaldoPendente));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "EncerramentoCiclo", xmlWriter);


        if (localEncerramentoCiclo == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("EncerramentoCiclo cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEncerramentoCiclo));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "UltimoPedido", xmlWriter);

        if (localUltimoPedido == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("UltimoPedido cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUltimoPedido));
        }

        xmlWriter.writeEndElement();
        if (localSituacaoUltimoPedidoTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "SituacaoUltimoPedido", xmlWriter);


            if (localSituacaoUltimoPedido == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("SituacaoUltimoPedido cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localSituacaoUltimoPedido);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "ValorUltimoPedido", xmlWriter);


        if (localValorUltimoPedido == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("ValorUltimoPedido cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValorUltimoPedido));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "EncerramentoCaptacao", xmlWriter);


        if (localEncerramentoCaptacao == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("EncerramentoCaptacao cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEncerramentoCaptacao));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CodigoPapel", xmlWriter);

        if (localCodigoPapel == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CodigoPapel cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPapel));
        }

        xmlWriter.writeEndElement();
        if (localNomePapelTracker) {
            namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
            writeStartElement(null, namespace, "NomePapel", xmlWriter);


            if (localNomePapel == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("NomePapel cannot be null!!");

            } else {


                xmlWriter.writeCharacters(localNomePapel);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CreditoDisponivel", xmlWriter);

        if (localCreditoDisponivel == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CreditoDisponivel cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditoDisponivel));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CreditoTotal", xmlWriter);

        if (localCreditoTotal == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("CreditoTotal cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditoTotal));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CreditoAFaturar", xmlWriter);


        if (localCreditoAFaturar == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("CreditoAFaturar cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditoAFaturar));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CreditoAVencer", xmlWriter);


        if (localCreditoAVencer == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("CreditoAVencer cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditoAVencer));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "CreditoVencido", xmlWriter);


        if (localCreditoVencido == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("CreditoVencido cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditoVencido));

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.geravd.com.br/Servicos/PessoaWebService";
        writeStartElement(null, namespace, "PedidoMinimo", xmlWriter);


        if (localPedidoMinimo == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("PedidoMinimo cannot be null!!");

        } else {


            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPedidoMinimo));

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


        attribList.add(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema-instance", "type"));
        attribList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "RetornoResumoCampanha"));
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
                "TotalPedido"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPedido));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "TotalPontosVendas"));

        if (localTotalPontosVendas != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalPontosVendas));
        } else {
            throw new org.apache.axis2.databinding.ADBException("TotalPontosVendas cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "SaldoPendente"));

        if (localSaldoPendente != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSaldoPendente));
        } else {
            throw new org.apache.axis2.databinding.ADBException("SaldoPendente cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "EncerramentoCiclo"));

        if (localEncerramentoCiclo != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEncerramentoCiclo));
        } else {
            throw new org.apache.axis2.databinding.ADBException("EncerramentoCiclo cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "UltimoPedido"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUltimoPedido));
        if (localSituacaoUltimoPedidoTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "SituacaoUltimoPedido"));

            if (localSituacaoUltimoPedido != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSituacaoUltimoPedido));
            } else {
                throw new org.apache.axis2.databinding.ADBException("SituacaoUltimoPedido cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "ValorUltimoPedido"));

        if (localValorUltimoPedido != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localValorUltimoPedido));
        } else {
            throw new org.apache.axis2.databinding.ADBException("ValorUltimoPedido cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "EncerramentoCaptacao"));

        if (localEncerramentoCaptacao != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEncerramentoCaptacao));
        } else {
            throw new org.apache.axis2.databinding.ADBException("EncerramentoCaptacao cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CodigoPapel"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCodigoPapel));
        if (localNomePapelTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                    "NomePapel"));

            if (localNomePapel != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNomePapel));
            } else {
                throw new org.apache.axis2.databinding.ADBException("NomePapel cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CreditoDisponivel"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditoDisponivel));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CreditoTotal"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditoTotal));

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CreditoAFaturar"));

        if (localCreditoAFaturar != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditoAFaturar));
        } else {
            throw new org.apache.axis2.databinding.ADBException("CreditoAFaturar cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CreditoAVencer"));

        if (localCreditoAVencer != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditoAVencer));
        } else {
            throw new org.apache.axis2.databinding.ADBException("CreditoAVencer cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "CreditoVencido"));

        if (localCreditoVencido != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCreditoVencido));
        } else {
            throw new org.apache.axis2.databinding.ADBException("CreditoVencido cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService",
                "PedidoMinimo"));

        if (localPedidoMinimo != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPedidoMinimo));
        } else {
            throw new org.apache.axis2.databinding.ADBException("PedidoMinimo cannot be null!!");
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
        public static RetornoResumoCampanha parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            RetornoResumoCampanha object =
                    new RetornoResumoCampanha();

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

                        if (!"RetornoResumoCampanha".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (RetornoResumoCampanha) bo.com.mc4.onboarding.integrations.gera.wsdl.gen.ExtensionMapper.getTypeObject(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TotalPedido").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTotalPedido(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "TotalPontosVendas").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setTotalPontosVendas(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "SaldoPendente").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSaldoPendente(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EncerramentoCiclo").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEncerramentoCiclo(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "UltimoPedido").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setUltimoPedido(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "SituacaoUltimoPedido").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setSituacaoUltimoPedido(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "ValorUltimoPedido").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setValorUltimoPedido(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "EncerramentoCaptacao").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setEncerramentoCaptacao(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CodigoPapel").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCodigoPapel(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "NomePapel").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setNomePapel(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CreditoDisponivel").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCreditoDisponivel(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CreditoTotal").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCreditoTotal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CreditoAFaturar").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCreditoAFaturar(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CreditoAVencer").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCreditoAVencer(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "CreditoVencido").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setCreditoVencido(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }


                while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.geravd.com.br/Servicos/PessoaWebService", "PedidoMinimo").equals(reader.getName())) {

                    java.lang.String content = reader.getElementText();

                    object.setPedidoMinimo(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(content));

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
           
