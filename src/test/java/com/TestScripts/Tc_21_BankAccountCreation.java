 package com.TestScripts;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericMethods;
import com.ScreenFunctions.BankAccountCreation;
import com.ScreenFunctions.Login;

public class Tc_21_BankAccountCreation extends GenericMethods{

	@Test
	public static void evaluateTestcase() throws Exception {
		
		GenericMethods.LaunchBrowser("chrome");
        Login lgn=PageFactory.initElements(driver, Login.class);

         BankAccountCreation bac=PageFactory.initElements(driver, BankAccountCreation.class);


		lgn.launch_Application();
		Thread.sleep(4000);
		bac.BankAccountCreation();
		Thread.sleep(3000);


	}

}
