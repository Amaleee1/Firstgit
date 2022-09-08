package com.TestNG_;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concepts {
		@Test@BeforeSuite
	private void TestngFamily() {
		 System.out.println("MyFamily");
	}
	@Test
	private void openbrowser() {
		System.out.println("firefox");
	}
	@Ignore
	private void EnterURL() {
		 System.out.println("facebook.com");
	}
	@BeforeMethod
	private void logintoParent() {
		 System.out.println("Parent'login-Username & Password");
	}
	@AfterMethod
	private void Parent() {
		 System.out.println("Father & Mother");
	}
	@Ignore
	@Test
	private void Screenshot() {
		System.out.println("familypic");
	}
	@Test(enabled=false)
	private void logouttoParent() {
		 System.out.println("Parent'logout -Father & Mother");
	}
	@AfterSuite
	private void Close() {
		System.out.println("close'browser");
	}	
}
	
	
	
	
	

