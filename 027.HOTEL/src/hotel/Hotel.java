package hotel;

import java.util.ArrayList;

public class Hotel {

	private ArrayList<Habitacion> listadoHabitaciones;

	public Hotel() {
		this.listadoHabitaciones = new ArrayList();
	}

	public ArrayList<Habitacion> getListadoHabitaciones() {
		return this.listadoHabitaciones;
	}

	public void insertarHabitacion(Habitacion h) {
		this.listadoHabitaciones.add(h);
	}

}
