
/*
Realizar un programa que informe si un año introducido previamente es bisiesto o no. Son 
bisiestos los años múltiplos de 4 que no sean múltiplos de 100. Como excepción los múltiplos de 400 
también son bisiestos. Se puede hacer una primera versión con varias sentencias condicionales y 
otra más sofisticada con una sola. No usar las clases de fechas de Java. 
*/
import java.util.Scanner;

public class PrAp0207 {

	public static void main(String[] args) {
		int year;
		System.out.println("Dame un año: ");
		Scanner teclado = new Scanner(System.in);
		year = teclado.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0))
			System.out.println("El año es bisiesto caso 1.");
		else if (year % 400 == 0)
			System.out.println("El año es bisiesto caso 2.");
		else
			System.out.println("El año no es bisiesto.");

	}

}
