package MyGradle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class LifeCycleMethodTest {
	private SumNumber obj;

	@BeforeAll
    void setUpBeforeClass() throws Exception {
		obj = new SumNumber();
		System.out.println("in the beginning");
	}

	@AfterAll
    void tearDownAfterClass() throws Exception {
	     obj = null;
	     System.out.println("at the end");
	}


	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before each test");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each test");
	}
   // @Disabled
	@Test
	void testSum() {
		assertEquals(8, obj.sum(3,5));
	}
	@Test
	void testSumNegative() {
		assertNotEquals(10 , obj.sum(3, 5));
	}
	@Test
	void testError() {
		Exception exp = assertThrows(IllegalArgumentException.class, () -> obj.sum(11, 5));
		assertEquals("value should be less than 10", exp.getMessage());
	}

}
