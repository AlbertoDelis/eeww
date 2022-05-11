/*
Programa que muestre los n�mero primos comprendidos entre 2 y 1000. Hacer los bucles 
con un n�mero m�nimo de iteraciones (se permite el uso de break) sabiendo que: 
- Un n�mero primo es solo divisible por 1 y el mismo.
- Los n�meros primos son todos impares salvo el 2. 
- Los divisores de un n�mero siempre son menores que la mitad de dicho n�mero (salvo el 
mismo). 
- Si un n�mero no es divisible por 2 ya no va a serlo por ning�n otro n�mero par.
 */
public class PrAp0320 {

	public static void main(String[] args) {
		int cont;
		cont = 0;
		for (int i = 3; i <= 1000; i += 2) {
			for (int j = 2; j < i - 1; j++)
				if (i % j == 0)
					cont++;

			if (cont == 0)
				System.out.println("El n�mero " + i + " es primo.");
			cont = 0;
		}

	}

}
