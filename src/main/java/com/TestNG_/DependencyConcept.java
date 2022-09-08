package com.TestNG_;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependencyConcept {
 @Ignore
 @Test
	private void Tenth() {
		 
System.out.println("10th");
	}
@Test(dependsOnMethods ="Tenth" )
	private void twelth() {
		 
		System.out.println("12th");
	}

}
