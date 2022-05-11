/*
Diseñar un algoritmo al que se le introduzcan las notas de los exámenes de una clase con 
decimales. Se introducirá –1 para indicar que no hay más notas. El algoritmo informará del total de 
notas introducidas, calculará la nota mínima, máxima , la media, si hay algún 5.0 exacto, y el 
porcentaje de aprobados. Hay que validar que estén entre 0 y 10.
*/

import java.util.*;

public class PrAp0312 {

	public static void main(String[] args) {
		float nota, suma;
		int nNotas, aprobados, suspensos;
		boolean cinco;
		nNotas = 0;
		suma = 0;
		aprobados = 0;
		suspensos=0;
		cinco = false;

		Scanner tc = new Scanner(System.in);

		do {
			do {
				System.out.println("Dame una nota del alumno: ");
				nota = tc.nextFloat();
				if (nota < -1 || nota > 10)
					System.out.println("Error de nota.");
			} while (nota < -1 || nota > 10);
			if (nota != -1) {
				nNotas++;
				suma = suma + nota;
				if (nota == 5.0)
					cinco = true;
				if (nota >= 5)
					aprobados++;

			}

		} while (nota != -1);
		System.out.println("Total: " + nNotas);
		System.out.println("Media: " + suma / nNotas);
		if (cinco)
			System.out.println("Si hay 5 exacto");
		else
			System.out.println("No hay 5 exacto entre las notas.");
		System.out.println("El porcentaje de aprobados es de: " + (float)aprobados * 100 / nNotas + "%");
		System.out.println("El porcentaje de suspensos es de: " + (float)suspensos * 100 / nNotas + "%");
		

	}

}