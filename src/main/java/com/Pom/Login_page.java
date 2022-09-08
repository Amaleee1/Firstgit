package com.Pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.POMa.Project_Obj_Manger;

public class Login_page{ 
public static WebDriver driver;     
//Annotation
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement pass;
	@FindBy(id="login")
	private WebElement login;
	
	public Login_page(WebDriver driver2) {
	this.driver =driver2 ;
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsername() {
		return username;
	} 
	public WebElement getPassword() {
		return pass;
	}
	public WebElement getLogin() {
		return login;
	}
}
