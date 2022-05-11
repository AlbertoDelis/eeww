/*Un sistema de ecuaciones lineales de la forma: 
ax + by = c 
dx + ey = f 
puede resolverse utilizando las siguientes fórmulas: 
Realizar un programa que lea por teclado los dos conjuntos de coeficientes (a, b y c, y d, e y f) 
y calcule los valores para ‘x’ e ‘y’ según la fórmula descrita ¿Existen algunos casos para los 
cuales este algoritmo no funcione?
*/
public class PrAp0206 {

	public static void main(String[] args) {
		float a, b, c, d, e, f;
		float x, y;
		a = (int) (Math.random() * 100);
		b = (int) (Math.random() * 100);
		c = (int) (Math.random() * 100);
		d = (int) (Math.random() * 100);
		e = (int) (Math.random() * 100);
		f = (int) (Math.random() * 100);
		System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * f - c * d) / (a * e - b * d);
		if ((a * e - b * d) != 0) {
			System.out.println("El valor de x es: " + x);
			System.out.println("El valor de y es: " + y);
		} else {
			System.out.println("El denominador es igual a 0 y no se puede obtener los valores.");
		}

	}

}
