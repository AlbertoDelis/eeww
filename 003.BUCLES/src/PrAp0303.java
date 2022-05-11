
/*
Diseñar un algoritmo que permita introducir números positivos y nos vaya informando uno a 
uno si es par o impar. El programa finalizará cuando se introduzca un número negativo. Hacer dos 
versiones, una primera con una lectura de teclado adelantada (antes de entrar en el bucle) y otra 
versión en la que la lectura de datos se haga únicamente al principio del bucle.
*/
import java.util.*;

public class PrAp0303 {

	// primera versión.
	public static void main(String[] args) {
		System.out.println("PRIMER CASO!!!");
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número: ");
		num = teclado.nextInt();
		if (num % 2 == 0)
			System.out.println("El número es par.");
		else if (num < 0)
			System.out.println("El número es negativo.");
		else
			System.out.println("El número es impar.");

		System.out.println("SEGUNDO CASO!!!");
		while (num >= 0) {
			System.out.println("Dame un número: ");
			num = teclado.nextInt();
			if (num % 2 == 0)
				System.out.println("El número es par.");
			else if (num < 0)
				System.out.println("El número es negativo.");
			else
				System.out.println("El número es impar.");

		}

	}

}
