package com.eShipperV1.testCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.eShipperV1.pageObjects.Login;
import com.eShipperV1.pageObjects.Quote;

public class SaveQuoteTestCase extends BaseClass {

	@Test
	public void saveQuote() throws InterruptedException
	{
		driver.get(URL);
		Login obj = new Login(driver);
			
		obj.setUserID(username);
		obj.setPassword(password);
		obj.clickSignIn();
		
		driver.get(QuoteURL);
		
		Quote obj1 = new Quote(driver);
		
		obj1.toPostalCode("V5M3M5");
		Thread.sleep(3000);
		
		obj1.Length("1");
		obj1.Width("1");	
		obj1.Height("1");	
		obj1.Weight("1");
		
		obj1.Submit();
		obj1.SaveQuote();
		
		driver.switchTo().alert().accept(); // Test allows only to save 10 Quotes
		
		if(driver.getCurrentUrl().equals("https://test.eshipper.com/OrderManager.do?method=saveQuote&isDeleteQuote=true&rateIndex=0"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
