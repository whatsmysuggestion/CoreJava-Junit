import org.junit.*;
import static org.junit.Assert.*;


public class SampleTestCase {

	@Test
	public void testingfunction()
	{
		Multilevel ml=new Multilevel();
		assertEquals(30,ml.sum());
	}
}
