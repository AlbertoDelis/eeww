/*
Programa al que se le introduzcan por consola las coordenadas X e Y de un punto del plano y 
calcule el área del rectángulo que forma ese punto con el origen de los ejes de coordenadas (ojo: 
pueden ser negativos):
*/
import java.util.Scanner;

public class PrAp0110 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		int x, y;
		int area;
		System.out.println("Introduce el valor de la coordenada x: ");
		x=teclado.nextInt();
		System.out.println("Introduce el valor de la coordenada y: ");
		y=teclado.nextInt();
		area=Math.abs(x*y);
		System.out.println("El area del rectángulo es: "+ area);
		

	}

}
