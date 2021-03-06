package aeropuerto;

import java.time.LocalDate;
import java.util.Objects;

public class VueloImpl implements Vuelo{
	private String destino;
	private Double precio;
	private Integer numPlazas; // debe ser positivo
	private Integer numPasajeros; // debe ser positivo y menor de numPlazas
	private String codigo;
	private String fecha; // posterior al a?o 2000
	
	public VueloImpl() {	
	}

	public VueloImpl(String destino, Double precio, Integer numPlazas, Integer numPasajeros, String codigo,
			String fecha) {
		super();
		this.destino = destino;
		this.precio = precio;
		this.numPlazas = numPlazas;
		this.numPasajeros = numPasajeros;
		this.codigo = codigo;
		this.fecha = fecha;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(Integer numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public String getDestino() {
		return destino;
	}

	public Integer getNumPlazas() {
		return numPlazas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	@Override
	public int compareTo (Vuelo o) {
		int c=this.getFecha().compareTo(o.getFecha);
		if (c==0)
			c=this.getCodigo().compareTo(Vuelo.getCodigo());
		return c;
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VueloImpl other = (VueloImpl) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return "VueloImpl [destino=" + destino + ", precio=" + precio + ", numPlazas=" + numPlazas + ", numPasajeros="
				+ numPasajeros + ", codigo=" + codigo + ", fecha=" + fecha + "]";
	}
	
	

	

}
