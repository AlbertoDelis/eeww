//Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos).
import java.util.*;
public class PrAp0201f {

	public static void main(String[] args) {
		int num;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame un numero entero: ");
		num=teclado.nextInt();
		if (num<=20 && num>=10) {
			System.out.println("El numero está comprendido entre 10 y 20 (ambos incluidos)");
			
		} else {
			System.out.println("El numero es mayor que 20 o menor que 10");

		}
		

	}

}
