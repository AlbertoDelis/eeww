package da_ficheroTexto_copy;

import java.io.IOException;

public class Principal {
	static Alumno[] alumnos = new Alumno[] { new Alumno(1, "María 1", new byte[] { 5, 5, 5, 5 }),
			new Alumno(2, "Juan 2", new byte[] { 6, 6, 6, 6 }), new Alumno(3, "Pedro 3", new byte[] { 3, 3, 3, 3 }),
			new Alumno(4, "Luís 4", new byte[] { 4, 4, 4, 4 }) };

	public static void graba() throws IOException {
		ESObjetosTexto.abreParaSalida("alumnos.txt", false);

		for (Alumno uno : alumnos) {
			try {
				System.out.println(uno);
				ESObjetosTexto.grabaAlumno(uno);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		ESObjetosTexto.cierra();
	}
	
	public static void lee() throws IOException {
		ESObjetosTexto.abreParaEntrada("alumnos.txt");
		Alumno a;
		a = ESObjetosTexto.leeAlumno();
		while (a != null) {
			System.out.println(a);
			a = ESObjetosTexto.leeAlumno();
		}
	}

	public static void main(String[] args) throws Throwable {
		graba();
		lee();
		ESObjetosTexto.grabaAprobados();
	}
}
