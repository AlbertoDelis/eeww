package instituto;

import java.time.LocalDate;
import java.util.Arrays;

public class Alumno extends Persona {
	private int nMatricula;
	private int curso;
	private String grupo;
	private int notas[];
		
	public Alumno(String nombre, String nif, LocalDate fechaNac, int nMatricula, int curso, int i, int[] notas, String grupo) {
		super(nombre, nif, fechaNac);
		this.nMatricula = nMatricula;
		this.curso = curso;
		this.grupo = grupo;
		this.notas = notas;
	}

	public int getnMatricula() {
		return nMatricula;
	}

	public void setnMatricula(int nMatricula) {
		this.nMatricula = nMatricula;
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

	public int[] getNotas() {
		return notas;
	}

	public void setNotas(int[] notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		return "Alumno [nMatricula=" + nMatricula + ", curso=" + curso + ", grupo=" + grupo + ", notas="
				+ Arrays.toString(notas) + "]";
	}

}
