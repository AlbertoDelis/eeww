package ejprog0504;

import java.util.Arrays;

public class Alumno {
	private Integer numero;
	private String nombre;
	private Integer curso;
	private Integer[] notas;
	
	public Alumno(Integer numero, String nombre, Integer curso, Integer[] notas) throws AlumnoException {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.curso = curso;
		setNotas(notas);
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

	public Integer[] getNotas() {
		return notas;
	}

	public void setNotas(Integer[] notas2) throws AlumnoException {
		if(notas2.length!=4)
			throw new AlumnoException("Valor inválido en las notas!!!");
		else 
			this.notas = notas2;
			
	}

	@Override
	public String toString() {
		return "Alumno: \nnumero= " + numero + ",\nnombre= " + nombre + ",\ncurso= " + curso + ",\nnotas= "
				+ Arrays.toString(notas); 
	}
	
	

}
