package com.test;

import org.testng.annotations.Test;

public class TestngFeature {
	
	@Test
	public void loginTest(){
		System.out.println("login-test");
		int a=9/0;
	}
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest(){
		System.out.println("RegPage-test");
	}
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest(){
		System.out.println("SearchPage-test");
	}
}
