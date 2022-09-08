package com.mavenproj;
import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactinsignup extends Browserlauncher {

	public static void main(String[] args) throws IOException, InterruptedException {
		launchBrowser("firefox");
		launchUrl("https://adactinhotelapp.com/");
		/*Signup 
		WebElement a = driver.findElement(By.xpath("//a[@href='Register.php']"));
		clickOnElement(a);
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		passInput(Username, "AmalRaja");
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		passInput(Password, "Selenium123");
		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='re_password']"));
		passInput(ConfirmPassword, "Selenium123");
		WebElement FullName = driver.findElement(By.xpath("//input[@id='full_name']"));
		passInput(FullName, "Amal");
		WebElement Email = driver.findElement(By.xpath("//input[@id='email_add']"));
		passInput(Email, "amal.eee302@gmail.com");
		WebElement b = driver.findElement(By.xpath("//input[@name='tnc_box']"));
		clickOnElement(b);
		Thread.sleep(10000);
		WebElement c = driver.findElement(By.xpath("//input[@id='Submit']"));
		clickOnElement(c);*/
		
		//Login
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
		passInput(Username, "AmalRaja");
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		passInput(Password, "Selenium123");
		WebElement c = driver.findElement(By.xpath("//input[@id='login']"));
		clickOnElement(c);
		
		Select dropdown1 = new Select (driver.findElement(By.xpath("//select[@name='location']")));
		dropdown1.selectByVisibleText("Paris");
		
		Select dropdown2 = new Select (driver.findElement(By.xpath("//select[@id='hotels']")));
		dropdown2.selectByVisibleText("Hotel Sunshine");
		
		Select dropdown3 = new Select (driver.findElement(By.xpath("//select[@id='room_type']")));
		dropdown3.selectByVisibleText("Super Deluxe");
		
		Select dropdown4 = new Select (driver.findElement(By.xpath("//select[@id='room_nos']")));
		dropdown4.selectByIndex(2); 
		//Thread.sleep(5000);
		
	    WebElement CheckInDate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		passInput(CheckInDate, "15/08/2022");
		
		WebElement CheckOutDate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		passInput(CheckOutDate, "16/08/2022");
		
		Select dropdown5 = new Select (driver.findElement(By.xpath("//select[@id='adult_room']")));
		dropdown5.selectByIndex(2); 
		
		
		Select dropdown6 = new Select (driver.findElement(By.xpath("//select[@id='child_room']")));
		dropdown6.selectByIndex(2); 
		
		WebElement d = driver.findElement(By.xpath("//input[@value='Search']"));
		clickOnElement(d);
		WebElement e = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		clickOnElement(e);
		WebElement f = driver.findElement(By.xpath("//input[@type='submit']"));
		clickOnElement(f);
		
		 WebElement Firstname = driver.findElement(By.xpath("//input[@id='first_name']"));
		passInput(Firstname, "Amal");
		WebElement LastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		passInput(LastName, "Arockia Raj");
		
	    WebElement BillingAddress = driver.findElement(By.xpath("//textarea[@id='address']"));
		passInput(BillingAddress, "Dindigul");
		
		WebElement Creditcardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
		passInput(Creditcardno, "1234567891011121");
		
		Select dropdown7 = new Select (driver.findElement(By.xpath("//select[@id='cc_type']")));
		dropdown7.selectByVisibleText("VISA");
		
		Select dropdown8 = new Select (driver.findElement(By.xpath("//select[@id='cc_exp_month']")));
		dropdown8.selectByVisibleText("May");
		
		Select dropdown9 = new Select (driver.findElement(By.xpath("//select[@id='cc_exp_year']")));
		dropdown9.selectByVisibleText("2021");
		
		WebElement CVVno = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		passInput(CVVno, "123");
		
		WebElement g = driver.findElement(By.xpath("//input[@name='book_now']"));
		clickOnElement(g);
		//Thread.sleep(5000);
		
		WebElement h = driver.findElement(By.xpath("//a[@href='BookedItinerary.php']"));
		clickOnElement(h);
		
		ScreenShotMethod("C:\\Users\\hp\\Seleniumclassnew\\mavenproj\\Screenshots\\pic.png");
	}
	
}
