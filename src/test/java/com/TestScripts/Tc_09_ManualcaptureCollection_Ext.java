package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.CollPeriodBalances_MCC;
import com.ScreenFunctions.CollPeriodBalances_MCC_Ext;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;

public class Tc_09_ManualcaptureCollection_Ext extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         CollPeriodBalances_MCC_Ext cpbe=PageFactory.initElements(driver, CollPeriodBalances_MCC_Ext.class);

		lgn.launch_Application();
		cpbe.CollPeriodBalances_Ext();
		

	}

}


