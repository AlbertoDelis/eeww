
//Leer dos números enteros y diga si al menos uno de los dos es mayor de 10
import java.util.*;

public class PrAp0201e {
	public static void main(String[] args) {
		int num1, num2;
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduce el primer numero entero: ");
		num1=teclado.nextInt();
		System.out.println("Introduce el segundo numero entero: ");
		num2=teclado.nextInt();
		if (num1> 10 | num2>10) {
			System.out.println("Numero mayor de 10");
			
		} else {
			System.out.println("Numeros menores de 10");

			
			
		
		}
		
	}

}
