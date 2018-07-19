package com.qait.testing.Maven_Tatoc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class Basic_Course
{
	WebDriver driver;
	public Basic_Course(WebDriver driver)
	{
		this.driver=driver;
	}
	public void launchApplication(String string) {
		driver.get(string);
		System.out.println("User launched URL: "+string);
	}
	public void verifyHomePageLaunched() {
		
		Assert.assertEquals(driver.findElement(By.linkText("Basic Course")).isDisplayed(), true);
        driver.findElement(By.linkText("Basic Course")).click();
		System.out.println("User is on homepage");
	}
}
