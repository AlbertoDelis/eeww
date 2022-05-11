
//Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros.
import java.util.*;

public class PrEj0703 {
	static Scanner tc = new Scanner(System.in);
	static int array[] = new int[5];

	static void llenar() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Dame el número " + (i + 1) + " para llenar el array: ");
			array[i] = tc.nextInt();

		}
	}
	/*
	static float medias() {
		float mediaPos, mediaNeg, contPos, contNeg,cont0;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>0) {
				mediaPos+=array[i];
			}
			
		}
	}
	*/

	static float mediaPos() {
		float media = 0, cont = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				media += array[i];
				cont++;
			}
		}
		return media / cont;
	}

	static float mediaNeg() {
		float media = 0, cont = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				media += array[i];
				cont++;
			}

		}
		return media / cont;

	}

	static int contador0() {
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0)
				cont++;
		}
		return cont;
	}

	public static void main(String[] args) {
		llenar();
		System.out.println(Arrays.toString(array));
		System.out.println("La media de los números positivos es: " + mediaPos());
		System.out.println("La media de los números negativos es: " + mediaNeg());
		System.out.println("La cantidad de 0 es: " + contador0());

	}

}
