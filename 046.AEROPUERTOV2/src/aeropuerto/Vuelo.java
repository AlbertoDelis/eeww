package aeropuerto;

public interface Vuelo {
	String getDestino();
	Double getPrecio();
	Integer getNumPlazas();
	Integer getNumPasajeros();
	String getCodigo();
	Fecha getFecha();
	void setPrecio();
	void setNumPasajeros();
	

}
