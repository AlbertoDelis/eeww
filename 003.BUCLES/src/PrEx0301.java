
/*
Pedir 2 números enteros por teclado y obtener las tablas de multiplicar
incluidas entre ambos números (ambos inclusive).
*/
import java.util.*;

public class PrEx0301 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro número entero: ");
		num2 = teclado.nextInt();
		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				System.out.println();
				System.out.println("TABLA DEL " + i);
				for (int j = 0; j <= 10; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));
				}

			}
		} else {
			for (int i = num1; i <= num2; i++) {
				System.out.println();
				System.out.println("TABLA DEL " + i);
				for (int j = 0; j <= 10; j++) {
					System.out.println(i + " x " + j + " = " + (i * j));

				}

			}
		}
	}
}
