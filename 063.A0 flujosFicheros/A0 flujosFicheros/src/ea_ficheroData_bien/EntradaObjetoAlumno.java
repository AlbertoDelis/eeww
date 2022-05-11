package ea_ficheroData_bien;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EntradaObjetoAlumno {
	FileInputStream fEntrada;
	DataInputStream dIS;
	private String nombre = "alumnos.dat";

	// Por defecto abierto para escritura
	public EntradaObjetoAlumno() throws IOException {
		try {
			fEntrada = new FileInputStream(nombre);
			dIS = new DataInputStream(fEntrada);
		} catch (IOException e) {
			try {
				cierra();
			} finally {
				throw new IOException();
			}
		}
	}

	public void cierra() throws IOException {
		if (dIS != null)
			dIS.close();
		if (fEntrada != null)
			fEntrada.close();
		fEntrada = null;
		dIS = null;
	}

	protected void finalize() throws Throwable {
		cierra();
		super.finalize();
	}

	public Alumno leeAlumno() throws IOException {
		int numAl = dIS.readInt();
		String nomAl = dIS.readUTF();
		byte[] nota = new byte[4];
		dIS.read(nota);
		return new Alumno(numAl, nomAl, nota);
	}
}
