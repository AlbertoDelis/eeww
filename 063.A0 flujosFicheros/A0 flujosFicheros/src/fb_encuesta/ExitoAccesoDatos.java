package fb_encuesta;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ExitoAccesoDatos implements Constantes {
	
	static RandomAccessFile rAF = null;

	public ExitoAccesoDatos(boolean crea) throws IOException {
		if(crea)
			crea();
		rAF = new RandomAccessFile(EXITOS, "rw");
	}
	private void crea() throws IOException {
		File f = new File(EXITOS);
		if (f.exists()) {
			f.delete();
		}
	}
	public void finalize() throws Throwable {
		cierra();
		super.finalize();
	}
	public Exito leeRegistro(int posicion) throws EOFException, IOException {
		rAF.seek((posicion - 1) * LR);
		return leeRegistro();
	}
	public Exito leeRegistro() throws EOFException, IOException {
		// comprobar que es un registro válido
		int numero = rAF.readInt();
		String titulo = rAF.readUTF();
		int votosObtenidos = rAF.readInt();
		return new Exito(numero, titulo, votosObtenidos);
	}
	// Retorna lista
	public List<Exito> lee() throws IOException{
		List <Exito> exitos= new ArrayList<Exito>();
		Exito exito;
		boolean fF = false;
		int registro= 0;
		try {
			exito = leeRegistro();
			while (!fF) {
				//if(exito.getNumero() > 0)
					exitos.add(exito);
				rAF.seek((++registro) * LR);
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
	public void grabaRegistro(int posicion, Exito a) throws IOException {
		rAF.seek((posicion  - 1) * LR);
		grabaRegistro(a);
	}
	public void grabaRegistro(Exito a) throws IOException {
		//int n= (a.getNumero()  - 1) * LR;
		//rAF.seek(n);
		rAF.writeInt(a.getNumero());
		String formato= "%-" + LTIT + "s";
		rAF.writeUTF(String.format(formato, a.getTitulo()));
		rAF.writeInt(a.getVotos());
	}
	// cambiado a posicion
	public void graba(Collection<Exito> collection) throws IOException{
		for (Exito exito : collection) {
			//this.grabaRegistro(exito);
			this.grabaRegistro(exito.getNumero(), exito);
		}
	}

	public void cierra() throws IOException {
		if (rAF != null)
			rAF.close();
		rAF = null;
	}
}
