package alumno;

import java.util.Arrays;

public class Alumno {
	private int id;
	private String nombre;
	private int []notas;

	public Alumno() {
		this.id=0;
		this.nombre="";
		this.notas= new int[3];
	}
	
	public Alumno(int id, String nombre, int[]notas) {
		this.id=id;
		this.nombre=nombre;
		this.notas=notas;	
	}
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", notas=" + Arrays.toString(notas) + "]";
	}

	public static void main(String[] args) {
		Alumno a=new Alumno();
		a.id=0;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	
	public double getMediaNotas() {
		double suma=0;
		for (int nota : this.notas) 
			suma+=suma;	
		return suma/this.notas.length;
	}
	
	public boolean isAprobado() {
		for (int notas : this.notas) {
			if (notas<5)
				return false;	
		}
		return true;
	}
	
}
	
