package factorialjunit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class IllegalArgumentException {

	@Test
	void test() {
		int num = Factorial.calculo(12);
		assertEquals(479001600, num);
	}

	@Test(expected = java.lang.IllegalArgumentException.class)
	void testCalculoExcep1() {
		Factorial.calculo(-22);
		Factorial.calculo(-1);
	}
	
	@Test(expected = java.lang.IllegalArgumentException.class)
	void testCalculoExcep2() {
		Factorial.calculo(18);
	}
	

}