
//Dise�ar un programa capaz de leer un valor entero, que verifique que est� comprendido entre 
//1 y 10, y mostrar su tabla de multiplicar. 
import java.util.Scanner;

public class PrAp0304 {

	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero entero: ");
		num = teclado.nextInt();
		if (num >= 1 && num <= 10) {
			for (int i = 0; i <= 10; i++) {
				System.out.println(num + "x" + i + "=" + (num * i));
			}
		} else {
			System.out.println("N�mero erroneo.");
		}

	}

}
