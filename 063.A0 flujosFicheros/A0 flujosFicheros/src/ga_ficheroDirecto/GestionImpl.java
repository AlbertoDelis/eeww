/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ga_ficheroDirecto;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 
 * @author ali3
 */
public class GestionImpl implements GestionInterface{

	private final String ARCHIVO = "personas.dat";
	private final int NR = 100;
	private byte flagRegistro; // -1: no usado, 0: borrado, 1:usado
	private File fPersonas;
	private RandomAccessFile rAF;

	protected GestionImpl() throws validacionEntrada, validacionFichero, IOException {
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

	private static int bytesRegistro() {
		// Número de bits que ocupa la información
		int sizeReg = Byte.SIZE + Integer.SIZE + 40 * 8 + Integer.SIZE + 40 * 8 + Float.SIZE + Byte.SIZE + Byte.SIZE;
		return sizeReg / 8 + 2 + 2; // 2 bytes más por cada UTF
	}

	protected boolean estaActivo(int nP) throws validacionEntrada, IOException {
		// Comprobamos si el registro está activo, si está en uso
		validaNRegistro(nP); // si viene excepción ...
		
		rAF.seek(nP * bytesRegistro()); // Nos posicionamos
		flagRegistro = rAF.readByte();
		return flagRegistro > 0;
	}
	private void validaNRegistro(Integer nR) throws validacionEntradaNR{
		if (nR < 0 || nR > NR) {
			throw new validacionEntradaNR(NR);
		}
	}

	public void grabaPersona(Persona p) throws validacionEntrada, IOException {
		grabaPersona(p, 1);
	}
	@Override
	public void modificaPersona(Persona p) throws validacionEntrada, IOException {
		grabaPersona(p, 1);		
	}
	private void grabaPersona(Persona p, int flag) throws validacionEntrada, IOException {
		validaNRegistro(p.getNPersona()); // si viene excepción ...
		
		rAF.seek(p.getNPersona() * bytesRegistro()); // Nos posicionamos
		flagRegistro = (byte) flag;
		rAF.writeByte(flagRegistro);
		rAF.writeInt(p.getNPersona());
		String nombre = String.format("%1$-40s", p.getNombre());
		// nombre + espacios= 40 caracteres
		rAF.writeUTF(nombre);
		rAF.writeInt(p.getEdad());
		String domicilio = String.format("%1$-40s", p.getDomicilio());
		// domicilio + espacios= 40 caracteres
		rAF.writeUTF(domicilio);
		rAF.writeFloat(p.getSueldo());
		rAF.writeByte(p.getECivil()); // 0, 1, 2
		rAF.writeByte(p.getCategoria()); // 0..9
	}

	public Persona leePersona(int nP) throws validacionEntrada, IOException, EOFException {
		if(!estaActivo(nP))
			return null;	
		//  comprobar si está activo para seguir leyendo
		Persona p= new Persona();
		rAF.seek(nP * bytesRegistro()); // Nos posicionamos
		flagRegistro = rAF.readByte();
		p.setNPersona(rAF.readInt());
		p.setNombre(rAF.readUTF().trim()); // Quita espacios en blanco
		p.setEdad(rAF.readInt());
		p.setDomicilio(rAF.readUTF().trim()); // Quita espacios en blanco
		p.setSueldo(rAF.readFloat());
		p.setECivil(rAF.readByte()); // 0, 1, 2
		p.setCategoria(rAF.readByte()); // 0..9
		return p;
	}

	public void borraPersona(int nP) throws validacionEntrada, IOException {
		validaNRegistro(nP); // si viene excepción ...
		
		rAF.seek(nP * bytesRegistro()); // Nos posicionamos
		flagRegistro = (byte) 0; // Lo ponemos a cero
		rAF.writeByte(flagRegistro);
	}

}
