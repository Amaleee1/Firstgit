package com.TestNG_;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping_Concept {
@Test(groups="Hills")
	public void Hill_Station1() {
		 System.out.println("Kodaikanal");
	}
@Test(groups="Hills")	
	 public void  Hill_Station2 () {
		 System.out.println("Ooty");
	 }
@Test(groups="Beaches")	
	private void Seachore1() {
		System.out.println("Dhanushkodi_Beach");
	}
@Ignore
@Test(groups="Beaches")	
	private void Seachore2() {
		System.out.println("Kanyakumari_Beach");
	}
@Test(groups="Tour")		
	private void TourismTN1() {
		 System.out.println("Mahabalipuram");
	}
@Test(groups="Tour")
	private void TourismTN2() {
		 System.out.println("Yercaud");
	}
	
}
