package com.qait.testing.Maven_Tatoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class DragDrop {

	WebDriver driver;
	public DragDrop(WebDriver driver) {
		
		this.driver=driver;
				
	}
	public void verify(String url) {
		
		Assert.assertEquals(url,driver.getCurrentUrl());
		WebElement drop = driver.findElement(By.id("dropbox"));
		WebElement drag = driver.findElement(By.id("dragbox"));
		Actions act=new Actions(driver);
        act.dragAndDrop(drag, drop).build().perform();
        driver.findElement(By.linkText("Proceed")).click();
        System.out.println("User is on DragDrop Page");
	}
	
	

}
