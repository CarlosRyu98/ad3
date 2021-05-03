package ficherosXML;

public class Coche {
	
	private String matricula;
	private String marca;
	private Persona idPropietario;
	private String modelo;

	public Coche() {
	}

	public Coche(String matricula, String marca, Persona idPropietario, String modelo) {
	 this.matricula = matricula;
	 this.marca = marca;
	 this.idPropietario = idPropietario;
	 this.modelo = modelo;
	 }

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Persona getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(Persona idPropietario) {
		this.idPropietario = idPropietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
