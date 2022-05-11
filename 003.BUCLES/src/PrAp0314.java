/*
Diseñar un algoritmo que informe de los números perfectos que hay entre 1 y 10000. 
Un número perfecto si es igual a la suma de todos los divisores menores que él.
*/
public class PrAp0314 {

	public static void main(String[] args) {

		for (int i = 10000; i >= 1; i--) {
			int suma;
			suma = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0)
					suma = suma + j;

			}
			if (suma == i && i != 1)
				System.out.println("El número " + i + " es perfecto.");

		}

	}

}
