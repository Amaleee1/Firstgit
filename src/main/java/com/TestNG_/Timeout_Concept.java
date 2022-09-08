package com.TestNG_;
import org.testng.annotations.Test;
public class Timeout_Concept {

	@Test(timeOut=7000)
	public void Colours() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Blue");
		Thread.sleep(2000);
		System.out.println("Black");
		Thread.sleep(2000);
		System.out.println("Red");

		
	}
}
