package com.eShipperV1.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String URL="https://test.eshipper.com/login.jsp";
	public String username="rahul_test";
	public String password="admint7102";
	public static WebDriver driver;
	
	@BeforeClass          // This method executes before the Test Case Class
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterClass           // This method executes after the Test Case Class
	public void exit()
	{
		driver.quit();
	}
	
}
