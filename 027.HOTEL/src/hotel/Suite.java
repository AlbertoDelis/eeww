package hotel;

public class Suite extends Habitacion {

	private int precio;

	public Suite(int numeroHabitacion, String tipoHabitacion, boolean ocupada, int precio) {
		super(numeroHabitacion, tipoHabitacion, ocupada);
		this.precio = precio;
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
		return "Suite [precio=" + precio + ", toString()=" + super.toString() + "]";
	}

	
}
