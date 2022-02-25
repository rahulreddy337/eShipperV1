package com.eShipperV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Quote {

	WebDriver driver;
	
	public Quote(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="order.shipToAddress.postalCode")
	WebElement toPostalCode;
	
	@FindBy(name="packages[0].length")
	WebElement Length;
	
	@FindBy(name="packages[0].width")
	WebElement Width;
	
	@FindBy(name="packages[0].height")
	WebElement Height;
	
	@FindBy(name="packages[0].weight")
	WebElement Weight;
	
	@FindBy(css=".btn.text-white.bg-purple.custom-btn-purple.border-0.mb-2.mr-3")
	WebElement Submit;
	
	@FindBy(css=".btn.custom-btn-purple.border-0.mr-2.mb-2")
	WebElement SaveQuote;
	
	public void toPostalCode(String postalcode)
	{
		toPostalCode.clear();                // Used to clear "NA" value before passing the postal code
		driver.switchTo().alert().accept();  // Used to accept alert "Postal code should be only of US or Canada"
		toPostalCode.sendKeys(postalcode);
	}
	
	public void Length(String length)
	{
		Length.click();                    // Used to place pointer inside the test field
		Length.sendKeys(length);
	}
	
	public void Width(String width)
	{
		Width.sendKeys(width);
	}
	
	public void Height(String height)
	{
		Height.sendKeys(height);
	}
	
	public void Weight(String weight)
	{
		Weight.sendKeys(weight);
	}
	
	public void Submit()
	{
		Submit.click();
	}
	
	public void SaveQuote()
	{
		SaveQuote.click();
	}
	
}
