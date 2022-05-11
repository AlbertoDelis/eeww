/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ha_serializacion;

import java.io.*;

/**
 * 
 * @author ali
 */
public class Serializacion {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void crea() {
		FileOutputStream o;
		ObjectOutputStream oo;
		Trabajador[] t1 = { 
				new Trabajador(1, "Pepe", 21, "Avda. 1", 1000, (byte) 1, (byte) 1),
				new Trabajador(2, "Juan", 25, "Avda. 2", 2000, (byte) 0, (byte) 2),
				new Trabajador(3, "Nene", 14, "Avda. 3", 3000, (byte) 1, (byte) 3) };
		Trabajador t = null;
		try {
			o = new FileOutputStream("oPersona.obj");
			oo = new ObjectOutputStream(o);
			for (int j = 0; j < t1.length; j++) {
				t = t1[j];
				oo.writeObject(t);
			}
			oo.close();
			o.close();
		} catch (Exception e) {
		}
	}

	public static void lee() {
		FileInputStream i = null;
		ObjectInputStream oi = null;
		Trabajador t = null;

		try {
			i = new FileInputStream("oPersona.obj");
			oi = new ObjectInputStream(i);
			while (true) {
				t = (Trabajador) oi.readObject();
				System.out.print(t);
			}

		} catch (EOFException e) {
			try {
				oi.close();
				i.close();

			} catch (IOException eo) {
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
	}

	public static void leePersonas() {
		FileInputStream i = null;
		ObjectInputStream oi = null;
		Persona p = null;

		try {
			i = new FileInputStream("oPersona.obj");
			oi = new ObjectInputStream(i);
			while (true) {
				p = (Persona) oi.readObject();
				System.out.print(p);
			}

		} catch (EOFException e) {
			try {
				oi.close();
				i.close();

			} catch (IOException eo) {
			}
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		crea();
		leePersonas();
		lee();
	}
}
