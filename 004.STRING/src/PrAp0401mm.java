
//Decir si la cadena es un palíndromo.
import java.util.Scanner;

public class PrAp0401mm {
	static Scanner tc = new Scanner(System.in);

	static boolean isPalindromo(String cadena) {
		cadena=cadena.toUpperCase();
		boolean palindromo;
		palindromo = true;

		return cadena.equals(new StringBuilder(cadena).reverse().toString());
	}

	static boolean isPalindromo1(String cadena) {
		boolean palindromo;
		palindromo = true;
		cadena = cadena.toUpperCase();

		for (int i = 0, d = cadena.length() - 1; palindromo && i < d; i++, d--) {
			if (cadena.charAt(i) != cadena.charAt(d))
				return false;

		}

		return palindromo;
	}

	public static void main(String[] args) {
		String cadena = "Dabalearrozalazorraelabad";
		//System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
		if (cadena.indexOf('x') != -1)
			System.out.println("SI");
		else
			System.out.println("NO");
		//System.out.println(isPalindromo(""));

	}

}
