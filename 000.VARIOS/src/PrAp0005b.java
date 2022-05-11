
public class PrAp0005b {

	public static void main(String[] args) {
		int valor = 5;
		++valor; // ahora es como PREfijo
		switch (valor % 2) {
		case 0:
			System.out.print("Par");
		case 1:
			System.out.print("Impar");
			break;
		default:
			System.out.print("Nada");
			break;
		}

	}

}
