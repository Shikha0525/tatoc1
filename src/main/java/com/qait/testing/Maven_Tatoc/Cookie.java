/*package com.qait.testing.Maven_Tatoc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
public class Cookie
{
	WebDriver driver;
	public Cookie(WebDriver driver)
	{
		this.driver=driver;
	}
	public void checkProceedAfterTokenGeneration()
	{
		driver.findElement(By.linkText("Generate Token")).click();
		String Token = driver.findElement(By.id("token")).getText();
		System.out.println(Token);
		String substring1=Token.substring(7);
		Cookie name = new Cookie("Token", substring1);
		driver.manage().addCookie(name);
		driver.findElement(By.linkText("Proceed")).click();
	}
}*/