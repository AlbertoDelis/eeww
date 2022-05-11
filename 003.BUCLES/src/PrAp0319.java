
/*
Programa que se le introduzcan n�meros por consola y que informe si est�n ordenados 
ascendentemente o no. El programa finaliza si se introduce cero o en cuanto se detecte que los 
n�meros no est�n ordenados.
*/
import java.util.*;

public class PrAp0319 {

	public static void main(String[] args) {
		int numero;
		int numeroNuevo;
		numero = 0;
		numeroNuevo = 1;
		Scanner tc = new Scanner(System.in);
		System.out.println("Dame un n�mero: ");
		numeroNuevo = tc.nextInt();

		while (numero < numeroNuevo && numeroNuevo != 0) {

			System.out.println("El n�mero nuevo " + numeroNuevo + " es MAYOR que el n�mero anterior " + numero);
			numero = numeroNuevo;
			System.out.println("Dame otro n�mero nuevo: ");
			numeroNuevo = tc.nextInt();
		}
		System.out.println("El n�mero nuevo " + numeroNuevo + " es MENOR que el n�mero anterior " + numero);
		System.out.println("FIN PROGRAMA!!!");

	}

}
