package centralita;

public class Local extends Llamada {
	private double precio;
	
	public Local(String origen, String destino, int duracion) {
		super(origen, destino, duracion);
		this.precio=15;
		
	}

	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public double calculaPrecio() {
		return getDuracion()*precio;
	}

	@Override
	public String toString() {
		return "Local [precio=" + precio + ", toString()=" + super.toString() + "]";
	}
	
	

}
