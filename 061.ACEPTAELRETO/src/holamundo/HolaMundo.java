package holamundo;

import java.util.Scanner;

public class HolaMundo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("");
			num = sc.nextInt();	
		} while (num<0 || num>5);
		for (int i = 0; i < num; i++) {
			System.out.println("Hola mundo.");	
		}
		sc.close();
	}
}
