package hotel;

public abstract class Habitacion {

	private int numeroHabitacion;
	private String tipoHabitacion;
	private boolean ocupada; // False (Ocupada), True (Libre)

	public Habitacion(int numeroHabitacion, String tipoHabitacion, boolean ocupada) {
		this.numeroHabitacion = numeroHabitacion;
		this.tipoHabitacion = tipoHabitacion;
		this.ocupada = ocupada;
	}

	public void setOcupada(boolean cambio) {
		this.ocupada = cambio;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public abstract void checkIn();

	public abstract void checkOut();

	@Override
	public String toString() {
		return "Habitacion [numeroHabitacion=" + numeroHabitacion + ", tipoHabitacion=" + tipoHabitacion + ", ocupada="
				+ ocupada + "]";
	}

	

}
