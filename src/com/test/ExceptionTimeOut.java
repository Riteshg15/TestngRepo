package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOut {
	
@Test(invocationTimeOut=2)
public void infiniteLoopTest(){
	int i=1;
	while (i==1) {
		System.out.println(i);
	}
	
}
}
