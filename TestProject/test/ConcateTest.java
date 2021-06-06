package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ConcateTest {

	@Test
	public void testConcatenate() { 
		Junit test = new Junit();
		String result = test.concatenate("one", "two");
		assertEquals("onetwo", result); 
	}

}




