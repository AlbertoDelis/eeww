package ea_ficheroData_AD;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AlumnoAccesoDatos {
	static final String FICHERO = "alumnos.dat";
	// atributos de clase
	static DataInputStream dIS = null;
	static DataOutputStream dOS = null;
	
	// (modo == 'r' || modo == 'R')
	// (modo == 'w' || modo == 'W')

	public AlumnoAccesoDatos(char modo, boolean append) throws IOException {
		if (dOS == null && dIS == null) {
			if ("rR".indexOf(modo) != -1)
				dIS = new DataInputStream(new FileInputStream(FICHERO));
			else if ("wW".indexOf(modo) != -1)
				dOS = new DataOutputStream(new FileOutputStream(FICHERO, append));
		} else
			throw new IOException("El fichero ya está abierto");
	}
	public AlumnoAccesoDatos(char modo) throws IOException {
		this(modo, false);
	}
	
	public void grabaAlumno(Alumno al) throws IOException {
		dOS.writeInt(al.getnAlumno());
		dOS.writeUTF(al.getNombre());
		dOS.write(al.getNota());
	}

	public Alumno leeAlumno() throws IOException {
		int numAl = dIS.readInt();
		String nomAl = dIS.readUTF();
		byte[] nota = new byte[4];
		dIS.read(nota);
		return new Alumno(numAl, nomAl, nota);
	}

	public void cierra() throws IOException {
		if (dOS != null)
			dOS.close();
		if (dIS != null)
			dIS.close();
		dOS = null;
		dIS = null;
	}

	protected void finalize() throws Throwable {
		cierra();
		super.finalize();
	}
}
