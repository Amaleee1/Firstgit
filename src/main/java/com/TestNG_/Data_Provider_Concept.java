package com.TestNG_;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Concept {
	@Test(dataProvider = "input")
	public class Dataprov_Concept {
		
			public void login (String username, String password) {
				 
				System.out.println("Username is :" + username);
				System.out.println("Passworde is :" + password);
			}
	@DataProvider
	public Object[][] input() {
		return new Object [][] {
			
			{"abc","def"},{"ghi","jkl"},{"mno","pqr"}
			
		};
	}}}

	

