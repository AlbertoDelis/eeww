
// Examen PrEj07ExTexto
import java.util.*;

public class PrEj07Ex {
	static Scanner tc = new Scanner(System.in);

	static void llenarMarcas(String[] MARCAS) {
		for (int i = 0; i < MARCAS.length; i++) {
			System.out.println("Dame la marca de coche " + (i + 1) + ": ");
			MARCAS[i] = tc.nextLine();
		}
	}

	static void mostrar(String[] MARCAS) {
		for (int i = 0; i < MARCAS.length; i++) {
			System.out.print(MARCAS[i] + " ");
		}
	}

	static void llenarVentas(int[][] VENTAS, String[] VENDEDORES, String[] MARCAS) {
		for (int i = 0; i < VENDEDORES.length; i++) {
			for (int j = 0; j < MARCAS.length; j++) {
				System.out.println("Dame el número de ventas para el vendedor " + (VENDEDORES[i]) + " de la marca "+(MARCAS[j]) + ":");
				VENTAS[i][j] = tc.nextInt();
			}
		}
	}

	static void mostrarVentas(int[][] VENTAS, String[] VENDEDORES, String[] MARCAS) {
		for (int i = 0; i < VENDEDORES.length; i++) {
			for (int j = 0; j < MARCAS.length; j++) {
				System.out.print(VENTAS[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int[] totalVendedores(int[][] VENTAS, String[] VENDEDORES, String[] MARCAS) {
		int totales[] = new int[VENDEDORES.length];
		for (int i = 0; i < VENDEDORES.length; i++) {
			for (int j = 0; j < MARCAS.length; j++) {
				totales[i] += VENTAS[i][j];
			}
		}
		return totales;
	}

	static void visualizarTotales(int[][] VENTAS, String[] VENDEDORES, int marcas) {
		int cont;
		for (int i = 0; i < VENDEDORES.length; i++) {
			cont = 0;
			for (int j = 0; j < marcas; j++) {
				cont += VENTAS[i][j];
			}
			System.out.println("El vendedor " + VENDEDORES[i] + " ha echo el total de ventas " + cont + " unidades.");
		}
	}

	static void mejorVendedor(int[][] VENTAS, String[] VENDEDORES, int marcas) {
		int cont;
		int max = 0;
		int cont2 = 0;
		for (int i = 0; i < VENDEDORES.length; i++) {
			cont = 0;
			for (int j = 0; j < marcas; j++) {
				cont += VENTAS[i][j];
				if (max < cont) {
					max = cont;
					cont2 = j;
				}
			}
		}
		System.out.println("El vendedor " + VENDEDORES[cont2] + " es el que tiene más ventas totales que son: " + max);
	}

	public static void main(String[] args) {
		String VENDEDORES[] = { "María", "Raquel", "Antonio", "Pedro", "Soledad", "Marcos", "Mercedes" };
		System.out.print("Dime el número de marcas de coche: ");
		String num = tc.nextLine();
		int marcas = Integer.parseInt(num);
		String MARCAS[] = new String[marcas];
		llenarMarcas(MARCAS);
		mostrar(MARCAS);
		System.out.println();
		int[][] VENTAS = new int[VENDEDORES.length][marcas];
		llenarVentas(VENTAS, VENDEDORES, MARCAS);
		mostrarVentas(VENTAS, VENDEDORES, MARCAS);
		totalVendedores(VENTAS, VENDEDORES, MARCAS);
		int totales[] = new int[VENDEDORES.length];
		System.out.println(Arrays.toString(totalVendedores(VENTAS, VENDEDORES, MARCAS)));
		visualizarTotales(VENTAS, VENDEDORES, marcas);
		mejorVendedor(VENTAS, VENDEDORES, marcas);
	}
}
