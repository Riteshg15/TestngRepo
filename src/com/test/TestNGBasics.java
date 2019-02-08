package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*Before-suite
before-test
before-class
before-method
Test 2: google logo test
Aftermethod: logout from app
before-method
Test-3: google search test
Aftermethod: logout from app
before-method
Test-1: google title test
Aftermethod: logout from app
Afterclass: deleteAllCookies
Aftertest: closeBrowser
PASSED: googleLogoTest
PASSED: googleSearchTest
PASSED: googleTitleTest

*/

public class TestNGBasics {
	//Pre-condition Annotations--starting with @Before
	@BeforeSuite
	public void setUp(){
		System.out.println("Before-suite");
	}
	@BeforeTest
	public void launchBrowser(){
		System.out.println("before-test");
	}
	@BeforeClass
	public void login(){
		System.out.println("before-class");
	}
	@BeforeMethod
	public void enterURL(){
		System.out.println("before-method");
	} 
	
	//Test cases starting 
	@Test
	public void googleTitleTest(){
		System.out.println("Test-1: google title test");
	}
	@Test
	public void googleLogoTest(){
		System.out.println("Test 2: google logo test");
	}
	@Test
	public void googleSearchTest(){
		System.out.println("Test-3: google search test");
	}
	
	
	
	//post condition -- starting with after
	@AfterMethod
	public void logout(){
		System.out.println("Aftermethod: logout from app");
	}
	@AfterClass
	public void deleteAllCookies(){
		System.out.println("Afterclass: deleteAllCookies");
	}
	@AfterTest
	public void closeBrowser(){
		System.out.println("Aftertest: closeBrowser");
	} 
	@AfterSuite
	public void generateTestReport(){
		System.out.println("AfterSuite: generate test report");
	} 	

}
