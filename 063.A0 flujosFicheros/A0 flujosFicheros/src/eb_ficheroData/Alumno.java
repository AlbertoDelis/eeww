/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eb_ficheroData;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileWriter;
import java.io.IOException;

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

	public Alumno(int num, String nom, byte[] not) {
		nAlumno = num;
		nombre = nom;
		nota = not.clone();
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

	public String toString() {
		String salida = (nAlumno + "\t") + (nombre + "\t");
		for (byte n : nota)
			salida += (n + " ");
		salida += ("\n");
		return salida;
	}
}
