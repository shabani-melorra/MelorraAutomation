package com.melorra.qa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
			

	//Initializing page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateLogo()
	{
		return melorraLogo.isDisplayed();
	}
	
	@Test(dataProvider="Melorra")
	public void login(String un, String pwd) throws InterruptedException, FileNotFoundException
	{
		signInBtn.click();
		username.sendKeys(un);
		contBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//small[@id='emailFieldBlank']")));
		String actual_blank_error = driver.findElement(By.xpath("//small[@id='emailFieldBlank']")).getText();
		String expected_blank_error = "Please enter an email address.";
		Assert.assertEquals(actual_blank_error, expected_blank_error);
		System.out.println("The Email field is blank. Please look into it");
	}
		
	@Test(dataProvider="Melorra1")
	public void login1(String un, String pwd) throws InterruptedException, FileNotFoundException
	{
		signInBtn.click();
		username.sendKeys(un);
		contBtn.click();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//small[@id='emailFieldInvalid']")));
		String actual_invalidfield_error = driver.findElement(By.xpath("//small[@id='emailFieldInvalid']")).getText();
		String expected_invalidfield_error = "Please enter a valid email address.";
		Assert.assertEquals(actual_invalidfield_error, expected_invalidfield_error);
		System.out.println("Entered the invalid Email. Please look into it");
	}
	@Test(dataProvider="Melorra2")
	public void login11(String un, String pwd) throws InterruptedException, FileNotFoundException
	{
		signInBtn.click();
		username.sendKeys(un);
		contBtn.click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		WebElement element2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//small[@id='emailFieldNotExist']")));
		String actual_newgmail_error = driver.findElement(By.xpath("//small[@id='emailFieldInvalid']")).getText();
		String expected_newgmail_error = "Email address doesn't exist. Please create your account.";
		Assert.assertEquals(actual_newgmail_error, expected_newgmail_error);
		System.out.println("Entered Email id doesn't exist. Please look into it");
	}
	
	@Test(dataProvider="Melorra3")
	public void login21(String un, String pwd) throws InterruptedException, FileNotFoundException
	{
		signInBtn.click();
		username.sendKeys(un);
		contBtn.click();
		
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		WebElement element3 = wait3.until(ExpectedConditions.elementToBeClickable(By.id("signInPassword")));
		password.sendKeys(pwd);
		loginBtn.click();	
		
		//Thread.sleep(20000);
		
		//return new MyAccountPage(); 
		
		//Thread.sleep(5000);
		//System.out.println(driver.getTitle());
	
		
	}
	@DataProvider(name="Melorra")
	public Object[][] passData1()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0] = "admin1";
		data[0][1] = "pass1";
		return data;
	}
	@DataProvider(name="Melorra1")
	public Object[][] passData11()
	{
		Object[][] data = new Object[3][2];
		data[1][0] = "admin1";
		data[1][1] = "pass1";
		return data;
	}
	
	@DataProvider(name="Melorra2")
	public Object[][] passData()
	{
		Object[][] data = new Object[3][2];
		data[2][0] = "admin1";
		data[2][1] = "pass1";
		return data;
	}
	}

	


