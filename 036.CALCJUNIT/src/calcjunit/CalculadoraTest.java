package calcjunit;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculadoraTest {

	Calculadora calc = new Calculadora(3, 2, 5);

	// @Before ordenes antes de cada método
	@Before
	public void before() {
		System.out.println("before()");
		calc = new Calculadora(3, 2, 5);
	}

	// @After después de cada método
	@After
	public void after() {
		System.out.println("after()");
		calc.clear();
	}

	@Test
	public void testSum() {
		System.out.println("testSum()");
		int resul = calc.add(3, 2);
		int esper = 5;
		assertEquals(resul, esper);
	}

	@Test
	public void testAnsSum() {
		System.out.println("testAnsSum()");
		calc.add(3, 2);
		int resul = calc.ans();
		int esper = 1;
		assertEquals(resul, esper);
	}
	
	
	@Test(expected=ArithmeticException.class)
	public void testDivPorCero() {
		calc.div(5, 0);
	}

	@Test
	public void testResta() {
		System.out.println("testResta()");
		Calculadora calc = new Calculadora(5, 10, 15);
		calc.resta();
	}

	@Test
	public void testResta2() {
		System.out.println("testResta2()");
		Calculadora calc = new Calculadora(20, 300, 15);
		boolean resul = calc.resta2();
		assertFalse("No es true", resul);
	}

	@Test
	public void testDivide2() {
		System.out.println("testDivide2()");
		Calculadora calc = new Calculadora(20, 0, 15);
		Integer resul = calc.divide2();
		assertNull("No es nulo", resul);
	}

	public static void main(String[] args) {

	}

}
