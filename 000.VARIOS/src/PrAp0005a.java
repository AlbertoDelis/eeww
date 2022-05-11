
public class PrAp0005a {

	public static void main(String[] args) {
		int suma = 0;
		int y = 1;
		int x = 0;
		while (x <= 100) {
			if (y % 2 != 0) {
				System.out.println("Suma0 x=" + x + " y=" + y + " suma=" + suma);
				suma += y;
				x++; // post-incremento
				System.out.println("Suma1 x=" + x + " y=" + y + " suma=" + suma);

			}
			++y; // pre-incremento
			System.out.println("Suma2 x=" + x + " y=" + y + " suma=" + suma);

		}

	}

}
