 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Authorization_MCC;
import com.ScreenFunctions.CollPeriodBalances_MCC;
import com.ScreenFunctions.Login;

public class Tc_01_ManualcaptureCollection extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		

		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         //Dashboard db=PageFactory.initElements(driver, Dashboard.class);

		CollPeriodBalances_MCC cpb=PageFactory.initElements(driver, CollPeriodBalances_MCC.class);
        Authorization_MCC a_mcc=PageFactory.initElements(driver, Authorization_MCC.class);

		lgn.launch_Application();
		Thread.sleep(5000);
		cpb.CollPeriodBalances();
		lgn.launch_Application4();
		Thread.sleep(3000);
		a_mcc.Authorization_MCC();
		



	}

}
