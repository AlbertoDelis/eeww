package instituto;

public class Asignatura {
	private String nombre;
	private int precio;
	
	public Asignatura() {
		this.nombre=null;
		this.precio=0;
	}

	public Asignatura(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", precio=" + precio + "]";
	}
	
	
	
	
	
	

}
