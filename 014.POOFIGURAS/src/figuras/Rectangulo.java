/*
tiene 3 propiedades. Un origen, y adem?s la base y la altura. 
constructores por defecto, general que recibe base altura y punto, y otro constructor que recibe 2 puntos( vertice inf izq y vertice sup der)
x1>x2  y1>y2
calcular base y altura
		6.3
		
1.2
b=5
h=1

getArea, getPerimetro, toString
*/


package figuras;

public class Rectangulo {
	protected Punto origen;
	protected double base;
	protected double altura;
	
	public Rectangulo(Punto origen, double base, double altura) {
		this.origen=origen;
		this.base=base;
		this.altura=altura;
		
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
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
		return "Rectangulo [origen=" + origen + ", base=" + base + ", altura=" + altura + "]";
	}
	
	//public Rectangulo(Punto origen, Punto id) {
	//	this.origen=origen;
		
				
	//}
	
	

}
