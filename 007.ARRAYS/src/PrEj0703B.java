
/*
 * Indica la frecuencia de las calificaciones introducidas. 
 * Se introduce por teclado una secuencia de calificaciones (1..10) que finaliza cuando se introduce una nota errónea. 
 * Se pide obtener e imprimir la lista de frecuencias, número de repeticiones, de cada una de las notas.
 */
import java.util.Arrays;
import java.util.Scanner;

public class PrEj0703B {
	static Scanner tc = new Scanner(System.in);

	static void llenarNotas(int[] notasAlumnos) {
		for (int i = 0; i < notasAlumnos.length; i++) {
			System.out.println("Dame la nota del alumno " + (i + 1) + ": ");
			int var = tc.nextInt();
			if (var > 10 || var < 1) {
				System.out.println("NOTA INCORRECTA!!!");
				i--;
			}else {
				notasAlumnos[i] = var;
			}
		}
	}

	static void repeticiones(int[] notasAlumnos, int[] cont) {
		for (int i = 1; i <= 10; i++)
			for (int j = 0; j < notasAlumnos.length; j++)
				if (i == notasAlumnos[j])
					cont[i - 1]++;	
					
	}

	public static void main(String[] args) {
		int[] cont = new int[10];
		int[] notasAlumnos = new int[30];
		llenarNotas(notasAlumnos);
		System.out.println(Arrays.toString(notasAlumnos));
		repeticiones(notasAlumnos, cont);
		for (int i = 1; i <= 10; i++)
			System.out.println("La nota " + i + " se repite " + cont[i - 1] + " veces.");
	}
}
