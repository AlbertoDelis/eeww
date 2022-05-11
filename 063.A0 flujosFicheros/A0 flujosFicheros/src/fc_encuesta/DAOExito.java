package fc_encuesta;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DAOExito implements Constantes, AutoCloseable {
	
	static ObjectInputStream oIS = null;
	static ObjectOutputStream oOS = null;

	// para escritura
	public DAOExito(String nombre, boolean append) throws IOException {
		if(nombre.isBlank())
			nombre= ENCUESTADOS;
		if(oOS == null && oIS == null)
			oOS = new ObjectOutputStream(new FileOutputStream(nombre, append));
		else
			throw new IOException("Fichero ya está abierto");
	}
	// para lectura
	public DAOExito(String nombre) throws IOException {
		if(nombre.isBlank())
			nombre= ENCUESTADOS;
		if(oOS == null && oIS == null)
			oIS = new ObjectInputStream(new FileInputStream(nombre));
		else
			throw new IOException("Fichero ya está abierto");
	}

	public Exito leeRegistro() throws EOFException, IOException, ClassNotFoundException {
		return (Exito) oIS.readObject();
		/*
		Object o= oIS.readObject();
		if (o instanceof Exito)
			return (Exito) o;
		else
			return null;
			*/
	}
	public void grabaRegistro(Exito a) throws IOException {
		oOS.writeObject(a);
	}
	public void graba(Collection<Exito> collection) throws IOException{
		for (Exito exito : collection) {
			this.grabaRegistro(exito);
		}
	}

	// Retorna lista
	// Si usamos un array podemos indicar el número de objetos grabados
	public List<Exito> lee() throws IOException, ClassNotFoundException{
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
		}
		return exitos;
	}
	// Retorna Map
	public Map<Integer, Exito> leeMap() throws IOException, ClassNotFoundException{
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
		}
		return exitosMap;
	}

	@Override
	public void close() throws IOException {
		if (oIS != null)
			oIS.close();
		if (oOS != null)
			oOS.close();
		oIS = null;
		oOS = null;
	}
}
