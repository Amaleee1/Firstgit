package com.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Hotelsearch_main {
	public   WebDriver driver;
	
	@FindBy(name = "location")
	private   WebElement location;
	@FindBy(id = "hotels")
	private   WebElement hotel;	
	@FindBy(id = "room_type")
	private   WebElement type;
	@FindBy(id = "room_nos")
	private   WebElement room;
	@FindBy(id = "datepick_in")
	private WebElement datepick_in;
	@FindBy(id = "datepick_out")
	private WebElement datepick_out;
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	@FindBy(id = "child_room")
	private WebElement childroom;
	@FindBy(id = "Submit")
	private WebElement Submit;

	public Hotelsearch_main(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public   WebElement getLocation() {
		return location;
}
	public   WebElement gethotels() {
		return hotel;
}
	public   WebElement getroom_type() {
	return type;
	}
	public   WebElement getroom_nos() {
		return room;
	}
	public WebElement getdatepick_in() {
		return datepick_in;
	}
	public WebElement getdatepick_out() {
		return datepick_out;
	}

	public WebElement getadult_room() {
		return adultroom;
	}
	public WebElement getchild_room() {
		return childroom;
}
	public WebElement getSubmit() {
		return Submit;
}
}
