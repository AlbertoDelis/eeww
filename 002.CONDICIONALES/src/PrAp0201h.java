
/*Leer dos números y decir si el primero es mayor que el segundo, 
 * si es menor o si los dos números son iguales. 
 */
import java.util.Scanner;

public class PrAp0201h {

	public static void main(String[] args) {
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro numero: ");
		num2 = teclado.nextInt();
		if (num1 > num2) {
			System.out.println("El primer número es mayor que el segundo.");
		} else if (num1 < num2) {
			System.out.println("El primer número es menor que el segundo.");

		} else {
			System.out.println("Los 2 números son iguales.");
		}

	}

}
