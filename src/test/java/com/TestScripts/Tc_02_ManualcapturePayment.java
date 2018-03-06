package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Authorization2_MCP;
import com.ScreenFunctions.Authorization3_MCP;
import com.ScreenFunctions.Authorization_MCP;
import com.ScreenFunctions.CollPeriodBalances_MCP;
import com.ScreenFunctions.Login;

public class Tc_02_ManualcapturePayment extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		//int maxnumber=getmaxrownumber("iteration","Login");
		GenericMethods.LaunchBrowser("chrome");
         Login lgn=PageFactory.initElements(driver, Login.class);
        // Dashboard db=PageFactory.initElements(driver, Dashboard.class);

		CollPeriodBalances_MCP cpb=PageFactory.initElements(driver, CollPeriodBalances_MCP.class);
	    Authorization_MCP a_mcp=PageFactory.initElements(driver, Authorization_MCP.class);
	    Authorization2_MCP a2_mcp=PageFactory.initElements(driver, Authorization2_MCP.class);
	    Authorization3_MCP a3_mcp=PageFactory.initElements(driver, Authorization3_MCP.class);
		//for(int i=1;i<=maxnumber;i++) 	{
		lgn.launch_Application();
		Thread.sleep(4000);
		//db.EntitySearch(); 
		cpb.CollPeriodBalances_MCP();
		lgn.launch_Application5();
		Thread.sleep(3000);
		a_mcp.Authorization_MCP();
		Thread.sleep(2000);
		lgn.launch_Application6();
		Thread.sleep(2000);
		a2_mcp.Authorization2_MCP();
		
		Thread.sleep(2000);
		lgn.launch_Application7();
		Thread.sleep(2000);
		a3_mcp.Authorization3_MCP();
		}
	}

//}
