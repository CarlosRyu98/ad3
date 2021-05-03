package ficherosDOM;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Ejercicio02 {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

		Document doc = docBuilder.parse(new File("profesor.xml"));
		doc.getDocumentElement().normalize();

		System.out.print("Identificador del profesor: ");
		System.out.println(doc.getDocumentElement().getAttribute("identificador"));

		NodeList nList = doc.getElementsByTagName("profesor");
		for (int temp = 0; temp < nList.getLength(); temp++) {

			Node nNode = nList.item(temp);
			System.out.print("\nAsignaturas: ");

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;

				NodeList asNameList = eElement.getElementsByTagName("asignatura");

				for (int count = 0; count < asNameList.getLength(); count++) {

					Node node1 = asNameList.item(count);

					if (node1.getNodeType() == node1.ELEMENT_NODE) {

						Element as = (Element) node1;
						System.out.print(as.getAttribute("nombre") + ", ");

					}

				}
				
				System.out.println("\n");

			}

		}
		
		NodeList nList2 = doc.getElementsByTagName("profesor");
		for (int temp = 0; temp < nList2.getLength(); temp++) {

			Node nNode = nList2.item(temp);
			System.out.println("\nAlumnos: ");

			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) nNode;

				NodeList alNameList = eElement.getElementsByTagName("alumnos");

				for (int count = 0; count < alNameList.getLength(); count++) {

					Node node1 = alNameList.item(count);

					if (node1.getNodeType() == node1.ELEMENT_NODE) {

						Element al = (Element) node1;
						System.out.println(al.getAttribute("id") + " - " + al.getNodeValue());

					}

				}
				
				System.out.println("\n");

			}

		}
		
		System.out.println("--------------------------");

	}

}
