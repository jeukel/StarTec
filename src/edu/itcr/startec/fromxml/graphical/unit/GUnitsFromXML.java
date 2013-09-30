package edu.itcr.startec.fromxml.graphical.unit;

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

public class GUnitsFromXML{
	String path;
	NodeList nodeList;
	
	public String peonXMLUnit(){
		try {
			path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path + "/xml/papabichoG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/UnitsG/Unit[@class='Peon']" 
            					+ "/strenght";
            
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
	
	public String shamanXMLUnit (){
		try {
			path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path + "/xml/papabichoG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/UnitsG/Unit[@class='Shaman']" 
								+ "/strenght";
            
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
	
	public String fuerzasEspecialesXMLUnit (){
		try {
			path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path + "/xml/papabichoG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/UnitsG/Unit[@class='FuerzasEspeciales']" 
								+ "/strenght";
            
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
	
	public String escoltaXMLUnit (){
		try {
			path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path + "/xml/papabichoG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/UnitsG/Unit[@class='Escolta']" 
								+ "/strenght";
            
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

	public String enfermeroXMLUnit (){
		try {
			path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path + "/xml/papabichoG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/UnitsG/Unit[@class='Enfermero']" 
								+ "/strenght";
            
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
	
	public String peonEliteXMLUnit (){
		try {
			path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path + "/xml/papabichoG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/UnitsG/Unit[@class='PeonElite']" 
								+ "/strenght";
            
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

	public String soldadoXMLUnit (){
		try {
			path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path + "/xml/papabichoG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/UnitsG/Unit[@class='Soldado']" 
								+ "/strenght";
            
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

	public String tanqueXMLUnit (){
		try {
			path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path + "/xml/papabichoG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/UnitsG/Unit[@class='Tanque']" 
					+ "/strenght";
            
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
	
	public String dobleAgenteXMLUnit (){
		try {
			path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path + "/xml/papabichoG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/UnitsG/Unit[@class='DobleAgente']" 
								+ "/strenght";
            
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

	public String panzerXMLUnit (){
		try {
			path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path + "/xml/papabichoG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/UnitsG/Unit[@class='Panzer']" 
								+ "/strenght";
            
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

	public String kamikazeXMLUnit (){
		try {
			path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path + "/xml/papabichoG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/UnitsG/Unit[@class='Kamikaze']" 
								+ "/strenght";
            
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
	
	public String doubleOsevenXMLUnit(){
		try {
			path = new File(".").getCanonicalPath();
            FileInputStream file = 
            		new FileInputStream(new File(path + "/xml/papabichoG.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/UnitsG/Unit[@class='007']" 
								+ "/strenght";
            
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
