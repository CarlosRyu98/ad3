package org.jesuitaslarioja.ficherosJSON;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Serializacion {
	
	public static void showJSON(Coche coche) {
		
		Gson g = new Gson();
		String cocheJSON = g.toJson(coche);
		System.out.println(cocheJSON);
		
	}
	
	public static String generateJSON(Coche coche) {

		Gson g = new Gson();
		String cocheJSON = g.toJson(coche);
		
		return cocheJSON;
		
	}
	
	public static void guardarObjetoJSON(Coche coche, String fichero) {
		
		Gson g = new Gson();
		String cocheJSON = g.toJson(coche);
		
		try {
			
			PrintWriter pw = new PrintWriter(new File(fichero));
			pw.println(generateJSON(coche));
			
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static List<Coche> listaCochesSerializada(String fichero) {
		
		List<Coche> listaCoches= new ArrayList<Coche>();
		
		Gson g = new Gson();
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(fichero));
			
			String linea;
			while((linea = br.readLine()) != null) {
				
				Coche coche = g.fromJson(linea, Coche.class);
				
				listaCoches.add(coche);
				
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listaCoches;
	}

}
