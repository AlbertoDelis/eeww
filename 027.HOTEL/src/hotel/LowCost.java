package hotel;

public class LowCost extends Habitacion {

	private int precio;

	public LowCost(int numeroHabitacion, String tipoHabitacion, boolean ocupada) {
		super(numeroHabitacion, tipoHabitacion, ocupada);
		this.precio = 50;
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
		return "LowCost [precio=" + precio + ", toString()=" + super.toString() + "]";
	}

	

}
