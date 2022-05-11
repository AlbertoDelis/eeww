package aeropuerto;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	public Fecha(int dia, int mes, int anio) {
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	public void setDia(int dia) {
		this.dia=dia;
	}
	public void setMes (int mes) {
		this.mes=mes;
		
	}
	public void setAnio(int anio) {
		this.anio=anio;
		
	}
	public int getDia() {
		return this.dia;
	}
	public int getMes() {
		return this.mes;

	}
	public int getAnio() {
		return this.anio;
	}
	
	
	@Override
	public String toString() {
		return "La fecha es: "+dia+"/"+mes+"/"+anio;
	}
	
	


}
