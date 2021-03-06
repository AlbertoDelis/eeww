package aeropuerto;

import java.util.HashSet;
import java.util.Set;

public class TestVuelo {
	public static void main(String[] args) {
		Set<Vuelo>vuelos= new HashSet<>();
		vuelos.add(new VueloImpl("Madrid", 12.37, 155, 100, "IB1123", "22/11/2007"));
		vuelos.add(new VueloImpl("Barcelona", 19.56, 200, 150, "VLG256", "22/11/2007"));
		vuelos.add(new VueloImpl("Valencia", 2.1, 150, 150, "RYA803", "22/11/2007"));
		vuelos.add(new VueloImpl("Paris", 10.0, 85, 85, "UA894", "23/11/2007"));
		vuelos.add(new VueloImpl("Madrid", 22.37, 155, 154, "IB2365", "23/11/2007"));
		vuelos.add(new VueloImpl("Bilbao", 29.56, 200, 150, "EAS286", "23/11/2007"));
		vuelos.add(new VueloImpl("Valencia", 22.4, 100, 100, "VLG127", "24/11/2007"));
		vuelos.add(new VueloImpl("Paris", 70.0, 75, 70, "EAS348", "24/11/2007"));
		vuelos.add(new VueloImpl("Madrid", 32.37, 250, 250, "AIF389", "24/11/2007"));
		vuelos.add(new VueloImpl("Barcelona", 39.56, 200, 150, "UA7810", "24/11/2007"));
		vuelos.add(new VueloImpl("Londres", 28.4, 100, 90, "IB6511", "25/11/2007"));
		vuelos.add(new VueloImpl("Paris", 80.0, 75, 75, "RYA212", "25/11/2007"));
		
		System.out.println(vuelos);
		
		
		
		
		

	}
}