//Programa que invierte el contenido de un vector.

import java.util.*;

public class PrEj0702B {
	static int tam;

	static void llenar(int[] array, int[] arrayInv) {
		int temp = tam - 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 50 + 1);
			System.out.print(array[i] + " ");
			arrayInv[temp] = array[i];
			if (temp >= 0) {
				temp--;
			} else {
				break;
			}
		}

	}

	public static void main(String[] args) {
		int tam;
		Scanner tc = new Scanner(System.in);
		System.out.print("Dame la longitud del array: ");
		tam = tc.nextInt();
		int[] array = new int[tam];
		int[] arrayInv = new int[tam];
		llenar(array, arrayInv);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arrayInv));

	}

}
