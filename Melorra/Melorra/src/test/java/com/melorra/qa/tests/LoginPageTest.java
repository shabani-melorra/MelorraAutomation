 package com.melorra.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.melorra.qa.base.TestBase;
import com.melorra.qa.pages.LoginPage;
import com.melorra.qa.pages.MyAccountPage;
import com.relevantcodes.extentreports.LogStatus;

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
		extntTest = extntReport.startTest("LoginPageTest", "User Login");
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Online Jewellery Shopping Store: Buy Gold and Diamond Jewellery Online");
		extntTest.log(LogStatus.PASS, "Test Case pass");
		extntTest.log(LogStatus.FAIL, "Test Case Fail");
		extntReport.endTest(extntTest);	
	}
	
	@Test(priority=2)
	public void validloginTest() throws InterruptedException
	{
		extntTest = extntReport.startTest("LoginPageTest", "User Login");
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		extntTest.log(LogStatus.PASS, "Test Case pass");
		extntTest.log(LogStatus.FAIL, "Test Case Fail");
		extntReport.endTest(extntTest);	
	}
	
	@AfterMethod
	public void tearDown()
	{
		extntReport.flush();
		driver.quit();
	}
	
}
 