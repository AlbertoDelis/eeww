package da_ficheroTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeeObjetosTexto {
	private FileReader fEntrada = null;
	private BufferedReader bEntrada = null;
	private String nombre = "alumnos.txt";

	public LeeObjetosTexto() throws IOException {
		try {
			fEntrada = new FileReader(nombre);
			bEntrada = new BufferedReader(fEntrada);
		} catch (IOException e) {
			try {
				//cierra();
				if (bEntrada != null)
					bEntrada.close();
				if (fEntrada != null)
					fEntrada.close();
			} finally {
				throw new IOException();
			}
		}
	}

	public void cierra() throws IOException {
		if (bEntrada != null)
			bEntrada.close();
		if (fEntrada != null)
			fEntrada.close();
		fEntrada = null;
		bEntrada = null;
	}

	protected void finalize() throws Throwable {
		cierra();
		super.finalize();
	}

	public Alumno leeAlumno() throws IOException {
		String cadenaAlumno = bEntrada.readLine();
		if (cadenaAlumno == null)
			return null;
		else {
			String[] valorAtributo = cadenaAlumno.split("\t");
			String[] notas = valorAtributo[2].split(" ");
			byte[] nota = new byte[4];
			int n = 0;
			for (n = 0; n < nota.length; n++) {
				nota[n] = Byte.parseByte(notas[n]);
			}
			return new Alumno(Integer.parseInt(valorAtributo[0]), valorAtributo[1], nota);
		}
	}

}