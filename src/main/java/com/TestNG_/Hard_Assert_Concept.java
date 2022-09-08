package com.TestNG_;

import org.testng.Assert;
import org.testng.annotations.Test;
 

public class Hard_Assert_Concept {
@Test
	public void login() {
		String expected = "Amal";
		String actual  = "Amal";
		Assert.assertEquals(actual, expected);
		System.out.println("my Name");
	
	}

}
