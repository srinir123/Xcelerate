package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.CollPeriodBalances_MCP;
import com.ScreenFunctions.CollPeriodBalances_MCP_MUMD;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;

public class Tc_02_ManualcapturePayment_MUMD extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		int maxnumber=getmaxrownumber("iteration","Login");

		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
         Dashboard db=PageFactory.initElements(driver, Dashboard.class);

         CollPeriodBalances_MCP_MUMD cpb=PageFactory.initElements(driver, CollPeriodBalances_MCP_MUMD.class);

		for(int i=1;i<=maxnumber;i++) 	
		{
		lgn.launch_Application(i);
		Thread.sleep(3000);
		//db.EntitySearch(); 
		cpb.CollPeriodBalances_MCP_MUMD(i);


	}
		Thread.sleep(3000);
		driver.quit();
}

}