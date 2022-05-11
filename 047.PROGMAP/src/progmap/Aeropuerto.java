package progmap;

import java.util.*;

public class Aeropuerto {

	// b) Un método que devuelva una estructura que cuente el numero de pasajeros
	// para
	// cada dia.

	public Map<Fecha, Integer> getPasajerosPorDia() { // LocalDate o Fecha
		Map<Fecha, Integer> pasajerosDia = new HashMap<>();
		for (Vuelo vuelo : this.vuelos) {
			if (pasajerosDia.containsKey(vuelo.getFecha())) {
				int numPas = pasajerosDia.get(vuelo.getFecha);
				pasajerosDia.put(vuelo.getFecha(), numPas + vuelo.getNumPasajeros());
			} else {
				pasajerosDia.put(vuelo.getFecha(), vuelo.getNumPasajeros());

			}
			return pasajerosDia;
		}

	}

	// a) Un método que devuelva una estructura que relacione cada fecha con todos
	// los
	// vuelos programados para ese dia.

	public Map<Fecha, List<Vuelo>> getVuelosPorDia() { // LocalDate o Fecha
		Map<Fecha, List<Vuelo>> vuelosDia = new HashMap<>();
		for (Vuelo vuelo : this.vuelos) {
			if (vuelosDia.containsKey(vuelo.getFecha())) {
				vuelosDia.get(vuelo.getFecha().add(vuelo));
				//List<Vuelo> listaVuelosDia = vuelosDia.get(vuelo.getFecha);
				//listaVuelosDia.add(vuelo);
				//vuelosDia.put(vuelo.getFecha(), listaVuelosDia);	
			} else {
				vuelosDia.put(vuelo.getFecha(), new ArrayList<Vuelo>());
			}
			return vuelosDia;
		}

	}
	
	

}