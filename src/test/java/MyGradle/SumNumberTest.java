package MyGradle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumNumberTest {
	private final SumNumber obj = new SumNumber();

	@Test
	void testSum() {
		assertEquals(8, obj.sum(3,5));
	}
	@Test
	void testSumNegative() {
		assertNotEquals(10 , obj.sum(3, 5));
	}

}
