package ies;

import java.util.ArrayList;

public class Alumno {
	static final int NAS = 5;
	private String nombre;
	private String dni;
	private int curso;
	private String grupo;
	private ArrayList<Asignatura> matricula;

	public Alumno(String nombre, String dni, int curso, String grupo) {
		this.nombre = nombre;
		this.dni = dni;
		this.curso = curso;
		this.grupo = grupo;
		this.matricula = new ArrayList<>();
	}

	public boolean setMatricularEn(Asignatura as) {
		if (this.matricula.size() < NAS) {
			this.matricula.add(as);
			return true;
		}
		throw new RuntimeException("No se puede matricular en más materias!!!");
		// return false;

	}

	public boolean setBajaEn(Asignatura as) {
		return this.matricula.remove(as);
	}

	public boolean setBajaEn(String nombre) {
		int indice = 0;
		for (Asignatura asignatura : matricula) {
			if (nombre.equalsIgnoreCase(asignatura.getNombre())) {
				matricula.remove(indice);
				return true;
			}
			indice++;
		}
		return false;
	}

	public double getPrecioMatricula() {
		double precio = 0;
		for (Asignatura asignatura : matricula) {
			if (asignatura != null)
				precio += asignatura.getPrecio();
		}
		return precio;
	}
	
	public Asignatura getAsignatura(int n) {
		if(n<5)
			return this.matricula.get(n);
		return null;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + ", curso=" + curso + ", grupo=" + grupo + ", matricula="
				+ matricula + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public ArrayList<Asignatura> getMatricula() {
		return matricula;
	}

	public void setMatricula(ArrayList<Asignatura> matricula) {
		this.matricula = matricula;
	}

	public static int getNas() {
		return NAS;
	}
	
	
	
	

}
