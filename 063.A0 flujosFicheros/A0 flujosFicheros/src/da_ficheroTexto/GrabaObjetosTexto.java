package da_ficheroTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GrabaObjetosTexto {
	private FileWriter fSalida = null;
	private BufferedWriter bSalida = null;
	private String nombre = "alumnos.txt";

	// Por defecto abierto para escritura
	public GrabaObjetosTexto(boolean append) throws IOException {
		try {
			fSalida = new FileWriter(nombre, append);
			bSalida = new BufferedWriter(fSalida);
		} catch (IOException e) {
			try {
				//cierra();
				if (bSalida != null)
					bSalida.close();
				if (fSalida != null)
					fSalida.close();
			} finally {
				throw new IOException();
			}
		}
	}

	public void cierra() throws IOException {
		if (bSalida != null)
			bSalida.close();
		if (fSalida != null)
			fSalida.close();
		fSalida = null;
		bSalida = null;
	}

	protected void finalize() throws Throwable {
		cierra();
		super.finalize();
	}

	public void grabaAlumno(Alumno uno) throws IOException {
		bSalida.write(uno.toString());
	}
}
