package com.testNG;
import org.junit.Ignore;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_annotation_features {
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
	@Test(priority=0)
	private void Screenshot() {
		System.out.println("familypic");
	}
	@AfterTest
	private void logouttoParent() {
		 System.out.println("Parent'logout -Father & Mother");
	}
	@AfterSuite
	private void Close() {
		System.out.println("close'browser");
	}	
}
