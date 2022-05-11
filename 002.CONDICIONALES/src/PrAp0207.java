
/*
Realizar un programa que informe si un a�o introducido previamente es bisiesto o no. Son 
bisiestos los a�os m�ltiplos de 4 que no sean m�ltiplos de 100. Como excepci�n los m�ltiplos de 400 
tambi�n son bisiestos. Se puede hacer una primera versi�n con varias sentencias condicionales y 
otra m�s sofisticada con una sola. No usar las clases de fechas de Java. 
*/
import java.util.Scanner;

public class PrAp0207 {

	public static void main(String[] args) {
		int year;
		System.out.println("Dame un a�o: ");
		Scanner teclado = new Scanner(System.in);
		year = teclado.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0))
			System.out.println("El a�o es bisiesto caso 1.");
		else if (year % 400 == 0)
			System.out.println("El a�o es bisiesto caso 2.");
		else
			System.out.println("El a�o no es bisiesto.");

	}

}
