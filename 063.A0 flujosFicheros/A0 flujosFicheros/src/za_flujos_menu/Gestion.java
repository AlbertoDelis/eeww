package za_flujos_menu;

import java.io.*;
import java.util.Scanner;

public class Gestion {
	private static Grupo grupo = new Grupo("nombre");
	/**
	 * Lee la información desde el teclado y 
	 * añade el objeto al mapa
	 */
	static void alta() {
		Scanner t= new Scanner(System.in);
		System.out.print("Código: ");
		int codigo= t.nextInt();
		t.close();
		//grupo.alta(new Alumno());
	}
	/**
	 * Pregunta el número que queremos eliminar y 
	 * Busca en el mapa y lo elimina si está
	 */
	static void bajaLista() {
	}
	static void bajaFichero() throws IOException {
		/*
		 * Pregunta por alumno q hay borrar
		 */
		 DAOAlumnoSalida.borrar(3);
	}
	/**
	 * Llama al méto correspondiente para listar todo el fichero
	 * @throws IOException 
	 */
	static void listadoFichero() throws IOException {
		DAOAlumnoEntrada daoe= new DAOAlumnoEntrada();
		daoe.listado();
		daoe.cierra();
	}
	static void listadoMapa() throws IOException {
		DAOAlumnoEntrada daoe= new DAOAlumnoEntrada();
		daoe.listado();
		daoe.cierra();
	}
	/**
	 * Graba todos los objetos al fichero de datos
	 * @throws IOException 
	 */
	static void graba() throws IOException {
		DAOAlumnoSalida daos= new DAOAlumnoSalida();
		
		daos.grabaGrupo(grupo);
		daos.cierra();
	}
	/**
	 * Lee todos los registros de datos al mapa
	 */
	static void carga() {
	}
	static void creaArchivoLista() throws IOException {
		DAOAlumnoSalida daos= new DAOAlumnoSalida();
		daos.grabaListaCte();
		daos.cierra();
	}

	static void creaAprobados() throws IOException {
		String nombre= "aprobados.datos";
		DAOAlumnoSalida.grabaAprobados(nombre);
	}
	public static void main(String[] args) throws IOException {
		Scanner teclado= new Scanner(System.in);
		int opcion;
		do {
            Runtime.getRuntime().exec("clear");
            System.out.print("\033\143");
			System.out.println();
			System.out.println("==================== MENÚ PRINCIPAL DE GESTIÓN  ====================");
			System.out.println("               ======================================");
			System.out.println(" [1]  --> Dar de alta un Alumno. ");
			System.out.println(" [2]  --> Dar de baja un Alumno en Mapa. ");
			System.out.println(" [22] --> Dar de baja un Alumno en Fichero. ");
			
			System.out.println(" [3]  --> Listado de Alumnos FICHERO. ");
			System.out.println(" [33] --> Listado de Alumnos MAPA. ");

			System.out.println(" [4]  --> Guardar los Alumnos en el fichero.");
			System.out.println(" [5]  --> Cargar los Alumnos desde el fichero.");
			System.out.println(" [6]  --> Crear archivo de aprobados desde archivo de alumnos.");
			System.out.println(" [70] --> Crear archivo de alumnos desde lista CTE.");
			
			System.out.println(" [77] --> Salir y terminar el programa.");
			System.out.println("Elije una opción del menú: ");
			opcion= teclado.nextInt();
			switch (opcion) {
			case 1:
				alta();
				break;
			case 2:
				bajaLista();
				break;
			case 22:
				bajaFichero();
				break;
			case 3:
				listadoFichero();
				break;
			case 33:
				listadoMapa();
				break;
			case 4:
				graba();
				break;
			case 5:
				carga();
				break;
			case 70:
				creaArchivoLista();
				break;
			case 77:
				System.out.println("Terminando el programa...");
				System.out.println("Programa Finalizado");
				break;
			}
		} while (opcion != 77);
	}
}
