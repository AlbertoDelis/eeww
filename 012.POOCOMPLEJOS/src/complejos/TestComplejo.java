package complejos;

public class TestComplejo {

	public static void main(String[] args) {
		Complejo c1 = new Complejo(1, 2);
		Complejo c2 = new Complejo(3, 4);
		Complejo c3;
		System.out.println(c1);
		System.out.println(c2);
		c1.suma(c2);
		c2.suma(c1);
		System.out.println(c1);
		c3 = c1.suma(c1, c2);
	}
}
