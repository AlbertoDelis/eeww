
/*
Realizar un programa que permita introducir el sexo (�H�,�M�) y la edad de los 30 trabajadores 
de una f�brica. El programa debe obligar a que las edades que se introduzcan est�n comprendidas 
entre 16 y 70 a�os. El programa nos mostrar� la edad y el sexo del m�s joven y tambi�n mostrar� la 
media de edad de las mujeres. Finalmente nos informar� si hay alguno con m�s de 60 a�os. Si se 
introduce cero como edad el programa terminar� en ese momento sin esperar a que introduzcan 
los 30 trabajadores. 
 */
import java.util.Scanner;

public class PrAp0324 {

	

	public static void main(String[] args) {
		String sexoTrab, sexoJov;
		int edadTrab, edadJov, edadMedMuj, contEdadMedMuj, sumaEdadMedMuj, contEdadMay, cont;
		edadTrab = 50;
		edadJov = 70;
		sumaEdadMedMuj = 0;
		contEdadMedMuj = 0;
		contEdadMay = 0;
		cont=1;
		
		while (edadTrab!=0 && cont<=30) {
			Scanner tc = new Scanner(System.in);
			System.out.print(cont+"."+"Dame el sexo del trabajador H o M: ");
			sexoTrab = tc.nextLine();
			if (edadTrab <= 16 && edadTrab >= 70) {
				System.out.println("Edad incorrecta. Introduzca de nuevo la edad: ");
				System.out.print("Dame la edad del trabajador: ");
				edadTrab = tc.nextInt();
			} else {
				System.out.print("Dame la edad del trabajador: ");
				edadTrab = tc.nextInt();
			}
			if (edadTrab < edadJov) {
				edadJov = edadTrab;
				sexoJov = sexoTrab;
				System.out.println("La edad del trabajador m�s joven es: " + edadJov);
				System.out.println("El sexo del trabajador m�s joven es: " + sexoJov);
			}
			if (sexoTrab == "M") {
				contEdadMedMuj++;
				sumaEdadMedMuj = sumaEdadMedMuj + edadTrab;
				edadMedMuj = sumaEdadMedMuj / contEdadMedMuj;
				System.out.println("La edad media de las mujeres es: " + edadMedMuj);
			}
			if (edadTrab > 60) {
				contEdadMay++;
				System.out.println("El n�mero de trabajadores mayores de 60 a�os es: " + contEdadMay);

			}
			cont++;
			

		} 

	}

}
