package db_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UsoScanner {
	static <T>void mostrar(T s) {
		System.out.println(s);
	}

	/**
	 * Supongamos que queremos leer un fichero de texto línea a línea
	 * guardando cada línea en un String:
	 * 
	 * @throws FileNotFoundException
	 */
	public static void lineaAlinea() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("palabras.txt"));
		while (sc.hasNextLine()) {
			String s = sc.nextLine(); // tratamiento de s, por ejemplo:
			mostrar(s);
		}
		sc.close();
	}

	/**
	 * Supongamos que queremos leer un fichero de texto palabra a palabra
	 * separadas por un blanco guardando cada palabra en un String:
	 * 
	 * @throws FileNotFoundException
	 */
	public static void palabraApalabra() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("palabras.txt"));
		while (sc.hasNext()) {
			String s = sc.next(); // tratamiento de s, por ejemplo:
			mostrar(s);
		}
		sc.close();
	}

	/**
	 * Supongamos que queremos leer un fichero de texto palabra a palabra
	 * separadas por una coma guardando cada palabra en un String:
	 * 
	 * @param args
	 */
	public static void palabraApalabraPorComaEnLinea() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("palabras_coma_linea.txt")).useDelimiter(",");
		while (sc.hasNext()) {
			String s = sc.next(); // tratamiento de s, por ejemplo:
			mostrar(s);
		}
		sc.close();
	}

	public static void palabraApalabraPorComa() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("palabras_coma.txt")).useDelimiter("\\s*" + "," + "\\s*");
		while (sc.hasNext()) {
			String s = sc.next(); // tratamiento de s, por ejemplo:
			mostrar(s);
		}
		sc.close();
	}

	/**
	 * Para leer datos separados por blancos podríamos usar una sobrecarga del
	 * método que no tuviera parámetro delimitador. Su código sería:
	 * 
	 * @param args
	 */
	public static List<String> leeFichero(String fileName)  throws FileNotFoundException {
		List<String> listaleida = new LinkedList<String>();
		try {
			Scanner sc = new Scanner(new File(fileName)).useDelimiter("\\s+");
			while (sc.hasNext()) {
				listaleida.add(sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}
		return listaleida;
	}

	public static void main(String[] args) {
		try {
			// lineaAlinea();
			// palabraApalabra();
			List<String> l= leeFichero("numeros_espacio.txt");
			mostrar(l);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
