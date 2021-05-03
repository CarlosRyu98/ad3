package ficherosXML;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ManageObjectsXML2 {

	public void serialize(List<Coche> coches, String file) {

		try {

			XMLEncoder encoder = new XMLEncoder(new FileOutputStream("coches.xml"));

			for (Coche coche : coches) {

				encoder.writeObject(coche);

			}

			encoder.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Coche> deserialize(String file) {

		List<Coche> coches = new ArrayList<Coche>();

		try {

			XMLDecoder decoder = new XMLDecoder(new FileInputStream(file));
			
			Coche coche = (Coche) decoder.readObject();

			while (coche != null) {
				
				coches.add(coche);
				
				coche = (Coche) decoder.readObject();
				
			}
			
			decoder.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return coches;

	}

}
