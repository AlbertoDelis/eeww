package da_ficheroTexto;

import java.io.IOException;

public class Principal {
	public static void graba() throws IOException {
		GrabaObjetosTexto accesoAdatosGraba = new GrabaObjetosTexto(false);
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
		LeeObjetosTexto accesoAdatosLee = new LeeObjetosTexto();
		Alumno a;
		a = accesoAdatosLee.leeAlumno();
		while (a != null) {
			System.out.println(a);
			a = accesoAdatosLee.leeAlumno();
		}
	}

	public static void main(String[] args) throws Throwable {
		// graba();
		lee();
	}
}
