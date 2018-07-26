package com.melorra.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.melorra.qa.base.TestBase;
import com.melorra.qa.pages.HomePage;
import com.melorra.qa.pages.MyAccountPage;
import com.melorra.qa.pages.SignupPage;

public class SignupPageTest extends TestBase
{
	SignupPage signUpPage;
	MyAccountPage myAccountPage;
	HomePage homePage;
	
	public SignupPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		signUpPage = new SignupPage();
	}
	
	@Test(priority=1)
	public void validSignUpTest() throws InterruptedException
	{
		myAccountPage = signUpPage.signUp(prop.getProperty("firstName"), prop.getProperty("lastName"), prop.getProperty("phoneField"), prop.getProperty("emailField"), prop.getProperty("passwordField"));
		//Thread.sleep(10000);
		
		/*((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("signOutModal")));
		
		signUpPage.signOut();*/
	}
	

/*	public void signoutTest()
	{
		homePage = signUpPage.signOut();
		
	}*/

	/*public void tearDown()
	{
		driver.quit();
	}*/
}
