package com.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Library {

	 // Sendkeys actions on Element 
	public static void custom_SendKeys(WebElement element,String value) {
		try {
		   element.sendKeys(value);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Click on Element 
	public static void custom_Click(WebElement element) {
	
		try {
		element.click();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	//Drop Down Handle
	public static void handle_DropDown(WebElement element,String text) {
		
		try {
		Select select=new Select(element);
		select.selectByVisibleText(text);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	//Double click
	public static void handle_Doubleclick(WebDriver driver,WebElement element) {
		try {
		Actions act=new Actions(driver);
	    act.doubleClick(element).build().perform();
	    
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	// Right click
	public static void handle_Rightclick(WebDriver driver,WebElement element) {
		try {
		Actions act=new Actions(driver);
	    act.contextClick(element).build().perform();
	    
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void capture_Screenshot(WebDriver driver) throws Exception {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn =new File(System.getProperty("user.dir")+"\\Test.png");
		FileUtils.copyFile(src, destn);
		
	}
	
	
	
}
