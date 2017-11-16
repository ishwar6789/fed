package com.fed.framework;
//testing
public class BaseTest {	
	
	public void setUpBase(){
		System.out.println("Starting TestSuite");
		GlobalVariables.setGlobalVariables();
	
		
	}
	
	
	

	public void cleanUpBase(){		
		System.out.println("Cleaining TestSuite");
	}
	
	
	

}
