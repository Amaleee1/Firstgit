package com.TestNG_;

import org.testng.annotations.Test;

public class Expected_Exception_Concept {
@Test(expectedExceptions = ArithmeticException.class)
	private void Divide() {
		 int a = 100;
		 System.out.println(a/0);

	}
	
	
	
	
	
	
}
