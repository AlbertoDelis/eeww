/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za_flujos_object_menu;

import java.io.PrintStream;
import java.io.Serializable;

/**
 *
 * @author ali
 */
public class Alumno extends Persona{
	private int nAlumno;
	private String nombre;
	private Fecha fNaci;
	private int curso;
	private byte nota[];

	public Alumno() {
		nAlumno = 0;
		nombre = null;
		curso= 0;
		nota = new byte[] { 0, 0, 0, 0 };
		fNaci= new Fecha();
	}

	public Alumno(int num, String nom, int curso, byte[] nota) {
		this.nAlumno = num;
		this.nombre = nom;
		this.curso= curso;
		this.nota = nota.clone();
	}

	public int getnAlumno() {
		return nAlumno;
	}

	public String getNombre() {
		return nombre;
	}
	public void setCurso(int curso) {
		this.curso= curso;
	}
	public int getCurso() {
		return curso;
	}

	public byte[] getNota() {
		return nota;
	}
	
	public int numeroSuspensos(){
		int suspensos= 0;
		for (byte b : nota) {
			suspensos += b < 5 ? 1 : 0;
		}
		return suspensos;
	}
	public boolean aprobado() {
		return this.numeroSuspensos() == 0;
	}
	public String toString() {
		String salida = String.format("%5d %-20s %4d", nAlumno, nombre, curso);
		for (byte n : nota)
			salida += String.format("%4d", n);
		salida += ("");
		return salida;
	}
	
/*
	public String toString() {
		String salida = (nAlumno + "\t") + (nombre + "\t");
		for (byte n : nota)
			salida += (n + " ");
		salida += ("\n");
		return salida;
	}
*/
}
