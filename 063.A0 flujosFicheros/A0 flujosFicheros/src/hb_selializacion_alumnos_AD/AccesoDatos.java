package hb_selializacion_alumnos_AD;

import java.io.*;

public class AccesoDatos <T>{
	//private static AccesoDatos unica = null;
	private ObjectInputStream oIS;
	private T oOS;
	private String nombre;

	public AccesoDatos() throws IOException {
		oOS = null;
		oIS = null;
		nombre = "alumnos.dat";
	}
	public AccesoDatos(String nombre) throws IOException {
		oOS = null;
		oIS = null;
		this.nombre = nombre;
	}
	
	public ObjectInputStream getEntrada(){
		return oIS;
	}
	public ObjectOutputStream getSalida(){
		return (ObjectOutputStream) oOS;
	}
	
	public void abreSalida(boolean append) throws IOException {
		if (oIS == null && oOS == null) {
			try {
				if (append)
					oOS = (T) new MiObjectOutputStream(new FileOutputStream(nombre, append));
				else
					oOS = (T) new ObjectOutputStream(new FileOutputStream(nombre, append));
				//oOS = new ObjectOutputStream(new FileOutputStream(nombre, append));
			} catch (IOException e) {
				cierra();
			}
		} else
			// o bien cerramos y abrimos en el modo pedido
			throw new IOException("Archivo ya abierto");
	}
	
	public void abreEntrada() throws IOException {
		if (oIS == null && oOS == null) {
			try {
				oIS = new ObjectInputStream(new FileInputStream(nombre));
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
			if (append)
				oOS = (T) new MiObjectOutputStream(new FileOutputStream(nombre, append));
			else
				oOS = (T) new ObjectOutputStream(new FileOutputStream(nombre, append));
			//oOS = new ObjectOutputStream(new FileOutputStream(nombre, append));
		} catch (IOException e) {
			cierra();
		}
	}


	public void abreEntrada2() throws IOException {
		cierra(); // siempre cierra
		try {
				oIS = new ObjectInputStream(new FileInputStream(nombre));
			} catch (IOException e) {
				cierra();
			}
	}

	public void cierra() throws IOException {
		if (oIS != null)
			oIS.close();
		oIS = null;
		if (oOS != null)
			((ObjectOutputStream) oOS).close();
		oOS = null;
	}

	protected void finalize() throws Throwable {
		cierra();
		super.finalize();
	}

	public Alumno leeAlumno() throws IOException, ClassNotFoundException {
		if (oIS != null) {
			return (Alumno) oIS.readObject();

		} else
			throw new IOException("Archivo no abierto para lectura");
	}

	public void grabaAlumno(Alumno al) throws IOException {
		if (oOS != null) {
			((ObjectOutputStream) oOS).writeObject(al);
		} else
			throw new IOException("Archivo no abierto para escritura");
	}
}
