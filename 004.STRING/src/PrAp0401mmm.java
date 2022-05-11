import java.util.Scanner;

public class PrAp0401mmm {
	static Scanner teclado = new Scanner(System.in);

	/* conversion de un string a un stringbuilder y usamos reverse(). como el stringbuilder no tiene compareTo hay que comparar con el string
	dabale arroz a la zorra el abad

	no poner tildes

	ignorar mayusculas, minuscula, signos de puntuacion, espacios... */
	
	static String Cadena = "dabale arroz a la zorra el abad";
	

	public static boolean isPalindromo(String Cadena) {
		boolean palindromo;
		palindromo = true;
		String reverseCadena;
		String newCadena;
		
	
	
		newCadena= Cadena.replace(" ", "");
		
		StringBuilder sb = new StringBuilder(newCadena);
		reverseCadena= sb.reverse().toString();
			
		
		int result = newCadena.compareToIgnoreCase(reverseCadena);
		
		if(result == 0) {
			System.out.println("La expresión es palíndroma");
			palindromo = true;
		}
		else {
			System.out.println("La expresión no es palíndroma");
			palindromo = false;
		}
		
		return palindromo;
		}

	
	public static void main(String[] args) {
		
		System.out.println(isPalindromo(Cadena));

	}

}
