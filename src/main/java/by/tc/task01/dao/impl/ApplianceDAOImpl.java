package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.ApplianceFactory;
import by.tc.task01.entity.criteria.Criteria;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ApplianceDAOImpl implements ApplianceDAO {

    private ApplianceFactory applianceFactory = new ApplianceFactory();

    /**
     * @param criteria by which to find
     * @return list of appliances
     */
    public List<Appliance> find(Criteria criteria) {
        String groupName = criteria.getGroupSearchName();
        File xmlFile = new File("src/main/resources/appliances_db.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName(groupName);

            List<Appliance> appliances = new ArrayList<Appliance>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                NodeList childNodeList = nodeList.item(i).getChildNodes();
                ArrayList<String> parameters = new ArrayList<String>();
                parameters.add(nodeList.item(i).getNodeName());
                ArrayList<String> parametersInfo = new ArrayList<String>();
                parametersInfo.add("group");
                for (int k = 0; k < childNodeList.getLength(); k++) {
                    if (!childNodeList.item(k).getNodeName().equals("#text")) {
                        parameters.add(getTagValue(childNodeList.item(k).getNodeName(), (Element) nodeList.item(i)));
                        parametersInfo.add(childNodeList.item(k).getNodeName());
                    }
                }
                Set<String> applianceProperties = criteria.getCriteria().keySet();
                if (applianceProperties.isEmpty()) {
                    appliances.add(applianceFactory.getAppliance(groupName, parameters));
                } else {
                    for (String property : applianceProperties) {
                        int index = parametersInfo.indexOf(property);
                        if ((index != -1) && (criteria.getCriteria().get(property).toString().equals(parameters.get(index)))) {
                            appliances.add(applianceFactory.getAppliance(groupName, parameters));
                        }
                    }
                }
            }
            return appliances;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @return list of all appliances
     */
    public List<Appliance> getAll() {
        File xmlFile = new File("src/main/resources/appliances_db.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();
            Node node = document.getDocumentElement();
            List<Appliance> appliances = new ArrayList<Appliance>();
            node = node.getChildNodes().item(1);
            while (node != null) {
                if (!node.getNodeName().equals("#text")) {
                    NodeList nodeList = node.getChildNodes();
                    ArrayList<String> parameters = new ArrayList<String>();
                    parameters.add(node.getNodeName());
                    for (int i = 0; i < nodeList.getLength(); i++) {
                        if (!nodeList.item(i).getNodeName().equals("#text")) {
                            parameters.add(getTagValue(nodeList.item(i).getNodeName(), (Element) node));
                        }
                    }
                    appliances.add(applianceFactory.getAppliance(node.getNodeName(), parameters));
                }
                node = node.getNextSibling();
            }
            return appliances;
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return null;
    }

    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }
}

