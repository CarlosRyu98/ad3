package ficherosXML;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ManageObjectsXMLGenerica<T> {
	
	public void serialize(T t, String file) {
		
		try {
			
			XMLEncoder encoder = new XMLEncoder(new FileOutputStream("t.xml"));
			encoder.writeObject(t);
			encoder.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public T deserialize(String file) {
		
		T t = null;
		
		try {
			
			XMLDecoder decoder = new XMLDecoder(new FileInputStream(file));
			t = (T) decoder.readObject();
			decoder.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return t;
	}

}
