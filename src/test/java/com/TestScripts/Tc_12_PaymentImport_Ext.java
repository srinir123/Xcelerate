package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.PaymentImport;
import com.ScreenFunctions.PaymentImport_Ext;

public class Tc_12_PaymentImport_Ext extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception
	{
		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

Dashboard db=PageFactory.initElements(driver, Dashboard.class);

PaymentImport_Ext pi=PageFactory.initElements(driver, PaymentImport_Ext.class);

lgn.launch_Application();
Thread.sleep(2000);
pi.PaymentImport_Ext();

	}
	

}
