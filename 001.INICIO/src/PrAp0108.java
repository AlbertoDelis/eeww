
/* Diseñar un programa al que se le introduzcan las edades de cuatro personas y nos calcule la
 * media de edad de los mismos. Hacer una segunda versión que solo utilice dos variables. 
 * ¿Seríaposible hacerlo con una sola variable? 
 */
import java.util.Scanner;

public class PrAp0108 {

	public static void main(String[] args) {
		int edad1, edad2, edad3, edad4;
		float edadMedia;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la edad de la primera persona: ");
		edad1 = teclado.nextInt();
		System.out.println("Introduce la edad de la segunda persona: ");
		edad2 = teclado.nextInt();
		System.out.println("Introduce la edad de la tercera persona: ");
		edad3 = teclado.nextInt();
		System.out.println("Introduce la edad de la cuarta persona: ");
		edad4 = teclado.nextInt();
		edadMedia=(float)(edad1+edad2+edad3+edad4)/4;

		System.out.println("Las edades de las personas son: " + edad1 + " " + edad2 + " " + edad3 + " " + edad4);
		System.out.println("La edad media de las 4 personas es: "+edadMedia);

	}

}
