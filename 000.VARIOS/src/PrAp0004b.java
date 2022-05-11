
public class PrAp0004b {

	public static void main(String[] args) {
		int n = 5;
		for (int i = n; i > 0; i--) {
			int j = i;
			while (j++ <= n)
				System.out.print("*");
			if (i > 1)
				System.out.print("-");

		}

	}

}
