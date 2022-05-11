package ga_ficheroDirecto;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class GestionManejador {
/// sin usar
	private final String ARCHIVO = "personas.dat";
	private final int NR = 100;
	private File fPersonas;
	private RandomAccessFile rAF;

	public GestionManejador() throws validacionEntrada, validacionFichero, IOException {
		super();
		gestionPersonas();
	}

	protected void gestionPersonas() throws validacionEntrada, validacionFichero, IOException {
		fPersonas = new File(ARCHIVO);
		if (!fPersonas.exists() || fPersonas.length() == 0) {
			creaFichero(NR);
			throw new validacionFichero("\"" + ARCHIVO + "\"" + " no existe.\nHa sido creado para seguir.");
		}
		rAF = new RandomAccessFile(fPersonas, "rw");
	}

	protected void creaFichero() throws validacionEntrada, IOException {
		creaFichero(NR);
	}

	private void creaFichero(int nR) throws validacionEntrada, IOException {
		rAF = new RandomAccessFile(fPersonas, "rw");// borrar, mejor
		Persona p = new Persona();
		for (int n = 0; n < nR; n++) {
			p.setNPersona(n);
			grabaPersona(p, -1);
		}
		// rAF.close();
	}

}
