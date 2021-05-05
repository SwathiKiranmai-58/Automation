package com.qa.BigC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class BigCTestBase {
	
	WebDriver driver;
	 BigCPages  BPages;
	 
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setup(String Browser,String Url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swathi\\OneDrive\\Desktop\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 BPages=new  BigCPages(driver);
		 driver.get(Url);
		 
		
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}

}



