package eb_ficheroData;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GrabaObjetoAlumno {
	FileOutputStream fSalida;
	DataOutputStream dOS;
	private String nombre = "alumnos.dat";

	// Por defecto abierto para escritura
	public GrabaObjetoAlumno(boolean append) throws IOException {
		try {
			fSalida = new FileOutputStream(nombre, append);
			dOS = new DataOutputStream(fSalida);
		} catch (IOException e) {
			try {
				if (dOS != null)
					dOS.close();
				if (fSalida != null)
					fSalida.close();
			} finally {
				throw new IOException();
			}
		}
	}

	public void cierra() throws IOException {
		if (dOS != null)
			dOS.close();
		if (fSalida != null)
			fSalida.close();
		fSalida = null;
		dOS = null;
	}

	protected void finalize() throws Throwable {
		cierra();
		super.finalize();
	}

	public void grabaAlumno(Alumno al) throws IOException {
		dOS.writeInt(al.getnAlumno());
		dOS.writeUTF(al.getNombre());
		dOS.write(al.getNota());
	}
}
