package com.eShipperV1.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.eShipperV1.pageObjects.Login;

public class LoginTestCase extends BaseClass{
	
	@Test
	public void loginTest() 
	{
		driver.get(URL);
		Login obj = new Login(driver);
			
		obj.setUserID(username);
		obj.setPassword(password);
		obj.clickSignIn();
		
		if(driver.getCurrentUrl().equals("https://test.eshipper.com/Home.do")) // Checks the URL after login
		{
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}

}
