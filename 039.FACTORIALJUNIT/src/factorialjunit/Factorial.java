package factorialjunit;

/*
 *7. Escribe una clase de pruebas para probar el método calculo() de la clase Factorial.
 *En el método se comprueba si el número es menor que 0, en este caso se lanza la excepción IllegalArgumentException con el mensaje Número n no puede ser <0.
 *Si el valor del factorial calculado es menor que 0 es que ha ocurrido un error de desbordamiento,
 *en este caso se lanza la excepción ArithmeticException y se lanza el mensaje Overflow, número n demasiado grande. 
 *La clase a probar es la siguiente:
 */

public class Factorial {
	public static int calculo(int num) {
		if (num < 0)
			throw new IllegalArgumentException("Número " + num + " no puede ser <0");
		int fact = 1;
		for (int i = 2; i <= num; i++)
			fact *= i;
		if (fact <= 0)
			throw new ArithmeticException("Overflow, número " + num + " demasiado grande.");
		return fact;
	}


	public static void main(String[] args) {
		
		
	}
}
