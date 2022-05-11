package fc_encuesta;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DAOPersona implements Constantes, AutoCloseable {
	static DataInputStream dIS = null;
	static DataOutputStream dOS = null;

	// para escritura
	public DAOPersona(String nombre, boolean append) throws IOException {
		if(nombre.isBlank())
			nombre= ENCUESTADOS;
		if(dOS == null && dIS == null)
			dOS = new DataOutputStream(new FileOutputStream(nombre, append));
		else
			throw new IOException("Fichero ya está abierto");
	}
	// para lectura
	public DAOPersona(String nombre) throws IOException {
		if(nombre.isBlank())
			nombre= ENCUESTADOS;
		if(dOS == null && dIS == null)
			dIS = new DataInputStream(new FileInputStream(nombre));
		else
			throw new IOException("Fichero ya está abierto");
	}

	public Persona leeRegistro() throws EOFException, IOException {
		Persona p;
		int orden = dIS.readInt();
		String nombre = dIS.readUTF();
		int edad = dIS.readInt();
		char sexo = dIS.readChar();
		int[] voto = new int[NVOTOS];
		for (int v = 0; v < voto.length; v++)
			voto[v] = dIS.readInt();
		p = new Persona(orden, nombre, edad, sexo, voto);
		return p;
	}

	public void grabaRegistro(Persona p) throws IOException {
		dOS.writeInt(p.getOrden());
		dOS.writeUTF(p.getNombre());
		dOS.writeInt(p.getEdad());
		dOS.writeChar(p.getSexo());
		for (int v = 0; v < p.getVotos().length; v++)
			dOS.writeInt(p.getVoto(v));
	}

	@Override
	public void close() throws IOException {
		if (dIS != null)
			dIS.close();
		if (dOS != null)
			dOS.close();
		dIS = null;
		dOS = null;
	}
}
