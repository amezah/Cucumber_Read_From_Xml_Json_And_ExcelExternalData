package util;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LectorXML {

	public static ArrayList<String> leer() {
		ArrayList<String> lista = new ArrayList<>();
		try {			
			File xmlDoc = new File("amigos.xml");
			DocumentBuilderFactory dbFact = DocumentBuilderFactory.newInstance();
			DocumentBuilder dbBuild = dbFact.newDocumentBuilder();
			Document doc = dbBuild.parse(xmlDoc);
			
			NodeList nList = doc.getElementsByTagName("amigo");
			
			for (int i = 0; i < nList.getLength(); i++) {
				Node node = nList.item(i);
				Element element = (Element) node;
				lista.add(element.getElementsByTagName("nombre").item(0).getTextContent());				
			}			
			
		}catch (Exception e) {
			System.out.println("Error leyendo XML");
			e.printStackTrace();
		}
		
		return lista;

	}

}
