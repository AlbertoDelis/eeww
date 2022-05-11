
//Leer tres números enteros y diga hay alguno mayor que cero.
import java.util.*;

public class PrAp0201l {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame un segundo número entero: ");
		num2 = teclado.nextInt();
		System.out.println("Dame un tercer número entero: ");
		num3 = teclado.nextInt();
		if (num1 > 0 || num2 > 0 || num3 > 0) {
			System.out.println("Alguno de los números ya es mayor que 0");
		} else {
			System.out.println("Ninguno de los números es mayor de 0");

		}

	}

}
