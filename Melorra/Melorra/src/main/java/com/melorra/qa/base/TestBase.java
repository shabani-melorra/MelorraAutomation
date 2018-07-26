package com.melorra.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.melorra.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	public static ExtentReports extntReport;
	public static ExtentTest extntTest;
	
	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\tejen\\workspace\\Melorra\\src\\main\\java\\com\\melorra\\qa\\config\\config.properties");
			prop.load(fis);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void initialization(){
		
		extntReport = new ExtentReports("./Reports/report.html", true);
		extntReport.addSystemInfo("Author Name", "Melorra");
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("WebDriver.chrome.driver", "D:\\teja\\D Drive_Done\\Testing\\Automation Testing\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\teja\\D Drive_Done\\Testing\\Automation Testing\\Selenium\\Selenium\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
}
