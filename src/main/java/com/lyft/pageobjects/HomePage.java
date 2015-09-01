package com.lyft.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private static WebElement element = null;
	 
	 public static WebElement navigateToCitiesPage(WebDriver driver){
	 
	    element = driver.findElement(By.id("nav-item-cities"));
	 
	    return element;
	 
	    }

	
	 
	 
	 
	    
	 
	}


