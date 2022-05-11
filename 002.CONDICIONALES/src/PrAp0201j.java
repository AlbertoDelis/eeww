
/*
 * Leer dos números enteros y diga si el menor de ellos es divisor del mayor (prevenir 
 * divisiones por cero, que causan error) Repasar operadores en cortocircuito para hacer 
 *un solo if.
 */
import java.util.Scanner;

public class PrAp0201j {

	public static void main(String[] args) {
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro numero entero: ");
		num2 = teclado.nextInt();
		int div1 = num2 % num1;
		int div2 = num1 % num2;
		if (num2 < num1 || num1 < num2 || div1 == 0 || div2 == 0) {
			System.out.println("El menor es divisor del mayor.");

		} else {
			System.out.println("No se cumplen condiciones enunciado.");

		}

	}

}
