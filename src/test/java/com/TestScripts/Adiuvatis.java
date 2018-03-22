package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;

public class Adiuvatis extends GenericMethods{

		@Test
		public static void evaluateTestcase() throws Exception  
		{
			GenericMethods.LaunchBrowserAd("chrome");
			 
			Adiuvatis adlgn= PageFactory.initElements(driver, Adiuvatis.class);
adlgn.adiuvatis();
}

		private void adiuvatis() {
			// TODO Auto-generated method stub
			
		}
}
