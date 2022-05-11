package fa_encuesta;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PersonaAccesoDatos implements Constantes {
	static DataInputStream dIS = null;
	static DataOutputStream dOS = null;

	public PersonaAccesoDatos(char modo) throws IOException {
		//if (modo == 'r' || modo == 'R')
		if(dOS == null && dIS == null){
			if("rR".indexOf(modo) != -1)
				dIS = new DataInputStream(new FileInputStream(ENCUESTADOS));
			else if (modo == 'w' || modo == 'W')
				dOS = new DataOutputStream(new FileOutputStream(ENCUESTADOS));
			}
			else
				throw new IOException("Fichero ya está abierto");
	}

	public void finalize() throws Throwable {
		cierra();
		super.finalize();
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

	public void cierra() throws IOException {
		if (dIS != null)
			dIS.close();
		if (dOS != null)
			dOS.close();
		dIS = null;
		dOS = null;
	}
}
