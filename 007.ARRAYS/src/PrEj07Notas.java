import java.util.*;

public class PrEj07Notas {
	static Scanner tc = new Scanner(System.in);
	static final int ALUMNOS = 30;
	static final int MODULOS = 6;
	static int[][] notas = new int[ALUMNOS][MODULOS];

	static void rellenar() {
		for (int alumno = 0; alumno < ALUMNOS; alumno++) {
			for (int modulo = 0; modulo < MODULOS; modulo++) {
				notas[alumno][modulo] = (int) (Math.random() * 10);
				System.out.print(+(notas[alumno][modulo]) + "  ");
			}
			System.out.println();
		}
	}

	static void visualizaMediaAlumno(int alum) {
		int sumAlum = 0;
		float medAlum;
		for (int j = 0; j < MODULOS; j++)
			sumAlum += notas[alum - 1][j];
		medAlum = (float) sumAlum / MODULOS;
		System.out.println("La media de las notas para el alumno " + alum + " es: " + medAlum);
		System.out.println();
	}

	static void visualizaMediaTodos() {
		int sumAlum;
		float medAlum;
		for (int i = 0; i < ALUMNOS; i++) {
			sumAlum = 0;
			for (int j = 0; j < MODULOS; j++)
				sumAlum += notas[i][j];
			medAlum = (float) sumAlum / MODULOS;
			System.out.println("La media de las notas para el alumno " + i + " es: " + medAlum);
		}
	}

	static void visualizaMediaModulo(int mod) {
		int sumMod = 0;
		float medMod;
		for (int i = 0; i < ALUMNOS; i++) {
			sumMod += notas[i][mod - 1];
		}
		medMod = (float) sumMod / 30;
		System.out.println("La media deL MODULO " + (mod - 1) + " es: " + medMod);
	}

	static boolean Aprobado() {
		for (int i = 0; i < ALUMNOS; i++) {
			for (int j = 0; j < MODULOS; j++) {
				if (notas[i][j] < 5) {
					System.out.println("Alumno " + (i + 1) + " está SUSPENSO!!!");
					break;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		rellenar();
		System.out.println("Dame el alumno para calcular la media de los módulos: ");
		int alum = tc.nextInt();
		visualizaMediaAlumno(alum);
		visualizaMediaTodos();
		System.out.println("Dame el módulo para obtener la media: ");
		int mod = tc.nextInt();
		visualizaMediaModulo(mod);
		System.out.println(Aprobado());
	}
}
