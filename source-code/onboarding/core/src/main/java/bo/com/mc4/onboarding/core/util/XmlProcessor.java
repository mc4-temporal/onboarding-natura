package bo.com.mc4.onboarding.core.util;

import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.util.StringUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;

/**
 * Created by :MC4
 * Author :Ricardo Laredo
 * Email :rlaredo@mc4.com.bo
 * Date :7/22/22
 * Project onboarding-source
 * Package :bo.com.mc4.onboarding.core.util
 * Copyright :MC4
 */
public class XmlProcessor {
    private Document doc;
    private String xml;

    public XmlProcessor(String xml) {
        this.xml = xml;
        if (StringUtil.isEmptyOrNull(xml)) {
            throw new OperationException("El xml no debe ser nulo. xml=" + xml);
        }

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setAttribute("http://xml.org/sax/features/external-general-entities", false);
        docFactory.setNamespaceAware(true);
        docFactory.setValidating(false);
        DocumentBuilder docBuilder = null;
        try {
            docBuilder = docFactory.newDocumentBuilder();

            InputStream is = new ByteArrayInputStream(xml.getBytes());
            doc = docBuilder.parse(is);
        } catch (Exception e) {
            throw new OperationException("Error al remover header soap envelope.", e);
        }
    }

    public String getElementByTagName(String tagName) {
        if (StringUtil.isEmptyOrNull(tagName)) {
            throw new OperationException("El tagName no deben ser nulo tagName=" + tagName);
        }
        Node staff = doc.getElementsByTagName(tagName).item(0);
        if (staff == null) {
            throw new OperationException("No se encontro el TAG: " + tagName);
        }
        return staff.getTextContent();
    }

    public String getElementByTagNameIfExist(String tagName) {
        if (StringUtil.isEmptyOrNull(tagName)) {
            throw new OperationException("El tagName no deben ser nulo tagName=" + tagName);
        }
        Node staff = doc.getElementsByTagName(tagName).item(0);
        if (staff == null) {
            return "";
        }
        return staff.getTextContent();
    }

    public void removeElementByTagName(String tagName) {
        if (StringUtil.isEmptyOrNull(tagName)) {
            throw new OperationException("El tagName no deben ser nulo tagName=" + tagName);
        }
        Node staff = doc.getElementsByTagName(tagName).item(0);
        if (staff == null) {
            throw new OperationException("No se encontro el TAG: " + tagName);
        }
        doc.removeChild(staff);
    }

    public Element getElementsByTagName(String tagName) {
        if (StringUtil.isEmptyOrNull(tagName)) {
            throw new OperationException("El tagName no deben ser nulo tagName=" + tagName);
        }
        return (Element) doc.getElementsByTagName(tagName).item(0);
    }

    public Document getDocument(){
        return doc;
    }

    public  String getNodeByTagName( String tag) {
        String response = null;
        NodeList nList = doc.getElementsByTagName(tag);
        if (nList.getLength() > 0) {
            Node nNode = nList.item(0);
            if (nNode != null && nNode.getNodeType() == Node.ELEMENT_NODE) {
                response = nodeToString(nNode);
            }
        }
        return response;
    }

    /**
     * Metodo que convierte un nodo de xml en string
     *
     * @param node
     * @return
     */
    public  String nodeToString(Node node) {
        StringWriter sw = new StringWriter();
        try {
            Transformer t = TransformerFactory.newInstance().newTransformer();
            t.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            t.transform(new DOMSource(node), new StreamResult(sw));
        } catch (TransformerException te) {
            System.out.println("nodeToString Transformer Exception");
        }
        return sw.toString();
    }
}
