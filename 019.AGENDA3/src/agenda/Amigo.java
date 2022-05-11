package agenda;

public class Amigo {
	private String nombre;
	private String tlf;
	private int edad;
	
	public Amigo(String nombre, String tlf, int edad) {
		super();
		this.nombre= nombre;
		this.tlf= tlf;
		this.edad= edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Amigo [nombre=" + nombre + ", tlf=" + tlf + ", edad=" + edad + "]";
	}
	
	
	
}
