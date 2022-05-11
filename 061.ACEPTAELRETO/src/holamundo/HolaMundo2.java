package holamundo;

import java.util.Scanner;

public class HolaMundo2 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num=teclado.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("hola mundo.");
		}
		teclado.close();
	}
}
