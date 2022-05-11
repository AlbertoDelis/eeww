package sehacolado;

import java.util.Scanner;

public class SeHaColado {
	static Scanner teclado = new Scanner(System.in);
	static int cont;

	public static void main(String[] args) {
		System.out.print("");
		int numCasos = teclado.nextInt();
		for (int i = 0; i < numCasos; i++) {
			System.out.print("");
			int numPersonas = teclado.nextInt();
			for (int j = 0; j < numPersonas; j++) {
				cont = 0;
				int array[] = new int[numPersonas];
				System.out.print("");
				array[j] = teclado.nextInt();
				if (j > 0) {
					if (array[j] > array[j - 1]) {
						cont++;

					}
				}
			}
			System.out.println(cont);
		}
	}
}
