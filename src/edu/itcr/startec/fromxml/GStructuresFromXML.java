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
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GStructuresFromXML {
	String path;
	NodeList nodeList;
	
	public String metropoliXMLGStructure(){
		try {
			String path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path
            									 + "/xml/papabuildingG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/StructuresG/Structure[@class='Metropoli']" 
            					+ "/resistance";
            
            NodeList nodeList = (NodeList) xPath.compile(expression01)
            									.evaluate(xmlDocument,
            											  XPathConstants
            											  .NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                System.out.println(nodeList.item(i).getFirstChild()
                								   .getNodeValue());
                path = nodeList.item(i).getFirstChild().getNodeValue();
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
		return path;
	}
	
	public String mezquitaXMLGStructure (){
		try {
			String path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path
            									 + "/xml/papabuildingG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/StructuresG/Structure[@class='Metropoli']" 
            					+ "/resistance";
            
            NodeList nodeList = (NodeList) xPath.compile(expression01)
            									.evaluate(xmlDocument,
            											  XPathConstants
            											  .NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                System.out.println(nodeList.item(i).getFirstChild()
                								   .getNodeValue());
                path = nodeList.item(i).getFirstChild().getNodeValue();
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
		return path;
	}
	
	public String minaXMLGStructure (){
		try {
			String path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path
            									 + "/xml/papabuildingG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
System.out.println("************************************");
            
            String expression01 = "/StructuresG/Structure[@class='Mina']" 
            					+ "/resistance";
            
            NodeList nodeList = (NodeList) xPath.compile(expression01)
            									.evaluate(xmlDocument,
            											  XPathConstants
            											  .NODESET);
            for (int i = 0; i < nodeList.getLength(); i++) {
                System.out.println(nodeList.item(i).getFirstChild()
                								   .getNodeValue());
                path = nodeList.item(i).getFirstChild().getNodeValue();
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
		return path;
	}
	
}
