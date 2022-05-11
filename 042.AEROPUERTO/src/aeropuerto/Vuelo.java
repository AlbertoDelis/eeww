package aeropuerto;

public interface Vuelo {
	String getCodigo();
	Double getPrecio();
	
	void setPrecio(Double precio);
	int compareTo(Vuelo o);
	

}
