package ejercicio03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Principal03 {
	
	public static void main(String[] args) {
		
		Person persona = new Person("00000", "Jon", "Ander", "Wido", new Date(1, 06, 31));
		
		try {
			
			FileOutputStream fos = new FileOutputStream("persona.obj");
			ObjectOutputStream salida = new ObjectOutputStream(fos);
			
			salida.writeObject(persona);
			
			salida.close();
			

			FileInputStream fis = new FileInputStream("persona.obj");
			ObjectInputStream entrada = new ObjectInputStream(fis);
			
			Person persona2 = (Person)entrada.readObject();
			
			System.out.println("Dni: " + persona2.getDni() + ", nombre: " + persona2.getNombre() + ", apellido1: " + persona2.getApellido1() + ", apellido2: " + persona2.getApellido2() + ", fecha: " + persona2.getFechaNacimiento());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}
