package com.eShipperV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="j_username")
	WebElement UserID;
	
	@FindBy(name="j_password")
	WebElement Password;
	
	@FindBy(css=".text-white.btn.btn-block.bg-crimson.custom-btn-purple")
	WebElement SignIn;
	
	public void setUserID(String userid)
	{
		UserID.sendKeys(userid);
	}
	
	public void setPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void clickSignIn()
	{
		SignIn.click();
	}
	
}
