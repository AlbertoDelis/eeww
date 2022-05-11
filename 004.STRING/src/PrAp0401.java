import java.util.Scanner;

public class PrAp0401 {
	static Scanner tc = new Scanner(System.in);

	static char validaEntrada() {
		char entrada;
		final String opciones = "SsNn";
		do {
			System.out.println("Entrada: ");
			entrada = Character.toUpperCase(tc.nextLine().charAt(0));
			// entrada=tc.nextLine().toUpperCase().charAt(0);

			// } while (entrada != 's' && entrada !='S' && entrada != 's' && entrada !='S');
		} while (opciones.indexOf(entrada) == -1);

		return entrada;
	}

	static int cuentaDigitos(String cadena) {
		int cuenta;
		cuenta = 0;
		for (int c = 0; c < cadena.length(); c++) {
			if ("0123456789".indexOf(cadena.charAt(0)) != -1)
				cuenta++;
			if (Character.isDigit(cadena.charAt(0)))
				cuenta++;

		}

		return 0;
	}

	public static void main(String[] args) {
		String cadena = "La casa es verde";
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena.toLowerCase());
		if (cadena.indexOf('x') != -1)
			System.out.println("SI");
		else
			System.out.println("NO");

	}

}
