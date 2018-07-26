package com.melorra.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.melorra.qa.base.TestBase;

public class SignupPage extends TestBase
{

	//Page Factory or Page Object repositories
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement signInBtn;
	
	@FindBy(xpath = "//a[@class='btn btn-primary-outline width-100 m-t-1']")
	WebElement createAccntBtn;
	
	@FindBy(xpath = "//input[@id='signupFirstname']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='signupLastname']")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='signupPhone']")
	WebElement phoneField;
	
	@FindBy(xpath = "//input[@id='signupEmail']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@id='signupPassword']")
	WebElement passwordField;
	
	@FindBy(xpath = "//a[@class='btn btn-primary width-100 localyticsCategory']")
	WebElement signupButton;
	
	@FindBy(xpath = "//button[@id='signOutModal']")
	WebElement signoutButton;
	
	@FindBy(xpath = "//button[contains(text(),'Yes, sign out')]")
	WebElement yessignoutButton;
	
	public SignupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public MyAccountPage signUp(String fname, String lname, String phone, String email, String pwd)
	{
		signInBtn.click();
		createAccntBtn.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("signupFirstname")));
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		phoneField.sendKeys(phone);
		emailField.sendKeys(email);
		passwordField.sendKeys(pwd);
		signupButton.click();
		return new MyAccountPage();
		
	}
	
	public HomePage signOut()
	{
		signoutButton.click();
		yessignoutButton.click();
		return new HomePage();
	}
		
}
