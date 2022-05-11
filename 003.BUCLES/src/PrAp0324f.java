/*
Realizar un programa que permita introducir el sexo (‘H’,’M’) y la edad de los 30 trabajadores 
de una fábrica. El programa debe obligar a que las edades que se introduzcan estén comprendidas 
entre 16 y 70 años. El programa nos mostrará la edad y el sexo del más joven y también mostrará la 
media de edad de las mujeres. Finalmente nos informará si hay alguno con más de 60 años. Si se 
introduce cero como edad el programa terminará en ese momento sin esperar a que introduzcan 
los 30 trabajadores. 
 */

import java.util.*;

public class PrAp0324f {
	static Scanner tc = new Scanner(System.in);

	public static void main(String[] args) {
		final int NTR = 30;
		final int MAE = 70;
		final int MEE = 16;
		char sexo;
		int edad;
		int cTrabajadores;
		cTrabajadores = 1;
		do {
			System.out.println("Trabajador: " + cTrabajadores);
			do {
				System.out.printf("Edad: ");
				edad = tc.nextInt();
				if (edad != 0 && (edad < MEE || edad > MAE))
					System.out.println("Error entrada EDAD.");

			} while (edad != 0 && (edad < MEE || edad > MAE));
			tc.nextLine();
			do {
				System.out.printf("Sexo: ");
				sexo = tc.nextLine().toUpperCase().charAt(0);
				if (sexo != 'M' && sexo!='H')
					System.out.println("Error entrada SEXO.");

			} while (edad != 0 && (edad < MEE || edad > MAE));

			cTrabajadores++;
		} while (edad != 0 && cTrabajadores <= 30);
		System.out.println("FIN!!!");
	}

}
