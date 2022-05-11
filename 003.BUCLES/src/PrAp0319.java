
/*
Programa que se le introduzcan números por consola y que informe si están ordenados 
ascendentemente o no. El programa finaliza si se introduce cero o en cuanto se detecte que los 
números no están ordenados.
*/
import java.util.*;

public class PrAp0319 {

	public static void main(String[] args) {
		int numero;
		int numeroNuevo;
		numero = 0;
		numeroNuevo = 1;
		Scanner tc = new Scanner(System.in);
		System.out.println("Dame un número: ");
		numeroNuevo = tc.nextInt();

		while (numero < numeroNuevo && numeroNuevo != 0) {

			System.out.println("El número nuevo " + numeroNuevo + " es MAYOR que el número anterior " + numero);
			numero = numeroNuevo;
			System.out.println("Dame otro número nuevo: ");
			numeroNuevo = tc.nextInt();
		}
		System.out.println("El número nuevo " + numeroNuevo + " es MENOR que el número anterior " + numero);
		System.out.println("FIN PROGRAMA!!!");

	}

}
