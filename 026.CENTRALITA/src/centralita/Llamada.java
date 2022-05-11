package centralita;

public abstract class Llamada {
	private String origen;
	private String destino;
	private int duracion;

	public Llamada(String origen, String destino, int duracion) {
		super();
		setOrigen(origen);
		this.destino = destino;
		this.duracion = duracion;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		if(origen !=null || !origen.trim().isEmpty() || origen.length()>=9);
		this.origen=origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public abstract double calculaPrecio();

	@Override
	public String toString() {
		return "Llamada [origen=" + origen + ", destino=" + destino + ", duracion=" + duracion + "]";
	}
	
	

}
