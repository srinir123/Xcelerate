 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.BankAccountCreation;
import com.ScreenFunctions.CollPeriodBalances_MCC;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;

public class Tc_21_BankAccountCreation extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		
		int maxnumber=getmaxrownumber("iteration","Login");
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         BankAccountCreation bac=PageFactory.initElements(driver, BankAccountCreation.class);

	for(int i=1;i<=maxnumber;i++) 	
	{	
		lgn.launch_Application(i);
		Thread.sleep(4000);
		bac.BankAccountCreation(i);
		
	}


	}

}
