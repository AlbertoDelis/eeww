package vehiculos;

import java.time.*;
import java.util.*;

public class BbddConcesionario {
	private Set<Integer> numIdent;
	private List<String> marca;
	private List<String> modelo;
	private Set<Integer> matricula;
	private List<String> color;
	private List<Integer> kms;
	private List<LocalDate> fechaVenta;
	
	public BbddConcesionario(SortedSet<Integer> numIdent, ArrayList<String> marca, ArrayList<String> modelo,
			SortedSet<Integer> matricula, ArrayList<String> color, ArrayList<Integer> kms,
			ArrayList<LocalDate> fechaVenta) {
		this.numIdent = new HashSet<>();
		this.marca = new ArrayList<>();
		this.modelo = new ArrayList<>();
		this.matricula = new HashSet<>();
		this.color = new ArrayList<>();
		this.kms = new ArrayList<>();
		this.fechaVenta = new ArrayList<>();
	}

	public Set<Integer> getNumIdent() {
		return numIdent;
	}

	public void setNumIdent(Set<Integer> numIdent) {
		this.numIdent = numIdent;
	}

	public List<String> getMarca() {
		return marca;
	}

	public void setMarca(List<String> marca) {
		this.marca = marca;
	}

	public List<String> getModelo() {
		return modelo;
	}

	public void setModelo(List<String> modelo) {
		this.modelo = modelo;
	}

	public Set<Integer> getMatricula() {
		return matricula;
	}

	public void setMatricula(Set<Integer> matricula) {
		this.matricula = matricula;
	}

	public List<String> getColor() {
		return color;
	}

	public void setColor(List<String> color) {
		this.color = color;
	}

	public List<Integer> getKms() {
		return kms;
	}

	public void setKms(List<Integer> kms) {
		this.kms = kms;
	}

	public List<LocalDate> getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(List<LocalDate> fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	@Override
	public String toString() {
		return "BbddConcesionario [numIdent=" + numIdent + ", marca=" + marca + ", modelo=" + modelo + ", matricula="
				+ matricula + ", color=" + color + ", kms=" + kms + ", fechaVenta=" + fechaVenta + "]";
	}
	
	
	
	
	

}
