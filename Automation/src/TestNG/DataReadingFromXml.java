package TestNG;

import org.testng.annotations.Test;

public class DataReadingFromXml extends BaseTest {
	@Test
	public void readDataFromxml(String br) {
		new BaseTest().runbrowser(br);
		
	}

}
