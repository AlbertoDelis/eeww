
/*Programa que permita introducir números y nos muestre el resultado de sumarlos, hasta 
que introduzca un número mayor que 1000. Si no se introduce un número mayor que 1000 el 
programa finalizará después de introducidos 15 números.
*/
import java.util.Scanner;

public class PrAp0323 {

	public static void main(String[] args) {
		int num, suma, cont;
		suma = 0;
		cont = 0;
		num = 0;
		while (num <= 1000 && cont < 15) {
			Scanner tc = new Scanner(System.in);
			System.out.print("Dame el " + (cont + 1) + " número: ");
			num = tc.nextInt();
			suma = suma + num;
			cont++;

		}
		System.out.print("El resultado de sumar los " + cont + " números es: " + suma);

	}

}
