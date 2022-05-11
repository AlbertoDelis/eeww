package za_flujos_menu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DAOStatic {
	static public Alumno leeAlumno(DataInputStream dIS) throws IOException {
		int numAl = dIS.readInt();
		String nomAl = dIS.readUTF();
		int curso = dIS.readInt();
		byte[] nota = new byte[4];
		dIS.read(nota);
		return new Alumno(numAl, nomAl, curso, nota);
	}

	static public void grabaAlumno(DataOutputStream dOS, Alumno al) throws IOException {
		dOS.writeInt(al.getnAlumno());
		dOS.writeUTF(al.getNombre());
		dOS.writeInt(al.getCurso());
		dOS.write(al.getNota());
	}

	public static void fusion(String origenA, String origenB, String destino) throws IOException {
		File fOrigenA = new File(origenA);
		FileInputStream fisOrigenA = new FileInputStream(fOrigenA);
		DataInputStream disOrigenA = new DataInputStream(fisOrigenA);

		File fOrigenB = new File(origenB);
		FileInputStream fisOrigenB = new FileInputStream(fOrigenB);
		DataInputStream disOrigenB = new DataInputStream(fisOrigenB);

		File fDestino = new File(destino);
		FileOutputStream fosDestino = new FileOutputStream(fDestino);
		DataOutputStream dosDestino = new DataOutputStream(fosDestino);

		Alumno a1, a2;
		boolean eofA, eofB;

		a1 = a2 = null;
		eofA = eofB = false;

		try {
			a1 = DAOStatic.leeAlumno(disOrigenA);
		}catch(EOFException e) {
			eofA= true;
		}
		try {
			a2 = DAOStatic.leeAlumno(disOrigenB);
		}catch(EOFException e) {
			eofB= true;
		}
		eofA = eofB = false;
		while (!eofA && !eofB) {
			if (a1.compareTo(a2) < 0) {
				DAOStatic.grabaAlumno(dosDestino, a1);
				try {
					a1 = DAOStatic.leeAlumno(disOrigenA);
				} catch (EOFException e) {
					eofA = true;
				}
			} else {
				DAOStatic.grabaAlumno(dosDestino, a2);
				try {
					a2 = DAOStatic.leeAlumno(disOrigenB);
				} catch (EOFException e) {
					eofB = true;
				}
			}
		}

		while (!eofA) {
			DAOStatic.grabaAlumno(dosDestino, a1);
			a1 = DAOStatic.leeAlumno(disOrigenA);
		}
		while (!eofB) {
			DAOStatic.grabaAlumno(dosDestino, a2);
			a2 = DAOStatic.leeAlumno(disOrigenB);
		}

		// DAOAlumnoObjectSalida.fusion("a", "b", "d");

	}
}
