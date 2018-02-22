package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.CollPeriodBalances_MCP_Ext_MUMD;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;

public class Tc_10_ManualcapturePayment_Ext_MUMD extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		int maxnumber=getmaxrownumber("iteration","Login");

		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         CollPeriodBalances_MCP_Ext_MUMD cpbe=PageFactory.initElements(driver, CollPeriodBalances_MCP_Ext_MUMD.class);

     	for(int i=1;i<=maxnumber;i++) 	
     	{
		lgn.launch_Application(i);
		cpbe.CollPeriodBalances_MCP_Ext_MUMD(i);
		

	}
     	driver.quit();
	}
}

