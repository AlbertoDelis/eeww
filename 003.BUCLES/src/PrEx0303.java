// 2 números sean amigos.
public class PrEx0303 {

	public static void main(String[] args) {
		int suma1, suma2, n1, n2, divisor;
		suma1 = 0;
		suma2 = 0;
		n1=(int)(Math.random()*10000);
		n2=(int)(Math.random()*10000);

		for (divisor = 1; divisor <= n1; divisor++)
			if (n1 % divisor == 0)
				suma1 = suma1 + divisor;

		for (divisor = 1; divisor <= n2; divisor++)
			if (n2 % divisor == 0)
				suma2 = suma2 + divisor;
		if (suma1==n2 && suma2==n1) 
			System.out.println("Ambos números son amigos "+n1+" "+n2);
			
		else
			System.out.println("Ambos números NO son amigos "+n1+" "+n2);

	}

}
