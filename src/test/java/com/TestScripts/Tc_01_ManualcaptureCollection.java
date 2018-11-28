 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Authorization1_MCC;
import com.ScreenFunctions.Authorization2_MCC;
import com.ScreenFunctions.Authorization3_MCC;
import com.ScreenFunctions.Authorization_MCC;
import com.ScreenFunctions.CollPeriodBalances_MCC;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;

public class Tc_01_ManualcaptureCollection extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {

		GenericMethods.LaunchBrowser("chrome");
		Login lgn=PageFactory.initElements(driver, Login.class);
		Dashboard db=PageFactory.initElements(driver, Dashboard.class);
		CollPeriodBalances_MCC cpb=PageFactory.initElements(driver, CollPeriodBalances_MCC.class);
        Authorization_MCC a_mcc=PageFactory.initElements(driver, Authorization_MCC.class);
        Authorization1_MCC a1_mcc=PageFactory.initElements(driver, Authorization1_MCC.class);
        Authorization2_MCC a2_mcc=PageFactory.initElements(driver, Authorization2_MCC.class);
        Authorization3_MCC a3_mcc=PageFactory.initElements(driver, Authorization3_MCC.class);


			
			lgn.launch_Application();
			Thread.sleep(5000);
			cpb.CollPeriodBalances();
			Thread.sleep(4000);
			lgn.launch_Application4();
			Thread.sleep(3000);
			a_mcc.Authorization_MCC();
			Thread.sleep(3000);
			lgn.launch_Application10();
			Thread.sleep(3000);
			a1_mcc.Authorization1_MCC();
			Thread.sleep(3000);
			lgn.launch_Application10();
			Thread.sleep(3000);
			a2_mcc.Authorization2_MCC();
			Thread.sleep(3000);
			lgn.launch_Application7();
			Thread.sleep(3000);
			a3_mcc.Authorization3_MCC();
			Thread.sleep(5000);

}	

}
