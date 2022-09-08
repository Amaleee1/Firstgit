package com.Pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Pom_Runnerlogin extends Browserlauncher {
	
	public static void main(String[] args) {
		
		launchBrowser("firefox");
		launchUrl("https://adactinhotelapp.com/");
	
		Login_page Ip = new Login_page(driver);
		Hotelsearch_main Ip1 = new Hotelsearch_main(driver);
		Select_Hotel Ip2 = new Select_Hotel(driver);
		Book_Hotel Ip3 = new Book_Hotel(driver);
		
		passInput(Ip.getUsername(),"AmalRaja");
		passInput(Ip.getPassword(), "Selenium123");
		clickOnElement(Ip.getLogin());
		
		selectbytext(Ip1.getLocation(), "Paris");
		selectbytext(Ip1.gethotels(), "Hotel Sunshine");
		selectbytext(Ip1.getroom_type(), "Double");
		selectByInd(Ip1.getroom_nos(),2);
		passInput(Ip1.getdatepick_in(), "15/08/2022");
		passInput(Ip1.getdatepick_out(),"20/08/2022");
		selectByInd(Ip1.getadult_room(),2);
		selectByInd(Ip1.getchild_room(),2);
		clickOnElement(Ip1.getSubmit());
		
		clickOnElement(Ip2.getradiobutton_0());
		clickOnElement(Ip2.getreg_button());
		
		passInput(Ip3.getfirst_name(),"Amal");
		passInput(Ip3.getlast_name(),"Raja");
		passInput(Ip3.getaddress(),"Dindigul");
		passInput(Ip3.getcc_num(),"1234567891011121");
		selectbytext(Ip3.getcc_type(),"VISA");
		selectbytext(Ip3.getcc_exp_month(), "May");
		selectbytext(Ip3.getcc_exp_year(), "2021");
		passInput(Ip3.getcc_cvv(),"321");
		clickOnElement(Ip3.getbook_now());
		
	}}

	

	



	
		

		
	


