/* Realiza un programa que lea por consola dos números enteros (sin decimales) y nos muestre
 * los resultados de sumar, restar y dividir dichos números.
 * Comprueba que la división responde con decimales
 */

import java.util.Scanner;

public class ProgApuntes003 {

	public static void main(String[] args) {
		int num1, num2;
		int suma, resta;
		float division;
		Scanner teclado= new Scanner (System.in);
		System.out.println("Dame un numero: ");
		num1=teclado.nextInt();
		System.out.println("Dame otro numero: ");
		num2=teclado.nextInt();
		suma=num1+num2;
		resta=num1-num2;
		division=(float)num1/num2;
		System.out.println("El resultado de sumar los 2 numeros es: "+ suma);
		System.out.println("El resultado de restar los 2 numeros es: "+ resta);
		System.out.println("El resultado de dividir los 2 numeros es: "+ division);




	}

}
