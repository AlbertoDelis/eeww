
/*
 * Diseñar un programa al que se le introduzcan por consola tres números enteros. Si todos son 
 * negativos, mostrar el producto de los tres. Si alguno es negativo, pero no todos, mostrar la suma de 
 * los tres. En caso de que todos sean positivos sumar los dos primeros y multiplicar dicha suma por el 
 * tercero. ¿existe alguna combinación de los valores leídos no contemplado en el algoritmo? (Suponer 
 * que el cero es un número positivo). Hacer el programa lo más sencillo posible. 
 */
import java.util.Scanner;

public class PrAp0202 {
	public static void main(String[] args) {
		int num1, num2, num3;
		int prod, suma, op;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número entero: ");
		num1 = teclado.nextInt();
		System.out.println("Dame un segundo número entero: ");
		num2 = teclado.nextInt();
		System.out.println("Dame un tercer número entero: ");
		num3 = teclado.nextInt();
		prod = num1 * num2 * num3;
		suma = num1 + num2 + num3;
		op = (num1 + num2) * num3;
		if (num1 < 0 && num2 < 0 && num3 < 0) {
			System.out.println("El producto de los 3 números es: " + prod);

		} else if (num1 < 0 || num2 < 0 || num3 < 0) {
			System.out.println("La suma de los 3 números es: " + suma);

		} else if (num1 >= 0 && num2 >= 0 && num3 >= 0) {
			System.out.println("La suma de los 2 primeros y multiplicado por el tercero es: " + op);
		}

	}

}
