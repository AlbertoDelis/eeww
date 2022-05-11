package hotel;

import java.util.ArrayList;

public class TestHotel {

	public static void main(String[] args) {

		

		// PROGRAMA PRINCIPAL

		Hotel hotel = new Hotel();

		for (int i = 0; i < 3; i++) {
			LowCost lowcost=new LowCost(i+1, "LowCost", true);
			hotel.insertarHabitacion(lowcost);
			
		}

		for (int i = 0; i < 10; i++) {
			Dobles doble = new Dobles(i+4, "Doble", true, 100, 20);
			hotel.insertarHabitacion(doble);
			
		}
		
		for (int i = 0; i < 5; i++) {
			Suite suite= new Suite(i+14, "Suite", true, 200);
			hotel.insertarHabitacion(suite);
			
		}

		// El foreach se recorre de principio a fin, solo cuando el array tiene 1 o
		// varios elementos.
		// El for normal, se usa para recorrer una cierta cantidad de elementos.
		// El .length se usa para arrays (estaticos [])
		// El .size() para arrayList (dinámicos)

		for (int i = 0; i < hotel.getListadoHabitaciones().size(); i++) {
			System.out.println(hotel.getListadoHabitaciones().get(i));
		}

	}

}
