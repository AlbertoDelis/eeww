package factorialjunit;

/*
 *7. Escribe una clase de pruebas para probar el m�todo calculo() de la clase Factorial.
 *En el m�todo se comprueba si el n�mero es menor que 0, en este caso se lanza la excepci�n IllegalArgumentException con el mensaje N�mero n no puede ser <0.
 *Si el valor del factorial calculado es menor que 0 es que ha ocurrido un error de desbordamiento,
 *en este caso se lanza la excepci�n ArithmeticException y se lanza el mensaje Overflow, n�mero n demasiado grande. 
 *La clase a probar es la siguiente:
 */

public class Factorial {
	public static int calculo(int num) {
		if (num < 0)
			throw new IllegalArgumentException("N�mero " + num + " no puede ser <0");
		int fact = 1;
		for (int i = 2; i <= num; i++)
			fact *= i;
		if (fact <= 0)
			throw new ArithmeticException("Overflow, n�mero " + num + " demasiado grande.");
		return fact;
	}


	public static void main(String[] args) {
		
		
	}
}
