package eb_ficheroData;

import java.io.EOFException;
import java.io.IOException;

public class Principal {
	public static void graba() throws IOException {
		GrabaObjetoAlumno accesoAdatosGraba = new GrabaObjetoAlumno(false);
		Alumno[] alumnos = new Alumno[] { 
				new Alumno(1, "María 1", new byte[] { 5, 5, 5, 5 }),
				new Alumno(2, "Andrés 2", new byte[] { 6, 6, 6, 6 }),
				new Alumno(3, "Pedro 3", new byte[] { 3, 3, 3, 3 }),
				new Alumno(4, "Luís 4", new byte[] { 4, 4, 4, 4 }) };

		for (Alumno uno : alumnos) {
			try {
				System.out.println(uno);
				accesoAdatosGraba.grabaAlumno(uno);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		accesoAdatosGraba.cierra();
	}

	public static void lee() throws IOException {
		LeeObjetoAlumno accesoAdatosLee = new LeeObjetoAlumno();
		Alumno a;
		boolean eof = false;
		try {
			a = accesoAdatosLee.leeAlumno();
			while (!eof) {
				System.out.println(a);
				a = accesoAdatosLee.leeAlumno();
			}
		} catch (EOFException e) {
			eof = true;
		}
	}

	public static void main(String[] args) throws Throwable {
		// graba();
		lee();
	}
}
