
//Hacer para el lunes.
/*
Programar el siguiente juego. El ordenador genera un n�mero al azar entre 0 y 99 que habr� 
que adivinar. El jugador intentar� adivinar el n�mero y el programa le responder� si es mayor, menor 
o si ha acertado. Se dispone de un m�ximo de 5 intentos. 
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
				System.out.println("N�mero mayor. Intento: " + i);

			else if (x > num)
				System.out.println("N�mero menor. Intento: " + i);

			else 
				System.out.println("N�mero acertado. N�mero de intentos: " + i);
				if (x == num)
					System.out.println("N�mero acertado.");
				else
					System.out.println("N�mero no acertado.");

		}

	}

}
