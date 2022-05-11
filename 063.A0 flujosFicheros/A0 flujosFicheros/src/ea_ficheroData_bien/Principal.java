package ea_ficheroData_bien;

import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {
	public static void graba(boolean append) throws IOException {
		SalidaObjetoAlumno accesoAdatosSalida = new SalidaObjetoAlumno(append);
		Alumno[] alumnos = new Alumno[] { 
				new Alumno(1, "María 1", new byte[] { 10, 5, 5, 5 }),
				new Alumno(12, "Andrés 2", new byte[] { 6, 10, 6, 6 }), 
				new Alumno(113, "Pedro 3", new byte[] { 8, 3, 7, 3 }),
				new Alumno(1114, "Virginia 4", new byte[] { 10, 3, 7, 3 }),
				new Alumno(11115, "Antonio 5", new byte[] { 9, 3, 7, 3 }),
				new Alumno(1116, "Pedro 6", new byte[] { 9, 7, 10, 10 }),
				new Alumno(117, "Marta 7", new byte[] { 3, 3, 7, 3 }),
				new Alumno(18, "Luís 8", new byte[] { 4, 6, 5, 4 }) };

		for (Alumno uno : alumnos) {
			try {
				System.out.println(uno);
				accesoAdatosSalida.grabaAlumno(uno);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		accesoAdatosSalida.cierra();
	}
	

	public static void lee() throws IOException {
		EntradaObjetoAlumno accesoAdatosEntrada = new EntradaObjetoAlumno();
		Alumno a;
		boolean eof = false;
		try {
			a = accesoAdatosEntrada.leeAlumno();
			while (!eof) {
				System.out.println(a);
				a = accesoAdatosEntrada.leeAlumno();
			}
		} catch (EOFException e) {
			eof = true;
		}
		accesoAdatosEntrada.cierra();
	}
	public static void parte() throws IOException {
		String fAprobados= "aprobados.txt";
		String fSuspensos= "suspensos.txt";
		EntradaObjetoAlumno accesoAdatosEntrada = new EntradaObjetoAlumno();
		PrintWriter aprobados= new PrintWriter(fAprobados);
		PrintWriter suspensos= new PrintWriter(fSuspensos);
		Alumno a;
		boolean eof = false;
			while (!eof) {
				try {
					a = accesoAdatosEntrada.leeAlumno();
					if(a.numeroSuspensos() == 0)
						aprobados.print(a);
					else
						suspensos.print(a);
				}catch (EOFException e) {
					eof = true;
				}
			}
			accesoAdatosEntrada.cierra();
			aprobados.close();
			suspensos.close();
	}

	public static void main(String[] args) throws Throwable {
		graba(false);
		lee();
		//graba(true);
		//lee();
		//parte();
	}
}
