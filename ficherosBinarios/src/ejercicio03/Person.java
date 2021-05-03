package ejercicio03;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
	
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private transient Date fechaNacimiento;
	
	public Person(String dni, String nombre, String apellido1, String apellido2, Date fechaNacimiento) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
		
	}
	
	public Person (String dni, String nombre, String apellido1, String apellido2) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = null;
		
	}
	
	public Person (String dni, String nombre, String apellido1) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = null;
		this.fechaNacimiento = null;
		
	}
	
	public String getDni() { return dni; }
	public String getNombre() { return nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	public String getApellido1() { return apellido1; }
	public void setApellido1() { this.apellido1 = apellido1; }
	public String getApellido2() { return apellido2; }
	public void setApellido2() { this.apellido2 = apellido2; }
	public Date getFechaNacimiento() { return fechaNacimiento; }
	public void setFechaNacimiento() { this.fechaNacimiento = fechaNacimiento; }
	
	

}