//Sumar una cantidad de números que se van introduciendo por teclado hasta que la suma de 
//los mismos valga más de 100. 
import java.util.*;
public class PrAp0309 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		int num;
		int suma=0;
		while (suma<=100) {
			System.out.println("Dame un número entero: ");
			num=teclado.nextInt();
			suma=suma+num;
			
		}
		System.out.println("La suma de todos los números introducidos es: "+suma);

	}

}
