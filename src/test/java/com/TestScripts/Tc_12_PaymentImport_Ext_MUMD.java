package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.PaymentImport_Ext_MUMD;

public class Tc_12_PaymentImport_Ext_MUMD extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception{
		int maxnumber=getmaxrownumber("iteration","Login");

		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

Dashboard db=PageFactory.initElements(driver, Dashboard.class);

PaymentImport_Ext_MUMD pi=PageFactory.initElements(driver, PaymentImport_Ext_MUMD.class);

	for(int i=1;i<=maxnumber;i++) 	
	{
lgn.launch_Application(i);
Thread.sleep(2000);
pi.PaymentImport_Ext_MUMD(i);

	}
	
	driver.quit();
	Thread.sleep(5000);
}
}