package com.Pom;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Element;

public class Browserlauncher {
	public static WebDriver driver;// (default value Null)

	public static WebDriver launchBrowser(String browsername) {
		if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void terminateBrowser() {
		driver.quit();
	}
	public static void passInput(WebElement element, String input) {
		element.clear();
		element.sendKeys(input);
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	

	public static void selectbytext(WebElement element, String string) {
		Select ng = new Select(element);
		ng.selectByVisibleText(string);
	}
	public static void selectByInd(WebElement element, int index) {
		Select sc = new Select(element);
		sc.selectByIndex(index);
	}
	public static void selectbyvalue(WebElement element, String value) {
		Select ng = new Select(element);
		ng.selectByValue(value);
	}
	public static void ScreenShotMethod(String location) throws IOException {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File Src = sc.getScreenshotAs(OutputType.FILE);
		File Dest = new File(location);
		FileUtils.copyFile(Src, Dest);
	}
}
