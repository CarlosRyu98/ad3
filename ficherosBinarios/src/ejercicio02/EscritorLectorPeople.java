package ejercicio02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import ejercicio01.Person;

public class EscritorLectorPeople {

	public static void escribirObjetos1(List<Person> listPeople, String file) {

		try {

			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(file));
			salida.writeObject(listPeople);
			salida.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<Person> leerObjetos1(String file) {

		List<Person> listaPersonas = new ArrayList<Person>();

		try {

			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(file));
			listaPersonas = (List<Person>) entrada.readObject();

			entrada.close();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaPersonas;

	}

	public static void escribirObjetos2(List<Person> listPeople, String file) {
		
		try {
			
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(file));
			
			for(Person person:listPeople) {
				
				salida.writeObject(person);
				
			}
			
			salida.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static List<Person> leerObjetos2(String file) {
		
		List<Person> listaPersonas = new ArrayList<Person>();

		try {

			ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(file));
			
			for(true) {
				
				listaPersonas.add(entrada.readObject());
				
			}
			
			entrada.close();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listaPersonas;
		
	}

}
