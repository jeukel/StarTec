package edu.itcr.startec.facade.mapconstruction;

import edu.itcr.startec.datastructs.doublelist.DoubleList;
import edu.itcr.startec.datastructs.simplelist.SimpleList;

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

public class CreateMapFromXML<K> extends DoubleList<K>{
	DoubleList<	DoubleList<String>> map;

	public CreateMapFromXML(){
		map = new DoubleList<DoubleList<String>>();
	}
	
	public DoubleList<DoubleList<String>> XMLtoMap (){
		try {
            FileInputStream file = 
            		new FileInputStream(new File("/home/jeukel/map.xml"));
            DocumentBuilderFactory builderFactory = 
            		DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  builderFactory.newDocumentBuilder();
            Document xmlDocument = builder.parse(file); 
            XPath xPath =  XPathFactory.newInstance().newXPath();
 
            System.out.println("************************************");
            
            String expression01 = "/Map/Column/Node/type";
            String expressionX = "/Map/Size/x";
            String expressionY = "/Map/Size/y";
            NodeList nodeList01 = 
            		(NodeList) xPath.compile(expression01).evaluate(xmlDocument, XPathConstants.NODESET);
            int x = Integer.parseInt(xPath.compile(expressionX).evaluate(xmlDocument));
            int y = Integer.parseInt(xPath.compile(expressionY).evaluate(xmlDocument));
            
            for (int i = 0; i < nodeList01.getLength(); i++) {
            	DoubleList<String> column = new DoubleList<String>();
            	for (int j = 1; j <= x; j++ ){
            		column.append(nodeList01.item(i).getFirstChild().getNodeValue());
            	}
            	map.append(column);
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
		return map;
	}	
}
