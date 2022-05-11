
/*Leer 10 números enteros. Debemos mostrarlos en el siguiente orden: 
 * el primero, el último, el segundo, el penúltimo, el tercero, etc.
 */
import java.util.*;

public class PrEj0704 {
	static Scanner tc = new Scanner(System.in);
	static int[] array = new int[10];

	static void rellenar() {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Dame el numero entero " + (i + 1) + ": ");
			array[i] = tc.nextInt();
		}
	}

	static void mostrar() {
		for (int i = 0; i < array.length / 2; i++) {
			System.out.print(array[i] + " ");
			System.out.print(array[9 - i] + " ");
		}
	}

	public static void main(String[] args) {
		rellenar();
		System.out.println(Arrays.toString(array));
		mostrar();

	}

}
