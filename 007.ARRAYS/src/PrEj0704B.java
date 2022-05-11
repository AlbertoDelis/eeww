
public class PrEj0704B {
	static final int BOLAS = 50;
	static final int EXTRAC = 1000;

	static int[] frecuenciaBolas() {
		int bola;
		int[] contador = new int[BOLAS];
		for (int i = 0; i < EXTRAC; i++) {
			bola = (int) (Math.random() * BOLAS);
			contador[bola]++;
		}
		return contador;
	}

	static void visualiza(int[] frecuencia) {
		int i = 1;
		for (int r : frecuencia)
			System.out.printf("%2d: %d veces", i++, r);

	}

	public static void main(String[] args) {
		int[] f;
		f = frecuenciaBolas();
		visualiza(f);
		frecuenciaBolas();
	}

}
