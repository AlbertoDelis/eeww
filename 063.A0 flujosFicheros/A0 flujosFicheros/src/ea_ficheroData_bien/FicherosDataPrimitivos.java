/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ea_ficheroData_bien;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author ali
 */
public class FicherosDataPrimitivos {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void leeFicheroDatos() {
		boolean fF = false;
		FileInputStream fEntrada = null;
		DataInputStream dIS = null;
		Alumno unAlumno = new Alumno();
		try {
			fEntrada = new FileInputStream("alumnos.dat");
			dIS = new DataInputStream(fEntrada);
			while (!fF) {
				fEntrada.leeAlumno(dIS);
				System.out.print(unAlumno);
			}
			dIS.close();
			fEntrada.close();
		} catch (EOFException e) {
			fF = true;
		} catch (IOException e) {
		}
	}

	public static void grabaFicheroDatos() {
		Alumno[] a = new Alumno[] { new Alumno(1, "María 1", new byte[] { 5, 5, 5, 5 }),
				new Alumno(2, "Andrés 2", new byte[] { 6, 6, 6, 6 }), new Alumno(3, "Pedro 3", new byte[] { 3, 3, 3, 3 }),
				new Alumno(4, "Luís 4", new byte[] { 4, 4, 4, 4 }) };
		try {
			FileOutputStream fSalida = new FileOutputStream("alumnos.dat");
			DataOutputStream dOS = new DataOutputStream(fSalida);
			for (Alumno uno : a) {
				uno.grabaAlumno(dOS);
			}
			dOS.close();
			fSalida.close();
		} catch (IOException e) {
		} finally {
		}
	}

	public static void grabaFicheroDatosCategoria() {
		byte[] activo = new byte[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int[] nCat = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] desc = new String[] { "Cat 0", "Cat 1", "Cat 2", "Cat 3", "Cat 4", "Cat 5", "Cat 6", "Cat 7", "Cat 8", "Cat 9" };
		int[] descuento = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try {
			FileOutputStream fSalida = new FileOutputStream("categorias.dat");
			DataOutputStream dOS = new DataOutputStream(fSalida);
			for (int n = 0; n < 10; n++) {
				dOS.writeByte(activo[n]);
				dOS.writeInt(nCat[n]);
				dOS.writeUTF(desc[n] + "                           ");
				dOS.writeInt(descuento[n]);
			}
			dOS.close();
			fSalida.close();
		} catch (IOException e) {
		} finally {
		}
	}

	public static void main(String[] args) {
		grabaFicheroDatosCategoria();
		System.out.println("Se acabó");
		// leeFicheroDatos();
	}
}
