
public class PrAp0701f {
	static final int MESES = 12;

	static void cargaTemperaturas(int temperaturaMeses[]) {
		for (int m = 0; m < temperaturaMeses.length; m++) {
			temperaturaMeses[m] = (int) (Math.random() * 41);

		}

	}

	static void visualizaTemperaturas(int temperaturaMeses[]) {
		System.out.println();
		for (int m = 0; m < temperaturaMeses.length; m++) {
			System.out.print(temperaturaMeses[m] + " ");

		}

	}

	static void visualizaInTemperaturas(int temperaturaMeses[]) {
		System.out.println();
		for (int m = temperaturaMeses.length - 1; m >= 0; m--) {
			System.out.print(temperaturaMeses[m] + " ");

		}

	}

	static float mediaTemperaturas(int temperaturaMeses[]) {
		System.out.println();
		float suma = 0;
		for (int t : temperaturaMeses) {
			suma += t;

		}
		return suma / temperaturaMeses.length;

	}

	static void visualizaMesesMas30g(int temperaturaMeses[]) {
		System.out.println();
		for (int m = 0; m < temperaturaMeses.length; m++) {
			if (temperaturaMeses[m] > 30)
				System.out.println("Temperatura mayor de 30ºC: " + temperaturaMeses[m]);
		}

	}

	static boolean hayMesMas30g(int temperaturaMeses[]) {
		System.out.println();
		for (int m = 0; m < temperaturaMeses.length; m++) {
			if (temperaturaMeses[m] > 30) {
				return true;
			}

		}
		return false;
	}

	static boolean hayMesMas30g1(int temperaturaMeses[]) {
		System.out.println();
		boolean hayMes = false;
		int m = 0;

		while (!hayMes && m < temperaturaMeses.length) {
			if (temperaturaMeses[m] > 30) {
				hayMes = true;

			}

		}
		return hayMes;
	}

	static boolean temperaturaRepetida(int temperaturaMeses[]) {
		System.out.println();
		boolean repetida = false;
		for (int m = 0; m < temperaturaMeses.length - 1; m++) {
			for (int mr = m + 1; mr < temperaturaMeses.length; mr++) {
				if (temperaturaMeses[m] == temperaturaMeses[mr])
					return true;
			}
		}
		return repetida;
	}

	public static void main(String[] args) {
		int temperaturaMeses[] = new int[MESES];
		cargaTemperaturas(temperaturaMeses);
		visualizaTemperaturas(temperaturaMeses);
		visualizaInTemperaturas(temperaturaMeses);
		float media;
		media = mediaTemperaturas(temperaturaMeses);
		System.out.println(media);
		visualizaMesesMas30g(temperaturaMeses);
		if (hayMesMas30g(temperaturaMeses))
			System.out.println("SI");
		else
			System.out.println("NO");
		System.out.println("temperaturas repetidas: " + temperaturaRepetida(temperaturaMeses));

	}

}
