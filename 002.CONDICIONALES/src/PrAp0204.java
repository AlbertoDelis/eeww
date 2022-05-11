//Programa al que se le introduzcan las coordenadas X e Y de dos puntos del plano, nos diga si 
//lo que forman es un cuadrado o un rectángulo y calcule el área del mismo.
public class PrAp0204 {

	public static void main(String[] args) {
		int x1, x2, y1, y2;
		int base, altura, area;
		x1=(int)(Math.random()*100);
		x2=(int)(Math.random()*100);
		y1=(int)(Math.random()*100);
		y2=(int)(Math.random()*100);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(y1);
		System.out.println(y2);
		// dar entrada de datos
		base = Math.abs(x2) - Math.abs(x1);
		altura = Math.abs(y2) - Math.abs(y1);
		area = base * altura;
		System.out.printf("base: %d,altura: %d,área= %d", base, altura,area);
		if(base==altura)
			System.out.println("\nCuadrado");
		else
			System.out.println("\nRectángulo");
		

	}

}
