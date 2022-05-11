
/*
Hacer un programa que permita calcular el sueldo final de los vendedores de un 
concesionario de coches. Para cada uno se introducirá: sueldo base, cantidad de horas extras 
realizadas y cantidad de ventas. El sueldo final será el sueldo base más las horas extras (se pagan a 
100€ la hora) y un plus en función de las ventas: entre 10 y 20 ventas 500€, entre 21 y 30 ventas 
1000€ y si supera las 30 ventas  1300 €. Después de tratar cada vendedor se preguntará al usuario 
y hay más vendedores a tratar, finalizando el programa si contesta negativamente. Al final el 
programa mostrará el total de ventas y el salario final del que más ventas ha realizado (supón que al 
menos introducen los datos de un empleado). 
 */
import java.util.*;

public class PrAp0322 {

	public static void main(String[] args) {
		int sueldoBase, horasExtras, numeroVentas, sueldoFinal, totalVentas;
		int empleado, totalVentas2, sueldoFinal2;
		Scanner tc = new Scanner(System.in);
		empleado = 1;
		sueldoBase = 0;
		horasExtras = 0;
		numeroVentas = 0;
		totalVentas = horasExtras * numeroVentas;
		sueldoFinal = sueldoBase + totalVentas;
		while (empleado == 1) {
			System.out.print("Introduce el sueldo base del empleado: ");
			sueldoBase = tc.nextInt();
			System.out.print("Introduce las horas extras del empleado: ");
			horasExtras = tc.nextInt();
			System.out.print("Introduce las ventas del empleado: ");
			numeroVentas = tc.nextInt();
			if (numeroVentas == 0 && numeroVentas < 10)
				horasExtras = 100;

			else if (numeroVentas >= 10 && numeroVentas <= 20)
				horasExtras = 500;

			else if (numeroVentas >= 21 && numeroVentas <= 30)
				horasExtras = 1000;

			else
				horasExtras = 1300;

			totalVentas2 = horasExtras * numeroVentas;
			sueldoFinal2 = sueldoBase + totalVentas;

			if (totalVentas2 > totalVentas)
				totalVentas = totalVentas2;
			if (sueldoFinal2 > sueldoFinal)
				sueldoFinal = sueldoFinal2;
			System.out.println("Quieres introducir los datos de otro empleado? " + "\n"
					+ "Responde con el número de empleados si 0 o 1 más: ");
			empleado = tc.nextInt();
		}
		System.out.println("El total de ventas del empleado con mayor cantidad es: " + totalVentas);
		System.out.println("El sueldo final del empleado con mayor cantidad es: " + sueldoFinal);

	}

}
