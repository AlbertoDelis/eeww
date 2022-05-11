package figher;

public  abstract class Figuras implements Figurable{
	private String tipo;
	private Punto origen;
	
	public Figuras(String tipo, Punto origen) {
		super();
		this.tipo = tipo;
		this.origen = origen;
	}
	public Figuras() {
		
	}
	

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	@Override
	public String toString() {
		return "Figuras [tipo=" + tipo + ", origen=" + origen + "]";
	}

}
