/*
El coste de un autom�vil nuevo para un comprador es la suma total del coste de f�brica del 
veh�culo, m�s el porcentaje de la ganancia de la tienda (que se aplica sobre el coste de f�brica) y 
a�adi�ndole finalmente los impuestos estatales aplicables (sobre el precio de venta calculado ya con 
beneficio de la tienda). 
Suponiendo una ganancia de tienda de 10% y un impuesto del 20%, realiza un programa que lea por 
consola el coste inicial del autom�vil y calcule el coste para el consumidor. 
*/
import java.util.Scanner;

public class PrAp0106 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		final int BE=10;
		final int IM=20;
		float precioF;
		float precioFB;
		float precioFBI;
		System.out.println("Dame el precio f: ");
		precioF=teclado.nextInt();
		precioFB=precioF+precioF*10/100;
		precioFBI=precioFB+precioFB*20/100;
		System.out.println(precioFBI);
		
		
		
		

	}

}
