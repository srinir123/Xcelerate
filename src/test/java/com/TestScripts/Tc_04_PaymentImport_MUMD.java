package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.PaymentImport_MUMD;

public class Tc_04_PaymentImport_MUMD extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception
	{		int maxnumber=getmaxrownumber("iteration","Login");
		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

//Dashboard db=PageFactory.initElements(driver, Dashboard.class);

PaymentImport_MUMD pi=PageFactory.initElements(driver, PaymentImport_MUMD.class);

for(int i=1;i<=maxnumber;i++) 	
{

lgn.launch_Application(i);
Thread.sleep(2000);
pi.PaymentImport_MUMD(i);

	}
	driver.quit();
	}
}
