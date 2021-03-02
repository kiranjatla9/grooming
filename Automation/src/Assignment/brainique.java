package Assignment;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import datadriven.Basetest;

public class brainique {
	private static WebDriver WebDriver;

	public static void main(String[] args) {
	Basetest bt=new Basetest();
	bt.openbrowser();
	Pom p=new Pom();
	List<WebElement> quotes = p.getallquotes();
	System.out.println(quotes);
}}
