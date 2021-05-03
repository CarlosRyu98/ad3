package ficherosXML;

import java.util.ArrayList;
import java.util.List;

public class PrincipalEj03 {
	
	public static void main(String[] args) {
		
		List<Persona> listaPersonas = new ArrayList<Persona>();
		List<Persona> listaPersonas2 = new ArrayList<Persona>();

		listaPersonas.add(new Persona("11", "Shinji", "Ikari"));
		listaPersonas.add(new Persona("22", "Rei", "Ayanami"));
		listaPersonas.add(new Persona("33", "Asuka", "Langley"));
		
		ManageObjectsXMLGenerica.serialize(listaPersonas, "l1.xml");
		
		listaPersonas2 = (List<Persona>) ManageObjectsXMLGenerica.deserialize("l1.xml");
		
	}

}
