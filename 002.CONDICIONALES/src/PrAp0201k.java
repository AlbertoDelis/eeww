
/*
 * Leer un n�mero y decir si es m�ltiplo de 2, de 3 y/o de 10.
* Si no es m�ltiplo de 2 ya no hay que mirar si lo es de 10.
*/
import java.util.*;

public class PrAp0201k {

	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero: ");
		num = teclado.nextInt();
		if (num % 2 == 0) {
			System.out.println("El n�mero es divisible entre 2");
			if (num % 10 == 0)
				System.out.println("El n�mero es divisible entre 10");
		}

		if (num % 3 == 0) {
			System.out.println("El n�mero es divisible entre 3");
		}

	}

}
