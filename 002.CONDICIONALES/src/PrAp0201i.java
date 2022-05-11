
/*
 * Leer dos números enteros y diga si el segundo es divisor del primero (prevenir divisiones 
 *por cero, que causan error) Repasar operadores en cortocircuito para hacer un solo if
 */
import java.util.Scanner;

public class PrAp0201i {

	public static void main(String[] args) {
		int num1, num2;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame un segundo número entero: ");
		num2 = teclado.nextInt();
		int div1 = num1 % num2;

		if (div1 == 0) {
			System.out.println("El segundo número es divisor del primero.");

		} else {
			System.out.println("No se cumplen las condiciones.");

		}

	}

}
