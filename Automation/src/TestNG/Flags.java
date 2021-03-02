package TestNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flags {

		@Test(priority=1,invocationCount=10)
	public void C()
	{
		Reporter.log("C",true);
	}
	@Test(priority=2,enabled=true)
	public void B()
	{
		Reporter.log("B",true);
	}
	@Test(priority=3)
	public void A()
	{
		Reporter.log("A",true);
	}

	@Test(priority=1)
	public void Registration() {
//		Assert.fail();
		Reporter.log("Registered Successfully",true);
	}
	@Test(priority=2,dependsOnMethods="Registration")
	public void Deleted() {
		Reporter.log("Deleted Successfully",true);
	}
	}
	
