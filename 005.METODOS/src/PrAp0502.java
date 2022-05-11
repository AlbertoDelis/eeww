/*Programa que presente un menú y permita calcular repetidas veces 
 * a) el área de círculo –necesitará el radio- , 
 * b) el área de cuadrado –necesitará el lado - , 
 * c) el área de triángulo –necesitará base y altura – 
 * d) Salir. 
 * Usar funciones para cada una de las 3 opciones. 
*/
import java.util.Scanner;


public class PrAp0502 {
	static Scanner tc= new Scanner(System.in);
	
	static double areaCirculo (int radio) {
		return radio*radio*Math.PI;
	}
	
	
	

	public static void main(String[] args) {
		int opcion;
		do {
			System.out.println("1. Area circulo: ");
			System.out.println("2. Area cuadrado: ");
			System.out.println("3. Salir: ");
			System.out.println("Selección: ");
			opcion=tc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Valor del radio: ");
				int radio=tc.nextInt();
				System.out.println(areaCirculo(radio));
				break;
			case 2:
				
				break;
			
			default:
				System.out.println("Opción no válida!!!");
				break;
			}
			
		} while(opcion !=3);

	}

}
