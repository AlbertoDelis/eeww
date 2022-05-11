package ea_ficheroData_Singleton;

import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {
	public static void graba(boolean append) throws IOException {
		AccesoDatos ad= AccesoDatos.getInstancia();
		ad.abreSalida(false);
		ad.abreSalida2(false);
		//ad.leeAlumno();

		Alumno[] alumnos = new Alumno[] { new Alumno(1, "María 1", new byte[] { 10, 5, 5, 5 }),
				new Alumno(12, "Andrés 2", new byte[] { 6, 10, 6, 6 }),
				new Alumno(113, "Pedro 3", new byte[] { 8, 3, 7, 3 }),
				new Alumno(1114, "Virginia 4", new byte[] { 10, 3, 7, 3 }),
				new Alumno(11115, "Antonio 5", new byte[] { 9, 3, 7, 3 }),
				new Alumno(1116, "Pedro 6", new byte[] { 9, 7, 10, 10 }),
				new Alumno(117, "Marta 7", new byte[] { 3, 3, 7, 3 }),
				new Alumno(18, "Luís 8", new byte[] { 4, 6, 5, 4 }) };
		try {
			for (Alumno uno : alumnos) {
				AccesoDatos.getInstancia().grabaAlumno(uno);
				System.out.println(uno);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//ad.cierra();
	}

	public static void lee() throws IOException {
		AccesoDatos ad= AccesoDatos.getInstancia();
		ad.abreEntrada2();
		Alumno a;
		boolean eof = false;
		try {
			a = ad.leeAlumno();
			while (!eof) {
				System.out.println(a);
				a = ad.leeAlumno();
			}
		} catch (EOFException e) {
			eof = true;
		}
		ad.cierra();
	}


	public static void main(String[] args) throws Throwable {
		graba(false);
		lee();
		// graba(true);
		// lee();
		// parte();
	}
}
