package method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import testMethod.AllMehtods;

class methodsTest {

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
	void testNotEqual() {
		System.out.println("======testNotEqual EXECUTED=======");
		methods test = new methods();
		int result = test.ArrayEquals(new int []{32, 53, 33}, new int []{84, 2, 23});
		assertEquals(-1, result); 
	}
	
	@Test
	void testEqual() {
		System.out.println("======testEqual EXECUTED=======");
		methods test = new methods();
		int result = test.ArrayEquals(new int []{7, 2, 9}, new int []{7, 2, 9});
		assertEquals(0, result); 
		
	}
	
	@Test
	void existTest() {  
		System.out.println("======existTest EXECUTED=======");
		methods test = new methods();
		int result = test.existsArray(new int []{1, 4, 3},3);
		assertEquals(2, result); 
		
	}
	
	@Test	
	void notExistTest() {  
		System.out.println("======notExistTest EXECUTED=======");
		methods test = new methods();
		int result = test.existsArray(new int []{1, 4, 3},2);
		assertEquals(-1, result); 
		
	}
	
	@Test
	void testMultiply() {
		System.out.println("======testMultiplyEXECUTED=======");
		methods test = new methods();
		double result = test.multiplication(9,5);
		assertEquals(45, result); 
	}
	@Test
	void testMultiply1() {
		System.out.println("======testMultiply EXECUTED=======");
		methods test = new methods();
		double result = test.multiplication(6,5);
		assertEquals(30, result); 
	}
	
	@Test
	void maxTest1() {
		System.out.println("======maxTest1 EXECUTED=======");
		methods test = new methods();
			double result = test.maximum(3, 9);			
			Assert.assertEquals(Double.doubleToLongBits(9), Double.doubleToLongBits(result));
    
	}
	@Test
	void maxTest2() {
		System.out.println("======maxTest2EXECUTED=======");
		methods test = new methods();
			double result = test.maximum(6, 98);			
			Assert.assertEquals(Double.doubleToLongBits(98), Double.doubleToLongBits(result));
    
	}
}
