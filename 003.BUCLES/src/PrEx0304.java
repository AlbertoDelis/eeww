/*
Escriba un programa que imprima el siguiente triángulo utilizando un bucle while y un bucle for:
*
**
***
****
*****
******
*******
********
 */
public class PrEx0304 {

	public static void main(String[] args) {
		int ancho, alto;
		int x, y;
		y = 1;
		ancho = 10;
		alto = 10;
		while (y <= alto) {
			for (x = 1; x <= y; x++)
				System.out.print("*");
			y++;
			System.out.println();

		}

	}

}
