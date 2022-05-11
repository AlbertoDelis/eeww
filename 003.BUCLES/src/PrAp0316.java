
//Hacer para el lunes.
/*
Programar el siguiente juego. El ordenador genera un número al azar entre 0 y 99 que habrá 
que adivinar. El jugador intentará adivinar el número y el programa le responderá si es mayor, menor 
o si ha acertado. Se dispone de un máximo de 5 intentos. 
*/
import java.util.Scanner;

public class PrAp0316 {

	public static void main(String[] args) {
		int x = 0;
		int num = (int) (Math.random() * 100);
		System.out.println(num);
		for (int i = 1; i <= 5 && x != num; i++) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Dame un numero intento: ");
			x = teclado.nextInt();
			if (x < num) 
				System.out.println("Número mayor. Intento: " + i);

			else if (x > num)
				System.out.println("Número menor. Intento: " + i);

			else 
				System.out.println("Número acertado. Número de intentos: " + i);
				if (x == num)
					System.out.println("Número acertado.");
				else
					System.out.println("Número no acertado.");

		}

	}

}
