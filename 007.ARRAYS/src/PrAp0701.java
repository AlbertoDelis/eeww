
/*Realiza un programa que tenga definido un Array como variable global llamado 
temperaturaMeses, de 12 enteros, con las temperaturas medias de un lugar en cada uno de los 
meses del año. Serán valores enteros negativos o positivos. El programa tendrá diferentes funciones 
que realicen las siguientes tareas: 
a. Llenar el Array con valores al azar para todos los meses (entre 0 y 40). 
b. Mostrar por pantalla el contenido del Array. 
c. Mostrar por pantalla el contenido del Array en orden inverso.
*/
import java.util.*;

public class PrAp0701 {
	static Scanner tc = new Scanner(System.in);
	static int[] temperaturaMeses = new int[12];
	static int mes = 1;
	static int[] invertido = new int[temperaturaMeses.length];

	public static void main(String[] args) {
		for (int i = 0; i < temperaturaMeses.length; i++) {
			System.out.println("Dame el valor de la temperatura media para el mes " + mes + ": ");
			int tempMes = tc.nextInt();
			if (tempMes >= 0 && tempMes <= 40) {
				temperaturaMeses[i] = tempMes;
				mes++;
			} else {

				System.out.println("Temperatura errónea, introduzca nueva temperatura media.");
			}

		}
		System.out.println("La temperatura de los 12 meses es: "+Arrays.toString(temperaturaMeses));

		for (int i = 0; i < temperaturaMeses.length; i++) {
			invertido[i] = temperaturaMeses[temperaturaMeses.length - 1 - i];

		}
		System.out.println("El array invertido es: "+Arrays.toString(invertido));

	}

}
