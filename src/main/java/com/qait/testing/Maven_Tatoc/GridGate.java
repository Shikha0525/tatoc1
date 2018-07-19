package com.qait.testing.Maven_Tatoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class GridGate {

	WebDriver driver;
	
	public GridGate(WebDriver driver) {
		this.driver=driver;
		
	}

	public void verify(String url) {
		Assert.assertEquals(url,driver.getCurrentUrl());
        this.driver.findElement(By.className("greenbox")).click();
        System.out.println("User is on grid gate");
	}
}
