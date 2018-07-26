package com.melorra.qa.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.melorra.qa.base.TestBase;
import com.melorra.qa.pages.LoginPage;
import com.melorra.qa.pages.MyAccountPage;

public class LoginPageTest extends TestBase 
{
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void homePageTitleTest()
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Online Jewellery Shopping Store: Buy Gold and Diamond Jewellery Online");
	}
	
	@Test(priority=2)
	public void validloginTest()
	{
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	/*@Test(priority=2)
	public void blankloginTest()
	{
	
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		String actual_blank_error = driver.findElement(By.xpath("//small[@id='emailFieldBlank']")).getText();
		String expected_blank_error = "Please enter an email address.";
		Assert.assertTrue(actual_blank_error.contains("Please enter an email address"));
		System.out.println("The Email field is blank.");
	}
	
	@Test(priority=2)
	public void invalidloginTest()
	{
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		String actual_invalidfield_error = driver.findElement(By.xpath("//small[@id='emailFieldInvalid']")).getText();
		String expected_invalidfield_error = "Please enter a valid email address.";
		Assert.assertTrue(actual_invalidfield_error.contains("Please enter a valid email address."));
		System.out.println("Entered the invalid Email. Please look into it");
	}*/
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
 