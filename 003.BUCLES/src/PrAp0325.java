/*Mostrar por pantalla alternativamente �hola� y �adi�s� hasta completar x l�neas, 
 * siendo x un n�mero entero positivo tecleado previamente.
 */
import java.util.Scanner;
public class PrAp0325 {

	public static void main(String[] args) {
		String frase1= "hola";
		String frase2= "adi�s";
		int num;
		Scanner tc=new Scanner (System.in);
		System.out.println("Dame un n�mero entero: ");
		num=tc.nextInt();
		for (int i = 0; i <=num; i++) {
			System.out.println(frase1);
			System.out.println(frase2);
			
		}

	}

}
