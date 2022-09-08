package com.stepdefinition;

import com.POMa.Project_Obj_Manger;
import com.Pom.Browserlauncher;
import com.propertyfile.File_Reader_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Browserlauncher {
	public static Project_Obj_Manger POManger = new Project_Obj_Manger(driver);
	 
	@Given("^User Launch The Url Of Adactin Hotel App$")
	public void user_Launch_The_Url_Of_Adactin_Hotel_App() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		launchUrl(url);  }
	
	@When("^User Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String username) throws Throwable {
		passInput(POManger.getInstance().getUsername(),username);
	}
	@When("^User Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
		passInput(POManger.getInstance().getPassword(), password);
	}

	@Then("^User Click The Login Button And It Navigate The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigate_The_Search_Hotel_Page() throws Throwable {
		clickOnElement(POManger.getInstance().getLogin());
	}
	@When("^User Select The Location  As \"([^\"]*)\" From Location Field$")
	public void user_Select_The_Location_As_From_Location_Field(String loc) throws Throwable {
		selectbytext(POManger.getInstance1().getLocation(), loc); 
	}
	
	@When("^User Select The Hotel  As \"([^\"]*)\" From Hotel Field$")
	public void user_Select_The_Hotel_As_From_Hotel_Field(String arg1) throws Throwable {
		selectbytext(POManger.getInstance1().gethotels(),arg1);
	}


     @When("^User Select The Room Type As \"([^\"]*)\"$")
	public void user_Select_The_Room_Type_As(String Double) throws Throwable {
		selectbytext(POManger.getInstance1().getroom_type(), Double);
	}
     	@When("^User Select The No Of Rooms In The Select No Of Rooms Field As \"([^\"]*)\"$")
	public void user_Select_The_No_Of_Rooms_In_The_Select_No_Of_Rooms_Field_As(String arg1) throws Throwable {
		selectByInd(POManger.getInstance1().getroom_nos(),2);
	}
     
	@When("^User Fix The date in the Field Of Check In Date As \"([^\"]*)\"$")
	public void user_Fix_The_date_in_the_Field_Of_Check_In_Date_As(String chkin) throws Throwable {
		passInput(POManger.getInstance1().getdatepick_in(),chkin);
	}
		@When("^User Fix The date in the Field Of Check Out Date As \"([^\"]*)\"$")
	public void user_Fix_The_date_in_the_Field_Of_Check_Out_Date_As(String chkout) throws Throwable {
		passInput(POManger.getInstance1().getdatepick_out(),chkout);
	}
	@When("^User Select Adults Per Room As \"([^\"]*)\"$")
	public void user_Select_Adults_Per_Room_As(String arg1) throws Throwable {
		selectByInd(POManger.getInstance1().getadult_room(),2);
	}

	@When("^User Select Children Per Room As \"([^\"]*)\"$")
	public void user_Select_Children_Per_Room_As(String arg1) throws Throwable {
		selectByInd(POManger.getInstance1().getchild_room(),2);
	}
	

	@Then("^User Click the Search Button$")
	public void user_Click_the_Search_Button() throws Throwable {
		clickOnElement(POManger.getInstance1().getSubmit());
	}

 	@When("^User Click The Hotel In The Field Of Select  As \"([^\"]*)\"$")
	public void user_Click_The_Hotel_In_The_Field_Of_Select_As(String arg1) throws Throwable {
		clickOnElement(POManger.getInstance2().getradiobutton_0());
	}

	@Then("^User Click the Continue Button$")
	public void user_Click_the_Continue_Button() throws Throwable {
		clickOnElement(POManger.getInstance2().getreg_button());
	}

	@When("^User User Enter The First Name As \"([^\"]*)\"$")
	public void user_User_Enter_The_First_Name_As(String getfirst_name) throws Throwable {
		passInput(POManger.getInstance3().getfirst_name(),getfirst_name);
	}

	@When("^User Enter The Last Name As \"([^\"]*)\"$")
	public void user_Enter_The_Last_Name_As(String getlast_name) throws Throwable {
		passInput(POManger.getInstance3().getlast_name(),getlast_name);
	}

	@When("^User Enter The Address As \"([^\"]*)\"$")
	public void user_Enter_The_Address_As(String getaddress) throws Throwable {
		passInput(POManger.getInstance3().getaddress(),getaddress);
	}

	@When("^User Enter The CreditCard Number As \"([^\"]*)\"$")
	public void user_Enter_The_CreditCard_Number_As(String getcc_num) throws Throwable {
		passInput(POManger.getInstance3().getcc_num(),getcc_num);
	}

	@When("^User Select Credit Card Type As \"([^\"]*)\"$")
	public void user_Select_Credit_Card_Type_As(String type) throws Throwable {
		selectbytext(POManger.getInstance3().getcc_type(),type);
	}
	@When("^User User Select A Month In The Field Of Select Month Field As \"([^\"]*)\"$")
	public void user_User_Select_A_Month_In_The_Field_Of_Select_Month_Field_As(String month) throws Throwable {
		selectbytext(POManger.getInstance3().getcc_exp_month(), month);
	}

	@When("^User User Select A Year In The Field Of Select Year Field As \"([^\"]*)\"$")
	public void user_User_Select_A_Year_In_The_Field_Of_Select_Year_Field_As(String yr) throws Throwable {
		selectbytext(POManger.getInstance3().getcc_exp_year(), yr);
	}


	@When("^User Enter The CVV Number As \"([^\"]*)\"$")
	public void user_Enter_The_CVV_Number_As(String cvv) throws Throwable {
		passInput(POManger.getInstance3().getcc_cvv(), cvv);
	}

	@Then("^User Click the Book Now Button$")
	public void user_Click_the_Book_Now_Button() throws Throwable {
		clickOnElement(POManger.getInstance3().getbook_now());
	} 
}