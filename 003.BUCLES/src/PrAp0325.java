/*Mostrar por pantalla alternativamente “hola” y “adiós” hasta completar x líneas, 
 * siendo x un número entero positivo tecleado previamente.
 */
import java.util.Scanner;
public class PrAp0325 {

	public static void main(String[] args) {
		String frase1= "hola";
		String frase2= "adiós";
		int num;
		Scanner tc=new Scanner (System.in);
		System.out.println("Dame un número entero: ");
		num=tc.nextInt();
		for (int i = 0; i <=num; i++) {
			System.out.println(frase1);
			System.out.println(frase2);
			
		}

	}

}
