
/*
 Para aprobar el curso se valorar� la nota del examen, la valoraci�n del trabajo en clase y la 
nota de un trabajo pr�ctico. Aprobar�n los alumnos que est�n en alguna de las siguientes 
situaciones: 
� Nota examen mayor o igual a 5 
� Nota examen entre 4 y 5, trabajo en clase mayor que cinco y trab. pr�ctico mayor que 5. 
� Nota examen entre 4 y 5, y una nota mayor que 8 o en el trabajo pr�ctico o en la valoraci�n 
del trabajo en clase. 
Dise�ar un algoritmo al que se le introduzcan por consola la nota del examen, la valoraci�n del 
trabajo en clase y la nota del trabajo pr�ctico y saque por pantalla si est� aprobado o no, todo en 
con una sola sentencia condicional. 
 */
import java.util.Scanner;

public class PrAp0203 {

	public static void main(String[] args) {
		float examen, trabcl, trabpr;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame la nota del examen: ");
		examen = teclado.nextFloat();
		System.out.println("Dame la nota del trabajo en clase: ");
		trabcl = teclado.nextFloat();
		System.out.println("Dame la nota del trabajo pr�ctico: ");
		trabpr = teclado.nextFloat();
		if (examen >= 5) {
			System.out.println("Alumno aprobado caso 1.");
		} else if (examen >= 4 & trabcl >= 5 & trabpr >= 5) {
			System.out.println("Alumno aprobado caso 2.");
		} else if (examen >= 4 & trabcl >= 8 | trabpr >= 8) {
			System.out.println("Alumno aprobado caso 3.");
		} else {
			System.out.println("Alumno suspenso.");
		}

	}

}
