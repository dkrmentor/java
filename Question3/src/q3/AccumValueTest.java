package q3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AccumValueTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll executed");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll executed");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach executed");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("@AfterEach executed");
	}

	@Test
	public void testConstructor() {
		System.out.println("======TESTING OF CONSTRUCTOR EXECUTED=======");
		assertEquals(5, new AccumValue(5).getValue());
	}

	@Test
	void testing1() {
		System.out.println("======TEST 1 EXECUTED=======");
		AccumValue check = new AccumValue(0);
		AccumValue[] x = { new AccumValue(4), new AccumValue(5) };
		assertTrue(check.calcAccum(1, x));
		assertEquals(4, check.getValue());
	}

	@Test
	void testing2() {
		System.out.println("======TEST 2 EXECUTED=======");
		AccumValue check = new AccumValue(0);
		AccumValue[] x = { new AccumValue(4), new AccumValue(5) };
		assertTrue(check.calcAccum(1, x));
		assertEquals(4, check.getValue());
		assertFalse(check.calcAccum(1, x));
		assertEquals(4, check.getValue());
	}

	@Test
	void testing3() {
		System.out.println("======TEST 3 EXECUTED=======");
		AccumValue check = new AccumValue(0);
		AccumValue[] x = { new AccumValue(2), new AccumValue(3) };
		assertTrue(check.calcAccum(2, x));
		assertEquals(5, check.getValue());

	}

	@Test
	void testing4() {
		System.out.println("======TEST 4 EXECUTED=======");
		new AccumValue(0).calcAccum(25, null);
	}

	@Test
	public void testing5() {
		System.out.println("======TEST 5 EXECUTED=======");
		new AccumValue(0).calcAccum(23, new AccumValue[] {});
	}
}
