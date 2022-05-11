
/*Leer por teclado 2 vectores de enteros, con un único metodo para la entrada de datos. 
 * Los vectores A y B de longitud N random y completar el array3 mezclando ambos anteriores arrays sumando sus longitudes.
 */
import java.util.Arrays;
import java.util.Scanner;

public class PrEj0705 {
	static Scanner tc = new Scanner(System.in);

	static void llenarArrays(int[] arrayA, int[] arrayB, int[] arrayC) {

		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Dame el valor " + (i + 1) + " para llenar el arrayA: ");
			arrayA[i] = tc.nextInt();

		}
		for (int i = 0; i < arrayB.length; i++) {
			System.out.println("Dame el valor " + (i + 1) + " para llenar el arrayB: ");
			arrayB[i] = tc.nextInt();

		}
		if (arrayA.length > arrayB.length) {
			//int a = arrayB.length;
			int cont = 0;
			for (int i = 0; i < arrayB.length; i++) {
				arrayC[cont] = arrayA[i];
				cont += 2;
			}
			cont = 1;
			for (int j = 0; j < arrayB.length; j++) {
				arrayC[cont] = arrayB[j];
				cont += 2;
			}
			int var=arrayB.length*2;
			int var2=arrayB.length;
			for (int i = var; i < arrayC.length; i++) {
				arrayC[var]=arrayB[var2];
				var2++;
				
			}
				/*
				for (int k = j * 2; k < arrayC.length; k++) {
					arrayC[k] = arrayA[a + 1];
					a++;
					if (a == arrayA.length)
						break;

				}
				*/
			
			

		} else if (arrayB.length > arrayA.length) {
			//int a = arrayA.length;
			int cont = 0;
			for (int i = 0; i < arrayA.length; i++) {
				arrayC[cont] = arrayA[i];
				cont += 2;
				/*
				for (int k = i * 2; k < arrayC.length; k++) {
					arrayC[k] = arrayB[a + 1];
					a++;
					if (a == arrayB.length)
						break;
				}
				*/
				cont = 1;
				for (int j = 0; j < arrayA.length; j++) {
					arrayC[cont] = arrayB[j];
					cont += 2;
				}

			}

		} else {
			int cont = 0;
			for (int i = 0; i < arrayA.length; i++) {
				arrayC[cont] = arrayA[i];
				cont += 2;
			}
			cont = 1;
			for (int j = 0; j < arrayA.length; j++) {
				arrayC[cont] = arrayB[j];
				cont += 2;
			}
		}
	}

	public static void main(String[] args) {
		int tamA = (int) (Math.random() * 10 + 1);
		int tamB = (int) (Math.random() * 10 + 1);
		int[] arrayA = new int[tamA];
		int[] arrayB = new int[tamB];
		int[] arrayC = new int[tamA + tamB];
		System.out.println(tamA + "+" + tamB + "=" + (tamA + tamB));
		System.out.println(Arrays.toString(arrayA));
		System.out.println(Arrays.toString(arrayB));
		System.out.println(Arrays.toString(arrayC));
		llenarArrays(arrayA, arrayB, arrayC);
		System.out.println(Arrays.toString(arrayA));
		System.out.println(Arrays.toString(arrayB));
		System.out.println(Arrays.toString(arrayC));

	}

}
