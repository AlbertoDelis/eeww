package tuamigablevecino;

import java.util.Scanner;

public class TuAmigableVecino474 {
	static Scanner tc = new Scanner(System.in);

	public static void main(String[] args) {
		int cont = 0;
		int var = 0;
		System.out.print("");
		int casos = tc.nextInt();
		int array[] = new int[casos];
		for (int i = 0; i < casos; i++) {
			System.out.print("");
			int pos = tc.nextInt();
			System.out.print("");
			int bomA = tc.nextInt();
			System.out.print("");
			int bomB = tc.nextInt();
			if (pos > bomA) {
				var = pos - bomA;
				cont += var;
			}
			if (pos < bomA) {
				var = bomA - pos;
				cont += var;
			}
			if (bomA > bomB) {
				var = bomA - bomB;
				cont += var;
			}
			if (bomA < bomB) {
				var = bomB - bomA;
				cont += var;
			}
			array[i] = cont;
			cont = 0;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
