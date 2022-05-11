package bandurriahero;

public class BandurriaHero {
	static String array[] = null;
	static int contO = 0;
	static int mult = 1;

	public static void main(String[] args) {
		int casos = (int) (Math.random() * 5 + 1);
		for (int i = 1; i <= casos; i++) {
			int longitud = (int) (Math.random() * 10 + 1);
			array = new String[longitud];
			for (int j = 0; j < longitud; j++) {
				int num = (int) (Math.random() * 2);
				if (num == 0) {
					array[j] = "O";
					contO = contO + (10 *mult);
					System.out.print(array[j]);
					mult++;
				} else {
					array[j] = ".";
					System.out.print(array[j]);
				}
			}
		}
		System.out.println(" " + contO);
		contO = 0;
		mult = 1;
	}
}
