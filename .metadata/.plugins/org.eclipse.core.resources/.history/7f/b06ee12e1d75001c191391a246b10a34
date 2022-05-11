package figuras;

public class Punto {
	private double x;
	private double y;

	public Punto() {
		this(0, 0);
		// this.x=0;
		// this.y=0;
	}

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto(int x) {
		this(x, x);
		// this.x=x;
		// this.y=x;
	}

	// constructor copia
	public Punto(Punto p) {
		this(p.x, p.y);
		// this.x = p.x;
		// this.y = p.y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setPunto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setPunto(Punto p) {
		this.x = p.x;
		this.y = p.y;
	}

	public void setRelativa(int xd, int yd) {
		this.x += xd;
		this.y += yd;

	}

	// sqrt(sqr(x1-x2)+sqr(y1-y2))
	public double getDistancia(Punto p) {
	//	Punto.getDistancia(this, p);
		double r1 = Math.pow(this.x - p.x, 2);
		double r2 = Math.pow(this.y - p.y, 2);
		return Math.pow(r1 + r2, 1 / 2d);

	}

	public static double getDistancia(Punto p1, Punto p2) {
		return p1.getDistancia(p2);
	//	double r1=Math.pow(p1.x -p2.x, 2);
	//	double r2=Math.pow(p1.y -p2.y, 2);
	//	return Math.pow(r1+r2, 1/2d);

	}
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

}
