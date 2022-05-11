package aeropuerto;

import fecha.Fecha;

public interface Vuelo {
	String getCodigo();
	String getDestino();
	Fecha getFecha();
	Integer getNumPasajeros();
	Integer getNumPlazas();
	Double getPrecio();
	void setPrecio(Double p);
	void setNumPasajeros(Integer np);
	

}
