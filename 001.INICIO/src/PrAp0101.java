
/*
 * Realiza un programa que lea por consola un valor en euros
 * y lo convierta a d�lares (suponer que 1 euro es igual a 1,14 d�lares).
*/
import java.util.Scanner;

public class PrAp0101 {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float euros = 0;
		float valor=1.14f;
		float dolares;
		System.out.println("Dame el valor de euros: ");
		euros=teclado.nextFloat();
		dolares = euros * valor;
		System.out.println(dolares);

	}

}