package centralita;

public class Provincial extends Llamada {
	private int franja;
	static final private double precio[]= {10d,20d,30d};
	
	public Provincial(String origen, String destino, int duracion, int franja) {
		super(origen, destino, duracion);
		this.franja=franja;
	}

	public int getFranja() {
		return franja;
	}

	public void setFranja(int franja) {
		this.franja = franja;
	}

	public static double[] getPrecio() {
		return precio;
	}

	@Override
	public double calculaPrecio() {
		return getDuracion()*precio[franja];
	}

	@Override
	public String toString() {
		return "Provincial [franja=" + franja + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
