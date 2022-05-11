
public class PrEj07Sudoku {
	static int[][] sudoku = new int[9][9];

	static void llenar() {
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku.length; j++) {
				sudoku[i][j] = (int) (Math.random() * 9 + 1);
				System.out.print(sudoku[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void comprobar() {
		int var = 1;
		for (int f = 0; f < sudoku.length; f++) {
			for (int c = 0; c < sudoku.length; c++) {
				while (sudoku[f][c] == sudoku[f][var] || var<=9)
					sudoku[f][var] = (int) (Math.random() * 9 + 1);
				var++;
			}
		}
	}

	static void visualizar() {
		for (int f = 0; f < sudoku.length; f++) {
			for (int c = 0; c < sudoku.length; c++) {
				System.out.print(sudoku[f][c] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		llenar();
		System.out.println("------------------------------");
		System.out.println("++++++++++++++++++++++++++++++");
		comprobar();
		visualizar();
	}
}
