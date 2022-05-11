import java.util.Scanner;
/*
 * Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a 
dichas funciones: 
• Función llamada par() que se le pasa un entero y devuelve true si es par, false si no lo 
es. 
• Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos. 
• Función llamada sumaIntervalo() que le pasan dos long y devuelve otro long con la suma 
de los números comprendidos entre los números pasados (el primero es menor que el 
segundo, y ambos mayores que cero, en caso contrario devuelve -1) 
• Función llamada contarCeros() que se le pasa una cadena y devuelve la cantidad de ceros 
que tiene. 
• Función llamada aleatorio() que se le pasan dos valores enteros devuelve un entero al 
azar comprendido entre esos dos valores (el primero es menor que el segundo, y ambos 
mayores que cero, en caso contrario devuelve -1)
 */

public class PrAp0501 {

	static boolean par(int n) {
		return n % 2 == 0;

	}

	static double mayor(double num1, double num2, double num3) {
		double mayor;
		mayor = num1;
		if (num2 > num1)
			mayor = num2;
		if (num3 > num2)
			mayor = num3;
		return mayor;

		// elMayor=mayor(num1,num2) elMayor=(num3,elMayor) return elMayor
		// return mayor (mayor(num1,num2),num3)

	}

	static long sumaIntervalo(long n1, long n2) {
		long suma;
		if (n1 <= 0 || n2 <= 0 || n1 >= n2)
			return -1;
		suma = 0;

		for (long i = n1; i < n2; i++) {
			suma += n1;

		}
		return suma;

	}
	static int cuentaCeros(String cadena) {
		int ceros=0;
		for (int i = 0; i < cadena.length(); i++) 
			if(cadena.charAt(i) =='0')
				ceros++;
		return ceros;
			
		
	}
	static long aleatorio(int n1, int n2) {
		int n=(int)Math.random()*((n2-n1+1)+n1);
		return n;
	}

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Dame un número entero: ");
		int n = tc.nextInt();
		System.out.println("El número introducido es par: " + par(n));
		System.out.println("Dame un número double: ");
		double num1 = tc.nextDouble();
		System.out.println("Dame un segundo double: ");
		double num2 = tc.nextDouble();
		System.out.println("Dame un tercer double: ");
		double num3 = tc.nextDouble();
		System.out.println("El número double mayor es: " + mayor(num1, num2, num3));
		System.out.println("Introduce un número long: ");
		long n1 = tc.nextLong();
		System.out.println("Introduce otro número long: ");
		long n2 = tc.nextLong();
		System.out.println("La suma del intervalo del segundo long hasta el primero es: " + sumaIntervalo(n1, n2));
		System.out.println("Dame una cadena: ");
		String cadena=tc.nextLine();
		System.out.println("La cadena tiene estos ceros: "+cuentaCeros(cadena));

	}

}
//static boolean isBisiesto (int a)
//return (a%4==0)&&(a%1001=0)||(a%400==0)
