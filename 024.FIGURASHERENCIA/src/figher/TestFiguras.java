package figher;

import java.util.ArrayList;

public class TestFiguras {

	public static void main(String[] args) {
		ArrayList<Figuras> lista=new ArrayList<>();
		Punto p1, p2;
		p1 = new Punto(1, 5);
		p2 = new Punto(10, 6);
		Rectangulo r1=new Rectangulo("Rectangulo", p2, 5, 9);
		Triangulo t1=new Triangulo("Triangulo", p2, p2, p1, p2);
		System.out.println();
		System.out.println(p1.getDistancia(p2));
		System.out.println(Punto.getDistancia(p1,p2));
		System.out.println();
		Circulo c=new Circulo(p2, 8);
		lista.add(c);
		lista.add(r1);
		lista.add(t1);
		for (Figuras figuras : lista) {
			if(figuras instanceof Circulo) {
			System.out.println(figuras);
			}
		}
		System.out.println("Esta es la lista: "+lista);
	}
}
