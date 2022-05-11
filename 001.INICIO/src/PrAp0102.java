import java.util.Scanner;

/*Realiza un programa que lea por consola un valor en dólares
 * y lo convierta a euros (suponer que 1 euro es igual a=1,14 dólares).
 */
public class PrAp0102 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float dolares = 0;
		float valor = 1.14f;
		float euros;
		System.out.println("Dame el valor de dolares: ");
		dolares = teclado.nextFloat();
		euros = dolares * valor;
		System.out.println(euros);

	}

}
