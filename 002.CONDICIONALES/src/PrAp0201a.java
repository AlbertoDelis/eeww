
//Leer un número entero y determinar si es mayor de 10.
import java.util.*;

public class PrAp0201a {

	public static void main(String[] args) {
		int num;
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduce un numero: ");
		num=teclado.nextInt();
		if (num > 10)
			System.out.println("El numero es mayor de 10.");
		else if (num < 10)
			System.out.println("El numero es menor de 10.");
		else
			System.out.println("El numero es igual a 10");

	}

}
