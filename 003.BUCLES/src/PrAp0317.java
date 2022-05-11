
/*
Diseñar un algoritmo al que se le introduzcan las notas de un alumno en los nueve módulos 
de un ciclo y nos informe si puede ir a la FCT (todos aprobados). ¿Habría que solicitarle al usuario 
siempre las notas de los nueve módulos?
 */
import java.util.*;

public class PrAp0317 {
	static float nota;

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		do {
			do {
				System.out.println("Dame una nota del alumno: ");
				nota = tc.nextFloat();
				if (nota<5 || nota>=10) 
					System.out.println("Nota suspensa. No puede ir a la FCT");
			} while (nota < -1 || nota > 10);
		} while (nota != -1);
		

	}

}
