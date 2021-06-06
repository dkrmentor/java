import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import test.Junit;

import static org.junit.jupiter.api.Assertions.*;
class HigherTest {

	   @Test
	    void HigherTest() {
		   Higher test = new Higher();
	     assertEquals(25, test.higher(25, 25)); 
	    assertEquals (5, test.higher(3, 5)); 
	   
	    }

	    
	  
	

}
