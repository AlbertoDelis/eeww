
/*Programa que permita introducir n�meros y nos muestre el resultado de sumarlos, hasta 
que introduzca un n�mero mayor que 1000. Si no se introduce un n�mero mayor que 1000 el 
programa finalizar� despu�s de introducidos 15 n�meros.
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
			System.out.print("Dame el " + (cont + 1) + " n�mero: ");
			num = tc.nextInt();
			suma = suma + num;
			cont++;

		}
		System.out.print("El resultado de sumar los " + cont + " n�meros es: " + suma);

	}

}
