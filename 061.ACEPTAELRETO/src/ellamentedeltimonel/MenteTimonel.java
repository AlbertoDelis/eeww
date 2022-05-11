package ellamentedeltimonel;

import java.util.Scanner;

public class MenteTimonel {
	static Scanner teclado = new Scanner(System.in);
	static int num;

	public static void main(String[] args) {
		do {
			System.out.print("Introduce un numero: ");
			num = teclado.nextInt();
			int[] array = new int[num];
			int cont = 0;
			for (int i = 0; i < array.length; i++) {
				System.out.print("Número: ");
				array[i] = teclado.nextInt();
			}
			for (int i = 1; i <array.length; i++) {
				if (array[i] * array[i - 1] > cont) {
					cont = array[i] * array[i - 1];

				}
			}
			System.out.println("Contador: "+cont);
		} while (num != 0);
	}
}
