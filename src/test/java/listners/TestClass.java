package listners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listners.ListnersImplementation.class)
public class TestClass extends BaseClass{
	@Test
	public void demo() {
		System.out.println("@Test");
//		Assert.fail();
		
	}

}
