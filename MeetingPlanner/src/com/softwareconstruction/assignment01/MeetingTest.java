package com.softwareconstruction.assignment01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MeetingTest {

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
	void getDay() {
		System.out.println("======TEST 1EXECUTED=======");
		Meeting test = new Meeting();
		test.setDay(4);
		int result = test.getDay();
		assertEquals(4, result); 
    
	}
	@Test
	void StartTime() {
		System.out.println("======TEST 2EXECUTED=======");
		Meeting test = new Meeting();
		test.setStartTime(4);
		int result = test.getStartTime();
		assertEquals(4, result); 
    
	}
	
	@Test
	void EndTime() {
		System.out.println("======TEST 3EXECUTED=======");
		Meeting test = new Meeting();
		test.setEndTime(4);
		int result = test.getEndTime();
		assertEquals(4, result); 
    
	}
	@Test
	void getDescription() {
		System.out.println("======TEST 4EXECUTED=======");
		Meeting test = new Meeting();
		test.setDescription("dhara");
		String result = test.getDescription();
		assertEquals("dhara", result); 
    
	}
	

	@Test
	void getMonth() {
		System.out.println("======TEST 5EXECUTED=======");
		Meeting test = new Meeting();
		test.setMonth(4);
		int result = test.getMonth();
		assertEquals(4, result); 
    
	}
	
	
	
	
	
	

}
