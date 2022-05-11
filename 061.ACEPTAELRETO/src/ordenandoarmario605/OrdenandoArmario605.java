package ordenandoarmario605;

public class OrdenandoArmario605 {

	public static void main(String[] args) {
		char ver = 'V';
		char inv = 'I';
		char amb = 'A';
		int contVer = 0;
		int contInv = 0;
		int contAmb = 0;
		String estaciones[]=new String[2] ;
		estaciones= ['AMBAS"',"VERANO","INVIERNO"];
		int casos = (int) (Math.random() * 5 + 1);
		for (int i = 1; i <= casos; i++) {
			int casos2 = (int) (Math.random() * 10 + 1);
			for (int j = 1; j <= casos2; j++) {
				int prenda = (int) (Math.random() * 2);
				if (prenda == 0) {
					contAmb++;
					System.out.print(amb + " ");
				}
				if (prenda == 1) {
					contVer++;
					System.out.print(ver + " ");
				}
				if (prenda == 2) {
					contInv++;
					System.out.print(inv + " ");
				}
			}
			System.out.print(".");
		}
		System.out.println(".");

	}

}
