package random;

public class Registro {
	private int id;
	private String cadena;

	public Registro(int id, String cadena) {
		super();
		this.id = id;
		this.cadena = cadena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	@Override
	public String toString() {
		return "Registro [Id=" + id + ", cadena=" + cadena + "]";
	}

}
