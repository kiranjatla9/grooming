package TestNG;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class Datadriven {
	@DataProvider(name="db1")
public Object[][] dataRepo1(){
	Object[][] obj=new Object[2][2];
	obj[0][0]="admin1";
	obj[0][1]="manager1";
	
	obj[1][0]="admin2";
	obj[1][1]="manager2";
	return obj;	
}
	@DataProvider(name="db2")
	public Object[][] dataRepo2(){
		Object[][] obj=new Object[2][3];
		obj[0][0]="admin1";
		obj[0][1]="manager1";
		obj[0][1]="hyd";
		obj[1][0]="admin2";
		obj[1][1]="manager2";
		obj[0][1]="bangalore";
		return obj;	
}
	public void getcred(String un,String pwd,String city)
	{
		Reporter.log(un,true);
		Reporter.log(pwd,true);
		Reporter.log(city,true);
	
	}
	}
