package aeropuerto;

import java.util.HashSet;
import java.util.Set;

public class AeropuertoImpl implements Aeropuerto{
	private String nombre;
	private Set<Vuelo> conjuntoVuelos;
	
	private void Aeropuerto() {
	}
	

	public AeropuertoImpl(String nombre) {
		super();
		this.nombre=nombre;
		this.conjuntoVuelos = new HashSet<>();
	}

	@Override
	public void add(Vuelo v) {
		this.conjuntoVuelos.add(v);	
	}

	@Override
	public void add(String v) {	
	}
	
	

}
