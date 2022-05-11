// Matriz unitaria
import java.util.*;
public class PrEj07MatrizUnitaria {
	
	static void unitaria(int tam, int matrix[][]) {
		for (int i = 0; i < tam; i++) {
			for (int j = 0; j < tam; j++) {
				if (i == j)
					matrix[i][j] = 1;
				System.out.print(matrix[i][j]+" ");
			}
		System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner tc=new Scanner (System.in);
		System.out.println("Dame el tamaño de la matriz unitaria: ");
		int tam=tc.nextInt();
		int[][] matrix = new int[tam][tam];
		unitaria(tam, matrix);	
	}
}
