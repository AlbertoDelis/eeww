import java.util.Arrays;

/*
Realiza un programa similar a los anteriores pero que realice las siguientes funciones: 
a. Llenar el Array con valores al azar para todos los meses. Para enero, febrero, marzo, 
noviembre y diciembre los valores estarán comprendidos entre -10 y +20 y para el resto 
de meses entre +10 y +40. 
b. Mostrar por pantalla el contenido del array con el nombre de los meses (usar clases Java 
para obtener el nombre del mes) 
c. Mostrar la temperatura máxima del año, usando printf especificando en el formato que 
incluya el signo “+” en temperaturas positivas y que solo muestre 1 decimal. 
d. Mostrar el nombre del mes más frío del año. 
e. Para hacer pruebas estadísticas, desplazar los valores a la derecha, pasando el último al 
primero.
 */

public class PrAp0704 {
	static int[] array = new int[12];
	static final String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre" };

	static void llenarArray() {
		for (int i = 0; i < array.length; i++) {
			if (i >= 3 && i <= 9)
				array[i] = (int) (Math.random() * 31 + 10);
			else
				array[i] = (int) (Math.random() * 31 - 10);
		}
	}

	static int tempMax() {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > temp)
				temp = array[i];
		}
		return temp;
	}

	static void mesFrio() {
		int temp = 100;
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < temp) {
				temp = array[i];
				cont = i;

			}

		}
		System.out.println("El mes más frio es: " + meses[cont]);
	}

	static void visualizar() {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(meses[i] + ": " + array[i]);

		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		llenarArray();
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(meses));
		visualizar();
		System.out.println("La temperatura máxima del año es: " + tempMax());
		mesFrio();
	}
}
