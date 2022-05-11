package fisfos;

import java.io.*;

// DAO Archivo de Acceso a Datos

public class DAOAlumno {
	private String nombre;
	private DataInputStream dis;
	private DataOutputStream dos;

	public DAOAlumno(String nombre) {
		this.nombre = nombre.isBlank() ? "alumnos.datos" : nombre;
	}

	public DAOAlumno(String modo) throws FileNotFoundException {
		if (modo.equals("r"))
			this.abreEntrada();
		else if (modo.equals("w"))
			this.abreSalida();
	}

	public void abreEntrada() throws FileNotFoundException {
		if (dis == null && dos == null)
			this.dis = new DataInputStream(new FileInputStream(nombre));
	}

	public void abreSalida() throws FileNotFoundException {
		if (dis == null && dos == null)
			this.dos = new DataOutputStream(new FileOutputStream(nombre));
	}

	public void close() throws IOException {
		if (dis != null)
			dis.close();
		if (dos != null)
			dos.close();
	}

	public void graba(Alumno alumno) throws IOException {
		this.dos.writeInt(alumno.getId());
		this.dos.writeUTF(alumno.getNombre());
//		this.dos.write(disdos.getNota());
		for (Byte b : alumno.getNota()) {
			this.dos.writeByte(b);
		}
	}

	public Alumno lee() throws IOException {
		Integer id = this.dis.readInt();
		String nombre = this.dis.readUTF();
		byte[] nota = new byte[4];
//		this.dis.read(nota);
		for (int b = 0; b < 4; b++)
			nota[b] = this.dis.readByte();
		Alumno alumno = new Alumno(id, nombre, nota);
		return alumno;
	}

	public Alumno consulta(Integer id) throws IOException {
		close();
		abreEntrada();
		boolean eof = false;
		boolean encontrado = false;
		Alumno alumno = null;
		while (!encontrado && !eof) {
			alumno = lee();
			if (id.equals(alumno.getId()))
				encontrado = true;
		}
		return encontrado ? alumno : null;
	}
}