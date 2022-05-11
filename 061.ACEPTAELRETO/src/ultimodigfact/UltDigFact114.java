package ultimodigfact;

import java.util.Scanner;

public class UltDigFact114 {
	static Scanner teclado=new Scanner(System.in);
	static int cont;
	public static void main(String[] args) {
		System.out.print("");
		int numCasos=teclado.nextInt();
		for (int i = 0; i < numCasos; i++) {
			cont=1;
			System.out.println("");
			int numFact=teclado.nextInt();
			for (int j = numFact; j > 0; j--) 
				cont=cont*j;	
			System.out.println(cont);	
		}	
	}
}
