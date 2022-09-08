package com.Runnercucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Pom.Browserlauncher;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import ru.yandex.qatools.ashot.cropper.indent.MonochromeFilter;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hp\\Seleniumclassnew\\mavenproj\\src\\test\\java\\com\\Cucumber",
monochrome = true,
glue = "com.stepdefinition", plugin = {
		"html:Report","json:Report/cucumber.json" ,"com.cucumber.listener.ExtentCucumberFormatter:Report/Adactin.html"})
public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = Browserlauncher.launchBrowser("firefox");

	}

	@AfterClass
	public static void tearDown() {

		Browserlauncher.closeBrowser();
	}
}
