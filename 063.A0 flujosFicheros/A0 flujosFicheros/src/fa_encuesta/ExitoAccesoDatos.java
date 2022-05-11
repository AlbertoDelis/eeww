package fa_encuesta;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ExitoAccesoDatos implements Constantes {
	
	static DataInputStream dIS = null;
	static DataOutputStream dOS = null;

	public ExitoAccesoDatos(char modo) throws IOException {
		//if (modo == 'r' || modo == 'R')
		if(dOS == null && dIS == null){
			if("rR".indexOf(modo) != -1)
				dIS = new DataInputStream(new FileInputStream(EXITOS));
			else if (modo == 'w' || modo == 'W')
				dOS = new DataOutputStream(new FileOutputStream(EXITOS));
			}
			else
				throw new IOException("Fichero ya está abierto");
	}

	public void finalize() throws Throwable {
		cierra();
		super.finalize();
	}

	public Exito leeRegistro() throws EOFException, IOException {
		int numero = dIS.readInt();
		String titulo = dIS.readUTF();
		int votosObtenidos = dIS.readInt();
		return new Exito(numero, titulo, votosObtenidos);
	}
	// Retorna lista
	public List<Exito> lee() throws IOException{
		List <Exito> exitos= new ArrayList<Exito>();
		Exito exito;
		boolean fF = false;
		try {
			exito = leeRegistro();
			while (!fF) {
				exitos.add(exito);
				exito = leeRegistro();
			}
		} catch (EOFException end) {
			fF = true;
		} catch (IOException e) {
			throw new IOException();
		} finally {
			cierra();
		}
		return exitos;
	}
	// Retorna Map
	public Map<Integer, Exito> leeMap() throws IOException{
		Map <Integer, Exito> exitosMap= new TreeMap<Integer, Exito>();
		Exito exito;
		boolean fF = false;
		try {
			exito = leeRegistro();
			while (!fF) {
				exitosMap.put(exito.getNumero(), exito);
				exito = leeRegistro();
			}
		} catch (EOFException end) {
			fF = true;
		} catch (IOException e) {
			throw new IOException();
		} finally {
			cierra();
		}
		return exitosMap;
	}
	public void grabaRegistro(Exito a) throws IOException {
		dOS.writeInt(a.getNumero());
		dOS.writeUTF(a.getTitulo());
		dOS.writeInt(a.getVotos());
	}
	public void graba(Collection<Exito> collection) throws IOException{
		for (Exito exito : collection) {
			this.grabaRegistro(exito);
		}
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
