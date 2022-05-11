/*
Escribe un programa que lea un número N y realice el siguiente dibujo (Ej: suponiendo N igual a 4):
+***
*+**
**+*
***+
 */
public class PrEx0305 {

	public static void main(String[] args) {
		int ancho, alto;
		int x, y;
		ancho = 5;
		alto = 5;
		System.out.println("\t");
		for (int xx = 1; xx < alto; xx++)
			System.out.println(" " + xx + " ");

		System.out.println();
		for (y = 1; y <= alto; y++) {
			System.out.println(y + "\t");
			for (x = 1; x <= alto; x++)
				if (x == y)
					System.out.print("*");
				else
					System.out.print("-");
			System.out.println();

		}

	}

}
