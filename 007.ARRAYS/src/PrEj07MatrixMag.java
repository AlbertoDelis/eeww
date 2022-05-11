
//MATRIX MAGICA --> Suma filas, columnas y diagonales da el mismo resultado
import java.util.*;

public class PrEj07MatrixMag {

	static void rellenar(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix.length; j++)
				matrix[i][j] = (int) (Math.random() * 9 + 1);
	}

	static void visualizar(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void comprobarFilas(int[][] matrix, int suma) {
		int suma2;
		for (int i = 1; i < matrix.length; i++) {
			suma2 = 0;
			for (int j = 0; j < matrix.length; j++) {
				suma2 += matrix[i][j];
				if (suma2 != suma) {
					int resul=suma-suma2;
					matrix[i][matrix.length-1]=resul;	
					
				}
			}
		}
	}
	
	static void visualizar2(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	static void comprobarColumnas(int[][] matrix, int suma) {
		int suma2;
		for (int i = 0; i < matrix.length; i++) {
			suma2 = 0;
			for (int j = 0; j < matrix.length; j++) {
				suma2 += matrix[j][i];
				if (suma2 != suma) {
					int resul=suma-suma2;
					matrix[matrix.length-1][j]=resul;	
					
				}
			}
		}
	}
	
	static void visualizar3(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		rellenar(matrix);
		visualizar(matrix);
		System.out.println();
		int suma = 0;
		for (int i = 0; i < matrix.length; i++) {
			suma += matrix[0][i];
		}
		System.out.println(suma);
		comprobarFilas(matrix, suma);
		System.out.println("------");
		visualizar2(matrix);
		comprobarColumnas(matrix, suma);
		System.out.println("++++++++");
		visualizar3(matrix);
		

	}

}
