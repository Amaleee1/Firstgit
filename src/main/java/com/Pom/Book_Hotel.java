package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;
	@FindBy(id="first_name")
	private WebElement first_name;
	
	@FindBy(id="last_name")
	private WebElement last_name;
	
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cc_num;
	
	@FindBy(id="cc_type")
	private WebElement cc_type;
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	@FindBy(name = "book_now")
	private WebElement Submit;
	@FindBy(id = "window.location=\"BookedItinerary.php\"")
	private WebElement booked;

	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getfirst_name() {
		return first_name;
	}
	public WebElement getlast_name() {
		return last_name;
	}
	
	public WebElement getaddress() {
		return address;
	}
	public WebElement getcc_num() {
		return cc_num;
	}
	public WebElement getcc_type() {
		return cc_type;
	}
	public WebElement getcc_exp_month() {
		return cc_exp_month;
	}
	public WebElement getcc_exp_year() {
		return cc_exp_year;
	}
	
	public WebElement getcc_cvv() {
		return cc_cvv;
	}
	
	public WebElement getbook_now() {
		return Submit;
	}	
}
