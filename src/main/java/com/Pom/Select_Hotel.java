package com.Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Select_Hotel {

		public WebDriver driver;
		@FindBy(id="radiobutton_0")
		private WebElement radiobutton_0;
		
		@FindBy(name="continue")
		private WebElement reg_button;
		
		public Select_Hotel(WebDriver driver2) {
			this.driver = driver2;
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getradiobutton_0() {
			return radiobutton_0;
		}
		
		public WebElement  getreg_button() {
			return reg_button;
		}}
		
		
	
		
	