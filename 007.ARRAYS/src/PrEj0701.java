
//Leer 5 números y mostrarlos en el mismo orden introducido.
import java.util.*;

public class PrEj0701 {
	static Scanner tc = new Scanner(System.in);
	static int array[] = new int[5];

	static void llenarArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Dame un número: ");
			array[i] = tc.nextInt();
		}
	}

	static void visualizarArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		llenarArray();
		visualizarArray();
	}
}
