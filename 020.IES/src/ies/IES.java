package ies;

import java.util.ArrayList;
import java.util.Arrays;

public class IES {
	private static int NAS=5;
	private String centro;
	private long codigo;
	private ArrayList<Asignatura> listaAsignaturas;
	private ArrayList<Alumno> listaAlumnos;

	public IES() {
		this.listaAlumnos = new ArrayList<>();
		this.listaAsignaturas = new ArrayList<>();
	}

	public void creaAsignaturas() {
		this.listaAsignaturas.add(new Asignatura("Prog", 100));
		this.listaAsignaturas.add(new Asignatura("Sist", 50));
		this.listaAsignaturas.add(new Asignatura("EEDD", 60));
		this.listaAsignaturas.add(new Asignatura("BBDD", 30));
		this.listaAsignaturas.add(new Asignatura("FOL", 10));
		this.listaAsignaturas.add(new Asignatura("Marcas", 40));
	}

	public void creaAlumnos() {
		this.listaAlumnos.add(new Alumno("Alberto1", "47494475G", 1, "DAW1"));
		this.listaAlumnos.add(new Alumno("Hugo", "47457852G", 1, "DAW1"));
		this.listaAlumnos.add(new Alumno("Alex", "47214568G", 1, "DAW1"));
		this.listaAlumnos.add(new Alumno("Alfonso", "47225588G", 1, "DAW1"));
		this.listaAlumnos.add(new Alumno("Thania", "47323232G", 1, "DAW1"));
		this.listaAlumnos.add(new Alumno("Mónica", "47232589G", 1, "DAW1"));
		this.listaAlumnos.add(new Alumno("Edu", "47456789G", 1, "DAW1"));
		this.listaAlumnos.add(new Alumno("Patricia", "47585217G", 1, "DAW1"));
		this.listaAlumnos.add(new Alumno("Ana", "47544565G", 1, "DAW1"));
		this.listaAlumnos.add(new Alumno("Myriam", "47585256G", 1, "DAW1"));

	}

	public boolean matriculaEn(Alumno al, Asignatura as) {
		if(al.getMatricula().size()<NAS) {
			al.setMatricularEn(as);
			return true;
			
		}
		return false;
		

	}

	public void visualizaAlumno(int curso) {
		for (Alumno alumno : listaAlumnos) {
			if (alumno.getCurso()==1) {
				System.out.println(alumno);
				
			}
		}
	}
	/*
	public ArrayList<Alumno> visualizaAlumno(int curso) {
		ArrayList<Alumno>listaCurso=new ArrayList<>();
		for (Alumno alumno : listaAlumnos) {
			if (alumno.getCurso()==curso) {
				listaCurso.add(alumno);
				//System.out.println(alumno);
				
			}
			return listaCurso;
		}
	}
	
	
	public void visualizaAsignatura() {
		return listaAsignaturas;
	}
	*/

	@Override
	public String toString() {
		return "IES [centro=" + centro + ", codigo=" + codigo + ", listaAsignaturas=" + listaAsignaturas
				+ ", listaAlumnos=" + listaAlumnos + "]";
	}

}
