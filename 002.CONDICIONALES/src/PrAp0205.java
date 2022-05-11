/*
 Diseñar un algoritmo al que se le introduzca la cantidad de horas, minutos y segundo 
mostrados en un reloj digital, que verifique que los valores sean correctos y calcule el total de 
segundos transcurridos desde el comienzo del día. No emplear las clases de fecha de Java.
*/
public class PrAp0205 {

	public static void main(String[] args) {
		int h,m,s;
		//dar entrada valores.
		h=(int)(Math.random()*100);
		m=(int)(Math.random()*100);
		s=(int)(Math.random()*100);
		System.out.print(h + ":" +m+ ":"+s);
		int segundos;
		if ((h<0 || h>23) || (m<0 || m>59) || (s<0 || s>59)) {
			System.out.println("\nError de horario.");
		} else {
		segundos=h*60*60+m*60+s;
		System.out.printf("\n%d:%d:%d=",h,m,s);
		System.out.printf("\n%d",segundos);
		}

	}
	
}
