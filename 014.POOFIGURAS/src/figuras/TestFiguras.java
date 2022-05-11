package figuras;

public class TestFiguras {

	public static void main(String[] args) {
		Punto p1, p2;
		p1 = new Punto(1, 5);
		p2 = new Punto(10, 6);
		Rectangulo r1=new Rectangulo(p2, 1, 5);
		Triangulo t1=new Triangulo(p2, p1, p2);
		System.out.println();
		System.out.println(p1.getDistancia(p2));
		System.out.println(Punto.getDistancia(p1,p2));
		Circulo c=new Circulo(p1, 7);
		System.out.println(c);
		System.out.println(r1);
		System.out.println(t1);

	}

}
