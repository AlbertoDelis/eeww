
/*
 * Dise�ar un programa al que se le introduzcan por consola tres n�meros enteros. Si todos son 
 * negativos, mostrar el producto de los tres. Si alguno es negativo, pero no todos, mostrar la suma de 
 * los tres. En caso de que todos sean positivos sumar los dos primeros y multiplicar dicha suma por el 
 * tercero. �existe alguna combinaci�n de los valores le�dos no contemplado en el algoritmo? (Suponer 
 * que el cero es un n�mero positivo). Hacer el programa lo m�s sencillo posible. 
 */
import java.util.Scanner;

public class PrAp0202 {
	public static void main(String[] args) {
		int num1, num2, num3;
		int prod, suma, op;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame un segundo n�mero entero: ");
		num2 = teclado.nextInt();
		System.out.println("Dame un tercer n�mero entero: ");
		num3 = teclado.nextInt();
		prod = num1 * num2 * num3;
		suma = num1 + num2 + num3;
		op = (num1 + num2) * num3;
		if (num1 < 0 && num2 < 0 && num3 < 0) {
			System.out.println("El producto de los 3 n�meros es: " + prod);

		} else if (num1 < 0 || num2 < 0 || num3 < 0) {
			System.out.println("La suma de los 3 n�meros es: " + suma);

		} else if (num1 >= 0 && num2 >= 0 && num3 >= 0) {
			System.out.println("La suma de los 2 primeros y multiplicado por el tercero es: " + op);
		}

	}

}
