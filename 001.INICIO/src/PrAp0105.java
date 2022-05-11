import java.util.Scanner;

public class PrAp0105 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int susp, suf, not, sobr;
		float porCientoApr;
		int total;

		System.out.println("Introduce valor para suspensos: ");
		susp = teclado.nextInt();
		System.out.println("Introduce valor para suficientes: ");
		suf = teclado.nextInt();
		System.out.println("Introduce valor para notables: ");
		not = teclado.nextInt();
		System.out.println("Introduce valor para sobresalientes: ");
		sobr = teclado.nextInt();

		total = susp + suf + not + sobr;
		porCientoApr = (suf + not + sobr) * 100f / total;
		System.out.println("% aprobados: " + porCientoApr);

	}

}
