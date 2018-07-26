package com.melorra.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.melorra.qa.base.TestBase;

public class CatalogPage extends TestBase {
	
	@FindBy(linkText = "//www.melorra.com/jewellery/")
	WebElement AllJewellery;
	
	@FindBy(linkText = "//www.melorra.com/jewellery/earrings/")
	WebElement earrings;
	
	@FindBy(linkText = "//www.melorra.com/jewellery/rings/")
	WebElement rings;
	
	@FindBy(linkText = "//www.melorra.com/jewellery/pendants/")
	WebElement pendants;
	
	@FindBy(linkText = "//www.melorra.com/jewellery/nose-pins/")
	WebElement nosepins;
	
	@FindBy(linkText = "//www.melorra.com/jewellery/necklaces/")
	WebElement necklaces;
	
	@FindBy(linkText = "//www.melorra.com/jewellery/chains/")
	WebElement chains;
	
	@FindBy(linkText = "//www.melorra.com/jewellery/bangles/")
	WebElement bangles;
	
	@FindBy(linkText = "//www.melorra.com/jewellery/bracelets/")
	WebElement bracelets;
	
	@FindBy(linkText = "//www.melorra.com/newarrivals/")
	WebElement newarrivals;
	
	@FindBy(linkText = "//www.melorra.com/offers")
	WebElement offers;
	
	@FindBy(linkText = "https://blog.melorra.com/")
	WebElement blog;
	
	@FindBy(linkText = "https://www.melorra.com/refer-and-earn")
	WebElement referandearn;  
	
	@FindBy(linkText ="//www.melorra.com/jewellery/ready-to-ship")
	WebElement readytoship; 
	
	public void catrlog() {
		
		AllJewellery.click();
		String size= driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText();
		System.out.println(size);
		
		earrings.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
		
		rings.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
		
		pendants.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
		
		nosepins.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
		
		necklaces.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
		
		chains.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
		
		bangles.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
		
		bracelets.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
		
		newarrivals.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
		
		offers.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
		
		blog.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
		
		referandearn.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
		
		readytoship.click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"titletotal\"]")).getText());
	}
	

}
