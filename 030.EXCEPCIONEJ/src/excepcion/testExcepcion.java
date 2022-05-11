package excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * definir un entero
 * luego introducir otro entero con el argumento:
 * "Dime el numero de alumnos:"
 * realizar entrada con un scanner
 * El método tiene que devolver un método entero, 
 * si se produce un error se seguirá pidiendo un número entero hasta que
 * se realice el ejercicio.
 */

public class testExcepcion {
	static Scanner teclado = new Scanner(System.in);
	static int getEntero(String prompt) {
		int num = -1;
		//num=Integer.parseInt(teclado.nextLine());
		while (true) {
			try {
				System.out.println(prompt);
				num = teclado.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Valor no válido!!!");
				teclado.nextLine();
				//e.printStackTrace();
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int numAlum;
		numAlum = getEntero("Numero de alumnos: ");
		System.out.println("El número de alumnos total es: "+numAlum);
	}

}
