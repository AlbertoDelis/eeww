package da_ficheroTexto_copy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ESObjetosTexto {
	static private FileWriter aSalida = null;
	static private BufferedReader aEntrada = null;
	//static private String nombre = "alumnos.txt";

	public static void grabaAlumno(Alumno uno) throws IOException {
		aSalida.write(uno.toString());
	}
	
	public static Alumno leeAlumno() throws IOException {
		String cadenaAlumno = aEntrada.readLine();
		if (cadenaAlumno == null)
			return null;
		else {
			String[] valorAtributo = cadenaAlumno.split("\\t+");
			String[] notas = valorAtributo[2].split(" ");
			byte[] nota = new byte[4];
			int n = 0;
			for (n = 0; n < nota.length; n++) {
				nota[n] = Byte.parseByte(notas[n]);
			}
			return new Alumno(Integer.parseInt(valorAtributo[0]), valorAtributo[1], nota);
		}
	}
	
	public static void grabaAprobados() throws IOException {
		abreParaEntrada("alumnos.txt");
		abreParaSalida("alumnosAp.txt", false);
		Alumno a;
		a = leeAlumno();
		while (a != null) {
			System.out.println(a);
			if(a.aprobado())
				grabaAlumno(a);
			a = leeAlumno();
		}
		cierra();
	}

	public static void abreParaEntrada(String nombre) throws IOException {
		try {
			aEntrada = new BufferedReader(new FileReader(nombre));
		} catch (IOException e) {
			cierraEntrada();
		}
	}

	public static void abreParaSalida(String nombre, boolean append) throws IOException {
		try {
			aSalida = new FileWriter(nombre, append);
		} catch (IOException e) {
			cierraSalida();
		}
	}

	public static void cierraSalida() throws IOException {
		if (aSalida != null)
			aSalida.close();
		aSalida = null;
	}
	public static void cierraEntrada() throws IOException {
		if (aEntrada != null)
			aEntrada.close();
		aEntrada = null;
	}
	public static void cierra() throws IOException {
		cierraEntrada();
		cierraSalida();
	}
	
	protected void finalize() throws Throwable {
		cierra();
		super.finalize();
	}

}
