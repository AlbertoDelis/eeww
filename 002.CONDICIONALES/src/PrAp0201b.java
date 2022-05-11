
//Leer dos números enteros y muestre si el primero es mayor que el segundo.
import java.util.*;

public class PrAp0201b {

	public static void main(String[] args) {
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el valor del primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Introduce el valor del segundo numero: ");
		num2 = teclado.nextInt();

		if (num1 > num2) {
			System.out.println("El primer numero es mayor que el segundo");

		} else if (num2 > num1) {
			System.out.println("El segundo numero es mayor que el primero");

		} else {
			System.out.println("Los numeros son iguales");
		}

	}

}
