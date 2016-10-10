package com.nd.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fed.framework.FidelityTestCase;

public class Test_31 extends FidelityTestCase{
	
	@BeforeMethod(alwaysRun=true)
	public void testSetup(){
		System.out.println("setting up the test only ONCE");
	}
	
	@AfterMethod(alwaysRun=true)
	public void testCleanup(){
		System.out.println("Cleaning up the Tests ONCE");
	}
	
	
	
	@Test(groups={"Rollover"})
	public void test_30(){
		System.out.println("Running Tests 31");
		
		testmethod();
		
		
	}
	
	


	private void testmethod() {
		
		System.out.println("Tests are running");
	}

}
