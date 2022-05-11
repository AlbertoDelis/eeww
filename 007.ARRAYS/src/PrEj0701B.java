/*
 * Programa que lee N números enteros sobre un vector y 
 * obtiene e imprime cuales son el mayor y el menor número almacenado 
 * y cuantas veces se repiten ambos.
 */

import java.util.Arrays;
import java.util.Scanner;

public class PrEj0701B {
	static void llenarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 50 + 1);
		}
	}

	static void calculos(int[] array) {
		int numMayor = 0;
		int numMenor = 100;
		int contMayor =1;
		int contMenor=1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > numMayor)
				numMayor = array[i];
			else if (array[i] < numMenor)
				numMenor = array[i];
			else if (array[i] == numMayor)
				contMayor++;
			else if (array[i] == numMenor)
				contMenor++;

		}
		System.out.println("El número mayor es " + numMayor + " está repetido " + contMayor + " veces.");
		System.out.println("El número menor es " + numMenor + " está repetido " + contMenor + " veces.");

	}

	public static void main(String[] args) {
		int tam;
		Scanner tc = new Scanner(System.in);
		System.out.print("Dame la longitud del array: ");
		tam = tc.nextInt();
		int[] array = new int[tam];
		llenarArray(array);
		System.out.println(Arrays.toString(array));
		calculos(array);

	}

}
