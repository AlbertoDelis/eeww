/*
 * Queremos gestionar un agenda de amigos. Para ello, hasta que avancemos un poco en la materia, 
 * vamos a usar tres vectores de N componentes cada uno: 
 * el primero almacena el nombre, el segundo el n�mero de tel�fono y el tercero la edad. 
 * Como ves, son tres array paralelos, es decir, en la componente n�mero "a" tenemos la informaci�n del amigo n�mero "a". 
 * Realizar un programa que disponga de un men� con las siguientes opciones:
 * 1.Realiza una consulta para un nombre introducido por teclado. Si est�, indica el tel�fono y la edad y si no indica que no se encuentra.
 * 2.A�ade un amigo a la agenda. El lugar de inserci�n ser� el primer hueco disponible en los arrays: podemos buscarlo o llevar un contador de amigos.
 * 3.Eliminar un amigo de la agenda. Buscamos el nombre dado por teclado; si lo encontramos, 
 * todas las componentes situadas a la derecha de �sta se desplazar�n un lugar a la izquierda. 
 * 4.Lista toda la agenda.
 * 5.Calcula la edad media.
 * 6.Da los mayores a una edad introducida por tecla.
 * 7.Todas las operaciones que se te ocurran.
 * 8.Fin.
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class PrEj0709B {
	static Scanner teclado = new Scanner(System.in);
	static final int N = 100;
	static int nPersonas;
	static String nombre[];
	static String[] telefono;
	static int[] edad;
	/*
	 * APARTADO 1
	 */

	static int consulta(String nombreBusca) {
		boolean encontrado = false;
		int indice = 0;
		while (!encontrado && indice < nPersonas) {
			if (nombreBusca.equalsIgnoreCase(nombre[indice]))
				encontrado = true; // return indice;
			else
				indice++;
		}

		return encontrado == true ? indice : -1; // return -1;
	}

	static void apartado01() {
		int posicion;
		String nombreBusca = teclado.nextLine();
		posicion = consulta(nombreBusca);
		if (posicion != -1)
			System.out.printf("nombre: %s telefono: %s edad: %d\n", nombre[posicion], telefono[posicion],
					edad[posicion]);
		else
			System.out.println(nombreBusca + " no encontrado.");
	}

	static void visualiza(int p) {
		System.out.printf("nombre: %s \n", nombre[p]);
		System.out.printf("telefono: %s \n", telefono[p]);
		System.out.printf("edad: %d\n", edad[p]);
	}
	/*
	 * APARTADO 2
	 */

	static boolean alta() {
		boolean cabe = true;
		if (nPersonas < nombre.length) {
			System.out.print("NOMBRE: ");
			nombre[nPersonas] = teclado.nextLine();
			System.out.print("TELEFONO: ");
			telefono[nPersonas] = teclado.nextLine();
			System.out.print("EDAD: ");
			edad[nPersonas] = teclado.nextInt();

		} else
			cabe = false;

		return cabe;
	}

	/*
	 * VISUALIZA TODO
	 */

	static void visualizaTodo() {
		for (int p = 0; p < nPersonas; p++)
			visualiza(p);

	}

	/*
	 * GRABAR
	 */

	static void graba() throws FileNotFoundException {
		PrintWriter datos = new PrintWriter("agenda.csv");
		datos.println("Nombre, Tel�fono, Edad");
		for (int p = 0; p < nPersonas; p++) {
			datos.printf("%s,%s,%d\n", nombre[p], telefono[p], edad[p]);

		}
		datos.close();
	}
	
	/*
	 * APARTADO 3
	 */
	
	

	public static void main(String[] args) throws FileNotFoundException {
		nPersonas = 3;
		nombre = new String[] { "Juan", "Pedro", "Luis", null, null, null, null };
		telefono = new String[] { "123", "456", "789", null, null, null, null };
		edad = new int[] { 5, 6, 7, 0, 0, 0, 0 };
		// menu
		// 1
		System.out.println(Arrays.toString(nombre));
		System.out.println(Arrays.toString(telefono));
		System.out.println(Arrays.toString(edad));
		System.out.println("Introduce el nombre a buscar: ");
		apartado01();

		// 2 Alta
		// nombre[nPersonas]=elNombre;//hacerlo en un m�todo
		// nPersonas++;
		alta();
		visualiza(nPersonas - 1);
		visualizaTodo();
		graba();
		
		// 3 Baja
		

	}
}
