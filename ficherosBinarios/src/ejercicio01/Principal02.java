package ejercicio01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Principal02 {
	
	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("mixObjetos.dat");
			ObjectInputStream entrada = new ObjectInputStream(fis);
			
			String str1 = (String)entrada.readObject();
			System.out.println(str1);
			Integer i1 = (Integer)entrada.readObject();
			System.out.println(i1);
			Person p1 = (Person)entrada.readObject();
			System.out.println(p1.getDni() + " " + p1.getNombre());
			String str2 = (String)entrada.readObject();
			System.out.println(str2);
			Person p2 = (Person)entrada.readObject();
			System.out.println(p2.getDni() + " " + p2.getNombre());
			
			entrada.close();
			
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
