//Leer dos números enteros y diga si los dos son mayores de 10 o no lo son.
import java.util.*;

public class PrAp0201d {

	public static void main(String[] args) {
		int num1, num2;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introdukce un numero entero: ");
		num1=teclado.nextInt();
		System.out.println("Introduce otro numero entero: ");
		num2=teclado.nextInt();
		if (num1>10 && num2>10) {
			System.out.println("Los dos numeros son mayores de 10");
			
		} else {
			System.out.println("Los dos numeros no son mayores de 10");

		}

	}

}
