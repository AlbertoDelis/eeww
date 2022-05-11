/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package za_flujos_menu;

/**
 *
 * @author ali
 */
public class Alumno implements Comparable<Alumno>{
	private int nAlumno;
	private String nombre;
	private int curso;
	private byte nota[];

	public Alumno() {
		nAlumno = 0;
		nombre = null;
		curso= 0;
		nota = new byte[] { 0, 0, 0, 0 };
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
		String salida = String.format("%5d %-20s", nAlumno, nombre);
		for (byte n : nota)
			salida += String.format("%4d", n);
		salida += ("\n");
		return salida;
	}

	@Override
	public int compareTo(Alumno a) {
		return this.getnAlumno() - a.getnAlumno();
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
