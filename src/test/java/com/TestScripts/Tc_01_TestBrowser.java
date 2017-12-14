package com.TestScripts;

import com.GenericFunctions.GenericMethods;

import org.testng.annotations.Test;
public class Tc_01_TestBrowser extends GenericMethods{
	
	
	
	
	@Test
	
	public static void Test()
	{
		LaunchBrowser("chrome");
	System.out.println("Testing");
	LogEvent("pass", "Test Pass");
		
	}

}
