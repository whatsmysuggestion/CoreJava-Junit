import org.junit.*; 
import static org.junit.Assert.*;
 

public class SecondClass {
	
	DummyTestCase dt;
   @BeforeClass
   public static void beforeClass() {
      System.out.println("Testing Will start now");
   }

   
  
   @Before
   public void before() {
	   dt=new DummyTestCase();
   }
	
   
   
 
   @Test
   public void test() {
	   
	   int a=dt.addition(1,2);
	   assertEquals(3,a);
	   
      
   }
   
   @After
   public void after() {
      dt=null;
   }
	
   
   
   @AfterClass
   public static void  afterClass() {
      System.out.println("Testing ended");
   }

 
	
 
   @Ignore
   public void ignoreTest() {
      System.out.println("in ignore test");
   }
}