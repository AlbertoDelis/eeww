
/*El siguiente programa pretende intercambiar dos variables enteras introducidas previamente,
 * y luego mostrarlas por pantalla. Corrige los errores que encuentres en el código. 
 * ¿Sería posible intercambiar los valores de dos variables sin usar ninguna variable adicional? 
 * Piensa como hacerlo o busca en internet una solución.
 */
import java.util.Scanner;

public class PrAp0109 {

	public static void main(String[] args) {
		int var1, var2;
		Scanner teclado = new Scanner(System.in); // faltaba esto
		System.out.print("Introduce var1: ");
		var1 = teclado.nextInt();
		System.out.print("Introduce var2: ");
		var2 = teclado.nextInt();
		// var1 = var2;
		// var2 = var1;
		var1 = var1 + var2;
		// a la variable var1 le asigno el valor de var1 + var2
		var2 = var1 - var2;
		// A var2 le asigno el resultado de resta al valor calculado anteriormente de
		// var1 con el valor inicial de var2
		var1 = var1 - var2;
		// Y una vez realizado el cálculo de var2 le resto el valor a la variable de
		// var1 el nuevo valor de var2
		System.out.println("Ahora var1 es igual a var1: " + var1);
		System.out.println("Ahora var2 es igual a var2: " + var2);
	}
}
