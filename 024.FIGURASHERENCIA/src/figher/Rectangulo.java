/*
tiene 3 propiedades. Un origen, y además la base y la altura. 
constructores por defecto, general que recibe base altura y punto, y otro constructor que recibe 2 puntos( vertice inf izq y vertice sup der)
x1>x2  y1>y2
calcular base y altura
		6.3
		
1.2
b=5
h=1

getArea, getPerimetro, toString
*/


package figher;

public class Rectangulo extends Figuras implements Figurable{
	private double base;
	private double altura;
	
	
	
	public Rectangulo(String tipo, Punto origen, double base, double altura) {
		super(tipo, origen);
		this.base = base;
		this.altura = altura;
	}


	public double getPerimetro() {
		return (base+altura)*2;
	}

	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
	}


	@Override
	public double getArea() {
		return base*altura;
	}

}
