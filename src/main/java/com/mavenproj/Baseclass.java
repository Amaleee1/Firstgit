package com.mavenproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	public static void main(String[] args) {
		
	
//public static void launchbrowser() {
	System.setProperty("webdriver.gecko.driver",
			System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
	
    WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
    
}
}
