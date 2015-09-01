package com.lyft.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.lyft.pageobjects.CitiesPage;

public class PageObjectModel {
	
	private static WebDriver driver = null;
	 
	   public static void main(String[] args) throws InterruptedException {
	 
	     driver = new FirefoxDriver();
	 
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     driver.get("http://www.lyft.com/cities");
	   
	       
	     // Use page Object library now
	 
	   CitiesPage.searchField(driver).sendKeys("Sunnyvale CA, United States");
	  
	  
	  
		   
	   
	 
	    
	     
	 
	     }
	 
	}


