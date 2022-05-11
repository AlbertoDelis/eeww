/*
 * Diseña un algoritmo capaz de obtener la letra del nif a partir del número de dni. Consiste en 
dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente 
según la siguiente tabla. Almacena las letras del NIF en una cadena.
 */
import java.util.Scanner;

public class PrAp0402 {
	static Scanner tc=new Scanner(System.in);
	static String cadena="TRWAGMYFPDXBNJZSQVHLCKE";
	static int numero=23;
	
	static String letraElegida(int numLetra) {
		
		numero=numLetra%23;
		String letraCadena=cadena.charAt(numero);
		
		
		
		
		return letraCadena;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Introduce un numero para la letra comprendido entre 0 y 23: ");
		int numLetra=tc.nextInt();
		
	}

}
