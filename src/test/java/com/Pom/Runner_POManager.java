	package com.Pom;
	import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import com.POMa.Project_Obj_Manger;
import com.propertyfile.Configuration_Reader;
import com.propertyfile.File_Reader_Manager;


	public class Runner_POManager extends Browserlauncher {
	public static WebDriver driver =launchBrowser("firefox");
	public static Project_Obj_Manger POManger = new Project_Obj_Manger(driver);
	 
	public static void main(String[] args)throws IOException {
	
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		passInput(POManger.getInstance().getUsername(),username);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		passInput(POManger.getInstance().getPassword(), password);
		
		clickOnElement(POManger.getInstance().getLogin());

		selectbytext(POManger.getInstance1().getLocation(), "Paris");
		selectbytext(POManger.getInstance1().gethotels(),"Hotel Sunshine");
		selectbytext(POManger.getInstance1().getroom_type(), "Double");
		selectByInd(POManger.getInstance1().getroom_nos(),2);
		
		String getdatepick_in = File_Reader_Manager.getInstanceFRM().getInstanceCR().getdatepick_in();
		passInput(POManger.getInstance1().getdatepick_in(),getdatepick_in);
		
		String getdatepick_out = File_Reader_Manager.getInstanceFRM().getInstanceCR().getdatepick_out();
		passInput(POManger.getInstance1().getdatepick_out(),getdatepick_out);
		
		selectByInd(POManger.getInstance1().getadult_room(),2);
		selectByInd(POManger.getInstance1().getchild_room(),2);
		clickOnElement(POManger.getInstance1().getSubmit());
		clickOnElement(POManger.getInstance2().getradiobutton_0());
		clickOnElement(POManger.getInstance2().getreg_button());
		String getfirst_name = File_Reader_Manager.getInstanceFRM().getInstanceCR().getfirst_name();
		passInput(POManger.getInstance3().getfirst_name(),getfirst_name);
		String getlast_name = File_Reader_Manager.getInstanceFRM().getInstanceCR().getlast_name();
		passInput(POManger.getInstance3().getlast_name(),getlast_name);
		String getaddress = File_Reader_Manager.getInstanceFRM().getInstanceCR().getaddress();
		passInput(POManger.getInstance3().getaddress(),getaddress);
		String getcc_num = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcc_num();
		passInput(POManger.getInstance3().getcc_num(),getcc_num);
		
		selectbytext(POManger.getInstance3().getcc_type(),"VISA");
		selectbytext(POManger.getInstance3().getcc_exp_month(), "May");
		selectbytext(POManger.getInstance3().getcc_exp_year(), "2021");
		String getcc_cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcc_cvv();
		passInput(POManger.getInstance3().getcc_cvv(),getcc_cvv);
		
		clickOnElement(POManger.getInstance3().getbook_now());
		

		
	}}
	
		

		
	


