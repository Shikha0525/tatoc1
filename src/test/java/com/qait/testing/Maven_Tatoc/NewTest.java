package com.qait.testing.Maven_Tatoc;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	WebDriver driver;
	Basic_Course Basic;
	GridGate grid;
	Frame_Dungeon frame;
	DragDrop drag;
	PopUp popup;
	//Cookie cookie;
	
	@BeforeClass
	public void initial() {
		driver = new ChromeDriver();
		 Basic= new Basic_Course(driver);
	}
	@Test(priority=1)
	public void Basic(){
		Basic.launchApplication("http://10.0.1.86/tatoc");
		Basic.verifyHomePageLaunched();
	}
	@Test(priority=2)
	public void grid() {
		String url;
		url="http://10.0.1.86/tatoc/basic/grid/gate";
		grid=new GridGate(driver);
		grid.verify(url);
	}
	@Test(priority=3)
	public void frame() {
		String url;
		url="http://10.0.1.86/tatoc/basic/frame/dungeon";
		frame=new Frame_Dungeon(driver);
		frame.verify(url);
	}
	@Test(priority=4)
	public void Drag() {
		String url;
		url="http://10.0.1.86/tatoc/basic/drag";
		drag=new DragDrop(driver);
		drag.verify(url);
	}
	@Test(priority=5)
	public void popup() {
		String url;
		url="http://10.0.1.86/tatoc/basic/windows";
		popup=new PopUp(driver);
		popup.verify(url);
	}
	@Test(priority=6)
	public void cookie() {
		String url;
		url="http://10.0.1.86/tatoc/basic/cookie";
        //cookie=new Cookie(driver);
        //cookie.verify(url);
	}
	
}
