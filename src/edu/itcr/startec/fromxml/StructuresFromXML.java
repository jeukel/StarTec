package edu.itcr.startec.fromxml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class StructuresFromXML {
	String path;
	NodeList nodeList;
	
	public void metropoliXMLStructure (){
		try {
			String path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path
            									 + "/xml/papabuilding.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/Structures/Structure[@class='Metropoli']";
            
            Node node01 = (Node) xPath.compile(expression01)
            		.evaluate(xmlDocument, XPathConstants.NODE);

            if(null != node01) {
                nodeList = node01.getChildNodes();
                for (int i = 0;null!=nodeList && i < nodeList.getLength(); i++){
                    Node nod = nodeList.item(i);
                    if(nod.getNodeType() == Node.ELEMENT_NODE)
                        System.out.println(nodeList.item(i).getNodeName() 
                        		+ " : " + nod.getFirstChild().getNodeValue());
                }
            }
            
            System.out.println("************************************");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
	}
	
	public void mezquitaXMLStructure (){
		try {
			String path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path
            									 + "/xml/papabuilding.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/Structures/Structure[@class='Mezquita']";
            
            Node node01 = (Node) xPath.compile(expression01)
            		.evaluate(xmlDocument, XPathConstants.NODE);

            if(null != node01) {
                nodeList = node01.getChildNodes();
                for (int i = 0;null!=nodeList && i < nodeList.getLength(); i++){
                    Node nod = nodeList.item(i);
                    if(nod.getNodeType() == Node.ELEMENT_NODE)
                        System.out.println(nodeList.item(i).getNodeName() 
                        		+ " : " + nod.getFirstChild().getNodeValue());
                }
            }
            
            System.out.println("************************************");
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (XPathExpressionException e) {
            e.printStackTrace();
        }
	}
	
}
