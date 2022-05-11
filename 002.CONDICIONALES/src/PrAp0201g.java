
//Leer dos números enteros y diga si uno y solo uno es mayor de 10.
import java.util.*;

public class PrAp0201g {

	public static void main(String[] args) {
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame otro numero entero: ");
			num2 = teclado.nextInt();
			/*
		if (num1 > 10 && num2 < 10) {
			System.out.println("Solo un numero es mayor de 10.");
		} else  if(num1<10 && num2>10){
			System.out.println("Solo un numero es mayor de 10.");
		} else 
			System.out.println("No se cumple el enunciado");
		*/
		if ((num1 > 10 && num2 < 10) || (num1<10 && num2>10))
			System.out.println("Solo un numero es mayor de 10.");
		else
			System.out.println("No se cumple el enunciado");
				
	}

}
