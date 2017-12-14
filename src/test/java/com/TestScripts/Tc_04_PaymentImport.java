package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.Dashboard;
import com.ScreenFunctions.Login;
import com.ScreenFunctions.PaymentImport;

public class Tc_04_PaymentImport extends GenericMethods {

	@Test
	public static void evaluateTestcase() throws Exception
	{
		GenericMethods.LaunchBrowser("chrome");
Login lgn=PageFactory.initElements(driver, Login.class);

Dashboard db=PageFactory.initElements(driver, Dashboard.class);

PaymentImport pi=PageFactory.initElements(driver, PaymentImport.class);

lgn.launch_Application();
db.EntitySearch(); 
pi.PaymentImport();

	}
	

}
