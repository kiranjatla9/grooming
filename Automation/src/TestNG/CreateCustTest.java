package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNG.MyListeners.class)
public class CreateCustTest {
	private static final String Dependsonmethods = null;
	@Test
	public void runListeners1() {
	Reporter.log("Listner1",true);

	}
	@Test
	public void runListeners2() {
		Assert.fail();
	Reporter.log("Listner2",true);
}
	@Test(dependsOnMethods="runListeners2")
	public void runListeners3() {
	Reporter.log("Listner3",true);
}
	@Test
	public void runListeners4() {
	Reporter.log("Listner4",true);
}
}
