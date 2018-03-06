package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.PaymentImport_Ext_SUMD;

public class Tc_12_PaymentImport_Ext_SUMD extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception{
		int itr=getmaxrownumber("iteration","Login");
		int subitr=getmaxrownumber("Sub_iteration","PaymentImport_Ext_SUMD");

		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

//Dashboard db=PageFactory.initElements(driver, Dashboard.class);

PaymentImport_Ext_SUMD pi=PageFactory.initElements(driver, PaymentImport_Ext_SUMD.class);

	for(int i=1;i<=itr;i++) 	
	{
lgn.launch_Application(i);
Thread.sleep(2000);

for(int j=1;j<=subitr;j++) 	
{
pi.PaymentImport_Ext_SUMD(i,j);

	}
	
	}
	driver.quit();
}
}