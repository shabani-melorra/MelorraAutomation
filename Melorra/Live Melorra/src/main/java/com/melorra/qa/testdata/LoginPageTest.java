package com.melorra.qa.testdata;

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
	
	@Test(priority=1)
	public void homePageTitleTest()
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Online Jewellery Shopping Store: Buy Gold and Diamond Jewellery Online");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
 