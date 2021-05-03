package ficherosXML;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ManageCochesXML {
	
	public static void serialize(Coche coche, String file) {
		
		try {
			
			XMLEncoder encoder = new XMLEncoder(new FileOutputStream("coche.xml"));
			encoder.writeObject(coche);
			encoder.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Coche deserialize(String file) {
		
		Coche coche = new Coche();
		
		try {
			
			XMLDecoder decoder = new XMLDecoder(new FileInputStream(file));
			coche = (Coche) decoder.readObject();
			decoder.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return coche;
		
	}

}
