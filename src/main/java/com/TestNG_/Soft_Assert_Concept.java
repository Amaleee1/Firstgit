package com.TestNG_;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Concept {
	@Test
	public void login() {
		String expected = "Amal";
		String actual  = "Raja";
		SoftAssert SA = new SoftAssert();
		SA.assertEquals(actual, expected);
		System.out.println("my Name");
	
	}

}


