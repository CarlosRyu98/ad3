package org.jesuitaslarioja.ficherosJSON;

import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		// From Java to JSON
//		Persona persona = new Persona("111111", "Lelouch", "vi Britannia");
//		Gson g = new Gson();
//		String personaJSON = g.toJson(persona);
//		System.out.println(personaJSON);
//
//		try {
//			PrintWriter pw = new PrintWriter(new FileWriter("listaPersonas.json", true));
//			pw.println(personaJSON);
//			pw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// From JSON to Java
		String personaJSON = "{\"dni\":\"111111\",\"nombre\":\"Leluch\",\"apellido\":\"vi Britannia\"}";
		Gson g = new Gson();
		Persona persona = g.fromJson(personaJSON, Persona.class);
		System.out.println(persona.toString());

	}
	
}
