package instituto;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private String nif;
	private LocalDate fechaNac;
	
	public Persona(String nombre, String nif, LocalDate fechaNac) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", nif=" + nif + ", fechaNac=" + fechaNac + "]";
	}

}
