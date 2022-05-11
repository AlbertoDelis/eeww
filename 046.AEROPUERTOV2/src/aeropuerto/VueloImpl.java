package aeropuerto;

public class VueloImpl implements Vuelo{
	private String destino;
	private Double precio;
	private Integer numPlazas; // debe ser positivo
	private Integer numPasajeros; // debe ser positivo y menor de numPlazas
	private String codigo;
	private Fecha fecha; // posterior al año 2000
	
	
	
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
	public String getDestino() {
		return this.destino;
	}
	@Override
	public Double getPrecio() {
		return this.precio;
	}
	@Override
	public Integer getNumPlazas() {
		return this.numPlazas;
	}
	@Override
	public Integer getNumPasajeros() {
		return this.numPasajeros;
	}
	@Override
	public String getCodigo() {
		return this.codigo;
	}
	@Override
	public Fecha getFecha() {
		return this.fecha;
	}
	@Override
	public void setPrecio() {
		this.precio=precio;
		
	}
	@Override
	public void setNumPasajeros() {
		this.numPasajeros=numPasajeros;
		
	}
	
	
	

}
