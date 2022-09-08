package com.mavenproj;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;


public class Maven_runnerprog extends Browserlauncher {

	public static void main(String[] args) throws InterruptedException, IOException {
			
		launchBrowser("firefox");
		//driver.get("https://www.facebook.com/");
		launchUrl("https://www.facebook.com/");
	
		WebElement a = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		//a.click();
		clickOnElement(a);
		Thread.sleep(5000);
		WebElement Firstname = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
		passInput(Firstname, "Amal");
		WebElement Secondname = driver.findElement(By.xpath("//input[@name='lastname']"));
		passInput(Secondname, "Raj");
		WebElement Mobileno = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		passInput(Mobileno, "8668116728");
		WebElement Password = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		passInput(Password, "Javaseleniumtest");
		//Thread.sleep(5000);
		Select dropdown1 = new Select (driver.findElement(By.xpath("//select[@id='day']")));
		dropdown1.selectByVisibleText("8");
		//Thread.sleep(5000);
		Select dropdown2 = new Select (driver.findElement(By.xpath("//select[@id='month']")));
		dropdown2.selectByVisibleText("Sep");
		
		Select dropdown3 = new Select (driver.findElement(By.xpath("//select[@name='birthday_year']")));
		dropdown3.selectByVisibleText("1987");
		
		WebElement b = driver.findElement(By.xpath("//input[@value='2']"));
		clickOnElement(b);
		WebElement c = driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
		clickOnElement(c);
		
		ScreenShotMethod("C:\\Users\\hp\\Seleniumclassnew\\mavenproj\\Screenshots\\pic.png");
		
	}}