package ea_ficheroData_Singleton;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AccesoDatos {
	private static AccesoDatos unica = null;
	private DataInputStream dIS; // ahora no es necesario q sean static
	private DataOutputStream dOS;

	static private String nombre = "alumnos.dat";

	private AccesoDatos() throws IOException {
		dOS = null;
		dIS = null;
	}

	public static AccesoDatos getInstancia() throws IOException {
		if (unica == null)
			unica = new AccesoDatos();
		return unica;
	}

	public void abreSalida(boolean append) throws IOException {
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
	
	public void abreEntrada() throws IOException {
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
	
	public void abreSalida2(boolean append) throws IOException {
		// siempre cierra
		cierra();
		try {
			dOS = new DataOutputStream(new FileOutputStream(nombre, append));
		} catch (IOException e) {
			cierra();
		}
	}


	public void abreEntrada2() throws IOException {
		cierra(); // siempre cierra
		try {
				dIS = new DataInputStream(new FileInputStream(nombre));
			} catch (IOException e) {
				cierra();
			}
	}

	public void cierra() throws IOException {
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

	public Alumno leeAlumno() throws IOException {
		if (dIS != null) {
			int numAl = dIS.readInt();
			String nomAl = dIS.readUTF();
			byte[] nota = new byte[4];
			dIS.read(nota);
			return new Alumno(numAl, nomAl, nota);
		} else
			throw new IOException("Archivo no abierto para lectura");
	}

	public void grabaAlumno(Alumno al) throws IOException {
		if (dOS != null) {
			dOS.writeInt(al.getnAlumno());
			dOS.writeUTF(al.getNombre());
			dOS.write(al.getNota());
		} else
			throw new IOException("Archivo no abierto para escritura");
	}
}
