package appliTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import appli.CalculMath;

class CalculMathTest {

	CalculMath c = new CalculMath();
	
	@Test
	void testFac5() {
		Assertions.assertEquals(5*4*3*2, c.fac(5), "Test de la valeur 5");
	}
	
	@Test
	void testFac0() {
		Assertions.assertEquals(1, c.fac(0), "Test de la valeur 0");
	}
	
	@Test
	void testFacNeg() {
		Assertions.assertEquals(1, c.fac(-1), "Test de valeur negative");
	}

}
