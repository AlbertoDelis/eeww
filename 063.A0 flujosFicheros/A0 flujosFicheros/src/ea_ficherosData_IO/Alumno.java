/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_ficherosData_IO;

import java.io.PrintStream;

/**
 *
 * @author ali
 */
public class Alumno {
	private int nAlumno;
	private String nombre;
	private byte nota[];

	public Alumno() {
		nAlumno = 0;
		nombre = null;
		nota = new byte[] { 0, 0, 0, 0 };
	}

	public Alumno(int num, String nom, byte[] nota) {
		this.nAlumno = num;
		this.nombre = nom;
		this.nota = nota.clone();
	}

	public int getnAlumno() {
		return nAlumno;
	}

	public String getNombre() {
		return nombre;
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
	
	public String toString() {
		String salida = String.format("%5d %-20s", nAlumno, nombre);
		for (byte n : nota)
			salida += String.format("%4d", n);
		salida += ("\n");
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
