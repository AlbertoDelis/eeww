
//Leer 5 n�meros por teclado y a continuaci�n realizar la media de los n�meros positivos, la media de los negativos y contar el n�mero de ceros.
import java.util.*;

public class PrEj0703 {
	static Scanner tc = new Scanner(System.in);
	static int array[] = new int[5];

	static void llenar() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Dame el n�mero " + (i + 1) + " para llenar el array: ");
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
		System.out.println("La media de los n�meros positivos es: " + mediaPos());
		System.out.println("La media de los n�meros negativos es: " + mediaNeg());
		System.out.println("La cantidad de 0 es: " + contador0());

	}

}
