package com.lyft.pageobjects;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CitiesPage {
	private static WebElement element = null;
	public static WebElement searchField(WebDriver driver){
		 
	    element = driver.findElement(By.id("myLocation"));
	 
	    return element;
	 
	    }



}
