package figuras;

public class Triangulo {
	private Punto v1;
	private Punto v2;
	private Punto v3;

	public Triangulo(Punto v1, Punto v2, Punto v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public Triangulo(int x1, int y1, Punto v2, Punto v3) {
		this(new Punto(x1, y1), v2, v3);
		// this.v1=new Punto(x1,y1);
		// this.v1=v1;
		// this.v2=v2;
		// this.v3=v3;
	}

	public Triangulo() {
		this.v1 = new Punto(1, 2);
		this.v2 = new Punto(3, 4);
		this.v3 = new Punto(5, 6);
	}

	public Triangulo(double t1, double t2, double t3, double t4, double t5, double t6) {

	}

	private double getPerimetro() {
		double a = Punto.getDistancia(v1, v2);
		double b = v2.getDistancia(v3);
		double c = Punto.getDistancia(v1, v3);
		return a + b + c;

	}

	public double getArea() {
		double a = Punto.getDistancia(v1, v2);
		double b = v2.getDistancia(v3);
		double c = Punto.getDistancia(v1, v3);
		double semi = getPerimetro() / 2;
		return Math.sqrt((semi * (semi - a) * (semi - b) * (semi - c)));
	}

	@Override
	public String toString() {
		return "Triangulo [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
	}
	
	

}
