
//Leer 5 n�meros y mostrarlos en orden inverso al introducido.
import java.util.*;

public class PrEj0702 {
	static Scanner tc = new Scanner(System.in);
	static int array[] = new int[5];

	static void llenarArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Dame un n�mero: ");
			array[i] = tc.nextInt();
		}
	}

	static void inverso() {
		for (int i = array.length-1; i >= 0; i--)
			System.out.print(array[i] + " ");
	}

	public static void main(String[] args) {
		llenarArray();
		inverso();
	}

}
