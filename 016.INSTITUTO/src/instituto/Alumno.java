package instituto;

import java.util.ArrayList;


public class Alumno {
	private String nombre;
	private String dni;
	private String curso;
	private String grupo;
	private ArrayList<String> matricula;
	
	public Alumno() {
		this.nombre = null;
		this.dni = null;
		this.curso = null;
		this.grupo = null;
		this.matricula = null;
	}
	
	public Alumno(String nombre, String dni, String curso, String grupo) {
		this.nombre = nombre;
		this.dni = dni;
		this.curso = curso;
		this.grupo = grupo;
		this.matricula = null;
	}

	public void setMatricularEn() {
		

	}
	

}