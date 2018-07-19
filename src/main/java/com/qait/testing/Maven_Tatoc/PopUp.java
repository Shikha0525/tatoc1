package com.qait.testing.Maven_Tatoc;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class PopUp {

	WebDriver driver;
	public PopUp(WebDriver driver) {
		this.driver=driver;
	}
	
	public void verify(String url) {
		Assert.assertEquals(url,driver.getCurrentUrl());
		driver.findElement(By.linkText("Launch Popup Window")).click();
		List windowsList=new ArrayList(driver.getWindowHandles());
        String windows1= ((String)windowsList.get(1));
        driver.switchTo().window(windows1);
        driver.findElement(By.id("name")).sendKeys("shikha");
		Assert.assertEquals(driver.findElement(By.id("submit")).isDisplayed(), true);
        driver.findElement(By.id("submit")).click();
        String windows2=(String)(windowsList.get(0));
        driver.switchTo().window(windows2);
		Assert.assertEquals(driver.findElement(By.linkText("Proceed")).isDisplayed(), true);
        driver.findElement(By.linkText("Proceed")).click(); 
		
	}
	

}
