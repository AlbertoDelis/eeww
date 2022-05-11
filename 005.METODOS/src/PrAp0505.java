
/*
 * Programa que calcule el factorial de n�meros menores de 20. 
 * El programa permite al usuario meter los n�meros que desee 
 * y finalizar� cuando meta un n�mero menor que 1 o mayor que 20. 
 * Crea las funciones que consideres �tiles y que puedas reutilizar en otros programas.
 */
import java.util.Scanner;

public class PrAp0505 {

	static Scanner tc = new Scanner(System.in);

	static int factorial(int num) {
		int fact = 1;
		for (int i = num; i >= 1; i--)
			fact = fact * i;
		return fact;
	}

	public static void main(String[] args) {
		int num;
		do {
			System.out.println("Dame un n�mero: ");
			num = tc.nextInt();
			System.out.println("El factorial de " + num + " es: " + factorial(num));
			if (num >= 1 && num <= 20)
				System.out.println("N�mero introducido entre 1 y 20, continua programa.");

			else
				System.out.println("FIN PROGRAMA!!!");

		} while (num >= 1 && num <= 20);

	}

}
