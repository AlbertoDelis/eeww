//Introducir un número por teclado y decir si es o no primo.

import java.util.Scanner;

public class PrEx0302 {

	public static void main(String[] args) {
		int numero;
		int x = 2;
		int cont;

		Scanner tc = new Scanner(System.in);
		System.out.print("Dame un número entero: 	");
		numero = tc.nextInt();
		cont = 0;
		for (x = 2; x < numero / 2; x++)
			if (numero % x == 0)
				cont++;

		if (cont == 0)
			System.out.print("El número " + numero + " es primo.");
		else
			System.out.print("El número " + numero + " NO es primo.");

	}

}
