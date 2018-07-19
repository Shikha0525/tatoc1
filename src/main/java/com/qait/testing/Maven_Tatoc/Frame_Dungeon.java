package com.qait.testing.Maven_Tatoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class Frame_Dungeon {
	 
	WebDriver driver;
	
	public Frame_Dungeon(WebDriver driver) {
		
		this.driver=driver;
	}

	public void verify(String url) {
		
		driver.switchTo().frame(0);	
		Assert.assertEquals(url,driver.getCurrentUrl());
        String box1Color=driver.findElement(By.id("answer")).getAttribute("class");
		
		Boolean condition=true;		
		while(condition) {
			Assert.assertEquals(driver.findElement(By.linkText("Repaint Box 2")).isDisplayed(), true);
	  		driver.findElement(By.linkText("Repaint Box 2")).click(); 
			driver.switchTo().frame("child");
			Assert.assertEquals(driver.findElement(By.id("answer")).isDisplayed(), true);
			String box2Color=driver.findElement(By.id("answer")).getAttribute("class");
			driver.switchTo().parentFrame();
			
			if(box1Color.equals(box2Color)) {
				Assert.assertEquals(driver.findElement(By.linkText("Proceed")).isDisplayed(), true);
				driver.findElement(By.linkText("Proceed")).click();
				condition=false;
			}
		}
	         driver.switchTo().defaultContent();	
	         System.out.println("User is on Frame_Dungeon");
	}
		
}
	 
	
	

