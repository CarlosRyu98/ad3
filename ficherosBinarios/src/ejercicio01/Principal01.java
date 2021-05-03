package ejercicio01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Principal01 {
	
	public static void main(String[] args) {
		
		String str1 = "Me quedo en casa";
		Integer i1 = 288;
		Person p1 = new Person("11111", "Carlos", "Saenz", "Adan", new Date());
		String str2 = "Me quedo en casa 2";
		Person p2 = new Person("22222", "Ada", "Lovelace");
		
		try {
			
			FileOutputStream fos = new FileOutputStream("mixObjetos.dat");
			ObjectOutputStream salida = new ObjectOutputStream(fos);
			
			salida.writeObject(str1);
			salida.writeObject(i1);
			salida.writeObject(p1);
			salida.writeObject(str2);
			salida.writeObject(p2);
			
			salida.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
