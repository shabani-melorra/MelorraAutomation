package com.melorra.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.melorra.qa.base.TestBase;
import com.melorra.qa.util.TestUtil;

public class LoginPage extends TestBase 
{
	//Page Factory or Page Object repositories
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement signInBtn;
	
	@FindBy(id="signInEmail") //input[@id='signInEmail']
	WebElement username;
	 
	@FindBy(xpath = "//a[@class='btn btn-primary width-100 btn-sign-in']")
	WebElement contBtn;
	
	@FindBy(id="signInPassword") //input[@id='signInPassword']
	WebElement password;
	
	@FindBy(xpath = "//a[@class='btn btn-primary width-100 btn-sign-in']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//img[@src='https://res.cloudinary.com/melorra-cloud/image/upload/live-melorra/html_resource/homepage/home-page-assets/melorralogo.png']")
	WebElement melorraLogo;
			
	//h2[@class='m-b-3']
	//button[@id='signOutModal']

	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateLogo()
	{
		return melorraLogo.isDisplayed();
	}
	
}

