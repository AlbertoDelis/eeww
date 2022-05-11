package vehiculos;

import java.time.LocalDate;

public class Vehiculo {
	private Integer numIdent;
	private String marca;
	private String modelo;
	private String matricula;
	private String color;
	private Integer kms;
	private LocalDate fechaVenta;
	
	public Vehiculo(Integer numIdent, String marca, String modelo, String matricula, String color, Integer kms,
			LocalDate fechaVenta) {
		this.numIdent = numIdent;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.color = color;
		this.kms = kms;
		this.fechaVenta = fechaVenta;
	}

	public Integer getNumIdent() {
		return numIdent;
	}

	public void setNumIdent(Integer numIdent) {
		this.numIdent = numIdent;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getKms() {
		return kms;
	}

	public void setKms(Integer kms) {
		this.kms = kms;
	}

	public LocalDate getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDate fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	@Override
	public String toString() {
		return "Vehiculo [numIdent=" + numIdent + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula
				+ ", color=" + color + ", kms=" + kms + ", fechaVenta=" + fechaVenta + "]";
	}
	
	
	
	

}
