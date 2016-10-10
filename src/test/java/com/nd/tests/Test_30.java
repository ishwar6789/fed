package com.nd.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fed.framework.FidelityTestCase;

public class Test_30 extends FidelityTestCase{
	
	
	@BeforeMethod(alwaysRun=true)
	public void testSetup(){
		System.out.println("Test: ");
	}
	
	@AfterMethod(alwaysRun=true)
	public void testCleanup(){
		System.out.println("Finished: ");
	}
	
	
	
	/**
	 * Runs the test
	 */
	@Test(groups={"Rollover"})
	public void test_30(){
		System.out.println("Running Test Case Number 30");
		
		testmethod();
		
		
	}
	
	


	private void testmethod() {
		
		System.out.println("Tests are running");
	}

}
