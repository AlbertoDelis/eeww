package aeropuerto;

import fecha.Fecha;

public class VueloImpl implements Vuelo{
	private String destino;
	private Double precio;
	private Integer numPlazas;	// debe ser positivo
	private Integer numPasajeros;	// debe ser positivo y menor de numPlazas
	private String codigo;
	private Fecha fecha;	// posterios al año 2000
	
	
	
	public VueloImpl(String destino, Double precio, Integer numPlazas, Integer numPasajeros, String codigo,
			Fecha fecha) {
		super();
		this.destino = destino;
		this.precio = precio;
		this.numPlazas = numPlazas;
		this.numPasajeros = numPasajeros;
		this.codigo = codigo;
		this.fecha = fecha;
	}

	@Override
	public String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDestino() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fecha getFecha() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNumPasajeros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getNumPlazas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getPrecio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPrecio(Double p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNumPasajeros(Integer np) {
		// TODO Auto-generated method stub
		
	}
	

}
