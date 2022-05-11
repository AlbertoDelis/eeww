
//Programa que genere la combinación de la lotería primitiva.
import java.util.*;

public class PrEj0711B {
	static Scanner tc = new Scanner(System.in);
	static int[] primitiva = new int[8];

	static void llenar() {
		for (int i = 0; i < 8; i++) {
			if (i >= 0 && i <= 5) {
				primitiva[i] = (int) (Math.random() * 49 + 1);
				for (int j = i; j < 0; j--)
					if (primitiva[i] == j)
						i--;
			}
			primitiva[6] = (int) (Math.random() * 49 + 1);
			for (int k = i; k > 5; k--)
				if (primitiva[i] != k)
					k--;

			primitiva[7] = (int) (Math.random() * 10);

		}
	}

	static void visualizar() {
		for (int i = 0; i <= 5; i++)
			System.out.println("NUMERO: " + primitiva[i]);
		System.out.println("COMPLEMENTARIO: " + primitiva[6]);
		System.out.println("REINTEGRO: " + primitiva[7]);

	}

	public static void main(String[] args) {
		llenar();
		System.out.println(Arrays.toString(primitiva));
		visualizar();

	}

}
