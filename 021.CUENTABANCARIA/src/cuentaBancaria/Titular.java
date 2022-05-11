package cuentaBancaria;

public class Titular {
	private String nombre;
	private String apellidos;
	private String nIdentificacion;
	private int edad;
	
	public Titular(String nombre, String apellidos, String nIdentificacion, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nIdentificacion = nIdentificacion;
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getnIdentificacion() {
		return nIdentificacion;
	}

	@Override
	public String toString() {
		return String.format("Titular [nombre=%s, apellidos=%s, nIdentificacion=%s, edad=%s]", nombre, apellidos,
				nIdentificacion, edad);
	}
	
	
	
	

}
