package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

abstract class Annotation {
	@BeforeSuite
	public void A(){
		Reporter.log("BeforeSuite",true);
		}
	@BeforeTest
	public void B(){
		Reporter.log("BeforeTest",true);
		}
	@BeforeClass
	public void C(){
		Reporter.log("BeforeClass",true);
		}
	@BeforeMethod
	public void D(){
		Reporter.log("BeforeMethod",true);
	}
		@AfterMethod
		public void E(){
			Reporter.log("AfterMethod",true);
			}
		@AfterClass
		public void F(){
			Reporter.log("AfterClass",true);
			}
		@AfterTest
		public void G(){
			Reporter.log("AfterTest",true);
			}
		@AfterSuite
		public void H(){
			Reporter.log("AfterSuite",true);
			}
		}

