 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.CollPeriodBalances_MCC_MUMD;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;

public class Tc_01_ManualcaptureCollection_MUMD extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		
		int maxnumber=getmaxrownumber("iteration","Login");
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         CollPeriodBalances_MCC_MUMD cpb=PageFactory.initElements(driver, CollPeriodBalances_MCC_MUMD.class);

	for(int i=1;i<=maxnumber;i++) 	
	{	
		lgn.launch_Application(i);
		Thread.sleep(4000);
		cpb.CollPeriodBalances_MCC_MUMD(i);
		
	}
driver.quit();

	}

}
