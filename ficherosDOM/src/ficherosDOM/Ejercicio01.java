package ficherosDOM;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ejercicio01 {

	public static void main(String[] args) throws ParserConfigurationException {

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

		DOMImplementation dImplementation = dBuilder.getDOMImplementation();
		Document doc = dImplementation.createDocument(null, "profesor", null);
		
		Attr attr = doc.createAttribute("identificador");
		attr.setValue("0001");
		doc.getDocumentElement().setAttributeNode(attr);
		
		Element asignatura = doc.createElement("asignatura");
		doc.getDocumentElement().appendChild(asignatura);

		Attr attrNombre = doc.createAttribute("nombre");
		attrNombre.setValue("Programación de servicios y procesos");
		asignatura.setAttributeNode(attrNombre);
		Attr attrAbrv = doc.createAttribute("abreviatura");
		attrAbrv.setValue("PSP");
		asignatura.setAttributeNode(attrAbrv);

		Element bibliografia = doc.createElement("bibliografia");
		
		Element libro = doc.createElement("libro");
		Attr attrLibro = doc.createAttribute("id");
		attrLibro.setValue("l1_psp");
		libro.setAttributeNode(attrLibro);
		libro.appendChild(doc.createTextNode("PSP libro1"));
		bibliografia.appendChild(libro);
		
		Element libro2 = doc.createElement("libro");
		Attr attrLibro2 = doc.createAttribute("id");
		attrLibro2.setValue("l2_psp");
		libro2.setAttributeNode(attrLibro2);
		libro2.appendChild(doc.createTextNode("PSP libro2"));
		bibliografia.appendChild(libro2);
		
		asignatura.appendChild(bibliografia);
		
		Element alumnos = doc.createElement("alumnos");
		
		Element alumno = doc.createElement("alumno");
		Attr attrAlumno = doc.createAttribute("id");
		attrAlumno.setValue("a1");
		alumno.setAttributeNode(attrAlumno);
		alumno.appendChild(doc.createTextNode("Carlos Saenz Adan"));
		alumnos.appendChild(alumno);
		
		asignatura.appendChild(alumnos);
		
		//as2
		
		Element asignatura2 = doc.createElement("asignatura");
		doc.getDocumentElement().appendChild(asignatura2);
		
		Attr attrNombre2 = doc.createAttribute("nombre");
		attrNombre2.setValue("Acceso a datos");
		asignatura2.setAttributeNode(attrNombre2);
		Attr attrAbrv2 = doc.createAttribute("abreviatura");
		attrAbrv2.setValue("AD");
		asignatura2.setAttributeNode(attrAbrv2);

		Element bibliografia2 = doc.createElement("bibliografia");
		
		Element libro3 = doc.createElement("libro");
		Attr attrLibro3 = doc.createAttribute("id");
		attrLibro3.setValue("l1_ad");
		libro3.setAttributeNode(attrLibro3);
		libro3.appendChild(doc.createTextNode("AD libro1"));
		bibliografia2.appendChild(libro3);
		
		Element libro4 = doc.createElement("libro");
		Attr attrLibro4 = doc.createAttribute("id");
		attrLibro4.setValue("l2_ad");
		libro4.setAttributeNode(attrLibro4);
		libro4.appendChild(doc.createTextNode("AD libro2"));
		bibliografia2.appendChild(libro4);
		
		asignatura2.appendChild(bibliografia2);
		
		Element alumnos2 = doc.createElement("alumnos");
		
		Element alumno2 = doc.createElement("alumno");
		Attr attrAlumno2 = doc.createAttribute("id");
		attrAlumno2.setValue("a2");
		alumno2.setAttributeNode(attrAlumno2);
		alumno2.appendChild(doc.createTextNode("Pedro García Martínez"));
		alumnos2.appendChild(alumno2);
		
		asignatura2.appendChild(alumnos2);

		try {

			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);

			StreamResult result = new StreamResult(new File("profesor.xml"));
			transformer.transform(source, result);

		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
