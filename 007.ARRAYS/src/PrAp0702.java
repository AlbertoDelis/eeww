
/*7.2. Realiza un programa similar al anterior, con las siguientes tareas: 
a. Llenar el Array con valores al azar para todos los meses (entre 0 y 40). 
b. Mostrar la temperatura media del a�o. 
c. Mostrar los meses en los que hizo m�s de 30 grados.
d. Decir si hay alg�n mes con m�s de 30 grados, recorriendo lo imprescindible del array, es 
decir, en cuanto sepa que s� hay alguno, que pare de recorrer el array. Puedes usar break 
o return. 
e. Decir si hay alg�n mes con m�s de 30 grados, recorriendo lo imprescindible del array pero 
ahora sin usar ni break ni return.
f. Decir si hay alguna temperatura repetida en dos o m�s meses.
*/
import java.util.*;

public class PrAp0702 {
	static Scanner tc = new Scanner(System.in);
	static int[] meses = new int[12];
	static int mes = 1;
	static float tempMedia;

	public static void main(String[] args) {
		for (int i = 0; i < meses.length; i++) {
			System.out.println("Dame el valor de la temperatura media para el mes " + mes + ": ");
			int tempMes = tc.nextInt();
			tempMedia=tempMedia+tempMes;
			if (tempMes >= 0 && tempMes <= 40) {
				meses[i] = tempMes;
				mes++;
				if (tempMes > 30)
					System.out.println("La temperatura del mes " + mes + " que es " + tempMes + " es mayor de 30�C");

			} else {

				System.out.println("Temperatura err�nea, introduzca nueva temperatura media.");
			}
			

		}
		System.out.print("La temperatura de todos los meses es: "+Arrays.toString(meses));
		System.out.println();
		System.out.println("La temperatura media del a�o es: " + (tempMedia / 12)+" �C");
		

	}

}
