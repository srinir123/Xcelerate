package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Ad;

public class Adiuvatis extends GenericMethods{

		@Test
		public static void evaluateTestcase() throws Exception  
		{
			GenericMethods.LaunchBrowserAd("chrome");
			 
			Ad adlgn= PageFactory.initElements(driver, Ad.class);

		adlgn.AdLogin();	
}
}