
// Mostrar por pantalla los n primeros números naturales, siendo n el valor tecleado previamente. 
import java.util.Scanner;

public class PrAp0302 {

	public static void main(String[] args) {
		int n;
		System.out.println("Dame un número: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();

		while (n > 0) {
			System.out.println(n);
			n--;

		}

	}

}
