
//Leer un n�mero entero y determinar si se trata de un n�mero par o impar.
import java.util.*;

public class PrAp0201c {

	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		num = teclado.nextInt();
		// num=(int)(Math.random()*100); entrada de n�mero aleatorio
		// System.out.println(num);
		if (num % 2 == 0)
			System.out.println("El numero es par");
		else
			System.out.println("El numero es impar");

	}

}
