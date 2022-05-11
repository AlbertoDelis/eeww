
//Decir si la cadena es un palíndromo.
public class PrAp0401m {
	static String cad = "Roma ni se conoce sin oro, ni se conoce sin amor";
	static int x = cad.length();

	static char recorrerCadena(String cad) {
		char cad2 = 0;
		for (int i = 0; i < x/2; i++) {
			cad2 = cad.charAt(i);

		}
		return cad2;
	}

	static char recorrerCadena2(String cad) {
		char cad3 = 0;
		for (int i = x-1; i > x/2; i--) {
			cad3 = cad.charAt(i-1);

		}
		return cad3;
	}

	public static void main(String[] args) {
		System.out.println(recorrerCadena(cad));
		//System.out.println(recorrerCadena2(cad));
		//System.out.println(recorrerCadena(cad) == recorrerCadena2(cad));

	}

}
