package za_flujos_menu;

import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class DAOAlumnoSalida {
	private FileOutputStream fSalida;
	private DataOutputStream dOS;
	private String nombre;
	private boolean append;

	public DAOAlumnoSalida() throws IOException {
		this("alumnos.datos", false);
	}
	public DAOAlumnoSalida(String nombre, boolean append) throws IOException {
		this.nombre= nombre;
		this.append= append;
		this.abre(nombre, append);
	}
	public void abre () throws IOException {
		this.abre(this.nombre, false);
	}

	public void abre(String nombre, boolean append) throws IOException {
		try {
			this.cierra();
			this.nombre= nombre;
			this.append= append;
			fSalida = new FileOutputStream(nombre, append);
			dOS = new DataOutputStream(fSalida);
		} catch (IOException e) {
			try {
				cierra();
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
	/**
	 * Graba un alumno en el archivo
	 * @param al
	 * @throws IOException
	 */
	public void grabaAlumno(Alumno al) throws IOException {
		dOS.writeInt(al.getnAlumno());
		dOS.writeUTF(al.getNombre());
		dOS.writeInt(al.getCurso());
		dOS.write(al.getNota());
	}
	/**
	 * Graba toda la estructura List en el archivo
	 * @param grupo
	 * @throws IOException
	 */
	public void grabaGrupo(List<Alumno> grupo) throws IOException {
		this.abre();
		for (Alumno a : grupo) {
			this.grabaAlumno(a);
		}
		this.cierra();
	}
	/**
	 * Graba toda la estructura Map-Grupo en el archivo
	 * @param grupo
	 * @throws IOException
	 */
	public void grabaGrupo(Grupo grupo) throws IOException {
		this.grabaGrupo((List)grupo.getGrupo().values());
	}
	/**
	 * Graba los aprobados en un archivo
	 * @param nombre
	 * @throws IOException
	 */
	public static void grabaAprobados(String nombre) throws IOException {
		Alumno a;
		DAOAlumnoEntrada daoe= new DAOAlumnoEntrada();
		DAOAlumnoSalida daos= new DAOAlumnoSalida(nombre, false);
		try {
			while(true) {
				a= daoe.leeAlumno();
				if(a.aprobado())
					daos.grabaAlumno(a);
			}
		}catch(EOFException e){
		}
		daoe.cierra();
		daos.cierra();		
	}
	public static void borrar(int clave) throws IOException {
		DAOAlumnoEntrada daoe= new DAOAlumnoEntrada();
		DAOAlumnoSalida daos= new DAOAlumnoSalida("alumnos.auxiliar", false);
		while(true) {
			Alumno a= daoe.leeAlumno();
			if(clave != a.getnAlumno())
				daos.grabaAlumno(a);
		}
		//daos.cierra();
		//daoe.cierra();
		/// File remove, rename
	}
	public static void fusion(String origenA, String origenB, String destino) throws IOException {
		DAOAlumnoEntrada o1= new DAOAlumnoEntrada(origenA);
		DAOAlumnoEntrada o2= new DAOAlumnoEntrada(origenB);
		DAOAlumnoSalida dest= new DAOAlumnoSalida(destino, false);
		
		
	}
	public void grabaListaCte() throws IOException {
		Alumno[] alumnos = new Alumno[] { // sort
				new Alumno(1, "María 1", 2, new byte[] { 10, 5, 5, 5 }),
				new Alumno(22, "Andrés 2", 2, new byte[] { 6, 10, 6, 6 }),
				new Alumno(23, "Pedro 3", 2, new byte[] { 8, 3, 7, 3 }),
				new Alumno(42, "Virginia 4", 2, new byte[] { 10, 3, 7, 3 }),
				new Alumno(13, "Antonio 5", 2, new byte[] { 9, 3, 7, 3 }),
				new Alumno(21, "Pedro 6", 2, new byte[] { 9, 7, 10, 10 }),
				new Alumno(27, "Marta 7", 2, new byte[] { 3, 3, 7, 3 }),
				new Alumno(18, "Luís 8", 2, new byte[] { 4, 6, 5, 4 }) };
			for (Alumno uno : alumnos) {
				this.grabaAlumno(uno);
			}
			Alumno[] alumnos2 = new Alumno[] { //sort
					new Alumno(1, "María 1", 2, new byte[] { 10, 5, 5, 5 }),
					new Alumno(12, "Andrés 2", 2, new byte[] { 6, 10, 6, 6 }),
					new Alumno(3, "Pedro 3", 2, new byte[] { 8, 3, 7, 3 }),
					new Alumno(4, "Virginia 4", 2, new byte[] { 10, 3, 7, 3 }),
					new Alumno(15, "Antonio 5", 2, new byte[] { 9, 3, 7, 3 }),
					new Alumno(6, "Pedro 6", 2, new byte[] { 9, 7, 10, 10 }),
					new Alumno(17, "Marta 7", 2, new byte[] { 3, 3, 7, 3 }),
					new Alumno(8, "Luís 8", 2, new byte[] { 4, 6, 5, 4 }) };

	}

}
