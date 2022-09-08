package com.POMa;
import org.openqa.selenium.WebDriver;
import com.Pom.Book_Hotel;
import com.Pom.Hotelsearch_main;
import com.Pom.Login_page;
import com.Pom.Select_Hotel;

public class Project_Obj_Manger {

	public WebDriver driver;
	// private classname objectname
	private Login_page Ip;
	private Hotelsearch_main Ip1;
	private Select_Hotel Ip2;
	private Book_Hotel Ip3;

	public Project_Obj_Manger(WebDriver driver2) {
		this.driver = driver2;
	}

	public Login_page getInstance() {
		if (Ip == null) {
			Ip = new Login_page(driver);
		}
		return Ip;
	}

	public Hotelsearch_main getInstance1() {
		if (Ip1 == null) {
			Ip1 = new Hotelsearch_main(driver);
		}
		return Ip1;
	}
	public Select_Hotel getInstance2() {
		if (Ip2 == null) {
			Ip2 = new Select_Hotel(driver);
		}
		return Ip2;
	}
	public Book_Hotel getInstance3() {
		if (Ip3 == null) {
			Ip3 = new Book_Hotel(driver);
		}
		return Ip3;
	}
}
