import java.util.Scanner;

//Si 2 n�mero son o no amigos.

public class PrEj0502 {
	static Scanner tc = new Scanner(System.in);

	static int sumaDivisores(int num) {
		int suma;
		suma = 0;
		for (int divisor = 1; divisor <= num; divisor++)
			if (num % divisor == 0)
				suma += divisor;

		return suma;
	}

	static boolean amigo(int num1, int num2) {
		if (sumaDivisores(num1) - num1 != num2)
			return false;
		if (sumaDivisores(num2) - num2 != num1)
			return false;
		return true;

	}

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		do {

			System.out.println("Introduce los n�meros. Si no quiere introducirlos ponga alg�n 0.");
			System.out.print("Dame un primer n�mero: ");
			num1 = tc.nextInt();
			System.out.print("Dame un segundo n�mero: ");
			num2 = tc.nextInt();
			System.out.println("Los n�meros " + num1 + " y " + num2 + " son o no son amigos: " + amigo(num1, num2));

		} while (num1 != 0 && num2 != 0 && num1 != num2);
		System.out.println("FIN PROGRAMA!!!");

	}

}
