//Para rellenar una matriz con números aleatorios 
//Filas Derecha Columna Abajo

public class PrEj07ArraysBidi {
	static int[][] arrayBD = new int[5][10];// F --> C

	static void rellenar() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				arrayBD[i][j] = (int) (Math.random() * 90 + 10);
				System.out.print(arrayBD[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		rellenar();
		System.out.println("El valor para la FILA 1 y la COLUMNA 5 es: " + arrayBD[1][5]);
	}
}
