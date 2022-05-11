/*Calcular el número del tarot de una persona a partir de la fecha de su nacimiento. 
 * El cálculo consiste en sumar el día, mes y año; del resultado obtenido se suman sus dígitos 
 * y así sucesivamente hasta reducir a un sólo dígito. 
 * Antes de hacer los cálculos debes comprobar que la fecha introducida es correcta: día, mes y año.
 */
public class PrEj0501 {

	static boolean isBisiesto(int a) {
		return (a % 4 == 0) && (a % 1001 == 0) || (a % 400 == 0);
	}

	static void fechaCorrecta(String[] args) {
		int dia, mes, year;
		boolean correcta;
		dia = 1;
		mes = 1;
		year = 2021;
		correcta = false;
		switch (mes) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dia > 0 && dia <= 31)
				correcta = true;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (dia > 0 && dia <= 30)
				correcta = true;
			break;
		case 2:
			if (dia > 0 && dia <= 28)
				correcta = true;
			break;
		default:
		}
	}

	static int sumaDigitos(int numero) {
		int suma=0;
		while (numero > 0) {
			suma = suma + numero % 10;
			numero = numero / 10;

		}

		return suma;
	}

	public static void main(String[] args) {

	}

}
