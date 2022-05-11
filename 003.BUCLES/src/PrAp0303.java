
/*
Dise�ar un algoritmo que permita introducir n�meros positivos y nos vaya informando uno a 
uno si es par o impar. El programa finalizar� cuando se introduzca un n�mero negativo. Hacer dos 
versiones, una primera con una lectura de teclado adelantada (antes de entrar en el bucle) y otra 
versi�n en la que la lectura de datos se haga �nicamente al principio del bucle.
*/
import java.util.*;

public class PrAp0303 {

	// primera versi�n.
	public static void main(String[] args) {
		System.out.println("PRIMER CASO!!!");
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero: ");
		num = teclado.nextInt();
		if (num % 2 == 0)
			System.out.println("El n�mero es par.");
		else if (num < 0)
			System.out.println("El n�mero es negativo.");
		else
			System.out.println("El n�mero es impar.");

		System.out.println("SEGUNDO CASO!!!");
		while (num >= 0) {
			System.out.println("Dame un n�mero: ");
			num = teclado.nextInt();
			if (num % 2 == 0)
				System.out.println("El n�mero es par.");
			else if (num < 0)
				System.out.println("El n�mero es negativo.");
			else
				System.out.println("El n�mero es impar.");

		}

	}

}
