/**
 * @author Delis
 */
import java.util.Scanner;
public class Operaciones {

	public static void main(String[] args) {
		float num1,num2;
		float suma, resta, multiplicacion, division;
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce valor num1: ");
		num1= sc.nextInt();
		System.out.println("Introduce valor num2: ");
		num2= sc.nextInt();
		suma=num1+num2;
		resta=num1-num2;
		multiplicacion=num1*num2;
		division=num1/num2;
		System.out.println("El resultado de sumar num1+num2 es: "+suma);
		System.out.println("El resultado de restar num1-num2 es: "+resta);
		System.out.println("El resultado de multiplicar num1*num2 es: "+multiplicacion);
		System.out.println("El resultado de dividir num1/num2 es: "+division);


	}

}
