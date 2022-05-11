package ea_ficheroData_AD;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AccesoDatos {
	static private DataInputStream dIS;
	static private DataOutputStream dOS;

	static private String nombre = "alumnos.dat";

	/*
	 * public AccesoDatos() throws IOException { if (dIS != null || dOS != null)
	 * throw new IOException("Archivo abierto"); dOS = null; dIS = null; }
	 */
	public static void abreSalida(boolean append) throws IOException {
		if (dIS == null && dOS == null) {
			try {
				dOS = new DataOutputStream(new FileOutputStream(nombre, append));
			} catch (IOException e) {
				cierra();
			}
		} else
			// o bien cerramos y abrimos en el modo pedido
			throw new IOException("Archivo ya abierto");
	}

	public static void abreEntrada() throws IOException {
		if (dIS == null && dOS == null) {
			try {
				dIS = new DataInputStream(new FileInputStream(nombre));
			} catch (IOException e) {
				cierra();
			}
		} else
			// o bien cerramos y abrimos en el modo pedido
			throw new IOException("Archivo ya abierto");
	}

	public static void cierra() throws IOException {
		if (dIS != null)
			dIS.close();
		dIS = null;
		if (dOS != null)
			dOS.close();
		dOS = null;
	}

	protected void finalize() throws Throwable {
		cierra();
		super.finalize();
	}

	public static Alumno leeAlumno() throws IOException {
		if (dIS != null) {
			int numAl = dIS.readInt();
			String nomAl = dIS.readUTF();
			byte[] nota = new byte[4];
			dIS.read(nota);
			return new Alumno(numAl, nomAl, nota);
		} else
			throw new IOException("Archivo no abierto");
	}

	public static void grabaAlumno(Alumno al) throws IOException {
		if (dOS != null) {
			dOS.writeInt(al.getnAlumno());
			dOS.writeUTF(al.getNombre());
			dOS.write(al.getNota());
		} else
			throw new IOException("Archivo no abierto");
	}
}
