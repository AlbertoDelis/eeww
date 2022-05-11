package fisfos;

import java.io.*;

public class GestionAlumno {
	static public void grabaAlumnos() throws IOException {
		Alumno alumno;
		String nombre;
		DAOAlumno dao= new DAOAlumno("w");
		for (int a=1; a<=4; a++) {
			nombre= "sc.nextLine()";
			alumno= new Alumno(a,nombre);
			dao.graba(alumno);
		}
		dao.close();
		//dao=null

	}
	
	private void getDAO() {
	

	}
	
	static public void leeAlumnos() throws IOException {
		Alumno alumno;
		String nombre;
		boolean eof=false;
		DAOAlumno dao= new DAOAlumno("");
		dao.abreEntrada();
		//for (int a=1; a<=4; a++) {
		while(!eof) {
			alumno=dao.lee();
			System.out.printf("%s %s %s", alumno.getId(), alumno.getNombre(), alumno.getNota());
		}
		dao.close();
		dao=null;

	}
	
	public static void main(String[] args) throws IOException {
		leeAlumnos();
		System.out.println("hola");
	}
}
