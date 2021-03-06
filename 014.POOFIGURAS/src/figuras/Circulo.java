package figuras;

public class Circulo {
	private Punto centro;
	private double radio;

	public Circulo() {
		this(0, 0, 1);
		// this.centro=new Punto();
		// this.radio=1;
	}

	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}

	public Circulo(int x, int y, double radio) {
		this(new Punto(x, y), radio);
		// this.centro=new Punto(x, y);
		// this.radio=radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getDistancia(Circulo c) {
		return this.centro.getDistancia(c.centro);
	}

	public double getDistancia(Punto p) {
		return this.centro.getDistancia(p);
	}

	public double getArea() {
		return Math.PI * this.radio * this.radio;
	}

	public double getPerimetro() {
		return 2 * Math.PI * this.radio;
	}

	@Override
	public String toString() {
		return String.format("Circulo [centro=%s, radio=%s]", centro, radio);
	}
	
	

}
