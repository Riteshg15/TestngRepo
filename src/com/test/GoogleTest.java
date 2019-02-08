package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//dynamic wait	
	//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test(priority=1,groups="Title")
		public void googleTestTitle(){
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2,groups="logo")
	public void googlelogoTest(){
	boolean b=driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
	System.out.println(b);
}
	@Test(priority=3,groups="link")
	public void mailLinkTest(){
	boolean bb=driver.findElement(By.linkText("Gmail")).isDisplayed();
	System.out.println(bb);
}
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}
	
	}


