package com.TestNG_;

import org.testng.Assert;
import org.testng.annotations.Test;

public class I_Retry_Analyser {

	@Test
	public void login() {
		String expected = "Amal";
		String actual  = "Amal";
		Assert.assertEquals(actual, expected);
		
	
	}
	
	@Test(retryAnalyzer = Rerun.class)
	public void number() {
		String expected = "123";
		String actual  = "321";
		Assert.assertEquals(actual, expected);
		
	
	}
	
	
}
