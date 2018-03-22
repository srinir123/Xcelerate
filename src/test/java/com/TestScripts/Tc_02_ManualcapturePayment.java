package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Authorization2_MCP;
import com.ScreenFunctions.Authorization3_MCP;
import com.ScreenFunctions.Authorization_MCP;
import com.ScreenFunctions.CollPeriodBalances_MCP;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;

public class Tc_02_ManualcapturePayment extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
    	GenericMethods.LaunchBrowser("chrome");
        Login lgn=PageFactory.initElements(driver, Login.class);
        Dashboard db=PageFactory.initElements(driver, Dashboard.class);

		CollPeriodBalances_MCP cpb=PageFactory.initElements(driver, CollPeriodBalances_MCP.class);
		Authorization_MCP a_mcp=PageFactory.initElements(driver, Authorization_MCP.class);
	    Authorization2_MCP a2_mcp=PageFactory.initElements(driver, Authorization2_MCP.class);
		Authorization3_MCP a3_mcp=PageFactory.initElements(driver, Authorization3_MCP.class);
		
		
		lgn.launch_Application();
		Thread.sleep(4000);
		cpb.CollPeriodBalances_MCP();
		lgn.launch_Application5();
		Thread.sleep(5000);
		a_mcp.Authorization_MCP();
		lgn.launch_Application6();
		a2_mcp.Authorization2_MCP();
		lgn.launch_Application7();
		a3_mcp.Authorization3_MCP();
		Thread.sleep(5000);

	}

}
