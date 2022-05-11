package hotel;

public class Dobles extends Habitacion{
	private int precio;
	private int incremento;
	
	public Dobles(int numeroHabitacion, String tipoHabitacion, boolean ocupada, int precio, int incremento) {
		super(numeroHabitacion, tipoHabitacion, ocupada);
		this.precio = precio;
		this.incremento = incremento;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getIncremento() {
		return incremento;
	}

	public void setIncremento(int incremento) {
		this.incremento = incremento;
	}
	
	@Override
	public void checkIn() {
		super.setOcupada(false); // ocupada
	}

	@Override
	public void checkOut() {
		super.setOcupada(true); // liberar la habitacion
	}

	@Override
	public String toString() {
		return "Dobles [precio=" + precio + ", incremento=" + incremento + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
