package za_flujos_menu;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DAOObjectStatic {

	static public Alumno leeAlumno(ObjectInputStream dIS) throws IOException, ClassNotFoundException {
		Alumno a;
		a= (Alumno)dIS.readObject();
		return a;
	}

	static public void grabaAlumno(ObjectOutputStream dOS, Alumno al) throws IOException {
		dOS.writeObject(al);
	}

	public static void fusion(String origenA, String origenB, String destino) throws IOException, ClassNotFoundException {
		File fOrigenA = new File(origenA);
		FileInputStream fisOrigenA = new FileInputStream(fOrigenA);
		ObjectInputStream disOrigenA = new ObjectInputStream(fisOrigenA);

		File fOrigenB = new File(origenB);
		FileInputStream fisOrigenB = new FileInputStream(fOrigenB);
		ObjectInputStream disOrigenB = new ObjectInputStream(fisOrigenB);

		File fDestino = new File(destino);
		FileOutputStream fosDestino = new FileOutputStream(fDestino);
		ObjectOutputStream dosDestino = new ObjectOutputStream(fosDestino);

		Alumno a1, a2;
		boolean eofA, eofB;

		a1 = a2 = null;
		eofA = eofB = false;

		try {
			a1 = DAOObjectStatic.leeAlumno(disOrigenA);
		} catch (EOFException e) {
			eofA = true;
		}
		try {
			a2 = DAOObjectStatic.leeAlumno(disOrigenB);
		} catch (EOFException e) {
			eofB = true;
		}
		eofA = eofB = false;
		while (!eofA && !eofB) {
			if (a1.compareTo(a2) < 0) {
				DAOObjectStatic.grabaAlumno(dosDestino, a1);
				try {
					a1 = DAOObjectStatic.leeAlumno(disOrigenA);
				} catch (EOFException e) {
					eofA = true;
				}
			} else {
				DAOObjectStatic.grabaAlumno(dosDestino, a2);
				try {
					a2 = DAOObjectStatic.leeAlumno(disOrigenB);
				} catch (EOFException e) {
					eofB = true;
				}
			}
		}

		while (!eofA) {
			DAOObjectStatic.grabaAlumno(dosDestino, a1);
			a1 = DAOObjectStatic.leeAlumno(disOrigenA);
		}
		while (!eofB) {
			DAOObjectStatic.grabaAlumno(dosDestino, a2);
			a2 = DAOObjectStatic.leeAlumno(disOrigenB);
		}

		// DAOAlumnoObjectSalida.fusion("a", "b", "d");

	}
}
