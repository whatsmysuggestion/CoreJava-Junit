import org.junit.*;
import static org.junit.Assert.*;

public class FirstClass {

 
	@Test(expected=ArithmeticException.class)
	
	//@Test(timeout=100)
	
	
	
//	@Test
	public void testing() { 
		 	
	 DummyTestCase dt=new DummyTestCase();  
	  assertEquals(3,dt.addition(1,2));
	
	  assertEquals(2,dt.div(2,1));
	 assertTrue(dt.getResult()<20); 
	 assertFalse(dt.getResult()>2);
     assertNotNull(dt.getData());
		
		   
		  assertNull(dt.getNull());
		 
		  
		 
	 
	// assertEquals("abc","abc");
		   
   }
	
	 
 
}
 
