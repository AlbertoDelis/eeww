package saltosMario158;

import java.util.*;

public class SaltosMario {
	static Scanner tc = new Scanner(System.in);
	static int arrayMuros[];
	static int contArriba = 0;
	static int contAbajo = 0;

	public static void main(String[] args) {
		System.out.print("Introduce número de casos de prueba: ");
		int casos = tc.nextInt();
		for (int i = 1; i <= casos; i++) {
			System.out.print("Introduce el número de muros: ");
			int muros = tc.nextInt();
			int[] arrayMuros = new int[muros];
			for (int j = 0; j < arrayMuros.length; j++) {
				System.out.print("Introduce la altura del muro " + (j + 1) + ": ");
				arrayMuros[j] = tc.nextInt();
			}
			System.out.println(Arrays.toString(arrayMuros));
			System.out.println();
			for (int j = 0; j < arrayMuros.length; j++) {
				if (arrayMuros[j] > arrayMuros[j - 1])
					contArriba++;
				if (arrayMuros[j] < arrayMuros[j - 1])
					contAbajo++;
			}
			System.out.println("Contador saltos arriba :" + contArriba);
			System.out.println("Contador saltos abajo :" + contAbajo);
		}
	}
}
