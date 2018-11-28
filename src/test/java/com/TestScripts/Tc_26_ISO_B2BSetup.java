package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.B2BSetup;
import com.ScreenFunctions.BankAccountCreation;
import com.ScreenFunctions.Login;

public class Tc_26_ISO_B2BSetup extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		
		GenericMethods.LaunchBrowser("chrome");
        Login lgn=PageFactory.initElements(driver, Login.class);

        B2BSetup b2b=PageFactory.initElements(driver, B2BSetup.class);


		lgn.launch_Application();
		Thread.sleep(4000);
		b2b.B2BSetup();
		Thread.sleep(5000);
		

	}

}