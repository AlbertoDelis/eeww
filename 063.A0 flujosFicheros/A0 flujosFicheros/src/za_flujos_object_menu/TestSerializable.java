package za_flujos_object_menu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestSerializable {
	static void escribe(Alumno []alumnos) {
		DAOAlumnoObjectSalida daos;
		try {
			daos = new DAOAlumnoObjectSalida("alumnos.individuales.object", false);
			
			for (Alumno alumno : alumnos) {
				alumnos[0].setCurso(3);
				daos.grabaAlumno((Alumno)alumno);				
			}
			daos.cierra();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	static void escribeAlumnosArray(List<Alumno> alumnos) {
		DAOAlumnoObjectSalida daos;
		try {
			daos = new DAOAlumnoObjectSalida("alumnos.array.object", false);
			daos.grabaArrayAlumno(alumnos);				
			daos.cierra();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	static void leeArrayAlumno() {
		File fichero= new File("alumnos.array.object");
		FileInputStream fis= null;
		ObjectInputStream ois= null;
		List<Alumno> array;
		try {
			fis= new FileInputStream(fichero);
			ois= new ObjectInputStream(fis);
			array= (ArrayList<Alumno>) ois.readObject();
			System.out.println(array.get(0));
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}

	static void lee() {
		File fichero= new File("alumnos.individuales.object");
		FileInputStream fis= null;
		ObjectInputStream ois= null;
		Alumno alumno;
		try {
			fis= new FileInputStream(fichero);
			ois= new ObjectInputStream(fis);
			try {
				while(true) {
					alumno= (Alumno) ois.readObject();
					System.out.println(alumno);
				}
			}catch (EOFException e) {
				System.out.println("fin de fichero");
			}			
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) {
		List<Alumno> alumnos= new ArrayList<Alumno>();
				alumnos.add(new Alumno(1, "María 1", 2, new byte[] { 10, 5, 5, 5 }));
				new Alumno(22, "Andrés 2", 2, new byte[] { 6, 10, 6, 6 });
				new Alumno(23, "Pedro 3", 2, new byte[] { 8, 3, 7, 3 });
		escribeAlumnosArray(alumnos);
		leeArrayAlumno();
	}
}








