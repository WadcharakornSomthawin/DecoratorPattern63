import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeverageTest {

	@Test
	void testEspressoSoyMilk() {
		Beverage b1 = new Espresso();
		b1 = new Soy(b1);
		b1 = new StreamedMilk(b1);
		assertEquals("Espresso, Soy, Streamed Milk",b1.getDescription());
		assertEquals(2.24,b1.cost());
	}
	@Test
	void testDarkRoastMilk() {
		Beverage b2 = new DarkRoast();
		b2 = new StreamedMilk(b2);
		assertEquals("Dark Roast Coffee, Streamed Milk",b2.getDescription());
		assertEquals(1.09,b2.cost());
	}

}
