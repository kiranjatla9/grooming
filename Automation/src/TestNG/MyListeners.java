package TestNG;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"Started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+"passed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+"failed",true);
		WebdriverCommonLibrary wclib=new WebdriverCommonLibrary();
		try {
			wclib.getpagescreenshot("/Automation/ScreenShot//"+result.getName()+".png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+"skipped",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+"Started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+"completed",true);
	}
}
