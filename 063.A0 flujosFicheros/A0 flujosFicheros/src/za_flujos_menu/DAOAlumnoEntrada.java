package za_flujos_menu;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DAOAlumnoEntrada {
	private FileInputStream fEntrada;
	private DataInputStream dIS;
	private String nombre;

	public DAOAlumnoEntrada() throws IOException {
		this.nombre= "alumnos.datos";
		this.abre(nombre);
	}
	public DAOAlumnoEntrada(String nombre) throws IOException {
		this.nombre= nombre;
		this.abre(nombre);
	}
	
	public void abre() throws IOException {
		this.abre(nombre);
	}
	public void abre(String nombre) throws IOException {
		try {
			this.cierra();
			this.nombre = nombre;
			fEntrada = new FileInputStream(nombre);
			dIS = new DataInputStream(fEntrada);
		} catch (IOException e) {
			cierra();
		}

	}

	public void cierra() throws IOException {
		if (dIS != null)
			dIS.close();
		if (fEntrada != null)
			fEntrada.close();
		fEntrada = null;
		dIS = null;
	}

	protected void finalize() throws Throwable {
		cierra();
		super.finalize();
	}
	/**
	 * Lee un alumno del archivo 
	 * @return Alumno
	 * @throws IOException
	 */
	public Alumno leeAlumno() throws IOException {
		int numAl = dIS.readInt();
		String nomAl = dIS.readUTF();
		int curso = dIS.readInt();
		byte[] nota = new byte[4];
		dIS.read(nota);
		return new Alumno(numAl, nomAl, curso, nota);
	}
	/**
	 * Lee el archivo a un List
	 * return List grupo
	 * @throws IOException
	 */
	public List<Alumno> leeGrupo() throws IOException {
		List<Alumno> grupo= new ArrayList<Alumno>();
		this.abre();
		try {
			while(true) 
				grupo.add(this.leeAlumno());
		}catch(EOFException e){
		}
		this.cierra();
		return grupo;
	}

	public void listado() throws IOException {
		this.abre();
		try {
			while(true) {
				Alumno a= this.leeAlumno();
				System.out.println(a);
			}
				
		}catch(EOFException e){
		}
		this.cierra();
	}
	/**
	 * Lee el archivo a Map-Grupo
	 * @param Grupo
	 * @throws IOException
	 * @throws GestionGrupoException 
	 */
	public void leeGrupo(Grupo grupo) throws IOException, GestionGrupoException {
		this.abre();
		try {
			while(true) 
				grupo.alta(this.leeAlumno());
		}catch(EOFException e){
		}
		this.cierra();
	}
	
}
