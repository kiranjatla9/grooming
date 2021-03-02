package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groupexecution {
	@Test(groups="Smokegrp")
	public void Smoke1() {
		Reporter.log("Smoke1",true);
	}
	@Test(groups="Smokegrp")
	public void Smoke2() {
		Reporter.log("Smoke2",true);
	}
	@Test(groups="Smokegrp")
	public void Smoke3() {
		Reporter.log("Smoke3",true);
	}
	
	@Test(groups="Ftgrp")
	public void Ft1() {
		Reporter.log("Ft1",true);
	}
	@Test(groups="Ftgrp")
	public void Ft2() {
		Reporter.log("Ft2",true);
	}
	@Test(groups="Itgrp")
	public void It1() {
		Reporter.log("It1",true);
	}
	@Test(groups="Itgrp")
	public void It2() {
		Reporter.log("It2",true);
	}
	@Test(groups="Reggrp")
	public void Reg1() {
		Reporter.log("Reg1",true);
	}
	@Test(groups="Reggrp")
	public void Reg2() {
		Reporter.log("Reg2",true);
	}
}
