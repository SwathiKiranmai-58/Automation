package com.qa.BigC;


	

	import java.util.List;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	public class BigCPages {

	
		public WebDriver driver;
			
		    @FindBy(linkText="Login")
		    WebElement Login;
		    
		    public WebElement getLogin()
		    {
		    	return Login;
		    }
		    
		    @FindBy(xpath="//*[@id=\"email\"]")
		    WebElement email;
		    
		    public WebElement getEmail()
		    {
		    	return email;
		    }
		    
		    @FindBy(xpath="//*[@id=\"pass\"]")
		    WebElement password;
		    
		    public WebElement getPassword()
		    {
		    	return password;
		    }
		    
		    @FindBy(xpath="//*[@id=\"send2\"]/span")
		    WebElement signin;
		    
		    public WebElement getSignin()
		    {
		    	return signin;
		    }
		    
		    @FindAll(@FindBy(xpath="//body/div[1]/main[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/a[1]/span[2]/span[1]/span[1]/img[1]")) 
		    List<WebElement> AllOptions;
			public List<WebElement> getAllOptions()
		{
				return AllOptions;
			}
		    
		    
		
		    @FindBy(xpath="//*[@id=\"search\"]")
		    WebElement SearchBox;
		    public WebElement getSearchBox()
		    {
		    	return SearchBox;
		    			
		    }
		    
		    @FindBy(xpath="1")
		    WebElement submitBox;
		    public WebElement submitBox()
		    {
		    	return submitBox;
		    			
		    }
		    
		    
/*    @FindBy(className="fa fa-angle-down")
		    WebElement drop;
		    public WebElement getdrop()
		    {
		    	return drop;
		    			
		    }*/
		    
		   
		    
		    
		    
		    
		    public  BigCPages(WebDriver driver)
		    {
				this.driver=driver;
				PageFactory.initElements(driver, this);
				
			}
	}


