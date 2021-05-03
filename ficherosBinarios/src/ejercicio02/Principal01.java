package ejercicio02;

import java.util.ArrayList;
import java.util.List;

import ejercicio01.Person;

public class Principal01 {
	
	public static void main(String[] args) {
		
		List<Person> listaPersonas = new ArrayList<Person>();

		List<Person> listaPersonas2 = new ArrayList<Person>();

		listaPersonas.add(new Person("11", "Shinji", "Ikari"));
		listaPersonas.add(new Person("22", "Rei", "Ayanami"));
		listaPersonas.add(new Person("33", "Asuka", "Langley"));
		
		EscritorLectorPeople.escribirObjetos1(listaPersonas, "l1.dat");
		
		listaPersonas2 = EscritorLectorPeople.leerObjetos1("l1.dat");
		
		listaPersonas2.forEach(p -> System.out.println(p.getDni() + " " + p.getNombre()));
		
	}

}
