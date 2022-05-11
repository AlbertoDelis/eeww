
/*
 * Programa que calcule el factorial de números menores de 20. 
 * El programa permite al usuario meter los números que desee 
 * y finalizará cuando meta un número menor que 1 o mayor que 20. 
 * Crea las funciones que consideres útiles y que puedas reutilizar en otros programas.
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
			System.out.println("Dame un número: ");
			num = tc.nextInt();
			System.out.println("El factorial de " + num + " es: " + factorial(num));
			if (num >= 1 && num <= 20)
				System.out.println("Número introducido entre 1 y 20, continua programa.");

			else
				System.out.println("FIN PROGRAMA!!!");

		} while (num >= 1 && num <= 20);

	}

}
